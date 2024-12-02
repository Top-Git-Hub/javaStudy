public class Switch{
    public static void main(String[] args) {
        double a =10.0;
        int b=10;
        System.out.println(a+b);
        int c = 1;
        double d = 2.0;
        double e = c + d;
        //int f = c + d;此时int不可用，java: 不兼容的类型: 从double转换到int可能会有损失
        System.out.println(e);
        //System.out.println(f);f此时不可用
    }
}





