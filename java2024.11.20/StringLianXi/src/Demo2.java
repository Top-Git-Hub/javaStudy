import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        mainTest1(A,B);
    }

    public static void mainTest1(String A,String B)//A=abcde
    {
        int num = 0;
        char[] arr = new char[A.length()];
        for (int i = 0; i < A.length(); i++) {
            arr[i] = A.charAt(i);//ch[0]=a,ch[1]=b,ch[2]=c,ch[3]=d,ch[4]=e
        }
        StringBuilder sb = new StringBuilder(A);//sb=abcde
        for (int i = 0; i < arr.length; i++) {
            StringBuilder ch1 = sb.reverse();//ch1=edcba/
            for (int i1 = 0; i1 < arr.length; i1++) {
                arr[i1] = ch1.charAt(i1);
            }
            StringBuilder ch2 = new StringBuilder(ch1.substring(0, A.length() - 1));//ch2=edcb
            StringBuilder ch3 = ch2.reverse();//ch3=bcde,因为ch2发生偏转，所以ch2=bcde
            for (int i1 = 0; i1 < arr.length - 1; i1++) {
                arr[i1] = ch3.charAt(i1);
            }
            for (int i1 = 0; i1 < arr.length; i1++) {
                sb.setCharAt(i1, arr[i1]);
            }
            String ch4 = sb.toString();
            if (ch4.equals(B)) {
                System.out.println("YES");
                break;
            }else{
                num++;
                if(num==arr.length){
                    System.out.println("NO");
                }
                continue;
            }
        }
    }
}
