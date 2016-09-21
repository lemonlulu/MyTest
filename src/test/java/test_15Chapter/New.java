package test_15Chapter;

import java.util.*;

/**
 * Created by lemon on 14-12-1.
 */
public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<>();
    }

    public static <T> ArrayList<T> alist() {
        return new ArrayList<>();
    }

    public static <T> LinkedList<T> llist() {
        return new LinkedList<>();
    }

    public static <T> HashSet<T> set() {
        return new HashSet<>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<>();
    }

    public static void main(String[] args) {
        Map<String, List<String>> map = New.map();
        ArrayList<String> alist = New.alist();
        LinkedList<String> llist = New.llist();
        HashSet<String> set = New.set();
        Queue<String> queue = New.queue();
    }
}

class LimitsOfInference {
    static void f(Map<String, List<? extends String>> map) {}
    public static void main(String args[]) {
//        f(New.map()); //does not compile
    }
}

class ExplicitTypeSpecification {
    static void f(Map<String, List<String>> map) {}
    public static void main(String[] args) {
        f(New.<String, List<String>>map());//显式的指明类型
    }
}






































