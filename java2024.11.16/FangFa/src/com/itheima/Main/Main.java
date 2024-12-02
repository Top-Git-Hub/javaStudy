package com.itheima.Main;

public class Main {
    public Main(int i, int i1) {
    }

    public static void main(String[] args) {
        //方法是程序当中最小的执行单元
        //写一个方法提高代码复用性以及可维护性
        //重复的代码，具有独立功能的代码可以抽取到方法中

        //最简单方法定义:
        //1.public static 方法名(){}
        //例如:public static void majn(){}
        //方法调用:方法名()
        PlayGame();
        PlayGame();//重复调用
    }

    public static void PlayGame() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
    }
}