import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        /*switch(a){
            case 1-> System.out.println("工作日");
            case 2-> System.out.println("工作日");
            case 3-> System.out.println("工作日");
            case 4-> System.out.println("工作日");
            case 5-> System.out.println("工作日");
            case 6-> System.out.println("休息日");
            case 7-> System.out.println("休息日");
        }*/
        /*switch(a){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:System.out.println("工作日");
            break;
            case 6:
            case 7: System.out.println("休息日");
            break;
        }*///case穿透
        /*switch(a){
            case 1,2,3,4,5:System.out.println("工作日");
                break;
            case 6,7: System.out.println("休息日");
                break;
        }//case穿透*/
        switch(a){
            case 1,2,3,4,5->System.out.println("工作日");
            case 6,7->System.out.println("休息日");

        }//case穿透
        //所以case穿透可以简化代码

    }
}