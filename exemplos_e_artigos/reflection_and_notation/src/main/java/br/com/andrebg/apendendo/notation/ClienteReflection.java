package br.com.andrebg.apendendo.notation;

import org.apache.commons.lang3.ArrayUtils;

public class ClienteReflection {
	
	public static void listagem_2() {
		Cliente cliente = new Cliente();
		
		System.out.println("Imprimindo resultado da Listagem 2:\n");
		
        System.out.println(cliente.getClass().getName());//Código original do artigo 
	}

	public static void listagem_2a() {
		Cliente cliente = new Cliente();
		
		System.out.println("Imprimindo resultado da Listagem 2a:\n");
		
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
}
