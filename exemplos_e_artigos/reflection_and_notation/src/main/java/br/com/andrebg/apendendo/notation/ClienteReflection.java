package br.com.andrebg.apendendo.notation;

public class ClienteReflection {

	public static void listagem2() {
		Cliente cliente = new Cliente();
        System.out.println(cliente.getClass().getName());
	}
}
