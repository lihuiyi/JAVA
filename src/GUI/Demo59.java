package GUI;
//Demo59��JPane1���
//����JPane1���
//JPane1�����ӵ�����
//����JPane1����ڴ����еĲ���
//�������
//�����ӵ���Ӧ��JPane1��
//���������JPane1�еĲ���
//��ʾ����
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
	JButton [] button =new JButton[8];     //����JButton
	JPanel jpane11,jpane12;    //����JPane1
	Frame3(){
//		1������2��JPane1
		jpane11 =new JPanel();
		jpane12 =new JPanel();
		
//		2����JPane11��JPane12��ӵ�Frame������
		this.add(jpane11);
		this.add(jpane12);
		
//		3��JPane11��JPane12��Frame�����еĲ���
		this.setLayout(new GridLayout(2,1,5,5));    //���񲼾�
		
//		4��ѭ��������ť������Ѱ�ť����ֱ���ӵ�JPane11��JPane12��
		for(int i=0;i<button.length;i++){
			button[i] =new JButton(String.valueOf(i+1));
			if(i<=1){
				jpane11.add(button[i]);
			}else{
				
				jpane12.add(button[i]);
			}
		}

//		5������2����ť��JPane11�еĲ��������岼�֣�����6����ť��JPane12�еĲ��������񲼾�
		jpane11.setLayout(new FlowLayout());    //���岼��
		jpane12.setLayout(new GridLayout(2,3,5,5));   //���񲼾�
		
//		6����ʾ����
		this.setVisible(true);
		this.setSize(300,200);
		this.setLocation(450,200);
		this.setTitle("JPane1");
		this.setDefaultCloseOperation(Frame3.EXIT_ON_CLOSE);
	}
}