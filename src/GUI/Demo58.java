package GUI;
//Demo58�����񲼾�
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
			//1��ѭ��������ť���
			jbuttons[i] =new JButton(String.valueOf(i+1));
			//2��ѭ����Ӱ�ť���
			this.add(jbuttons[i]);
		}
		//3�����ò���
		this.setLayout(new GridLayout(3,3,5,5));    //���񲼾�
		//4����ʾ����
		this.setVisible(true);
		this.setTitle("���񲼾�");
		this.setSize(500,400);
		this.setLocation(300, 100);
		this.setDefaultCloseOperation(Frame2.EXIT_ON_CLOSE);
	}
}