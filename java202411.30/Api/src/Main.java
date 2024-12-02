import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rs = new Random();
        int i=rs.nextInt(66);
        if(i==12){
            i=36;
        }
        System.out.println(i);
    }
}