import java.util.Random;

public class Demo3Test1 {
    public static void main(String[] args) {
        Random Ra=new Random();
        for(int i=1;i<=10;i++){
            int a=Ra.nextInt(101)+1;//1~100的随机数
            //如果要生成任意数之间的
            //1.让头尾的数各减去一个值，让这个值从0开始例如7~15
            //7~15->0~8
            //2.尾巴加1,8->9
            //3.最终的结果再加上第一步减去的值
            System.out.println(a);
        }

    }
}
