package testCollections;

import java.util.*;

/**
 * Created by lemon on 2015/11/26.
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map<String, String> fill(Map map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String args[]) {
        System.out.println(fill(new ArrayList<String>()));  //按照插入顺序保存元素
        System.out.println(fill(new LinkedList<String>())); //按照插入顺序保存元素

        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>())); //按照比较结果的升序保存对象
        System.out.println(fill(new LinkedHashSet<String>()));//按照添加的顺序保存对象

        System.out.println(fill(new HashMap()));
        System.out.println(fill(new TreeMap())); //按照比较结果的升序保存键
        System.out.println(fill(new LinkedHashMap()));//按照插入顺序保存键
    }
}
