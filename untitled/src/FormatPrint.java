
import java.io.*;
import java.util.*;

public class FormatPrint {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String res = x >= 100 ? s1 + " ".repeat(15 - s1.length()) + String.valueOf(x) : x >= 10 ? s1 + " ".repeat(15 - s1.length())+"0"+String.valueOf(x) : s1 + " ".repeat(15 - s1.length())+"00" +String.valueOf(x);
            System.out.println(res);
            //Complete this line
        }
        System.out.println("================================");
    }
}

