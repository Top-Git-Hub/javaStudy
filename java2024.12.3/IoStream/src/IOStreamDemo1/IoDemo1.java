package IOStreamDemo1;

public class IoDemo1 {
    public static void main(String[] args) {
        //IO流
        //用于读写文件中的数据(可以读写文件,或网络中的数据...)
        //1.Io流可以把程序中帮的数据保存(output)到本地文件当中
        //2.可以把本地文件中的数据读取(input)到程序中
        //以程序为参照物进行读取，程序读取文件中的数据，程序(内存)往文件当中写出数据

        //IO流分类
        //1.按数据流向分
        //输入流：程序从文件中读取数据(InputStream)
        //输出流：程序往文件中写出数据(OutputStream)
        //2.按数据类型分
        //字节流(Reader)：以字节为单位读写数据,可以操作任意类型的文件
        //字符流(Writer)：以字符为单位读写数据,只能操作纯文本文件(Windows自带的记事本打开能读懂:txt,xml,md,lrc等等)
        //以上四种流全为抽象类

    }
}