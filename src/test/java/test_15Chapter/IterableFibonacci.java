package test_15Chapter;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lemon on 14-11-28.
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{

    int n;

    public IterableFibonacci(int count) {
        n = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n --;
                return IterableFibonacci.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(int i:new IterableFibonacci(20))//IterableFibonacci实现了Iterable接口，是可以迭代的
            System.out.println(i);


    }
}
