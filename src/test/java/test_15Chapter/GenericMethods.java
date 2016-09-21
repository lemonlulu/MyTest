package test_15Chapter;

import java.util.ArrayList;

/**
 * Created by lemon on 14-11-28.
 */
public class GenericMethods {

    public static <T> void f(T t) {
        System.out.println(t.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods methods = new GenericMethods();
        f("");
        f('a');
        f(1);
        f(5L);
        f(3.14);
        f(new ArrayList<>());
        f(methods);
    }
}
