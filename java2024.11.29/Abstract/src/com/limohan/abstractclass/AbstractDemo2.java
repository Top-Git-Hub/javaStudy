package com.limohan.abstractclass;

public class AbstractDemo2 {
    public static void main(String[] args) {
        // AbstractDemo2_1 ad2 = new AbstractDemo2_1(); 报错，抽象类不能实例化
    }
}
abstract class AbstractDemo2_1{
    private int a;
    private int b;

    public AbstractDemo2_1() {
    }

    public AbstractDemo2_1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract void show();
    public void test(){
        System.out.println("test");
    }
}
