package com.itheima.Main;

public class FangFaDemo10 {
    public static void main(String[] args) {
        int num1 = C1(10, 20);
        int num2 = C2(5, 6);
        if (num1 > num2) {
            System.out.println("C1大");
        } else if (num1 < num2) {
            System.out.println("C2大");
        } else {
            System.out.println("一样大");
        }
    }

    public static int C1(int x, int y) {
        return (x + y) * 2;
    }

    public static int C2(int i, int j) {
        return (i + j) * 2;
    }
}
