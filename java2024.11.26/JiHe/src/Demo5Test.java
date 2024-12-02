import java.util.ArrayList;
import java.util.Scanner;

public class Demo5Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Demo5> list = new ArrayList<>();
        int idTest=sc.nextInt();
        for(int i=0;i<3;i++){
            Demo5 d = new Demo5();
            System.out.println("请输入第"+(i+1)+"个用户的id");
            int id = sc.nextInt();
            d.setId(id);
            System.out.println("请输入第"+(i+1)+"个用户的账户名");
            String username = sc.next();
            d.setUsername(username);
            System.out.println("请输入第"+(i+1)+"个用户的密码");
            String password = sc.next();
            d.setPassword(password);
            list.add(d);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==idTest){
                System.out.println("True");
                break;
            }else{
                System.out.println("False");
            }
        }
    }
}
