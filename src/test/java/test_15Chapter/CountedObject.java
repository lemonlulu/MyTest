package test_15Chapter;

/**
 * Created by lemon on 14-12-2.
 */
public class CountedObject {
    public static int id;
    public final int count = id++;


    public CountedObject() {
    }


    @Override
    public String toString() {
        return "CountedObject{" +
                "count=" + count +
                '}';
    }
}
