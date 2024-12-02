import java.util.Scanner;

//链式编程:
//当我们在调用一个方法的时候,不需要用变量接收他的结果,可以继续调用其他方法
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        int length = main1().substring(1).replace('A', 'B').length();
        System.out.println(length);
    }
    public static String  main1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.next();
        return str;
    }
}
