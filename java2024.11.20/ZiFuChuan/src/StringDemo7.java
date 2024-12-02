import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入手机号：");
        String phone = sc.next();
        mainTest(phone);
    }
    public static void mainTest(String phone){
        char[] arr = new char[phone.length()];
        for (int i = 0; i < phone.length(); i++) {
            arr[i] = phone.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if(i>=3&&i<=6){
                arr[i]= '*';
            }
            System.out.print(arr[i]);
        }
    }
}
