package testFinal;

/**
 * Created by lemon on 2015/11/24.
 */
public class Main {
    public static void main(String args[]) {
        TwoTuple<String, Integer> twoTuple = new TwoTuple<>("hello", 2);
        System.out.println(twoTuple.toString());
        System.out.println(twoTuple.id);

        twoTuple = new TwoTuple<>("so", 3);
        System.out.println(twoTuple.toString());
        System.out.println(twoTuple.id);

//        twoTuple.first = "world"; //compile error
    }
}

class TwoTuple<A, B> {
    public static int count;
    public final long id = count++;
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
