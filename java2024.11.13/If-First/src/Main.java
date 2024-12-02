import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int b = sc.nextInt();
        if (b < a) {//java习惯将{写在括号末尾
            System.out.println("不同意");
        }
        //if(关系表达式){语句体;}
        //如果关系表达式为true则执行语句体，若为false则不执行
        //如果一个bool类型的变量进行判断，直接将变量写在小括号中
    }
}