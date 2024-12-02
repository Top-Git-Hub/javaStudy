import java.util.Scanner;
import java.util.StringJoiner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        mainTest(a);
    }

    public static void mainTest(String a) {
        char[] ch = new char[a.length()];
        StringBuilder sb = new StringBuilder();
        StringJoiner sj = new StringJoiner(",", "[", "]");
        if (a.length()<= 9) {
            for (int i = 0; i < ch.length; i++) {
                ch[i] = a.charAt(i);
            }
            for (int i = 0; i < ch.length; i++) {
                switch (ch[i]) {
                    case '1':
                        sj.add("Ⅰ");
                        continue;
                    case '2':
                        sj.add("Ⅱ");
                        continue;
                    case '3':
                        sj.add("Ⅲ");
                        continue;
                    case '4':
                        sj.add("Ⅳ");
                        continue;
                    case '5':
                        sj.add("Ⅴ");
                        continue;
                    case '6':
                        sj.add("Ⅵ");
                        continue;
                    case '7':
                        sj.add("Ⅶ");
                        continue;
                    case '8':
                        sj.add("Ⅷ");
                        continue;
                    case '9':
                        sj.add("Ⅸ");
                        continue;
                    case '0':
                        sj.add(" ");
                }
            }
            String result = sj.toString();
            System.out.println(result);
        } else {
            System.out.println("输入错误");
        }
    }
}