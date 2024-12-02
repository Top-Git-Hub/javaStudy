package com.itheima.Main;

public class ShuZuNeiCun1 {
    public static void main(String[] args) {
        //栈:方法运行时使用的内存，比如main方法运行，进入方法栈中执行
        //程序的主入口（main方法）开始执行时会进入栈，代码执行完成会出栈
        //堆:存储对象或者数组，new来创建的，都存储在堆内存
        //new产生的东西会在这块内存中开辟空间并产生地址
        int a=10;
        int b=10;
        int c=a+b;
        System.out.println(c);
        int arr[]=new int[2];
        //int arr[]储存在栈内存，new int[]在堆内存
        //堆内存中数组的地址值赋给arr
        System.out.println(arr);//地址值
        System.out.println(arr[0]);//先通过地址值找到栈内存中数据的位置
        //然后通过下标确定数据值
        arr[0]=11;//通过赋值将11赋给arr的0下标、
        int arr2[]={1,2,3};//简化的new堆内存
        System.out.println(arr);//arr2在堆内存的地址值

//      方法区:存储可以运行的class文件
//      本地方法栈:jVM在使用操作系统功能的时候使用，和我们开发无关
//      寄存器:给CPU使用，和我们开发无关
    }
}
