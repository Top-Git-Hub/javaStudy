import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        // 获取当前日期
        LocalDate currentDate = LocalDate.now();
        System.out.println("当前日期: " + currentDate);

        // 获取年份
        int year = currentDate.getYear();
        System.out.println("年份: " + year);

        // 获取月份（返回值是1-12的整数）
        int month = currentDate.getMonthValue();
        System.out.println("月份: " + month);

        // 获取日
        int day = currentDate.getDayOfMonth();
        System.out.println("日: " + day);
    }
}