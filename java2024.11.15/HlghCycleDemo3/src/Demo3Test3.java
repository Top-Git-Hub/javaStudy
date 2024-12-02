import java.util.Random;
import java.util.Scanner;
public class Demo3Test3 {
    public static void main(String[] args) {
        Random Ra=new Random();
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(true){
            int b=sc.nextInt();//循环输入
            if(i==3){
                System.out.println("猜中了");
                break;
            }//保底机制
            i++;
            int a=Ra.nextInt(100)+1;
            System.out.println("请输入你要猜的数字");
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
