package GongJv2;

import java.util.ArrayList;

public class StudentUtilTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 18, "男"));
        list.add(new Student("李四", 20, "男"));
        list.add(new Student("王五", 19, "男"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+" "+list.get(i).getAge()+" "+list.get(i).getGender());
        }
        System.out.println("最大年龄为：");
        int i = StudentUtil.MaxAge(list);
        System.out.println(i);
    }
}
