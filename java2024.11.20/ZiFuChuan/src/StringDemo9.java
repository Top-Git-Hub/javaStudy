import java.util.Scanner;

//字符串替换
//String s2=s1.replace(CharSequence target, CharSequence replacement):将字符串中的target用replacement替换
//注意点:只有返回值才是替换之后的结果public class StringDemo9 {
public class StringDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"尼玛", "你妈逼", "你大爷", "你奶奶"};
        String s2;
        for (int i = 0; i < arr.length; i++) {
            String s1 = sc.next();
            s2 = s1.replace(arr[i], "***");
            System.out.println(s2);
        }
    }
}
