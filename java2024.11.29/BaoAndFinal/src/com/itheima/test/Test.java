package com.itheima.test;
import com.itheima.domain1.Teacher;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(18);
        s.setName("张三");
        System.out.println(s.getAge());
        System.out.println(s.getName());
        String s1="Hello World";
        System.out.println(s1);
        //全类名
        com.itheima.domain2.Teacher t = new com.itheima.domain2.Teacher();
        com.itheima.domain1.Teacher t1= new com.itheima.domain1.Teacher();

    }
}
