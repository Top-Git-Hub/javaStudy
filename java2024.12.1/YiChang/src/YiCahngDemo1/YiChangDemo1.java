package YiCahngDemo1;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class YiChangDemo1 {
    //异常:异常就是代表程序出现的问题
    //Throwable:异常的父类
    //Error:错误,java程序中不能解决的严重问题,如:JVM系统内部错误,资源耗尽等,出现这种问题,java程序将无法处理,只能终止程序的执行
    //Exception:异常,java程序中程序本身可以处理的异常,如:空指针异常,数组下标越界异常,类型转换异常,算数异常等
    //RuntimeException是Exception的子类:运行时异常
    //非RuntimeException是Exception的子类:编译时异常

    //编译时异常和运行时异常的区别?
    //编译时异常:没有继承RuntimeException的异常,直接继承于Excpetion。
    //编译阶段就会错误提示
    //运行时异常:RuntimeException本身和子类。
    //编译阶段没有错误提示,运行时出现的
    public static void main(String[] args) {
        //编译时异常
        /*String time="2020-10-10";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Data data=sdf.parse(time);
        System.out.println(data);*/
        //运行时异常,在编译阶段是不需要处理的,是代码运行时出现的异常
        int[] arr={1,2,3};//数组下标越界异常
        System.out.println(arr[3]);
    }
}
//java文件进行javac编译转化为为字节码文件
//编译时异常:编译阶段就要进行处理的异常。(如:日期解析异常)
//运行时异常:RuntimeException及其子类,编译阶段不需要处理，代码运行时出现的异常(如:数组索引越界异常)
//编译阶段:
//Java不会运行代码,只会检查语法是否错误,或者做一些性能老的优化