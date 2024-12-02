import java.util.Scanner;

public class StringBiJiaoDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=s1;
        //public char charAt (int index): 根据索引返回字符
        for(int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i)+" ");
        }
    }
}
