//if(关系表达式){语句体1}else if(关系表达式n){语句体n}else{语句体n+1}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<=100&&a>=0) {
            if (a >= 95 && a <= 100) {
                System.out.println("自行车");
            } else if (a >= 90 && a <= 94) {
                System.out.println("游乐场");
            } else {
                System.out.println("挨打");
            }
        }else{
            System.out.println("不合法");
        }
        //从上往下依次判断，如果为true则执行语句体


    }
}