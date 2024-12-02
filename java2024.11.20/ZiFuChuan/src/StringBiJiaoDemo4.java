import java.util.Arrays;

public class StringBiJiaoDemo4 {
    public static void main(String[] args) {
        String[] arr = {"abc", "def", "ghi", "jkl"};
        String brr = Arrays.toString(mainTest(arr));
    }
    public static String[] mainTest(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
        return null;
    }
}

