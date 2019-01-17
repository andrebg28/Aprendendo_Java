package br.com.andrebg.apendendo.notation;

import java.lang.reflect.Field;

import org.apache.commons.lang3.ArrayUtils;

public class ClienteReflection {
	
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
}
