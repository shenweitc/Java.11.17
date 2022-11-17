package 图形化界面_12;

import javax.swing.*;

public class Demo03 {
    public static void main(String[] args) {
        new MyJFrame().init("Java菜单设计");

    }
}

class MyJFrame extends JFrame{
    JMenuBar menuBar;
    JMenu menu1,menu2,menu3,menu4,submenu1;
    JMenuItem Open,Flush,Package,Class,Close,Save,Cut,Paste,About;

    void init(String s){
        setTitle(s);
        menuBar = new JMenuBar();

        menu1=new JMenu("文件");
        menu2=new JMenu("编辑");
        menu3=new JMenu("搜索");
        menu4=new JMenu("帮助");
        submenu1=new JMenu("新建");

        Open=new JMenuItem("打开");
        Flush=new JMenuItem("刷新");
        Package=new JMenuItem("包");
        Class=new JMenuItem("类");
        Close=new JMenuItem("关闭");
        Save=new JMenuItem("保存");
        Cut=new JMenuItem("剪切");
        Paste=new JMenuItem("粘贴");
        About=new JMenuItem("关于");

        submenu1.add(Package);
        submenu1.add(Class);
        menu1.add(submenu1);
        menu1.add(Open);
        menu1.add(Close);
        menu1.add(Flush);
        menu1.add(Save);
        menu2.add(Cut);
        menu2.add(Paste);
        menu4.add(About);

        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);

        setJMenuBar(menuBar);
        setLocation(100,300);
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}