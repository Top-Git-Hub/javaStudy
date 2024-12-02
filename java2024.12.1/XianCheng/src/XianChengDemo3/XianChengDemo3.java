package XianChengDemo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class XianChengDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*多线程第三种启动方式
        * 1.创建一个MyCallable类实现Callable接口
        * 2.重写call方法（有返回值，表示多线程运行的结果）
        * 3.创建一个MyCallable对象（表示多线程要执行的任务）
        *4.创建一个FutureTask对象（管理多线程运行的任务）
        * 5.创建一个Thread对象，并启动（表示线程）
        * */
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        Integer i = futureTask.get();
        System.out.println(i);
    }
}
