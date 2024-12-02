package com.itheima.Main;

public class ShuZuNeiCun2 {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]=arr1;
        //将arr1的地址值赋给arr2
        System.out.println(arr2[0]);
        //arr2与arr1公用一个堆内存
        arr2[0]=2;
        System.out.println(arr1[0]);//2
        System.out.println(arr2[0]);//2
        //因为arr1与arr2共用一个堆内存导致赋值以后arr1与arr2的
        //堆内存发生改变，导致arr1[0]的值发生改变
        //当两个数组所对应一个小空间时，一个数组的空间值发生改变
        //那么其他数组再次访问时的结果就是改变之后的结果
    }
}
