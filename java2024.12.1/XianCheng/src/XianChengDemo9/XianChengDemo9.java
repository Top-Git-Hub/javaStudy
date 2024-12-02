package XianChengDemo9;

public class XianChengDemo9 {
    public static void main(String[] args) {
        //同步代码块
        //把操作共享数据的代码锁起来
        //特点1:锁默认打开,有一个线程进去了,锁自动关闭
        //特点2:锁对象可以是任意对象
        //特点3:里面的代码全部执行完毕,线程出来,锁自动打开
        //特点4:锁对象必须保证唯一
        //锁对象必须保证唯一
        //格式:synchronized(锁){操作共享数据的代码}
        //
        MyThread mt1= new MyThread();
        mt1.setName("窗口一");
        MyThread mt2= new MyThread();
        mt2.setName("窗口二");
        MyThread mt3= new MyThread();
        mt3.setName("窗口三");
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
