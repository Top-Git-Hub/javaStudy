import java.util.Scanner;

public class StringBiJiao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String str1 = sc.next();
        String str2 = "abc";
        System.out.println(str1==str2);//false
        //因为Scanner是new出来的
    }
}
