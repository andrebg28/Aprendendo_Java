package br.com.andrebg28.classloader2;
/*
 * Origem do código:
 * https://www.journaldev.com/349/java-classloader
 */
import br.com.andrebg28.annotated.exemplo1;
import br.com.andrebg28.classloader.*;

public class ClassLoaderTest {

	public static void main(String[] args) {

		System.out.println("class loader for HashMap: "
				+ java.util.HashMap.class.getClassLoader());
		System.out.println("class loader for DNSNameService: "
				+ sun.net.spi.nameservice.dns.DNSNameService.class
						.getClassLoader());
		System.out.println("class loader for this class: "
				+ ClassLoaderTest.class.getClassLoader());

		System.out.println(Loader1.class.getClassLoader());
		
		System.out.println(Loader2.class.getClassLoader());
		
		System.out.println(exemplo1.class.getClassLoader());

	}

}