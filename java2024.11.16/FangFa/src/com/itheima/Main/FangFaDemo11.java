package com.itheima.Main;

public class FangFaDemo11 {
    public static void main(String[] args) {
        //方法的重载
        //在同一个类中定义了多个同名的方法，这些同名的方法具有同种的功能
        //每个方法具有不同的参数类型以及参数个数，这些同名的方法，构成重载
        //在同一个类中，方法名相同，参数不同的方法。与返回值无关
        //参数不同:个数不同，顺序不同，类型不同
        short result = (short) num1(10, 20);
        if (result > 0) {
            System.out.println("a>b");
        } else {
            System.out.println("a<b");
        }
    }

    public static int num1(int a, int b) {
        return a - b;
    }

    public static short num1(short a, short b) {
        return (short) (byte) (a - b);
    }

    public static long num1(long a, long b) {
        long i = a - b;
        return i = a - b;
    }

    public static byte num1(byte a, byte b) {
        return (byte) (a - b);
    }
}
