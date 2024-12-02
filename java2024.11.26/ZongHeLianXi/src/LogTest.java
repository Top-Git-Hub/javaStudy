import java.util.ArrayList;
import java.util.Scanner;

public class LogTest {
    private static ArrayList<Log> list1 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------欢迎来到128寝室学生管理系统-----------------");
        System.out.println("                       1.注册");
        System.out.println("                       2.登录");
        System.out.println("                       3.忘记密码");
        System.out.println("                       4.查询学生");
        System.out.println("                       5.退出");
        System.out.println("----------------------------------------------------------");
        System.out.println("请选择操作");
        int s2 = sc.nextInt();
        switch (s2) {
            case 1:
                list1 = ZhuCe();
                for (int i = 0; i < list1.size(); i++) {
                    System.out.println(list1.get(i).getUsername() + " " + list1.get(i).getPassword() + " " + list1.get(i).getId()+ " " + list1.get(i).getPhone());
                }
                break;
        }

    }

    public static ArrayList<Log> ZhuCe() {
        ArrayList<Log> list2 = new ArrayList<>();
        //用户名
        Scanner sc = new Scanner(System.in);
        Log l = new Log();
        int num2 = 0;
        String z = "";
        String name;
        do {
            System.out.println("请输入用户名");
            name = sc.next();
            if ((name.length() >= 3 && name.length() <= 13) && ((name.charAt(num2) >= 'a' && name.charAt(num2) <= 'z') || (name.charAt(num2) >= 'A' && name.charAt(num2) <= 'Z'))) {
                l.setUsername(name);
            } else {
                System.out.println("用户名格式错误");
                continue;
            }
            System.out.println("请确认用户名:确认/取消");
            z = sc.next();
        } while (!"确认".equals(z));
        l.setUsername(name);
        //账号输入成功
        System.out.println("账号输入成功");
        //密码
        System.out.println("请输入密码");
        int password = sc.nextInt();
        //确认密码
        int password1;
        do {
            System.out.println("请确认密码");
            password1 = sc.nextInt();
            System.out.println("两次密码不一致");
        } while (password1 != password);
        System.out.println("密码输入成功");
        l.setPassword(password);
        //验证身份证号
        int num = 0;
        int flag;
        do {
            //请输入身份证号
            System.out.println("请输入身份证号");
            flag = 0;
            String id1 = sc.next();
            char[] ch1 = new char[18];
            for (int i = 0; i < ch1.length; i++) {
                ch1[i] = id1.charAt(i);
            }
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] < '0' || ch1[i] > '9') {
                    System.out.println("身份证号输入错误");
                    flag = 1;
                    break;
                } else if ((ch1[i] >= '0' && ch1[i] <= '9') || ch1[17] == ('x' | 'X')) {
                    l.setId(String.valueOf(ch1[i]));
                }
            }
        } while (flag == 1);
        System.out.println("身份证号输入成功");
        //验证手机号
        int flag1 = 0;
        do {
            char[] ch2 = new char[11];
            System.out.println("请输入手机号");
            String phone2=sc.next();
            flag1 = 0;
            for (int i = 0; i < ch2.length; i++) {
                ch2[i] = phone2.charAt(i);
            }
            for (int i = 0; i < ch2.length; i++) {
                if (ch2[i] < '0' || ch2[i] > '9') {
                    System.out.println("手机号输入错误");
                    flag1 = 1;
                    break;
                } else if ((ch2[i] >= '0' && ch2[i] <= '9')) {
                    l.setPhone(String.valueOf(ch2[i]));
                }
            }
        } while (flag1 == 1);
        System.out.println("注册成功");
        list2.add(l);
        return list2;

    }

    public static void DengLu(ArrayList<Log> list1) {

    }

    public static void WangJiMiMa() {

    }

}
