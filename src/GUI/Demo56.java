package GUI;
//Demo56��JFrame
//JButton��ť��ΪJFrame�����ԣ�1.�������     2.������      3.��ʾ����

import javax.swing.JButton;   //����JButton��
import javax.swing.JFrame;   //����JFrame��
public class Demo56 {
	public static void main(String[] args) {
		new MyFrame();   //newһ��JFrame	
	}
}
//����һ���࣬�̳�JFrame�� �ڹ��췽���г�ʼ������
@SuppressWarnings("serial")
class MyFrame extends JFrame{
	JButton jbutton;    //JButton����Ӱ�ť������ΪMyFrame�����ԡ���Ҫnew������new�Ĳ�����ڹ��췽����
	MyFrame(){
		this.setVisible(true);    //�Ƿ���ʾ����
		this.setSize(500,400);   //���ÿ���
		this.setLocation(400, 150);   //���ڷ�������Ϊ400,150��λ��
		this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);   //������Ͻǹرհ�ťʱ���˳�����
		jbutton = new JButton("�ļ�");     //newһ��JButton�� ��ʾ������ť���������û��ӵ�MyFrame������
		this.add(jbutton);   //��ʾ��jbutton��ť��ӵ�MyFrame������
		this.setTitle("�ļ�");  //����
	}
}