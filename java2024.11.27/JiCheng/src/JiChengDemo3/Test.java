package JiChengDemo3;

public class Test {
    public static void main(String[] args) {

    }
}
class Employee{

}
class Teacher extends Employee{

}
class Lecturer extends Teacher{

}
class Tutor extends Teacher{

}



class AdminStaff extends Employee{
    public void work(){
        System.out.println("AdminStaff work");
        System.out.println("保证公司流畅运行");
    }
}
class Maintainer extends AdminStaff{

}
class Buyer extends AdminStaff{

}