//创建sj对象
//StringJoiner sj= new StringJoiner(",","[","]");


//StringJoiner跟StringBuilder一样,也可以看成是一个容器,创建之后里面的内容是可变的。
//作用:提高字符串的操作效率,而且代码编写特别简洁.
//StringJoiner 的构造方法
//1.public StringJoiner (间隔符号)：创建一个StringJoiner对象,指定拼接时的间隔符号
//2.public StringJoiner (间隔符号,开始符号,结束符号)：创建一个StringJoiner对象,指定拼接时的间隔符号
//开始符号、结束符号

import java.util.StringJoiner;

//成员方法
//1.添加数据,并返回对象本身
//public StringJoiner add(添加的内容)
//sj.add
//2.返回长度(字符出现的个数)
//public int length()
//sj.length();
//3.返回一个字符串(该字符串就是拼接之后的结果)
//public String toString()
//sj.toString();
public class Main {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");//创建一个StringJoiner对象,指定拼接时的间隔符号
        //1.添加数据,并返回对象本身
        sj.add("张三").add("李四").add("王五");
        System.out.println(sj);//[张三,李四,王五]
        //2.返回长度(字符出现的个数)
        System.out.println(sj.length());//10
        //3.返回一个字符串(该字符串就是拼接之后的结果)
        System.out.println(sj.toString());//[张三,李四,王五]
    }
}
