import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        /*int j;
        int num = 0;
        for (j = 1; j <= 100; j++) {
            i = i / 10;
            if (i < 10 && i >= 1) {
                num = j;//j==4==num
            }
        }
        int n;
        if (num % 2 == 0) {
            for (n = 1; n <= 100; n++) {
                if (i % (10 * n) == i % (((num + 1) - n) * 10)) {
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }
        }*/
        //求回文数
        int m = j;
        int n;
        int k = 0;
        int g=0;
        for (n = 1; n <= 100; n++) {
            i = i - m;
            if (i < j&&i>=0) {
                k = i;
                g=n;
            }

        }
        System.out.println(g);
        System.out.println(k);
        //求商与余数


    }

}