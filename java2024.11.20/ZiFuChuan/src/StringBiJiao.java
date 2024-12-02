//String的比较
public class StringBiJiao {
    public static void main(String[] args) {
        //如果是基本数据类型==是判断值是否相等
        //如果是引用数据类型==是判断地址是否相等
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);//true
        String s3 = new String("hello");
        System.out.println(s1 == s3);//false
        //s3记录的是堆空间的地址值
        //s1记录的是串池的地址值
        //字符串比较
        //1.使用equals方法：boolean equals(要比较的字符),区分大小写,完全一样结果为true
        //2.equalsIgnoreCase(要比较的字符串)方法：忽略大小写比较
        String s4 = "hello";
        String s5=new String("Hello");
        System.out.println(s4==s5);//false
        boolean result = s4.equals(s5);
        System.out.println(result);//false
        boolean b = s5.equalsIgnoreCase(s4);
        System.out.println(b);//true
    }
}
