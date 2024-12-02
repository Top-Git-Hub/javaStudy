//if(关系表达式){语句体1}else{语句体2}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的钱");
        int a = sc.nextInt();
        if (a >= 100) {
            System.out.println("网红小吃");
        } else {
            System.out.println("沙县小吃");
        }

    }
}