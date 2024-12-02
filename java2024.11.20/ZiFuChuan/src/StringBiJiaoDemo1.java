import java.util.Scanner;

public class StringBiJiaoDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "limohan";
        int code1 = 123456;
        int i;
        String[] arr = new String[3];
        for (i = 0; i < 3; i++) {
            System.out.println("请输入账号：");
            arr[i]=sc.next();
            System.out.println(" ");
            System.out.println("请输入密码：");
            int code2 = sc.nextInt();
            boolean flag = s1.equals(arr[i]);
            if (code1 == code2 && flag == true) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("登录失败,您还剩下"+(2-i)+"次机会");
                continue;
            }
        }
        if (i == 3) {
            System.out.println("账号密码错误次数过多，请稍后再试");
        }
    }
}
