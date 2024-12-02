package com.itheima.Main;

import java.util.Random;

public class FangFaDemo13 {
    public static void main(String[] args) {
        int M = Max();
        System.out.print("最大的值为");
        System.out.println(M);
    }

    public static int Max() {
        int[] arr = new int[5];
        Random Ra = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Ra.nextInt(5);
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        for (int j : arr) {
            if (max <= j) {
                max = j;
            }
        }
        return max;
    }
}
