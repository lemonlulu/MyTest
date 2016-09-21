package check;

/**
 * Created by lemon on 2016/4/14.
 */
import java.util.Stack;

public class Check {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String  s="(1){CHI[与|和] || CAT[J] LOGIC[G|D]}+(2){CAT[A] || OF_AMBI[A]}+(3){CHI[的]||CAT[N]}";
        Stack<Character> sc = new Stack<Character>();
        char[] c=s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i]=='('||c[i]=='['||c[i]=='{') {
                sc.push(c[i]);
            }
            else if (c[i]==')') {
                if (sc.peek()=='(') {
                    sc.pop();
                }
            }else if (c[i]==']') {
                if (sc.peek()=='[') {
                    sc.pop();
                }
            }else if (c[i]=='}') {
                if (sc.peek()=='{') {
                    sc.pop();
                }
            }
        }
        if (sc.empty()) {
            System.out.println("成对");
        }else {
            System.out.println("不成对");
        }
    }
}