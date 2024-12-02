public class Main {
    public static void main(String[] args) {
        System.out.println(true & true);
        System.out.println(true&false);
        System.out.println(false&true);
        //&:逻辑上的与关系，表示并且，两边为真，结果才是真
        System.out.println(true|true);
        System.out.println(true|false);
        System.out.println(false|false);
        //|:逻辑上的或关系，表示或者，两边都是假，结果才为假
        System.out.println(true^true);
        System.out.println(true^false);
        System.out.println(false^false);
        //^:逻辑上的异或关系，相同为false，不同为true
        System.out.println(!true);
        //!:逻辑上的非关系，取反

    }
}