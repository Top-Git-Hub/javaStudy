package com.itheima.Main;

public class FangFaDemo15 {
    //    public static void main(String[] args) {
//        int[] result =copyOfRange(5, 10);
//        for(int i=0;i<6;i++){
//            System.out.println(result[i]+" ");
//        }
//    }
//
//    public static int[] copyOfRange(int from, int to) {
//        int[] arr = new int[20];
//        Random Ra = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= Ra.nextInt(arr.length);
//        }
//        int []brr=new int [6];
//        int num=5;
//        for (int i = 0; i < brr.length; i++) {
//            brr[i]=arr[num];
//            num++;
//            return new int[]{brr[i]};
//        }
//        return arr;
//    }
    public static void main(String[] args)
    {
        int[] arr =new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] Arr = copyOfRange(arr,3,7);
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i]+" ");
        }
    }

    public static int [] copyOfRange(int[] arr, int from, int to)
    //返回数组在int后面加上[]
    {
        int[] brr =new int [to-from];
        int num=0;
        for (int i = from; i < to; i++) {
            brr[num]=arr[i];
            num++;
        }
        return brr;
    }
}
