package 图形化界面_12;

import javax.swing.*;

public class Demo01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("一个简单窗口");
        frame.setSize(300,200);
        frame.setLocation(200,200);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
