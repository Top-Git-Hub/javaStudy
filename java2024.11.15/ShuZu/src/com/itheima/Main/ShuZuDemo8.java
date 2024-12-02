package com.itheima.Main;

import java.util.Random;

public class ShuZuDemo8 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Random Ra=new Random();
        int num=0;
        for (int i1 = 0; i1 < arr.length; i1++) {
            int i=Ra.nextInt(5);
            num=arr[i];
            //先将随机生成的下标所对应的数组值赋给一个变量
            arr[i]=arr[i1];
            //将数组中的值填入其他下标所对应的地方
            arr[i1]=num;
           // 再将随机下标的值赋值此时所生成下标对应的数组位置
            //完成随机排序
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
