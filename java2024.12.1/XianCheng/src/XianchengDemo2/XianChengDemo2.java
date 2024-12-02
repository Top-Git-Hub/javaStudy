package XianchengDemo2;

public class XianChengDemo2 {
    public static void main(String[] args) {
        /*多线程第二种启动方式
        * 1.创建一个类实现Runnable接口
        * 2.重写run方法
        * 3.创建自己类的对象
        * 4.创建一个Thread类的对象，并开启线程
        * */
        MyRun myRun1 = new MyRun();
        Thread thread1 = new Thread(myRun1);
        thread1.setName("线程一");
        thread1.start();
        MyRun myRun2 = new MyRun();
        Thread thread2 = new Thread(myRun2);
        thread2.setName("线程二");
        thread2.start();
    }
}
