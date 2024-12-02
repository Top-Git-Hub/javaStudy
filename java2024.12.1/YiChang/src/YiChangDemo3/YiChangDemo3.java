package YiChangDemo3;

public class YiChangDemo3 {
    //JVM默认的处理方式
    //1.把异常的名称,异常原因及异常出现的位置等信息输出在了控制台
    //2.程序停止执行,下面的代码不会再执行了
    public static void main(String[] args) {
        System.out.println("开始");
        System.out.println(10/0);//ArithmeticException算数异常
        System.out.println("过程");
        System.out.println("结束");
    }
}
