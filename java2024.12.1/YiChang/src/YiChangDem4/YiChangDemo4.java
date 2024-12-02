package YiChangDem4;

public class YiChangDemo4 {
    public static void main(String[] args) {
        //自己处理(捕获异常)
        //格式:
        //try{可能出现异常的代码;}
        // catch(异常类名 变量名){异常的处理代码;}
        //好处：可以让代码继续运行
        int []ch1={1,2,3,4,5};
        System.out.println("程序结束");
        try{
            System.out.println(ch1[5]);//此处出现了异常,程序就会在这里创建一个ArrayIndexOutOfBoundsException对象
                                       //new ArrayIndexOutOfBoundsException();
                                       //拿着这个对象到catch的小括号中对比,看括号中的变量是否可以按收这个对象
                                       //如果能被按收,就表示该异常就被捕获(抓住),执行catch里面对应的代码
                                       //当catch里面所有的代码执行完毕,继续执行try...catch体系下面的其他代码
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界异常");
        }
        System.out.println("============================");



        try{
            System.out.println(ch1[3]);//4
            //1.question:如果try中没有遇到问题,怎么执行?
            //answer:会把try里面所有的代码全部执行完毕,不会执行catch的代码
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界异常");
        }
        System.out.println("============================");



        try {
            System.out.println(10/0);
            System.out.println(ch1[5]);

            //2question:如果try中可能会遇到多个问题,怎么执行?
            //answer:会写多个catch与之对应
            //细节:
            //如果我们要捕获多个异常,这些异常中如果存在父子关系的话,那么父类一定要写在下面
        }catch(ArithmeticException f){
            System.out.println("除数不能为0");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界异常");
        }
        System.out.println("============================");


        /*try {
            //3.question:如果try中遇到的问题没有被捕获,怎么执行?
            //answer:相当于try catch没有写,会调用jvm的方式进行处理
            System.out.println(ch1[5]);
        }catch ( NullPointerException e){
            System.out.println("空指针异常");
        }*/
        System.out.println("============================");



        try {
            //4.question:如果try中遇到了问题,那么try下面的其他代码还会执行吗?
            //answer:不会执行,就会立即结束try,跳到catch中
            //细节:如果try中遇到了问题,那么try下面的其他代码就不会执行了
            //如果下面没有catch进行捕获，那么会交由jvm进行处理
            System.out.println(ch1[5]);
            System.out.println("程序结束");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界异常");
        }
    }
}
