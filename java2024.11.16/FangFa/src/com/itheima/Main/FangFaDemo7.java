package com.itheima.Main;

public class FangFaDemo7 {
    //形参:方法定义中的参数
    //实参:方法调用中的参数
    //型参与实参必须一一对应
    //要决定方法体也就是方法内的代码
    public static void main(String[] args) {
        Main(10, 20);

    }

    public static void Main(int num1, int num2) {
        System.out.println(num1 * 2 + num2 * 2);

    }
}
