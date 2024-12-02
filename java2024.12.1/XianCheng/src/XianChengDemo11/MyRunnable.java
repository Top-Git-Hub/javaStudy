package XianChengDemo11;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable{
    int ticket=0;
    Lock l=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            l.lock();
            try {
                if(ticket<=100){
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(Thread.currentThread().getName()+"卖出第"+ticket+"张票");
                }else{
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }finally {
                l.unlock();
            }
        }
    }
}
