public class Main {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        int max1 = height1 > height2 ? height1 : height2;
        //找出第一个和尚与第二个和尚中最高的
        int max2 = max1 > height3 ? max1 : height3;
        //找出最高的
        System.out.println(max2 + "cm");
        //ctrl+alt+l:可以对齐代码让其变得工整
        // 运算符优先级:小括号优先于所有
    }
}