package IOStreaamDemo2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //FileOutputStream
        //操作本地文件的字节输出流,可以把程序中的数据写到本地文件中。
        //实现步骤:
        //1.创建对象
        //细节1:参数是字符串表示的路径或者是File对象都是可以的
        //细节2:如果文件不存在会创建一个新的文件,但是要保证父级路径是存在的。
        //细节3:如果文件已经存在,会清空文件中的数据,重新写入数据。
        //2.写出数据
        //细节:write方法的参数是整数,但是实际上写到本地文件中的是整数在ASCII上对应的字符
        //3.释放资源
        //每次使用完流之后都要释放资源
        //1.创建对象
        FileOutputStream fos=new FileOutputStream("C:\\java2024.12.3\\IoStream\\IO1.txt");
        //2.写出数据
        fos.write(97);//输入的是ASCII
        //3.释放资源
        fos.close();




        /*一次写一个字节数据:void write (int b)
        一次写一个字节数组数据:void write (byte [] b)
        一次写一个字节数组的部分数据:void write (byte [] b,int off,int len)
        */
        //一次写一个字节数数据:void write (int b)
        //1.创建对象
        FileOutputStream fos1=new FileOutputStream("C:\\java2024.12.3\\IoStream\\IO2.txt");
        //2.写出数据
        fos1.write(98);
        fos1.write(99);
        //3.释放资源
        fos1.close();


        //一次写一个字节数组数据:void write (byte [] b)
        //1.创建对象
        FileOutputStream fos2=new FileOutputStream("C:\\java2024.12.3\\IoStream\\IO3.txt");
        //2.写出数据
        byte [] bytes={100,101,102,103,104,105};
        fos2.write(bytes);
        //3.释放资源
        fos2.close();

        //一次写一个字节数组的部分数据:void write (byte [] b,int off,int len)
        //参数一：数组
        //参数二：起始索引
        //参数三：个数
        //1.创建对象
        FileOutputStream fos3=new FileOutputStream("C:\\java2024.12.3\\IoStream\\IO4.txt");
        //2.写出数据
        byte [] bytes1={100,101,102,103,104,105};
        fos3.write(bytes1,2,3);
        //3.释放资源
        fos3.close();






    }
}
