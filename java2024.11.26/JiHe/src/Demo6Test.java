import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo6Test {
    public static void main(String[] args) {
        ArrayList<Demo6> list = new ArrayList<>();
        List<String> list2 = (mainTest(list));
        System.out.println(list2);
    }

    public static List<String> mainTest(ArrayList<Demo6> list) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Demo6 d = new Demo6();
            System.out.println("请输入第" + (i + 1) + "台手机的品牌");
            String bound = sc.next();
            d.setBound(bound);
            System.out.println("请输入" + d.getBound() + "手机的价格");
            int price = sc.nextInt();
            d.setPrice(price);
            list.add(d);
        }
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() <= 3000) {
                list1.add(list.get(i).getBound());
            }
        }
        return list1;
    }
}
