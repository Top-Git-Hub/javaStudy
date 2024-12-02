//static
//静态变量
//static表示静态,是Java中的一个修饰符,可以修饰成员方法,成员变量
//1.被static修饰的成员变量,叫做静态变量
//特点:被该类所有对象共享
//不属于对象,属于类.
//随着类的加载而加载,优先于对象存在
//调用方式:类名调用/对象名调用
//2.被static修饰的成员方法,叫做静态方法
//特点:多用在测试类和工具类中/Javabean 类中很少会用
//调用方式:类名调用 (推荐)/对象名调用

//Javabean类
//用来描述一类事物的类。比如,Student,Teacher,Dog,Cat等
//测试类
//用来检查其他类是否书写正确,带有main方法的类,是程序的入口
//工具类
//用来提供一些工具方法,比如Math,Arrays,Scanner等，不描述事物

//工具类
//类名
//类名见名知意
//私有化构造方法
//方法定义为静态
/*public class ArrUtil{
private ArrUtil(){}
public static int getMax(...){...}
public static int getmin(...){...}
public static int getsum(...){...}
public static int getAvg(...){...}
}*/

//静态方法只能访问静态变量和静态方法
//非静态方法可以访问静态变量或者静态方法,也可以访问非非静态的成员变量和非静态的成员方法
//静态方法中是没有this关键字

//main方法
//public:
//被JVM调用,访问权限足够大
//static:
//被JVM调用,不用创建对象,直接类名访问
//因为main方法是静态的,所以测试类中其他方法也需要是静净态的。
//void :
//被JVM调用,不需要给JVM返回值
//main:
// 一个通用的名称,虽然不是关键字,但是被JVM识别
//String[] args:
// 以前用于接收键盘录入数据的,现在没用