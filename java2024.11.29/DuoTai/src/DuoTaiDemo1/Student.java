package DuoTaiDemo1;

public class Student extends Person{
    @Override
    public void Show() {
        System.out.println("学生信息为"+getName()+","+getAge());
    }
}
