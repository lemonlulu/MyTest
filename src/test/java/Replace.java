import com.google.common.base.Strings;

import java.io.*;

/**
 * Created by lemon on 2016/4/11.
 */
public class Replace {
    public static void main(String args[]) throws IOException {

        BufferedReader bf= new BufferedReader(new FileReader("d:\\Users\\lemon\\Desktop\\xxx.txt"));
        String s = bf.readLine();

        System.out.println(s);

        while(!Strings.isNullOrEmpty(s)) {
            System.out.println("lemon@" + s + ",");


            s = bf.readLine();
        }


    }
}
