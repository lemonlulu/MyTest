import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lemon on 14-6-19.
 */
public class Question1002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.next());

        List<Long> numbers = new ArrayList<Long>();
        int c = 0;
        while(c<count*2){
            numbers.add(Long.parseLong(scanner.next()));
            c++;
        }

        for(int i=1; i<=count; i++){
            System.out.println("Case "+i+":");
            System.out.println(numbers.get(i*2-2)+" + "+numbers.get(i*2-1)+" = "+(Long.parseLong(numbers.get(i*2-2).toString())+Long.parseLong(numbers.get(i*2-1).toString())));
//            if(i!=count)
                System.out.println();
        }

    }


}

class Main {
    public static void main(String args[])
    {
        Scanner cin=new Scanner(System.in);
        int t;
        BigInteger a,b,c;
        t=cin.nextInt();
        for(int i=1;i<=t;i++)
        {
            a=cin.nextBigInteger();
            b=cin.nextBigInteger();
            c=a.add(b);
            System.out.println("Case " + i +":");
            System.out.println(a + " + " + b + " = " + c);
            if(i!=t)
            {
                System.out.println();
            }
        }
    }
}
