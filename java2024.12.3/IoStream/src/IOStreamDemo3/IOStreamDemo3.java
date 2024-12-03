package IOStreamDemo3;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
        换行写：
        Windows:换行符:  \r\n
        Linux:换行符:  \n
        Mac:换行符:  \r



        续写：
         如果想要续写,打开续写开关即可
         开关位置:创建对象的第二个参数
         默认false:表示关闭续写,此时创建对象会清空文件
         手动传递true:表示打开续写,此时创建对象不会清空文件


         */
        FileOutputStream fos = new FileOutputStream("C:\\java2024.12.3\\IOStream\\IO1.txt", true);
        String str1 = "hello world";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);
        fos.write("\r\n".getBytes());
        String str2 = "LIMOHAN";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2);
        fos.close();

    }
}
