import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        for (int i = 1; i <= 5; i++) {
            j = j + i;
        }
        System.out.println(j);
        int a = 0;
        for (int b = 1; b <= 100; b++) {
            if (b % 2 == 0) {
                a += b;
            }
        }
        System.out.println(a);
        System.out.println("请输入两个整数");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int num = 0;
        for (int e = c; e <= d; e++) {
            if (e % 3 == 0 & e % 5 == 0) {
                num++;
            }
        }
        System.out.println(num);
    }
}