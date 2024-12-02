package com.itheima.Main;

public class ShuZuDemo7 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int j=0;
        int k=arr.length;
        if(arr.length%2!=0) {
            for (int i = 0; i < arr.length; i++) {
                j = 0;
                j = arr[i];
                arr[i] = arr[k - 1];
                arr[k - 1] = j;
                if(i==k-1){
                    break;
                }
                k--;
            }
        }
        if(arr.length%2==0) {
            for (int i = 0; i < arr.length; i++) {
                j = 0;
                j = arr[i];
                arr[i] = arr[k - 1];
                arr[k - 1] = j;
                if(i==k-2){
                    break;
                }
                k--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
