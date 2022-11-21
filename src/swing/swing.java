package swing;

import java.awt.*;//awt 界面包
import java.awt.event.*;//事件处理包
import javax.swing.*;//Swing 界面包

public class swing {
    public static void main(String args[]){
        JButton b0=new JButton("正常");
        JTextField tf1=new JTextField("Hello",10);
        tf1.setBackground(new Color(200,230,250));
        JButton b1=new JButton("Login");
        b1.setForeground(Color.blue);
        JButton b2=new JButton("Cancel");
        b2.setFont(new Font("Arial",Font.BOLD,15));
        JButton b3=new JButton("确定");
        b3.setEnabled(false);
        add(b0);add(tf1);add(b1);add(b2);add(b3);
    }
}
