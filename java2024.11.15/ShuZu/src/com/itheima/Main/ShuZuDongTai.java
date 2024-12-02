package com.itheima.Main;
import java.util.Scanner;
public class ShuZuDongTai {
    public static void main(String[] args) {
        //动态初始化
        //格式:数据类型[]数组名=new 数据类型[数组长度]
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[4];
        int i=0;
        while(i<4){
            int a=sc.nextInt();
            arr[i]=a;
            i++;
        }
        System.out.println(arr[0]);
        //数组默认初始化值
        //整数类型:默认初始化值为0
        //小数类型:默认初始化值为0.0
        //字符类型:默认初始化值'/u0000',也就是一个空格
        //boolen:默认初始化值:false
        //引用数据类型(除了以上数据类型都是引用数据类型):默认初始化值:null
        //动态初始化:手动指定数组长度，由系统给出默认初始化值
        //静态初始化:手动指定数组元素，系统会根据元素个数，计算数组长度
    }
}
