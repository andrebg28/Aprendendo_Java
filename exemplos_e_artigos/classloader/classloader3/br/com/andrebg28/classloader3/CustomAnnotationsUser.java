package br.com.andrebg28.classloader3;

/*
 * Origem do código:
 * http://www.whycouch.com/2012/05/how-to-create-custom-classloader-for.html
 */

/**
* A sample class that makes use of the custom annotations
*
* @author Hathy
*/
public class CustomAnnotationsUser {
 
    @CustomAnnotations.AUTO
    public String ID1;
 
    @CustomAnnotations.AUTO
    public String ID2;
 
    public static void main(String[] args) throws Exception{
        System.out.println(CustomAnnotations.autoFields);
    }
}