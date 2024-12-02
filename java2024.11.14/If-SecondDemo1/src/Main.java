import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的钱");
        int a=sc.nextInt();
        if(a>=600){
            System.out.println("付款成功");
        }else{
            System.out.println("您的钱不足");
        }
    }
}