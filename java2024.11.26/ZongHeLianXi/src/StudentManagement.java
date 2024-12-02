import java.util.ArrayList;
import java.util.List;

// 定义学生类
class Student1 {
    private String name;
    private int id;


    public Student1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}




public class StudentManagement {
    // 用于存储学生信息的列表
    private static List<Student1> students = new ArrayList<>();

    // 添加学生信息的方法
    public static void addStudent(String name, int id) {
        Student1 newStudent = new Student1(name, id);
        students.add(newStudent);
        System.out.println("成功添加学生: " + name + ", 学号: " + id);
    }

    // 删除学生信息的方法，通过学号来删除已添加的学生
    public static void deleteStudent(int id) {
        for (Student1 student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("成功删除学生: " + student.getName() + ", 学号: " + id);
                return;
            }
        }
        System.out.println("未找到学号为 " + id + " 的学生，无法删除");
    }

    public static void main(String[] args) {
        // 添加学生信息
        addStudent("张三", 1001);
        addStudent("李四", 1002);

        // 删除学生信息
        deleteStudent(1001);

        // 再次尝试删除（此处尝试删除一个已经删除了的学生，用于测试删除不存在情况的逻辑）
        deleteStudent(1001);
    }
}