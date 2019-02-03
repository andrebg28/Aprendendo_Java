package br.com.andrebg28.classloader;

/*
 * Origem do código:
 * https://softbork.com/blog/index.php?id=8
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Huep {

}
