package com.itheima.Main;

public class FangFaDemo6 {
    //带参数的方法定义与调用
    //格式:public static void 方法名(参数){代码}
    //多个参数时，每个参数必须用小逗号隔开，且参数前写上正确的数据类型

    //调用:格式:方法名(赋给参数1的值，赋给参数2的值，...)
    //方法调用时参数的数量与数据类型必须与方法定义小括号内的变量一一对应
    public static void main(String[] args) {
        getSum(10,20);//调用时括号内的为赋给参数的值
    }
    public static void getSum(int i,int j){
        System.out.println(i+j);
    }


}
