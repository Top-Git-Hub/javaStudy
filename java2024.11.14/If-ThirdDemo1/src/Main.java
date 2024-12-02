import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1){
            System.out.println(1000*0.9);
        } else if (a==2) {
            System.out.println(1000*0.8);

        }else if(a==3){
            System.out.println(1000*0.7);
        }else{
            System.out.println("不打折");
        }

    }
}