package T_Test;

/**
 * Created by lemon on 14-11-21.
 */
public class ObjectTest {
    private Object o;

    public void setO(Object o) {
        this.o = o;
    }

    public Object getO() {
        return o;
    }

    public ObjectTest(Object o) {
        this.o = o;
    }

    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest(new User());
        User user = (User)objectTest.getO();
        System.out.println(user.getUid());

        objectTest.setO("Not User type");
        String s = (String)objectTest.getO();
        System.out.println(s);

        objectTest.setO(3);
        Integer i = (Integer)objectTest.getO();
        System.out.println(i);
    }

}
