package br.com.andrebg28.classloader2;

import java.lang.reflect.Method;
/*
 * Origem do código:
 * https://www.journaldev.com/349/java-classloader
 */
public class CCRun {
	public static void main(String[] args) throws Exception{
		String[] ars = {"br.com.andrebg28.classloader2.cl.Foo", "1212", "1313"};
		args = ars; 
		String progClass = args[0];
        String progArgs[] = new String[args.length - 1];
        System.arraycopy(args, 1, progArgs, 0, progArgs.length);

        CCLoader ccl = new CCLoader(CCRun.class.getClassLoader());
        Class clas = ccl.loadClass(progClass);
        
        Class mainArgType[] = { (new String[0]).getClass() };
        Method main = clas.getMethod("main", mainArgType);
        Object argsArray[] = { progArgs };
        main.invoke(null, argsArray);

        // Below method is used to check that the Foo is getting loaded
        // by our custom class loader i.e CCLoader
        Method printCL = clas.getMethod("printCL", null);
        printCL.invoke(null, new Object[0]);
        
	}
}
