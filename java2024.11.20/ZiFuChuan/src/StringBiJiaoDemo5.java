import java.util.Scanner;

public class StringBiJiaoDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        mainTest(s1);
    }

    public static void mainTest(String s1) {
        String[] arr = new String[s1.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(s1.charAt(i));
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        String num1;
        String num2;
        int num=0;
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                num1 = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = num1;
                if (i == arr.length / 2 - 1) {
                    break;
                }
            }
        }
        if(arr.length % 2 != 0) {
            for (int i = 0; i < arr.length; i++) {
                num2 = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = num2;
                if (i == (arr.length+1)/2-1) {
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
