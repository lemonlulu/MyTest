import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lemon on 14-6-19.
 */
public class Question1003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        ArrayList<Integer> result = new ArrayList<Integer>();

        int count;
        List<Integer> numbers ;
        for(int i=0;i<cases;i++){
            count = scanner.nextInt();
            numbers = new ArrayList<Integer>();
            for(int j=0;j<count;j++){
                numbers.add(scanner.nextInt());
            }
            System.out.println("Case "+(i+1)+":");
            result = maxSum_subSequence(numbers);
            System.out.println(result.get(0)+" "+result.get(1)+" "+result.get(2));
            if(i != cases-1)
                System.out.println();
        }
    }

    public static ArrayList<Integer> maxSum_subSequence(List<Integer> list){

        ArrayList<Integer> result = new ArrayList<Integer>();
        int num=0, sum=0;
        int num_start=0, num_end=0, sum_start=0, sum_end=0;
        int flag = 0;

        for(int i=0; i<list.size(); i++){
            num += list.get(i);

            if(num > sum){
                sum = num;
                sum_end = i;
                if(flag == 1){
                    sum_start = num_start;
                    sum_end = num_end;
                    flag = 0;
                }
            }
            else if(num < 0){
                flag = 1;
                num = 0;
                num_start = i+1;
                num_end = i+1;
            }

        }
        result.add(0,(sum>0?sum:0));
        result.add(1,(sum>0?sum_start+1:0));
        result.add(2,(sum>0?sum_end+1:0));

        return result;
    }
}

class Main2 {

    public static void main(String[] args) {

        int t, i;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for (i = 0; i < t; i++) {
            anster(in, i + 1);

            if (i != t - 1)
                System.out.println();
        }
    }

    private static void anster(Scanner in, int k) {

        int l = 0;
        int r = 0;
        int sum = 0;
        int count = in.nextInt();
        int num;
        int max = -1001;
        int tempStep = 1;

        for (int i = 0; i < count; i++) {
            num = in.nextInt();
            sum = sum + num;

            if (sum > max) {
                l = tempStep;
                r = i + 1;
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
                tempStep = i + 2;

            }
        }

        System.out.println("Case " + k + ":");
        System.out.println(max + " " + l + " " + r);
    }

}