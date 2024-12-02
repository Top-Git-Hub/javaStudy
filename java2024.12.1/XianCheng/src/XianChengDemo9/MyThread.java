package XianChengDemo9;

public class MyThread extends Thread {
    static int ticket = 0;
    //如果synchronized写在循环外面就会导致一个线程一直循环从而其他线程进不去
    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class)
            {
                if (ticket < 100) {
                    try {
                        Thread.sleep(0);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
