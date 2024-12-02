package com.itheima.Main;
import java.util.Random;
public class ShuZuDemo5 {
    public static void main(String[] args) {
        int []arr=new int[10];
        for (int i = 0; i < 10; i++) {
            Random Ra=new Random();
            arr[i]=Ra.nextInt(100)+1;
        }
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num+=arr[i];
        }
        System.out.println(num);
        double a=(double)num;
        System.out.println(a/10);
        int b=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<(a/10)){
                b++;
            }
        }
        System.out.println(b);
    }
}
