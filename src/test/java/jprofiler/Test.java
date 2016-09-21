package jprofiler;

/**
 * Created by lemon on 2014/12/19.
 */
public class Test extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        for(int i=1; i<10000; i++) {
            new HelloWorld();
            t.sleep(100); // 休眠100毫秒
        }
    }
}

class HelloWorld {
    public HelloWorld() {
        System.out.println("Hello Jayzee!");
    }
}