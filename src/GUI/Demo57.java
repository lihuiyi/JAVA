package GUI;
//Demo57�����岼��
import java.awt.FlowLayout;  //�������岼�ְ�
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
//		1)������ť���
		jbutton1 =new JButton("�ļ�");	
		jbutton2 =new JButton("�༭");
		jbutton3 =new JButton("��ʽ");
		jbutton4 =new JButton("�鿴");
		jbutton5 =new JButton("����");
//		2����Ӱ�ť���
		this.add(jbutton1);
		this.add(jbutton2);
		this.add(jbutton3);
		this.add(jbutton4);
		this.add(jbutton5);
//		3�����ò���
		this.setLayout(new FlowLayout());   //���岼�֣�Ҫ�������岼�ְ�
//		4)��ʾ����
		this.setVisible(true);
		this.setSize(500,300);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(Frame1.EXIT_ON_CLOSE);
		this.setTitle("���岼��");     //����
	}
}