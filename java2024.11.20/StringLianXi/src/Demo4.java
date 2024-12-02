import java.util.Random;

public class Demo4 {
    public static void main(String[] args) {
        char[] arr = new char[5];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int flag = r.nextInt(2);
            int num4=r.nextInt(arr.length);
            int num2=r.nextInt(10)+48;
            int num1 = r.nextInt(26) + 97;
            int num3 = r.nextInt(26) + 65;
            if (flag == 0) {
                arr[i] = (char) num1;//小写字母
            } else {
                arr[i] = (char) num3;//大写字母
            }
            if(i==arr.length-1){
                arr[num4]= (char) num2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());

    }
}
