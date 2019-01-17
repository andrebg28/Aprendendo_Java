package br.com.andrebg.apendendo.notation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.commons.lang3.ArrayUtils;

public class ClienteReflection {
	private static Class<Cliente> clazz;
	public static void listagem_2() {
		
		System.out.println("Imprimindo resultado da Listagem 2:\n");
		
		Cliente cliente = new Cliente();
        System.out.println(cliente.getClass().getName());//Código original do artigo 
        
        System.out.println("\n\n");
	}

	
	public static void listagem_2a() {
		
		System.out.println("Imprimindo resultado da Listagem 2a:\n");
		
		Cliente cliente = new Cliente();
        System.out.println(cliente.getClass().getName());//Código original do artigo 
        
        
        //Código adicional de manipulação de String, não essencial para compeenção do Artigo
        System.out.println(cliente.getClass());
        System.out.println(cliente);
        
        String partes[] = cliente.getClass().getName().split("\\.");
        String Class = partes[partes.length-1];
		System.out.println("Class:  \t" + Class);
		
		
		partes = ArrayUtils.removeElement(partes, Class);	
		System.out.println("package:\t" + String.join(".", partes));
        
        System.out.println("\n\n");
	}
	
	
	public static void listagem_3() {

		
		System.out.println("Imprimindo resultado da Listagem 3:\n");
		
		Cliente cliente = new Cliente();
        System.out.println(Cliente.class.getName());//Código original do artigo 
        
        System.out.println("\n\n");
	}
	
	
	public static void listagem_4() {

		
		System.out.println("Imprimindo resultado da Listagem 4:\n");
		
		Cliente cliente = new Cliente();
        Class<Cliente> clazz = (Class<Cliente>) cliente.getClass();
        for(Field f : clazz.getDeclaredFields()){
               System.out.println(f.getName());
        }
        
        System.out.println("\n\n");
	}
	
	public static void listagem_5() {

		
		System.out.println("Imprimindo resultado da Listagem 5:\n");
		
		Cliente cliente = new Cliente();
        clazz = (Class<Cliente>) cliente.getClass();
        for(Method m : clazz.getDeclaredMethods()){
               System.out.println(m.getName());
        }
        
        System.out.println("\n\n");
	}

	
	//Listagem 6
	private static Object createNewInstance(Class clazz) {

	
		System.out.println("Executando Listagem 6:");
		
		Constructor<?> ctor;
        try {
               ctor = clazz.getConstructors()[0];
               Object object = ctor.newInstance();
               return object;
        } catch (Exception e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
        }
         
        return null;
	    
	    
	}
	
	
	public static void listagem_7() {

		
		System.out.println("Executando Listagem 7:");
		
		Cliente cliente = (Cliente) createNewInstance(Cliente.class);
		  
		System.out.println("Imprimindo resultado da Listagem 7:\n");
		
        if (cliente == null) {
               System.err.println("Ops, não foi possível criar o objeto cliente");
        } else {
               System.out.println("Objeto cliente criado = " + cliente.toString());
        }
        
        System.out.println("\n\n");
	}
	
	
	//Listagem 10
	// Mostra valores apenas com anotação @Mostrar
    public static void mostrarValores(Object obj) {
    	try {
            Class clazz = obj.getClass();
            for (Method m : clazz.getDeclaredMethods()) {
                   if (m.isAnnotationPresent(Mostrar.class)){
                          if (m.getParameterTypes().length > 0){
                                System.err.println(" "+m.getName()+" anotado com @Mostrar de forma errada, ignorando ...");
                                continue;
                          }
                          System.out.println(m.getName()+": "+m.invoke(obj));
                   }
            }
          } catch (Exception e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
          }
    }
}
