package DuoTaiDemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("李墨涵");
        s.setAge(18);
        Teacher t = new Teacher();
        t.setName("杨光");
        t.setAge(40);
        Administrator a = new Administrator();
        a.setName("张三");
        a.setAge(30);
        //创建一个方法，用来注册
        register(s);
        register(t);
        register(a);
    }
    public static void register(Person p){
        p.Show();
    }
}
