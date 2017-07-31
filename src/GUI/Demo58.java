package GUI;
//Demo58是网格布局
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo58 {
	public static void main(String[] args) {
		new Frame2();
	}
}
@SuppressWarnings("serial")
class Frame2 extends JFrame{
	Frame2(){
		JButton [] jbuttons =new JButton [9];
		for(int i=0;i<jbuttons.length;i++){
			//1、循环创建按钮组件
			jbuttons[i] =new JButton(String.valueOf(i+1));
			//2、循环添加按钮组件
			this.add(jbuttons[i]);
		}
		//3、设置布局
		this.setLayout(new GridLayout(3,3,5,5));    //网格布局
		//4、显示窗口
		this.setVisible(true);
		this.setTitle("网格布局");
		this.setSize(500,400);
		this.setLocation(300, 100);
		this.setDefaultCloseOperation(Frame2.EXIT_ON_CLOSE);
	}
}