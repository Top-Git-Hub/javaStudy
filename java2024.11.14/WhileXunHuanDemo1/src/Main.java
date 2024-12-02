//for循环中，控制循环的变量，因为归属for循环的语法结构中，在for循环结束后，就不能再次被访问到了
//while循环中，控制循环的变量，对于while循环来说不归属其语法结构中，在while循环结束后，该变量
//还可以继续使用
public class Main {
    public static void main(String[] args) {
        int j = 0;
        double i = 0.1;
        while (i <= 8844430) {
            i *= 2;
            j++;
        }
        System.out.println(j);
    }
}