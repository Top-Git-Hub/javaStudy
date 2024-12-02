import java.util.Random;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        char[] arr = new char[s1.length()];
        char[] brr = new char[1];
        for (int i = 0; i < s1.length(); i++) {
            arr[i] = s1.charAt(i);
        }
        for (int i = 0; i < s1.length(); i++) {
            Random r = new Random();
            int n = r.nextInt(s1.length());
            brr[0] = arr[n];
            arr[n] = arr[i];
            arr[i] = brr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            sb.append(arr[i]);
        }
        String s2 = sb.toString();
        System.out.println(s2);
    }
}
