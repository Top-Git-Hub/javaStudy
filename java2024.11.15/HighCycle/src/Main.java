public class Main {
    public static void main(String[] args) {

        //无限循环
        //无限循环下不可写代码，因为永远执行不到
        // 1.for(;;){sout}
        /*for(;;){
            System.out.println("HelloWorld");
        }*/
        //2.while(true){System.out.println}
        /*while (true) {
            System.out.println("HelloWorld");
        }*/
        //3.do{sout};while(true);
        /*do{
            System.out.println("HelloWorld");
        }while (true);*/
        //跳转控制语句:将循环跳出并执行其他语句
        for (int i = 1; i <= 5; i++) {
            //continue:结束本次循环,跳转至下次循环
            if (i == 3) {
                continue;
            }
            //break:结束整个循环
            if (i == 4) {
                break;
            }
            System.out.println("小老虎吃" + i + "个包子");
        }

    }
}