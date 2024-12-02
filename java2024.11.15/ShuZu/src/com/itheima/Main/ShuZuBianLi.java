package com.itheima.Main;

public class ShuZuBianLi {
    public static void main(String[] args) {
        int []A={11,12,13,14,5,45,21,5,5,14,1,2};
//        System.out.println(A[0]);
//        System.out.println(A[1]);
//        System.out.println(A[2]);
//        System.out.println(A[3]);
//        for(int i=0;i<=3;i++){
//          System.out.println(A[i]);
//      }
        System.out.println(A.length);
      //java中，关于数组的一个长度属性:length
      //调用方法:数组名.length
//        for(int i=0;i<A.length;i++){
//            System.out.println(A[i]);
//
//        }
        //自动快捷生成数组的遍历方式
        //数组名.fori
        for(int i = 0; i < A.length; i++) {
            System.out.println(A[i]);

        }
    }
}
