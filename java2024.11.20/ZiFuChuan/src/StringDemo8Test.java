import java.util.Scanner;

public class StringDemo8Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        mainTest(s);
    }
    public static void mainTest(String s){
        char[] arr =new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.charAt(i);
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println(arr[6]+arr[7]+arr[8]+arr[8]+"年"+arr[10]+arr[11]+"月"+arr[12]+arr[13]+"日");
        if(arr[16]%2==0){
            System.out.println("女");
        }else{
            System.out.println("男");
        }
    }
}
//String a =talk.substring(int beginIndex, int endIndex):表示截取
//从beginIndex开始到endIndex结束的字符串
//左闭右开

//String a=talk.replace(CharSequence target, CharSequence replacement):将字符串中的target用replacement替换
//注意点:只有返回值才是替换之后的结果
