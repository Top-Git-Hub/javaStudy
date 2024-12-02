import java.util.ArrayList;
import java.util.Scanner;

public class Demo4Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Demo4> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"名学生的姓名");
            Demo4 d = new Demo4();
            String name = sc.next();
            d.setName(name);
            System.out.println("请输入第"+(i+1)+"名学生的年龄");
            int age = sc.nextInt();
            d.setAge(age);
            list.add(d);
        }
        for (Demo4 demo4 : list) {
            System.out.println(demo4.getName() + " " + demo4.getAge());
        }
    }
}
