package testTimer;

import java.util.Timer;

/**
 * Created by lemon on 14-7-22.
 */
public class Test {
    public static void main(String args[]){
        Timer timer = new Timer();
        timer.schedule(new TimerTaskTest(), 1000, 2000);


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End"+ TimerTaskTest.count);
    }
}
