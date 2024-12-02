package FileDemo1;

import java.io.File;
//  \表示转义字符
public class FileDemo1 {
    //相对路径：不带盘符
    //绝对路径：带盘符
    //File对象就表示一个路径,可以是文件的路径、也可以是文件夹的路径
    //这个路径可以是存在的,也允许是不存在的
    public static void main(String[] args) {
        //1.public File(String pathname)
        //根据文件路径创建文件对象
        String str1="C:\\Users\\Administrator\\Desktop\\a.txt";
        File f1=new File(str1);
        System.out.println(f1);
        //2.public File(String parent,String child)
        //根据父路径和子路径创建文件对象
        //父路径：a.txt的上一级目录:C:\Users\Administrator\Desktop\\
        //子路径：a.txt
        String str2="C:\\Users\\Administrator\\Desktop";
        String str3="a.txt";
        File f2=new File(str2,str3);
        System.out.println(f2);
        //3.public File(File parent,String child)
        //根据父路径文件对象和子路径名字字符串创建文件对象
        File f3=new File(str2);
        File f4=new File(f3,"a.txt");
        System.out.println(f4);
    }
}
//把字符串表示的路径变成 File 对象
//public File (String pathname)
//把父级路径和子级路径进行拼接
//public File (String parent, String child)
//把父级路径和子级路径进行拼接
//public File (File parent, String child)
