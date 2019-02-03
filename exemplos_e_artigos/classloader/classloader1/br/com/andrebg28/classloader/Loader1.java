package br.com.andrebg28.classloader;

/*
 * Origem do código:
 * https://softbork.com/blog/index.php?id=8
 */

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Hello world!
 *
 */
public class Loader1 
{
    public static void main( String[] args )
    {
        
    	System.out.println( "Hello World!" );
    	
    	ClassLoader classLoader = Loader1.class.getClassLoader();
    	URLClassLoader uc = null;
    	if (classLoader instanceof URLClassLoader) {
    	    uc = (URLClassLoader)classLoader;
    	}
    	else {
    	    throw new RuntimeException("classLoader is not an instanceof URLClassLoader");
    	}
    	URL[] urLs = uc.getURLs();
    	// just have a look at what you get...
    	for (int i = 0; i < urLs.length; i++) {
    	    System.out.println( i + ". " + urLs[i]);
    	}
    	
    }
}
