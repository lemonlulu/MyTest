package testThreadPool;

/**
 * Created by lemon on 14-8-1.
 */
import java.io.Serializable;

public class ThreadPoolTask implements Runnable, Serializable {

    private Object attachData;

    ThreadPoolTask(Object tasks) {
        this.attachData = tasks;
    }

    public void run() {

        System.out.println("开始执行任务：" + attachData);
        for(int i=1; i<100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        attachData = null;
    }

    public Object getTask() {
        return this.attachData;
    }
}
