package com.itheima.Main;

public class FangFaDemo9 {
    public static void main(String[] args) {
        //带返回值的方法定义与调用:当需要去使用方法得出的结果时
        //返回值可以帮助我们使用方法得出的结果,返回值就是代码运行结果
        //格式:public static void 方法名(参数){代码;return 返回值;}
        //方法调用:1.方法名(实参)2.整数类型 变量名=方法名(实参)
        //3.sout(方法名(实参));
        Main(10, 20, 30);//直接调用:在无返回值处
        int sum1 = Main(10, 20, 30);//赋值调用
        //System.out.println(Main(10,20,30));//输出调用
        int sum2 = Main(10, 20, 30);
        int sum3 = Main(10, 20, 30);
        int sum4 = Main(10, 20, 30);
        System.out.println(sum1 + sum2 + sum3 + sum4);
    }

    public static int Main(int x, int y, int z) {//如果无返回值写void，若无则写具体数据类型
        int result = x + y + z;
        return result;//返回给方法调用处
    }
}
