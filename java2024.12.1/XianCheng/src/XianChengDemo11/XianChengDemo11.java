package XianChengDemo11;

public class XianChengDemo11 {
    public static void main(String[] args) {
        //Lock锁
        //虽然我们可以理解同步代码块和同步方法的锁对象问题,
        //但是我们并没有直接看到在哪里加上了锁,在哪里释放了锁,
        //为了更清晰的表达如何加锁和释放锁,JDK5以后提供了一个新的锁对象Lock

        //Lock实现提供比使用synchronized方法和语句可以获得更广泛的锁定操作
        //Lock中提供了获得锁和释放锁的方法
        //void lock():获得锁
        //void unlock():释放锁

        //Lock是接口不能直接实例化,这里采用它的实现类ReentrantLock来实例化
        //ReentrantLock的构造方法
        //ReentrantLock():创建一个ReentrantLock的实例
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t1.start();
        t2.start();
    }
}
