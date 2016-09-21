package testTimer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by lemon on 14-7-22.
 */
public class TimerTaskTest extends TimerTask{

    static int count;

    @Override
    public void run() {
        count ++;
        System.out.println("Hello World!");
    }
}
