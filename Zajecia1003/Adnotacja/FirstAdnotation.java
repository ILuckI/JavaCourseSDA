package Zajecia1003.Adnotacja;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstAdnotation {
    String id();
    int wiek();
    boolean test() default true;
}
