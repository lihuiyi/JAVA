package GUI;
//Demo56是JFrame
//JButton按钮作为JFrame的属性：1.创建组件     2.添加组件      3.显示窗口

import javax.swing.JButton;   //导入JButton包
import javax.swing.JFrame;   //导入JFrame包
public class Demo56 {
	public static void main(String[] args) {
		new MyFrame();   //new一个JFrame	
	}
}
//创建一个类，继承JFrame， 在构造方法中初始化窗口
@SuppressWarnings("serial")
class MyFrame extends JFrame{
	JButton jbutton;    //JButton是添加按钮，他作为MyFrame的属性。不要new出来，new的步骤放在构造方法中
	MyFrame(){
		this.setVisible(true);    //是否显示窗口
		this.setSize(500,400);   //设置宽、高
		this.setLocation(400, 150);   //窗口放在坐标为400,150的位置
		this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);   //点击右上角关闭按钮时，退出程序
		jbutton = new JButton("文件");     //new一个JButton， 表示创建按钮组件，但还没添加到MyFrame窗口中
		this.add(jbutton);   //表示把jbutton按钮添加到MyFrame窗口中
		this.setTitle("文件");  //标题
	}
}