package YiChangDemo5;

public class YiChangDemo5 {
    //Throwable类中的常用方法
    //1.返回此 throwable 的详细消息字符串
    //public String getMessage ()

    //2.返回此可抛出的简短描述
    //public String toString ()

    //3.public void printStackTrace ()
    //把异常的错误信息输出在控制台
    public static void main(String[] args) {
        int[] ch1 = {1, 2, 3, 4, 5};
        try {
            System.out.println(ch1[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());//返回此可抛出的详细消息字符串
            System.out.println(e.toString());//返回此可抛出的简短描述
            e.printStackTrace();//把异常的错误信息输出在控制台,仅仅打印信息，不会终止代码
        }
        System.out.println("看看我执行了吗");
        System.err.println(13);//红色字体打印
    }
}
