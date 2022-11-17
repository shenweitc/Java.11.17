package 图形化界面_12;

import javax.swing.*;

public class Demo02 {
    public static void main(String[] args) {
        new MyFrame("一个窗口",300,200,200,200);
    }
}

class MyFrame extends JFrame{
    MyFrame(String title,int x,int y,int width,int height){
        super(title);
        setLocation(x,y);
        setSize(width,height);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}