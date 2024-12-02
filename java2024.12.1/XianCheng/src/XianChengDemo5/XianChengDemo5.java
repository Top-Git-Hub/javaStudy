package XianChengDemo5;

import XianChengDemo4.MyThread;

public class XianChengDemo5 {
    public static void main(String[] args) {
        /*
              setPriority(int newPriority) 设置线程优先级
              getPriority() 获取线程优先级
         */
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable, "线程一");
        Thread thread2 = new Thread(myRunnable, "线程二");
        thread1.setPriority(10);
        thread2.setPriority(1);
        thread1.start();
        thread2.start();


    }
}
