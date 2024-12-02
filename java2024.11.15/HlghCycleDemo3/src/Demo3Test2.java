import java.util.Random;
import java.util.Scanner;

public class Demo3Test2   {
    public static void main(String[] args) {
        Random Ra=new Random();
        int a=Ra.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入你要猜的数字");
            int b=sc.nextInt();//循环输入
            if(b<a){
                System.out.println("小了");
            } else if (b>a) {
                System.out.println("大了");

            }else{
                System.out.println("猜对了");
                break;
            }
        }



    }
}
