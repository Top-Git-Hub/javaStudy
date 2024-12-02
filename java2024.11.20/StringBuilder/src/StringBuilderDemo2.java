public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append("def").append("ghi").append("jkl").append("mno");
        System.out.println(sb); // abcdefghijklmno

    }
}
