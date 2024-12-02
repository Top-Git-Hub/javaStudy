import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a=sc.nextInt();
        System.out.println("请输入第二个数");
        int b=sc.nextInt();
        boolean result=(a==6||b==6)||((a+b)%6==0);
        System.out.println(result);

    }
}