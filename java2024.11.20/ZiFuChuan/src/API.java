import java.util.Scanner;

public class API {
    //API目前是JDK中提供的各种功能的Java类
    //帮助开发人员更好的使用 API 和查询 API 的一个工具。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数：");
        double v = sc.nextDouble();;
        System.out.println(v);
    }
}
