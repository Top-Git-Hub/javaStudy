package GongJv1;

public class ArrayUtil {
    //私有化构造方法
    //不让外界创建其对象
    private ArrayUtil() {
    }

//定义静态方法，方便调用
    public static String PrintArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
           if(i==arr.length-1){
               sb.append(arr[i]);
           }else{
               sb.append(arr[i]).append(",");
           }
        }
        sb.append("]");
        return sb.toString();
    }
    public static double getArrage (double [] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
