package YiChangDemo6;

public class YiChangDemo6 {
    //抛出处理
    //throws
    //注意:写在方法定义处,表示声明一个异常
    //告诉调用者,使用本方法可能会有哪些异常
    //public void 方法()throws 异常类名1,异常类名2.....{....}

    //throw
    //注意:写在方法内结束方法
    //手动抛出异常对象,交给调用者
    //方法中下面的代码不再执行了
    //public void 方法(){throw new 异常类名(异常信息);}
    //编译时异常:必须要写。
    //运行时异常:可以不写。
    public static void main(String[] args) {
        int[] ch1 = {1, 2, 3, 4, 5};
        int max = 0;
        try {
            max = method(ch1);
        } catch (NullPointerException e) {
            System.out.println("数组为空");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组为空");
        }
        System.out.println(max);

    }

    public static int method(int[] ch1) throws NullPointerException,ArrayIndexOutOfBoundsException{
        if (ch1 == null) {//判断数组是否为空
            //手动创建一个异常对象,并把这个异常交给方法的调用者处理
            //此时方法就会结束,下面的代码不会再执行了
            throw new NullPointerException("数组为空");
        }
        if (ch1.length == 0) {//判断数组是否为空
            //手动创建一个异常对象,并把这个异常交给方法的调用者处理
            //此时方法就会结束,下面的代码不会再执行了
            throw new ArrayIndexOutOfBoundsException("数组为空");
        }
        int max = ch1[0];
        for (int j : ch1) {
            if (j >= max) {
                max = j;
            }
        }
        return max;
    }
}
