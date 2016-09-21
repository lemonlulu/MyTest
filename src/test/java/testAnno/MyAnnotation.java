package testAnno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by lemon on 2014/12/25.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation
{
    String hello() default "gege";
    String world();
    int[] array() default { 2, 4, 5, 6 };
//    EnumTest.TrafficLamp lamp() ;
    TestAnnotation lannotation() default @TestAnnotation(value = "ddd");
    Class style() default String.class;
}
