import java.util.Scanner;
public class SuanShuDemo2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int i=sc.nextInt();
        System.out.println(i%10);
        System.out.println(i%100/10);
        System.out.println(i/100);
    }
}
