public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=a;
        System.out.println(b);//b=10
        //=:赋值运算，将等号右边的值赋值给左边
        a+=b;//a+b的值赋值给a,a=20
        System.out.println(a);
        System.out.println(b);
        //+=:加后赋值，a+=b:将a+b的值赋值给a;
        a-=b;
        System.out.println(a);//a=10
        //-=:减后赋值，a-=b:将a-b的值给a
        a*=b;
        System.out.println(a);//a=100
        //*=:乘后赋值，a*=b:将a*b的值赋值给a
        a/=b;
        System.out.println(a);//a=10
        // /=:除后赋值，a/=b:将a/b的值赋值给a
        a%=b;
        System.out.println(a);
        //%=:将a%b的值赋值给a
        //ps:扩展的赋值运算隐含了强制转换

    }
}