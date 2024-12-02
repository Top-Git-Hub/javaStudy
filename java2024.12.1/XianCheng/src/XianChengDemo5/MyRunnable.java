package XianChengDemo5;

public class MyRunnable implements Runnable{
    public MyRunnable() {
    }
    @Override
    public void run() {
        int num1=0;
        int num2=0;
        for(int i = 0;i < 10;i++){
            Thread thread = Thread.currentThread();
            if(thread.getName().equals("线程1")){
                num1++;
            }else{
                num2++;
            }
            System.out.println(thread.getName()+i);
        }
        System.out.println("线程1的num1="+num1);
        System.out.println("线程2的num2="+num2);
    }
}
