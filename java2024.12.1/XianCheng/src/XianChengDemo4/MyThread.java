package XianChengDemo4;

public class MyThread extends Thread{
    public MyThread() {
    }
    public MyThread(String name) {
        super(name);//调用父类的有参构造方法
        //因为父类的构造方法不可以继承，所以要用super去调用
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName()+"@"+i);
        }
    }


}
