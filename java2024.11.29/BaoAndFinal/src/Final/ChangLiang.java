package Final;

public class ChangLiang {
    public static void main(String[] args) {
        final int a = 10;
        //a = 20; //编译错误，常量不能被修改
        System.out.println(a);
        final String b="aaa";
        //b = "bbb"; //编译错误，地址值不能被修改
        System.out.println(b);
        final ChangLiangBean c = new ChangLiangBean(10,"lisi");
        c.setId(10);
        c.setName("liwu");
        //s= new ChangLiangBean(10,"lisi"); //编译错误，地址值不能被修改
    }
}
