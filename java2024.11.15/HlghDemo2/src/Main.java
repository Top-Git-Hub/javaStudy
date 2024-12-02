import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int i = 1;
        for (i = 1; i <= j; i++) {
            if (i * i >= j) {
                break;
            }
        }
        System.out.println(i-1);
    }
}