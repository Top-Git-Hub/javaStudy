package com.itheima.Main;

public class FangFaDemo12 {
    public static void main(String[] args) {
        ShuZu();
    }

    public static void ShuZu() {
        int[] arr = {11, 22, 33, 44, 55};
        System.out.print("[");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
}