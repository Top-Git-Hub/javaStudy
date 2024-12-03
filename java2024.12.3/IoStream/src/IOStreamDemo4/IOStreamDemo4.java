package IOStreamDemo4;

import java.io.FileInputStream;
import java.io.IOException;

public class IOStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //FileInputStream
        //操作本地文件的字节输入流,可以把本地文件中的数据该续取到程序中来
        //1.创建字节输入流对象
        //2.调用read方法读取数据
        //3.释放资源

        FileInputStream fis = new FileInputStream("C:\\java2024.12.3\\IOStream\\IO1.txt");
        int b1 = fis.read();
        System.out.println(b1);//细节1:一次读一个字节,读出来的是数据在ASCII上对应的数字
        //细节2:读到文件末尾了,read方法返回-1。
        fis.close();
        System.out.println("-----------------");
        FileInputStream f = new FileInputStream("C:\\java2024.12.3\\IOStream\\IO1.txt");
        int b2;
        while ((b2 = f.read()) != -1) {
            System.out.print((char)b2);
        }
        f.close();

    }
}
