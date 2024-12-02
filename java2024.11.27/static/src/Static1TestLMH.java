
public class Static1TestLMH {
    public static void main(String[] args) {
        Static1LMH.teacherName = "阿玮老师";
        Static1LMH s1 = new Static1LMH();
        System.out.println("s1"+":"+s1);
        s1.name = "zhangsan";
        s1.age = 23;
        s1.show1();
        System.out.println("======================");
        Static1LMH s2 = new Static1LMH();
        System.out.println("s2"+":"+s2);
        s2.name = "lisi";
        s2.age = 24;
        s2.show1();
    }
}