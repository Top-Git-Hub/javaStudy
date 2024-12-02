package DuoTaiDemo1;

public class Teacher extends Person{
    @Override
    public void Show() {
        System.out.println("老师信息为"+getName()+","+getAge());
    }
}
