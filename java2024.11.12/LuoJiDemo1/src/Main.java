public class Main {
    public static void main(String[] args) {
        //短路逻辑运算符
        System.out.println(true&&false);
        System.out.println(false&&false);
        System.out.println(true&&true);
        int a=10;
        int b=10;
        boolean result = ++a<5 && ++b<5;
        //a先自增,因为11<5是false，已经确定最后结果，所以右边不在计算
        System.out.println(result);
        System.out.println(a);//11
        System.out.println(b);//10
        //&&:短路与，结果和&相同，但是有短路效果
        System.out.println(true||false);
        System.out.println(false||false);
        System.out.println(true||true);
        int c=1;
        int d=10;
        boolean result1=++c<5||++d<5;//c先自增,因为2<5是true，已经确定最后结果，所以右边不在计算
        System.out.println(result1);
        System.out.println(c);
        System.out.println(d);
        //||:短路或，结果和|相同，但是有短路效果
        //短路运算符与常规运算符不同点在于常规运算符无论左边是否true还是false，右边都要执行
        //短路运算符如果左边能确定整个表达式的的结果，右边不执行
    }
}