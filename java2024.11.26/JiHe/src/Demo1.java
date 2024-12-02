import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        StringJoiner sj = new StringJoiner(",","[","]");
        for(int i=0;i<5;i++){
            String s = sc.next();
            list.add(s);
        }
        System.out.println(list);
    }
}
