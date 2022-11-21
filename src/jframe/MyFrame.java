package jframe;

import javax.swing.*;
//自定义窗口类
public class MyFrame extends JFrame{
    public MyFrame(String str) {
        super(str);
        setSize(500,500);
    }
}
//程序入口，实现窗口
class FrameDemo{
    public static void main(String args[]){
        MyFrame fr = new MyFrame("我的第一个窗口");
        fr.setVisible(true);
    }
}