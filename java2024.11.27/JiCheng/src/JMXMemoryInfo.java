import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
public class JMXMemoryInfo {
    public static void main(String[] args) {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage heapMemoryUsage = memoryMXBean.getHeapMemoryUsage();
        System.out.println("堆内存初始大小：" + heapMemoryUsage.getInit());
        System.out.println("堆内存最大大小：" + heapMemoryUsage.getMax());
        System.out.println("堆内存已使用大小：" + heapMemoryUsage.getUsed());
    }
}