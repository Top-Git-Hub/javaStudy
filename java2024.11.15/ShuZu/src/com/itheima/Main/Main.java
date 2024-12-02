package com.itheima.Main;
public class Main {
    public static void main(String[] args) {
        //格式:数据类型[] 数组名 = new 数据类型{元素1，元素2...}
        //简化格式:数据类型 [] 数组名 ={元素1，元素2...};
        int [] a1={12,13,14,15,16};
        String [] a2={"a","b","c"};
        double [] a3={193.3,156.3,171.1};
        System.out.println(a1);
        //此时输出的是地址值:[I@b4c966a
        //[:表示当前是一个数组
        //I:表示当前数据类型
        //@表示间隔符号无特定含义
        //b4c966a:表示数组真正地址值(16进制表现形式)
        System.out.println(a1[1]);
        System.out.println(a2[0]);
        //数组元素访问
        //格式:数组名[下标];
        //输出的数是下标+1所对应的数
        a1[0]=18;
        System.out.println(a1[0]);
        //把数据存储到数组当中
        //数组名[下标]=具体数据


    }
}