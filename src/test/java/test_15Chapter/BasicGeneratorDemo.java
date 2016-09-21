package test_15Chapter;

/**
 * Created by lemon on 14-12-2.
 */
public class BasicGeneratorDemo {
    public static Generator<CountedObject> basicGenerator =
            BasicGenerator.creat(CountedObject.class);

    public static void main(String args[]) {
        for(int i=0; i<5; i++)
            System.out.println(basicGenerator.next());
    }
}
