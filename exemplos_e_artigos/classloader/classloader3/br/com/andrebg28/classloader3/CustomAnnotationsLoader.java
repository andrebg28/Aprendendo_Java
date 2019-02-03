package br.com.andrebg28.classloader3;

/*
 * Origem do código:
 * http://www.whycouch.com/2012/05/how-to-create-custom-classloader-for.html
 */

import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
 
/**
* A custom classloader that can be used as a system class loader.
*
* It checks if a field has the CustomAnnotations.AUTO and if yes,
* adds it to the autoFields arraylist.
*
* @author Hathy
*/
public class CustomAnnotationsLoader extends URLClassLoader {
 
    public CustomAnnotationsLoader(ClassLoader cl){
        super(new URL[0],cl);
    }
 
    @Override
    public Class<?> loadClass(String className)
                        throws ClassNotFoundException {
    	System.out.println("Carregando: " + className);
        Class c=super.loadClass(className);
        Field fields[]=c.getFields();
        for(Field field:fields){
        	System.out.println("Nome do campo: " + field.getName());
            if(field.getAnnotations().length>0){
                String annotationName=field.getAnnotations()[0]
                                           .annotationType()
                                           .getCanonicalName();
                System.out.println("    Anotação: " + annotationName);
                //The check happens here
                
                if(annotationName.indexOf("CustomAnnotations.AUTO")!=-1){
                	System.out.println("        Personalizada: ");
                    CustomAnnotations.autoFields.add(field.getName());
                }
            }
        }
        System.out.println(CustomAnnotations.autoFields);
        return c;
    }
 
}