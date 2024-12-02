package XianChengDemo8;

public class XianChengDemo8 {
    public static void main(String[] args) throws InterruptedException {
        /*
        * public final void join()插入线程
        * */
        MyThread mt1=new MyThread();
        mt1.setName("土豆");
        mt1.start();
        mt1.join();//将mt1线程插入到main线程中
        //让mt1先进行
        //执行在main线程
        for(int i=0;i<100;i++){
            System.out.println("main线程"+"$"+i);
        }
    }
}
