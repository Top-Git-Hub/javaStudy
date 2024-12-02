package com.itheima.Main;

public class FangFaDemo2 {
    public static void main(String[] args) {
        System.out.println("a");
        Main();//看到方法调用方法;方法调用完回到调用处往下执行
        System.out.println("d");
    }
    public static void Main(){
        System.out.println("b");
        System.out.println("c");
    }

}
