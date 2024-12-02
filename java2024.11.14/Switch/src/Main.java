//switch语句格式:switch(表达式){case 值1:语句体1;break;case 值2:语句体2;break;default:语句体n+1;break;)}
//表达式取值为byte,short,int,char,String
//case后的值只能是字面量，不可以是变量
//case后的值不可重复
public class Main {
    public static void main(String[] args) {
        String noodles="武汉热干面";

        switch (noodles){
            case"兰州拉面":
                System.out.println("吃兰州拉面");
            break;
            case"武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
            default:
                System.out.println("吃方便面");
                break;

        }

    }
}