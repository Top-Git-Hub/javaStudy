import javax.swing.*;
import java.awt.*;

public class BoxedOutput extends JFrame {

    public BoxedOutput() {
        // 设置窗口标题
        setTitle("Boxed Output");
        // 设置窗口大小
        setSize(300, 200);
        // 设置窗口关闭按钮的默认操作
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建一个面板
        JPanel panel = new JPanel() {
            // 重写paintComponent方法
            @Override
            protected void paintComponent(Graphics g) {
                // 调用父类的paintComponent方法
                super.paintComponent(g);

                // 绘制一个矩形
                g.drawRect(20, 20, 260, 160);
                // 在矩形中绘制字符串
                g.drawString("1234564789", 50, 100);
            }
        };

        // 将面板添加到窗口中
        add(panel);
    }

    public static void main(String[] args) {
        // 使用SwingUtilities.invokeLater方法来创建并显示窗口
        SwingUtilities.invokeLater(() -> {
            new BoxedOutput().setVisible(true);
        });
    }
}