package GUI;
//Demo57是流体布局
import java.awt.FlowLayout;  //导入流体布局包
import javax.swing.JButton;
import javax.swing.JFrame;
public class Demo57 {
	public static void main(String[] args) {
		new Frame1();
	}
}
@SuppressWarnings("serial")
class Frame1 extends JFrame{
	JButton jbutton1,jbutton2,jbutton3,jbutton4,jbutton5;
	Frame1(){
//		1)创建按钮组件
		jbutton1 =new JButton("文件");	
		jbutton2 =new JButton("编辑");
		jbutton3 =new JButton("格式");
		jbutton4 =new JButton("查看");
		jbutton5 =new JButton("帮助");
//		2）添加按钮组件
		this.add(jbutton1);
		this.add(jbutton2);
		this.add(jbutton3);
		this.add(jbutton4);
		this.add(jbutton5);
//		3）设置布局
		this.setLayout(new FlowLayout());   //流体布局，要导入流体布局包
//		4)显示窗口
		this.setVisible(true);
		this.setSize(500,300);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(Frame1.EXIT_ON_CLOSE);
		this.setTitle("流体布局");     //标题
	}
}