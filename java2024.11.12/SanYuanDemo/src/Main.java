import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        String c=a==b?"相同":"不同";
        //表达式可以用字符串
        //结果为true，输出表达式一
        System.out.println(c);
    }
}