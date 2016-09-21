package test_15Chapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lemon on 14-12-1.
 */
public class GenericVarargs {
    /**
     * equals "java.util.Arrays.asList()方法"
     * @param args
     * @param <T>
     * @return
     */
    public static <T> List<T> makeList(T... args) {
        List<T> list = new ArrayList<>();
        if(args == null)
            return null;
        for(T t:args){
            list.add(t);
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list = makeList("A");
        System.out.println(list);

        list = makeList("A","B","C");
        System.out.println(list);

        list = makeList("ABCDEFGHIJKLMN".split(""));
        System.out.println(list);
    }

}
