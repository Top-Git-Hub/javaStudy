package XianChengDemo7;

public class XianChengDemo7 {
    public static void main(String[] args) {
        /*
        * public static void yield():出让线程/礼让线程
        * 让结果更均匀一些
        * */
        MyThread mt1 = new MyThread();
        mt1.setName("坦克");
        MyThread mt2 = new MyThread();
        mt2.setName("子弹");
        mt1.start();
        mt2.start();
    }
}
