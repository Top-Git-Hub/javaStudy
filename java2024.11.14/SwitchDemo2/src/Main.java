public class Main {
    public static void main(String[] args) {
        //default的位置与省略
        //default可以省略，但是不建议,并且写在最下面
        //case的穿透：如果case中不加break，那么会向下一个case执行输出两个代码
        //if一般用于对范围的判断,switch把有限个数据一一列举来进行选择
        int number = 1;
        /*switch(number){
            case 1:
                System.out.println("一");
                break;
            case 10:
                System.out.println("二");
                break;
            case 100:
                System.out.println("三");
                break;
            case 1000:
                System.out.println("四");
                break;
        }*/
        /*switch(number){
            case 1-> {
                System.out.println("一");
            }
            case 10-> {
                System.out.println("二");
            }
            case 100->{
                System.out.println("三");
            }
            case 1000-> {
                System.out.println("四");
            }
            default->{
                System.out.println("无");
            }
        }*/
        //箭头可以替代break
        switch (number) {
            case 1 -> System.out.println("一");
            case 10 -> System.out.println("二");
            case 100 -> System.out.println("三");
            case 1000 -> System.out.println("四");
            default -> System.out.println("无");
        }//利用箭头简化书写

    }
}