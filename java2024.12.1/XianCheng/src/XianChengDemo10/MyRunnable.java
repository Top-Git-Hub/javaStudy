package XianChengDemo10;

public class MyRunnable implements Runnable{
    int ticket=0;
    @Override
    public void run() {
        while (true){
            synchronized (MyRunnable.class){
                if (method()) break;

            }
        }
    }

    private boolean method() {
        if(ticket<=100){
            ticket++;

            System.out.println(Thread.currentThread().getName()+"正在卖票，票号为："+ticket);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            return true;
        }
        return false;
    }
}
