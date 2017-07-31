package GUI;
//Demo59是JPane1面板
//创建JPane1面板
//JPane1面板添加到窗口
//设置JPane1面板在窗口中的布局
//创建组件
//组件添加到对应的JPane1中
//设置组件在JPane1中的布局
//显示窗口
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Demo59 {
	public static void main(String[] args) {
		new Frame3();
	}
}
@SuppressWarnings("serial")
class Frame3 extends JFrame{
	JButton [] button =new JButton[8];     //定义JButton
	JPanel jpane11,jpane12;    //定义JPane1
	Frame3(){
//		1、创建2个JPane1
		jpane11 =new JPanel();
		jpane12 =new JPanel();
		
//		2、把JPane11和JPane12添加到Frame窗口中
		this.add(jpane11);
		this.add(jpane12);
		
//		3、JPane11和JPane12在Frame窗口中的布局
		this.setLayout(new GridLayout(2,1,5,5));    //网格布局
		
//		4、循环创建按钮组件，把按钮组件分别添加到JPane11和JPane12中
		for(int i=0;i<button.length;i++){
			button[i] =new JButton(String.valueOf(i+1));
			if(i<=1){
				jpane11.add(button[i]);
			}else{
				
				jpane12.add(button[i]);
			}
		}

//		5、其中2个按钮在JPane11中的布局是流体布局，另外6个按钮在JPane12中的布局是网格布局
		jpane11.setLayout(new FlowLayout());    //流体布局
		jpane12.setLayout(new GridLayout(2,3,5,5));   //网格布局
		
//		6、显示窗口
		this.setVisible(true);
		this.setSize(300,200);
		this.setLocation(450,200);
		this.setTitle("JPane1");
		this.setDefaultCloseOperation(Frame3.EXIT_ON_CLOSE);
	}
}