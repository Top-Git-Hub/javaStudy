package com.itheima.Main;


import java.util.Scanner;

public class FangFaDemo14 {
    public static void main(String[] args) {
        boolean Flag=Exist();
        if(Flag){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }
    }

    public static boolean Exist() {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc=new Scanner(System.in);
        for(int j=0;j<10000;j++) {
            boolean flag = false;
            int a = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (a == arr[i]) {
                    flag = true;
                    break;
                }
            }
            return flag;

        }
        return false;
    }
}
