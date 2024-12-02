package DuoTaiDemo1;

public class Administrator extends Person{
    @Override
    public void Show(){
        System.out.println("管理员信息为"+getName()+","+getAge());
    }
}
