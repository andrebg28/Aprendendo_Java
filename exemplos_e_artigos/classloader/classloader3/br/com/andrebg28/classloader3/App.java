package br.com.andrebg28.classloader3;

/*
 * Origem do código:
 * http://www.whycouch.com/2012/05/how-to-create-custom-classloader-for.html
 */

public class App {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CustomAnnotationsLoader cal = new CustomAnnotationsLoader(App.class.getClassLoader());
		cal.loadClass("br.com.andrebg28.classloader3.CustomAnnotationsUser");
	}

}
