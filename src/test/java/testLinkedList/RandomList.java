package testLinkedList;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lemon on 14-11-28.
 */
public class RandomList<T> {
    public ArrayList<T> arrayList = new ArrayList<>();
    Random random = new Random(47);

    public void add(T item) {
        arrayList.add(item);
    }

    public T select() {
        return arrayList.get(random.nextInt(arrayList.size()));
    }

    public static void main(String args[]) {
        RandomList<String> randomList = new RandomList<>();
        for(String s:"Ok, Let's begin test.".split(" "))
            randomList.add(s);

        for(int i = 0; i<10; i++)
            System.out.println(randomList.select());
    }
}
