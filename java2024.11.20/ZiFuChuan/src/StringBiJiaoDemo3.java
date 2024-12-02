import java.util.Scanner;

//char 类型的变量在参与计算的时候自动类型提升为 int 查询 ascii 码表
public class StringBiJiaoDemo3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1=sc.next();
        int num1=0;
        int num2=0;
        int num3=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')//字符比较
            {
                num1++;
            } else if (s1.charAt(i)>='A'&&s1.charAt(i)<='Z') {
                num2++;
            }else {
                num3++;
            }

        }
        System.out.println("小写字母有"+num1+"个，大写字母有"+num2+"个，数字有"+num3+"个");
    }
}
