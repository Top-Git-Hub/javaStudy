package YiChangDemo2;

public class YiChangDemo2_2 {
    //作用二:异常可以作为方法内部的一种特殊返回值,以便通知调用者底层
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            if(arr[i] <3 ){
                throw new RuntimeException("数组下标越界");
            }else{
                System.out.println(arr[i]);
            }
        }

    }
}
