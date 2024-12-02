package XianChengDemo6;

public class XianChengDemo6 {
    public static void main(String[] args) {
        /*
        * final void setDaemon(boolean on)
        * 设置该线程为守护线程
        * 细节:
          当其他的非守护线程执行完毕之后,守护线程会陆续结束
        * */
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();
        mt1.setName("线程一");
        mt2.setName("线程二");
        mt1.setDaemon(true);
        mt1.start();
        mt2.start();
    }
}
