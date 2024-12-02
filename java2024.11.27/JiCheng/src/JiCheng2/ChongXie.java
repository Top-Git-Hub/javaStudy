package JiCheng2;
//方法的重写
//当父类的方法不能满足子类现在的需求时,需要进行方法重写

//书写格式
//在继承体系中,子类出现了和父类中一模一样的方法声明,我我们就称子类这个方法是重写的方法。

//@Override重写注解
//1.@Override是放在重写后的方法上,校验子类重写时语法是否正确。
//2.如果父类方法被子类重写后,子类方法名和父类方法名不一致,编译就会报错。


//1.重写方法的名称、形参列表必须与父类中的一致。
//2.子类重写父类方法时,访问权限子类必须大于等于父类(暂时了解:空着不写<protected<public)
//3.子类重写父类方法时,返回值类型子类必须小于等于父类
//4.建议:重写的方法尽量和父类保持一致。
//5.私有方法不能被重写。
//6.子类不能重写父类的静态方法,如果重写会报错的。
//7.只有被添加到虚方法表中的方法才能被重写
public class ChongXie {
    public static void main(String[] args) {
        OverseasStudent o= new OverseasStudent();
        o.lunch();
    }
}
class Person {
    public void eat() {
        System.out.println("吃饭");
    }
    public void Sport(){
        System.out.println("运动");
    }
}
class OverseasStudent extends Person {
    public void lunch() {
        this.eat();
        this.Sport();

        super.eat();
        super.Sport();
    }
    //重写
    @Override
    public void eat() {
        System.out.println("吃西餐");
    }
    @Override
    public void Sport(){
        System.out.println("打篮球");
    }
}
class ChineseStudent extends Person {
    @Override
    public void eat() {
        System.out.println("吃中餐");
    }
    @Override
    public void Sport(){
        System.out.println("打乒乓球");
    }
}
