package com.itheima.Main;

public class ShuZuDemo6 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int i=0;
        i=arr[0];
        arr[0]=arr[4];
        arr[4]=i;
        int j=0;
        j=arr[1];
        arr[1]=arr[3];
        arr[3]=j;
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1]+" ");
        }

    }
}
