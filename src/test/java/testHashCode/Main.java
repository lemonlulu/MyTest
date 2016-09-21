package testHashCode;

import java.util.*;

/**
 * Created by lemon on 2015/12/28.
 */
public class Main {
//    public static void main(String[] args) {
//        HashSet<UserInfo> userset = new HashSet<UserInfo>();
//        UserInfo user = new UserInfo(1001, "华安");
//        userset.add(user);
//        System.out.println(user.hashCode());
//
//        UserInfo user2 = new UserInfo(1002, "秋香");
//        userset.add(user2);
//        System.out.println(user2.hashCode());
//
//        UserInfo user3 = new UserInfo(1001, "华安");
//        userset.add(user3);
//        System.out.println(user3.hashCode());
//
//        System.out.println("userInfo:"+userset.size());
//
//        System.out.println("---------------");
//
//        Iterator<UserInfo> iter2 = userset.iterator();
//        while (iter2.hasNext()) {
//            UserInfo userInfo = iter2.next();
//            System.out.println(userInfo);
//        }
//    }

//    public static void main(String args[]){
//        List list = new LinkedList();
//        for(int i=0;i<=5;i++)
//            list.add("a"+i);
//        System. out.println(list);
//        list.add(3, "test3");
//        System. out.println(list);
//
//        System. out.println(list.set(6, "haha6") );
//        System. out.println(list);
//        System. out.println(list.get(5));
//        System. out.println(list.contains("aaa" ));
//        System. out.println(list.indexOf("a3" ));
//        list.remove(1);
//        System. out.println(list);
//        System. out.println(list.size());
////            list.add(7, "are you ok?");    //只能是挨个的set和add，否则数组越界
////            System.out.println(list);
//
//    }

    public static void main(String[] args){
        List list = new LinkedList();
        for(int i=0;i<=9;i++)
            list.add("a"+i);
        System. out.println(list);
        Collections. shuffle(list);
        System. out.println(list);
        Collections. reverse(list);//逆序对于ArrayList和LinkedList来说，LinkedList效率更高，因为数组还需要copy，而LinkedList只需要将指针改变方向。
        System. out.println(list);
        Collections.sort(list);
        System. out.println(list);
        System. out.println(Collections.binarySearch(list, "a5") );

    }


}
