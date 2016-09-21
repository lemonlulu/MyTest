import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lemon on 14-6-20.
 */
public class Question1005 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Long> list = new ArrayList<Long>();
        list.add(scanner.nextLong());
        list.add(scanner.nextLong());
        list.add(scanner.nextLong());
        long result;
        while(!(list.get(0)==0L&&list.get(1)==0L&&list.get(2)==0L)){
            result = compute(list.get(0),list.get(1),list.get(2));
            System.out.println(result);
            list = new ArrayList<Long>();
            list.add(scanner.nextLong());
            list.add(scanner.nextLong());
            list.add(scanner.nextLong());
        }

    }

    public static long compute(long A, long B, long n){
        long result;
        if(n == 1 || n == 2){
            result = 1;
        }
        else
            result = (A * compute(A,B,n-1) + B * compute(A,B,n-2)) % 7;

        return result;

    }
}
