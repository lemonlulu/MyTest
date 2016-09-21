import java.util.*;

/**
 * Created by lemon on 14-6-20.
 */
public class Question1004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num;
        ArrayList<String> list;

        num = scanner.nextInt();
        while(num != 0){
            list = new ArrayList<String>();
            for(int i=0; i<num; i++){
                list.add(scanner.next());
            }
            findMaxCountNumber(list);
            num = scanner.nextInt();
        }
    }

    /*找出序列中出现次数最多的一个元素*/
    public static <T> void findMaxCountNumber(List<T> list){
        Map<T,Integer> map = new HashMap<T, Integer>();
        for(T t : list){
            if(!map.containsKey(t))
                map.put(t,1);
            else
                map.put(t,map.get(t)+1);
        }

        int maxValue = 0;
        String maxKey = "";
        Iterator it = map.entrySet().iterator();
        for(int i=0;i<map.size();i++){
            Map.Entry entry =(Map.Entry)it.next();
            int value = Integer.parseInt(entry.getValue().toString());
            if(value > maxValue){
                maxValue = value;
                maxKey = entry.getKey().toString();
            }
        }
        System.out.println(maxKey);
    }

}
