package br.com.andrebg.apendendo.notation;

//Listagem 9
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Mostrar {

	
}
