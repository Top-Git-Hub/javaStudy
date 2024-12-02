package FileDemo2;

import java.io.File;
import java.time.LocalDate;

//1.列出可用的文件系统根
//public static File[] listRoots()
//2.获取当前该路径下所有内容
//public String[] list()
//3.利用文件名过滤器获取当前该路径下所有内容
//public String[] list(FilenameFilter filter)
//4.获取当前该路径下所有内容
public class FileDemo2 {
    public static void main(String[] args) {
        //1.对文件的路径进行判断
        File f1 = new File("C:\\java12.1\\1.txt");
        System.out.println(f1.isDirectory());//判断是否是文件夹
        System.out.println(f1.isFile());//判断是否是文件
        System.out.println(f1.exists());//判断文件是否存在
        System.out.println("====================");
        //2.对文件夹的路径进行判断
        File f2 = new File("C:\\java12.1\\2");
        System.out.println(f2.isDirectory());//判断是否是文件夹
        System.out.println(f2.isFile());//判断是否是文件
        System.out.println(f2.exists());//判断文件是否存在
        System.out.println("====================");
        //3.对一个不存在的路径进行判断
        File f3 = new File("C:\\java12.1\\5");
        System.out.println(f3.isDirectory());//判断是否是文件夹
        System.out.println(f3.isFile());//判断是否是文件
        System.out.println(f3.exists());//判断文件是否存在
        System.out.println("====================");
        //4.返回文件的大小(无法获取文件夹大小)
        System.out.println(f1.length());//返回文件的大小(字节数量)
        File f4 = new File("C:\\java12.1\\屏幕截图 2023-12-28 175648.png");
        System.out.println(f4.length());//返回文件的大小(字节数量)
        System.out.println("====================");
        //5.getAbsolutPath获取文件的绝对路径
        System.out.println(f1.getAbsolutePath());
        System.out.println("====================");
        //6.获取定义文件时使用的路径:getPath
        System.out.println(f1.getPath());//创建对象时，括号内写的是什么，返回的是什么
        System.out.println("====================");
        //7.获取文件名:getName
        System.out.println(f1.getName());//1是文件名，txt是扩展名
        System.out.println("====================");
        System.out.println(f2.getName());//调用者是文件夹只会返回文件夹名
        System.out.println("====================");
        //8.返回文件最后的修改时间(时间毫秒值):lastModified
        long l = f1.lastModified();
        System.out.println(f1.lastModified());
        LocalDate date = LocalDate.ofEpochDay(l / 86400000);
        System.out.println(date);//返回几年几月几日

    }
}
