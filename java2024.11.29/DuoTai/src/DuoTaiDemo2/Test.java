package DuoTaiDemo2;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        //调用成员变量:编译看左边,运行也看左边
        //编译看左边:javac编译代码的时候,会看左边的父类中有没有这个变量,如果有,编译成功,如果没有编译失败。
        //运行也看左边:java运行代码的时候,实际获取的就是左边父类中成员变量的值
        System.out.println(a1.name);
        //调用成员方法:编译看左边,运行看右边
        //编译看左边:javac编译代码的时候,会看左边的父类中有没有这个方法,如果有,编译成功,如果没有编译失败。
        //运行看右边:java运行代码的时候,实际调用的是右边子类中重写的方法
        a1.show();
    }
}

class Animal {

    String name = "动物";

    public void show() {
        System.out.println("Animal --- show 方法");
    }
}

class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("Dog----show 方法");
    }
}

class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat --- show 方法");
    }
}