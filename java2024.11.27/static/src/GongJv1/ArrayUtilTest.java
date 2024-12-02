package GongJv1;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String s = ArrayUtil.PrintArr(arr);
        System.out.println(s);
        double[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double arrage = ArrayUtil.getArrage(arr1);
        System.out.println(arrage);
    }
}
