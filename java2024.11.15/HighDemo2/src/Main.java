import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y;
        int z = 1;
        for (y = 2; y < x; y++) {
            for (z = y; z < x; z++) {
                if (z * y == x) {
                    System.out.println(x+"不是一个质数");
                    break;
                }
            }
            if (z * y == x) {
                break;
            }
        }
        int b;
        int a;
        if (z * y != x) {
            for (a = 2; a < x; a++) {
                for (b = a; b < x; b++) {
                    if (b * a != x) {
                        System.out.println(x+"是一个质数");
                        break;
                    }
                }
                if (b * a != x) {
                    break;
                }
            }
        }
        if (x == 2) {
            System.out.println("2是一个质数");
        }
    }


}