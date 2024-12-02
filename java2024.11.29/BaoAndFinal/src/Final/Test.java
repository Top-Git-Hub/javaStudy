package Final;

//final修饰方法：表明该方法是最终方法,不能被重写
//final修饰类：表明该类是最终类,不能被继承
//final修饰变量：表明该变量是常量,只能被赋值一次
public class Test {
    public static void main(String[] args) {
        final int a = 10;
        System.out.println(a);
        //a = 20; //常量不能被修改
    }
}

class Fu {
    public final void method() {
        System.out.println("我是final父类方法");
    }
}

class Zi extends Fu {
    //final修饰的方法不能被重写
    //    @Override
    //    public void method() {
    //        System.out.println("我是子类方法");
    //    }
}
final class A {

}
//class B extends A{
//    //final修饰的类不能被继承
//}
