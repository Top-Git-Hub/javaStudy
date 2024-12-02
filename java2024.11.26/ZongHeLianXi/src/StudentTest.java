import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    private static List<Student> ss1 = new ArrayList<>();  // 定义为类的成员变量

    public static ArrayList<Student> mainTest1() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list1 = new ArrayList<>();
        int i = 1;
        String X;
        do {
            Student s = new Student();
            System.out.println("请输入第" + i + "名学生的信息");
            System.out.println("请输入第" + i + "名学生的id：");
            int id = sc.nextInt();
            s.setId(id);

            System.out.println("请输入第" + i + "名学生的姓名：");
            String name = sc.next();
            s.setName(name);

            System.out.println("请输入第" + i + "名学生的年龄：");
            int age = sc.nextInt();
            s.setAge(age);

            System.out.println("请输入第" + i + "名学生的家庭住址：");
            String address = sc.next();
            s.setAddress(address);

            list1.add(s);
            i++;
            System.out.println("是否继续录入？(yes/no)");
            X = sc.next();
        } while (!"no".equals(X));
        System.out.println("学生信息录入完毕！");
        return list1;
    }

    public static ArrayList<Student> mainTest2(ArrayList<Student> ss1) {
        System.out.println("请输入要删除学生的id：");
        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();
        for (int i = 0; i < ss1.size(); i++) {
            if (ID == ss1.get(i).getId()) {//如果输入的id与数组中的id相等，则删除该学生
                ss1.remove(i);
            } else if (ID != ss1.get(i).getId() && i == ss1.size()) {
                System.out.println("出错");
            }
        }
        return ss1;
    }

    public static ArrayList<Student> mainTest3(ArrayList<Student> ss1) {
        System.out.println("请输入要修改学生的id：");
        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();
        for (int i = 0; i < ss1.size(); i++) {
            if (ID == ss1.get(i).getId()) {//如果输入的id与数组中的id相等，则修改该学生
                ss1.get(i).setId(ID);
            }
            if (ID != ss1.get(i).getId() && i == ss1.size() - 1) {
                System.out.println("没有该学生");
                continue;
            }
        }
        return ss1;

    }

    public static void mainTest4(ArrayList<Student> ss1) {
        if (ss1.size() == 0) {
            System.out.println("学生信息为空");
        } else {
            System.out.println("学生信息如下：");
            System.out.println("学号" + "  " + "姓名" + "  " + "年龄" + "  " + "家庭住址");
            for (int i = 0; i < ss1.size(); i++) {
                System.out.println(ss1.get(i).getId() + "  " + ss1.get(i).getName() + "  " + ss1.get(i).getAge() + "  " + ss1.get(i).getAddress());
            }
        }
    }

    public List<Student> getSs1() {
        return ss1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        int s1;
        do {
            System.out.println("------------------欢迎来到128寝室学生管理系统-----------------");
            System.out.println("                       1.添加学生");
            System.out.println("                       2.删除学生");
            System.out.println("                       3.修改学生");
            System.out.println("                       4.查询学生");
            System.out.println("                       5.退出");
            System.out.println("----------------------------------------------------------");
            System.out.println("                       请输入你的选择：");
            s1 = sc.nextInt();
            switch (s1) {
                case 1:
                    ss1 = mainTest1();
                    System.out.println("学生信息如下：");
                    for (int i = 0; i < ss1.size(); i++) {
                        System.out.println(ss1.get(i).getId() + " " + ss1.get(i).getName() + " " + ss1.get(i).getAge() + " " + ss1.get(i).getAddress());
                    }
                    break;
                case 2:
                    ArrayList<Student> ss2 = mainTest2((ArrayList<Student>) ss1);
                    System.out.println("删除后学生信息如下：");
                    if (ss1.size() == 0) {
                        System.out.println("学生信息为空");
                    }
                    for (int i = 0; i < ss2.size(); i++) {
                        System.out.println(ss2.get(i).getId() + " " + ss2.get(i).getName() + " " + ss2.get(i).getAge() + " " + ss2.get(i).getAddress());
                    }
                    break;
                case 3:
                    ArrayList<Student> ss3 = mainTest3((ArrayList<Student>) ss1);
                    System.out.println("修改后学生信息如下：");
                    for (int i = 0; i < ss3.size(); i++) {
                        System.out.println(ss3.get(i).getId() + " " + ss3.get(i).getName() + " " + ss3.get(i).getAge() + " " + ss3.get(i).getAddress());
                    }
                    break;
                case 4:
                    mainTest4((ArrayList<Student>) ss1);
                    break;
                case 5:
                    break;

            }
            if(s1 == 5)break;
            System.out.println("是否仍要使用该系统");
            S = sc.next();
        } while (!"no".equals(S)||s1==5);
        System.out.println("谢谢使用，再见！");
    }
}
