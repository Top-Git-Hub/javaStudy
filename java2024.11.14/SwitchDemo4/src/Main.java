import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        switch(a){
            case 1-> System.out.println("机票查询");
            case 2-> System.out.println("机票预订");
            case 3-> System.out.println("机票改签");
            case 4,5,6,7,8,9-> System.out.println("退出服务");
        }
    }
}