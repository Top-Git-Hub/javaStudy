package GongJv2;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }

    public static int  MaxAge(ArrayList<Student> list) {
        int max = list.getFirst().getAge();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge() > max) {
                max = list.get(i).getAge();
            }
        }
        return max;
    }
}
