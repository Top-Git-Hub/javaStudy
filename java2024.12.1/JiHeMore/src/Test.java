import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random ra = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(ra.nextInt(100));
        }
        System.out.println(list);
        int max = 0;
        int mini=list.getFirst();
        int num=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= max) {
                max = list.get(i);
            }
            if(list.get(i)<=mini){
                mini=list.get(i);
            }
            num+=list.get(i);
        }
        System.out.println("最大值"+max);
        System.out.println("最小值"+mini);
        System.out.println("总值"+num);
    }
}