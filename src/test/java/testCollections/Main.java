package testCollections;

import java.util.*;

/**
 * Created by lemon on 2015/11/26.
 */
public class Main {
    public static void main(String args[]) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        collection.addAll(Arrays.asList(new Integer[]{6, 7, 8}));

        Collections.addAll(collection, 9, 10);
        Collections.addAll(collection, new Integer[]{11, 12});

        System.out.println(collection);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        integerList.set(0, 0);
//        integerList.add(10); //Runtime error.
        System.out.println(integerList);
    }

}

class Snow {}
class Power extends Snow {}
class Light extends Power {}
class Heavy extends Power {}

class Crusty extends Snow {}
class Slush extends Snow {}

class AsListInterface {
    public static void main(String args[]) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Power());

//        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
        //Compile error.

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy());

        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
    }
}
