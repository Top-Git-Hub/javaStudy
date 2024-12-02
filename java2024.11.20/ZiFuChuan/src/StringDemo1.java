//字符串的创建
public class StringDemo1
{
    public static void main(String[] args) {
        //直接赋值
        String s = "hello";
        System.out.println("*"+s+"*");
        //空参构造
        String s1 = new String();
        System.out.println("*"+s1+"*");
        //有参构造
        String s2 = new String("hello");//可以不写
        System.out.println("*"+s2+"*");
        //传递一个字符数组，根据字符数组的内容在创建一个新的字符串对象
        //因为字符串不可改变，但可以改变字符串中的内容，所以可以先改变数组中的内容
        //再将字符数组的内容赋值给字符串，改变字符串中的内容
        char[] chs = {'a','b','c'};
        String s3 = new String(chs);
        System.out.println("*"+s3+"*");
        //传递一个字节数组，根据字节数组的内容在创建一个新的字符串对象
        //先拿数字到ascii码表中找到对应的字符，再根据字符创建字符串
        //网络中我们一般要把字节信息进行转换,转成字符串,此时就要用到这个构造
        byte[] bytes = {97,98,99};
        String s4 = new String(bytes);
        System.out.println("*"+s4+"*");
    }
}
