public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=a++;
        //先用后加
        //先将a的值赋值给b在进行自增
        //所以b=10，a==11
        int c=10;
        int d=++c;
        //先加后用
        //c先自增然后将自增后的值赋给d
        System.out.println(b);
        System.out.println(a);
        System.out.println(d);
        System.out.println(c);
        int x=10;
        int y=x++;
        //x此时自增一次
        int z=++x;
        //x此时自增第二次
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}