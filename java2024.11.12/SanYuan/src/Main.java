import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //可以进行判断，根据判断结果得到不同的内容
        System.out.println("请输入第一个数");
        int a=sc.nextInt();
        System.out.println("请输入第二个数");
        int b=sc.nextInt();
        int c=a>b?a:b;
        System.out.println(c);
        //如果a>b是true的话那么c的值就是a的值，否则为b的值
        //并且需要定义一个变量将值赋给他
        //格式:关系表达式?表达式1:表达式2;
        //先计算关系表达式的值，如果值为true，表达式1的值就是运算结果
        //如果值为false，表达式2的值就是运算结果
    }
}