import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindNumberForRule {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String res = (N % 2 == 1) ? "Weird" : (N > 6 && N <= 20)? "Weird" : "Not Weird";
        System.out.println(res);
        scanner.close();
    }
}

