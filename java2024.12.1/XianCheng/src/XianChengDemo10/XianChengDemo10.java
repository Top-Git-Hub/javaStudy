package XianChengDemo10;



public class XianChengDemo10 {
    //同步方法
    //就是把synchronized关键字加到方法上
    //特点 1: 同步方法是锁住方法里面所有的代码
    //特点 2: 锁对象不能自己指定
    //当前方法为非静态，锁定对象为this
    //当前方法为静态，锁定对象为当前类的字节码对象
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.setName("窗口1");
        Thread t2 = new Thread(myRunnable);
        t2.setName("窗口2");
        Thread t3 = new Thread(myRunnable);
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
