package testTimer;

/**
 * Created by lemon on 14-12-13.
 */
public class Test2 {
    public static void main(String args[]) throws InterruptedException {
        while (true){
            System.out.println(TimerTaskTest.count);
            Thread.sleep(2000);
        }
    }
}
