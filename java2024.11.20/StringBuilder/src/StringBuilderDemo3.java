import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        int flag=mainTest();
        if(flag==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static int  mainTest(){
        Scanner sc= new Scanner(System.in);
        String s1=sc.next();
        StringBuilder sb= new StringBuilder(s1);
        char[] ch1 = new char[s1.length()];
        char[] ch2 = new char[s1.length()];
        for (int i = 0; i < ch1.length; i++) {
            ch1[i]= sb.charAt(i);
        }
        StringBuilder ss = sb.reverse();
        for (int i = 0; i < ch2.length; i++) {
            ch2[i]= ss.charAt(i);
        }
        int flag=0;
        for (int i = 0; i < ch1.length; i++) {
            if(ch1[i]==ch2[i]){
                continue;
            }else{
                flag=1;
                break;
            }
        }
        return flag;
    }
}
