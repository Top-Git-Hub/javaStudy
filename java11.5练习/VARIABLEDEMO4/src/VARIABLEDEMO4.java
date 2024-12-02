public class VARIABLEDEMO4
{
    public static void main(String[] args)
    {
        //byte(-128~127)
        byte b=10;
        System.out.println(b);
        //short(-32768~32767）
        short a=30;
        System.out.println(a);
        //int（-2147483648~2147483647）
        int c=40;
        System.out.println(c);
        //long(-923372036854775808~9223372036854775807)
        //如果要定义long类型的变量
        //在数据值得后面加一个L作为后缀
        //L可以是大写也可以是小写
        long d=99999999999L;
        //以上为整数类型
        System.out.println(d);
        //float()
        //tips:用float定义变量时数据值后面加一个F作为后缀
        float f=13.2F;
        System.out.println(f);
        //double
        double g=11.1;
        System.out.println(g);
        //以上为小数
        //char（字符）
        char h= '李';
        System.out.println(h);
        //boolean（true false）
        //bool类型只两个值：要么false，要么true
        boolean i=true;
        System.out.println(i);
        //以上数据类型均为基本数据类型
    }
}
//取值范围大小(double>float>long>int>short>byte)