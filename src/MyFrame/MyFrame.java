package MyFrame;
import java.awt.*;//awt 界面包
import java.awt.event.*;//事件处理包
import javax.swing.*;//Swing 界面包
public class MyFrame extends JFrame{
    JTextField t1;
    JButton b1,b2;
    public MyFrame (String title){
        super(title);//调用父类构造器设置标题
        setSize(400,200);
        //设置布局管理器
        setLayout(new FlowLayout());
        //添加按钮文本框等组件
        b1 = new JButton("Add");
        b2 = new JButton("Cancel");
        t1=new JTextField(50);
        b1.setFont(new Font("黑体",Font.BOLD,20));
        b2.setFont(new Font("黑体",Font.BOLD,20));
        t1.setFont(new Font("黑体",Font.BOLD,20));
        //事件处理第 3 步：按钮关联 Action 事件监听器对象
        MyListenerClass bln = new MyListenerClass();
        b1.addActionListener(bln);
        b2.addActionListener(bln);
        //添加按钮文本框等组件到窗口中
        add(b1);
        add(b2);
        add(t1);
        //窗口关联 Window 事件监听器对象
        this.addWindowListener(new WindowAdapter() {
            //当窗口关闭时调用该处理方法
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    //事件处理第 1 步：自定义一个按钮点击（Action 事件）监听器类类
    class MyListenerClass implements ActionListener{
        //事件处理第 2 步：按钮点击的事件处理方法
        public void actionPerformed(ActionEvent e) {
            String s=t1.getText();
            if( e.getActionCommand().equals("Add")){
                t1.setText(s+"b1..Hit..");
            }else{
                if (s.length()>=9)
                    t1.setText(t1.getText().substring(0,s.length()-9));
            }
        }
    }
}
