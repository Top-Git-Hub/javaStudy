public class VariableDemo3
{
    //主入口
    public static void main (String [] args)
    {
        //定义变量
        //数据类型 变量名=数据名；
        //数据类型:限定了变量能存储数据的类型
        //int(整数) double(小数)
        //变量名：就是存储空间的名字
        //作用：方便以后使用
        //数据值：真正存在于变量的数据
        //等号：赋值，把右边的数值赋值给左边的变量
        int a=10;
        System.out.println(a);//10
        //一条语句中可以定义多个变量
        int d=100,e=200,f=300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        //变量在使用之前必须赋值
        int g;
        g=500;
        System.out.println(g);
    }
}
