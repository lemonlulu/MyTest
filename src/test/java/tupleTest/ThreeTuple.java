package tupleTest;

/**
 * Created by lemon on 14-11-21.
 */
public class ThreeTuple<A, B, C> extends TwoTuple<A, B>{

    public final C third;

    public ThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
