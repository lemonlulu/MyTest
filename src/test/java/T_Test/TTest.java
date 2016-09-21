package T_Test;

/**
 * Created by lemon on 14-11-21.
 */
public class TTest<T> {

    T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public TTest(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        TTest<User> tTest = new TTest(new User());
        User user = tTest.getT();//不需要强制类型转换

//        tTest.setT("Not user type");//Error
//        tTest.setT(3);//Error
    }
}
