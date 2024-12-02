import java.util.Scanner;
import java.util.Random;//导包
//Random获取随机数：1.导包2.创建对象3.接收数据
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random Ra=new Random();//创建对象
        int num=56;
        for(int i=1;i<=100;i++){
            int b=Ra.nextInt(10);
            //生成随机数，括号内写入随机数的范围
            //括号内的范围一定从0开始
            //并到括号内的数-1结束
            //如果生成随机数写在循环外面会导致只输出一个随机数
            System.out.println(b);
        }
    }
}