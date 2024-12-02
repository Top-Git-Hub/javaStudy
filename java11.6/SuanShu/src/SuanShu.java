public class SuanShu
{
    public static void main(String[] args)
    {
        //+:代表相加
        int a=10;
        int b=20;
        System.out.println(a+b);
        //-:代表相减
        int c=20;
        int d=10;
        System.out.println(c-d);
        //*:代表相乘
        System.out.println(10*20);
        //%:代表取余
        System.out.println(5%3);
        //如果计算时有小数参与
        System.out.println(1.01 + 1.1);//2.1100000000000003
        System.out.println(1.1 - 1.01);//0.09000000000000008
        System.out.println(1.1 * 1.01);//1.1110000000000002
        //因此可以得出在代码中如果有小数参与，代码可能不准确
        System.out.println(1.1 + 1.1);//2.2
        //但是上面这个计算又准确了到之后再了解
        /*/：是除法运算*/
        System.out.println(6/3);
    }

}