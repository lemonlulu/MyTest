package test_15Chapter;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by lemon on 14-12-1.
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> c, Generator<T> g, int num) {
        for(int i=0; i < num; i++) {
            c.add(g.next());
        }
        return c;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for(Coffee c: coffees)
            System.out.println(c);

        Collection<Integer> fnumbers = fill(new ArrayList<Integer>(), new Fibonacci(), 12);
        for(Integer i: fnumbers)
            System.out.print(i+" ");
    }
}
