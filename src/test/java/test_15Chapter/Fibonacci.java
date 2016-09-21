package test_15Chapter;

/**
 * Created by lemon on 14-11-28.
 */
public class Fibonacci implements Generator<Integer>{

    private int count = 0;

    @Override
    public Integer next() {
        return fab(count ++);
    }

    private Integer fab(int i) {
        if( i<2 )
            return 1;
        else
            return fab(i-1) + fab(i-2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for(int i=1; i<20; i++)
            System.out.println(fibonacci.next());
    }


}
