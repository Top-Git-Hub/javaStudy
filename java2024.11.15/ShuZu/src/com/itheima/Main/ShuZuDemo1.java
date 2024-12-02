package com.itheima.Main;

public class ShuZuDemo1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int i=0;
        for (int i1 = 0; i1 < arr.length; i1++) {
            i+=arr[i1];
        }
        System.out.println(i);
    }
}
