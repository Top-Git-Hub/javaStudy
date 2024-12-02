public class SuanShuDemo
{
    public static void main(String[] args)//主入口
    {
        System.out.println(10 / 2);//5
        System.out.println(10 / 3);//3
        //整数计算只能得到整数
        System.out.println(10.0 / 3);//3.3333333333333335
        System.out.println(10.0 / 3.0);//3.3333333333333335
        //有小数参与计算可以得得到小数，但并不准确，若要得到准确的数，后面会讲解
        //除法

        System.out.println(10 % 3);//1
        System.out.println(10 % 5);//0
        System.out.println(10.0 % 3);//1.0
        System.out.println(11.1 % 3);//2.0999999999999996
        //因此可以看出取余计算与除法相似

    }
}
