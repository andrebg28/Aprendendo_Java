package br.com.andrebg28.classloader3;

/*
 * Origem do código:
 * http://www.whycouch.com/2012/05/how-to-create-custom-classloader-for.html
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
 
/**
 * Defines the custom annotation that will be used later on
 * Also holds a list of fields that made use of the custom annotation
 *
 * @author Hathy
 */
public class CustomAnnotations {
 
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AUTO{
    }    
 
    public static ArrayList<String> autoFields=new ArrayList<String>();
                // This holds the names of the fields that made
                // use of my custom annotation
}
