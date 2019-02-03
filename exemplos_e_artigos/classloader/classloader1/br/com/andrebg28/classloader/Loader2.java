package br.com.andrebg28.classloader;

/*
 * Origem do código:
 * https://softbork.com/blog/index.php?id=8
 */

import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;

public class Loader2 {

	public static void main( String[] args ) {
		ArrayList<URL> urls = new ArrayList<URL>();
		ClassLoader [] classloaders = {
		        Loader2.class.getClassLoader() ,
		        Thread.currentThread().getContextClassLoader()
		};
		for (int i = 0; i < classloaders.length; i++) {
		    if (classloaders[i] instanceof URLClassLoader) {
		        urls.addAll(Arrays.asList(((URLClassLoader)classloaders[i]).getURLs()));
		    }
		    else {
		        throw new RuntimeException("classLoader is not an instanceof URLClassLoader");
		    }
		}
		System.out.println(urls.size());
		for(URL ele : urls) {
			System.out.println(ele);

		}
	
	}
	
}
 
