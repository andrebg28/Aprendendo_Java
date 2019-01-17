package br.com.andrebg.apendendo.notation;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClienteReflection.listagem_2();
    	ClienteReflection.listagem_2a();
    	ClienteReflection.listagem_3();
    	ClienteReflection.listagem_4();
    	ClienteReflection.listagem_5();
    	ClienteReflection.listagem_7();
    	
    	Cliente cliente = instanciarCliente();
    	ClienteReflection.mostrarValores(cliente);
    }
    
    
    //Listagem 11
    private static Cliente instanciarCliente() {
    	Cliente cliente = new Cliente();
        cliente.setCodigo(1010);
        cliente.setDataNascimento(new Date());
        cliente.setEnderecoCompleto("Rua ABC, Bairro YHU nº 190");
        cliente.setNome("Antonio da Silva Nunes");
        cliente.setNomeMae("Maria da Silva Nunes");
        cliente.setNomePai("Joao da Silva Nunes");
        
        return cliente;
    }
    
}
