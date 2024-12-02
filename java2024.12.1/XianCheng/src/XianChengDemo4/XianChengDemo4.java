package XianChengDemo4;

public class XianChengDemo4 {
    public static void main(String[] args) throws InterruptedException {
        //String getName       获取线程名称
        //void setName(String name)  设置线程名称(构造方法也可以构造名字)
        //1、如果我们没有给线程设置名字,线程也是有默认的名字的的
        //格式:Thread-X(X序号,从0开始的)
        //2、如果我们想要给线程设置名字,有两种方式
        //2.1、构造方法设置名字
        //2.2、setName(String name)设置名字
        //2.并且要用第1种时，要在MyThread中调用父类构造方法
        MyThread myThread1 = new MyThread("线程一");//构造方法设置名字
        myThread1.start();
        MyThread myThread2 = new MyThread("线程二");//
        myThread2.start();


       //获取当前线程的对象
       //static Thread currentThread()
       //细节:
       //当JVM虚拟机启动之后,会自动的启动多条线程
       //其中有一条线程就叫做main线程
       //他的作用就是去调用main方法,并执行里面的代码
       //在以前,我们写的所有的代码,其实都是运行在main线程当中
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);


        //让线程休眠指定的时间,单位为毫秒
        //static void sleep(long time)
        //细节:
        //1、哪条线程执行到这个方法,那么哪条线程就会在这里停留对应的时间
        //2、方法的参数:就表示睡眠的时间,单位毫秒
        //1秒=1000毫秒
        //3、当时间到了之后,线程会自动地醒来,继续执行下面的为其他代码

        //System.out.println("睡觉前");
        //Thread.sleep(3000);
        //System.out.println("睡醒了");










    }
}
