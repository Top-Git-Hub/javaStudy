import java.util.Scanner;

public class JinEZhuanHuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        mainTest(a);
    }

    public static void mainTest(String a) {
        char[] arr = new char[7];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= 0 && i <= 6 - a.length()) {
                arr[i] = '0';
            } else {
                arr[i] = a.charAt(num);
                num++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                // 将数组arr中第i个元素赋值为"零"
                arr[i] = '零';
            } else if (arr[i] == '1') {
                // 将数组arr中第i个元素赋值为"壹"
                arr[i] = '壹';
            } else if (arr[i] == '2') {
                // 将数组arr中第i个元素赋值为"贰"
                arr[i] = '贰';
            } else if (arr[i] == '3') {
                // 将数组arr中第i个元素赋值为"叁"
                arr[i] = '叁';
            } else if (arr[i] == '4') {
                // 将数组arr中第i个元素赋值为"肆"
                arr[i] = '肆';
            } else if (arr[i] == '5') {
                // 将数组arr中第i个元素赋值为"伍"
                arr[i] = '伍';
            } else if (arr[i] == '6') {
                // 将数组arr中第i个元素赋值为"陆"
                arr[i] = '陆';
            } else if (arr[i] == '7') {
                // 将数组arr中第i个元素赋值为"柒"
                arr[i] = '柒';
            } else if (arr[i] == '8') {
                // 将数组arr中第i个元素赋值为"捌"
                arr[i] = '捌';
            } else if (arr[i] == '9') {
                // 将数组arr中第i个元素赋值为"玖"
                arr[i] = '玖';
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i] + "佰");
            } else if (i == 1) {
                System.out.print(arr[i] + "拾");
            } else if (i == 2) {
                System.out.print(arr[i] + "万");
            } else if (i == 3) {
                System.out.print(arr[i] + "仟");
            } else if (i == 4) {
                System.out.print(arr[i] + "佰");
            } else if (i == 5) {
                System.out.print(arr[i] + "拾");
            } else if (i == 6) {
                System.out.print(arr[i] + "元");
            }
        }
    }
}
