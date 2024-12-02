package YiChangDemo2;

//异常的作用
//作用一:异常是用来查询bug的关键参考信息
public class YiChangDemo2_1 {
    public static void main(String[] args) {
        JavaBean2 jb = new JavaBean2();
        JavaBean2[] arr =new JavaBean2[3];
        String name=arr[0].getName();
    }
}