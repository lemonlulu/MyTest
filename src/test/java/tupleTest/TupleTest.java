package tupleTest;

/**
 * Created by lemon on 14-11-21.
 */
public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 47);
    }

    static ThreeTuple<String, Integer, Double> g() {
        return new ThreeTuple<>("hello",47, 1.0);
    }

    public static void main(String[] args) {
        TwoTuple twoTuple = f();
//        twoTuple.first = "";//Error
        System.out.println(twoTuple);

        System.out.println(f());
        System.out.println(g());
    }
}
