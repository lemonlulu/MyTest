import java.io.UnsupportedEncodingException;
import java.util.*;

public class Test{
    public static void main(String[] args) throws UnsupportedEncodingException {
        List list = new ArrayList<Integer>();
//        list.add(1);
//
//        list = null;
//        System.out.println(list);
//
//        t(null);
        Map<String, Integer> map = new HashMap();

        Iterator<Integer> iteratorValue = map.values().iterator();

    }

    static Integer s = 1;


    public static void t(Integer t){
        s = t;
        System.out.println(s);
    }
}