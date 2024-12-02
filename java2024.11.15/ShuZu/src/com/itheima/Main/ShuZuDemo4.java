package com.itheima.Main;

public class ShuZuDemo4 {
    public static void main(String[] args) {
        int arr[]={33,5,22,44,55};
        int j;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            for(j=i;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    max=arr[j];
                }
            }
        }
        System.out.println(max);
    }
}
