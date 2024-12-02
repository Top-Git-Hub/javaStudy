//键盘录入
//可以用于接收键盘上输入的整数
//先写一个类（scanner）
import java.util.Scanner;
//导包，找到Scanner这个类在哪
//写在类定义上面
public class KeyBoard {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //创建对象
        System.out.println("请输入整数");
        //输入提示
        int i= sc.nextInt();
        //接收数据
        //变量i键盘录入的数据
        System.out.println(i);
    }
}