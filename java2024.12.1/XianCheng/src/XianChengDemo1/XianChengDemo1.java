package XianChengDemo1;

public class XianChengDemo1 {
    public static void main(String[] args) {
        /*多线程第一种启动方式
        *1.创建一个类继承Thread类
        * 2.重写run方法
        * 3.创建子类的对象，并启动线程
         */
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        mt2.start();//启动线程，调用run方法,利用start
        //mt.run();//调用run方法，不是启动线程
        mt1.start();//启动线程，调用run方法,利用start
        mt2.setName("线程一");
        mt1.setName("线程二");
    }
}
