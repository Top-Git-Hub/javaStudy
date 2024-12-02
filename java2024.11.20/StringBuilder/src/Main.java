//StringBuilder可以看成是一个容器,创建之后里面的内容是可变的的
//public StringBuilder():创建一个空白可变字符串对象,不含有任何内容
//public StringBuilder(String str):根据传入的字符串内容,来创建可变字符串对象
//StringBuilder sb = new StringBuilder("abc");

//StringBuilder 常用方法
//public StringBuilder append(任意类型):添加数据,并返回对象本身
//public StringBuilder reverse():反转容器中的内容
//public int length():返回容器中字符的个数
//public String toString():通过 toString () 就可以实现把 St ringBuilder 转换为 String
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();//创建一个空白可变字符串对象,不含有任何内容
        StringBuilder dsb = new StringBuilder("abc");//根据传入的字符串内容,来创建可变字符串对象
        System.out.println(sb);//没有值
        System.out.println(dsb);//有值:abc
        // 因为StringBuilder是Java已经写好的类
        //java 在底层对他做了一些特殊处理。
        // 打印对象不是地址值而是属性值。

        //添加数据,并返回对象本身
        dsb.append(123);
        dsb.append("hello");
        dsb.append(2.3);
        System.out.println(dsb);//abc123hello2.3

        //反转容器中的内容
        dsb.reverse();
        System.out.println(dsb);//3.2olleh321cba

        //获取容器中字符的个数
        System.out.println(dsb.length());//14,因为每个字符都占一个位置

        //通过 toString () 就可以实现把 StringBuilder 转换为 String
        //因为StringBuilder只是一个容器，要将它进行转化，才可执行String的运算
        String s = dsb.toString();
        System.out.println(s);//3.2olleh321cba


    }
}