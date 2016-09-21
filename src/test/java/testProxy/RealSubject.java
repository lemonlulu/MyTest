package testProxy;

/**
 * Created by lemon on 14-7-22.
 */
public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("From real subject.");
    }
}
