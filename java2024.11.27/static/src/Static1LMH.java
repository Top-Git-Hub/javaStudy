
public class Static1LMH {

    String name;
    int age;
    static String teacherName;

    //this: 表示当前方法调用者的地址值。
    // 这个 this: 是由虚拟机赋值的。
    public void show1(Static1LMH this) {
        System.out.println(name + "," + age + "," + teacherName);
    }

    public static void method() {
        System.out.println("静态方法");
    }
}
