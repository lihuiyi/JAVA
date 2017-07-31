package ������;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ������ {
	public static void main(String[] args) {
		new Jsq();
	}
}
@SuppressWarnings("serial")
class Jsq extends JFrame implements ActionListener{
	String str1;   //���ڱ����һ������
	String ysf;    //���ڱ��������
	String str2;   //���ڱ���ڶ�����
	String Result=null;  //���ڱ��������
	JPanel jpane11,jpane12;
	JTextField text;
	JButton [] button =new JButton [20];
	Jsq(){
		jpane11 =new JPanel();
		jpane12 =new JPanel();
		this.setLayout(new BorderLayout());
		this.add(jpane11,BorderLayout.NORTH);
		this.add(jpane12,BorderLayout.CENTER);
		text =new JTextField();
		jpane11.add(text);
		text.addActionListener(this);
		String [] buttonName ={"C","","<��","+","7","8","9","-","4","5","6","*","1","2","3","/","0","",".","="};
		for(int i=0;i<button.length;i++){
			button[i] =new JButton(buttonName[i]);
			jpane12.add(button[i]);
			button[i].addActionListener(this);   //Ϊ��ť����¼�������
		}
		jpane11.setLayout(new GridLayout(1,1));
		jpane12.setLayout(new GridLayout(5,4,4,4));
		this.setVisible(true);
		this.setSize(300,300);
		this.setTitle("������");
		this.setLocation(500,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
//actionPerformed()�����ǣ�ʵ��ActionListener�ӿ�,���ĳ����ťʱ,������Ӧ���¼���
	public void actionPerformed(ActionEvent e) {
		String comm =e.getActionCommand();
//20����ť���ࣺ0-9�����ְ�ť            +-*/�������ť	           С����.��ť            �Ⱥ�= ��ť 	   <-��ť               C��ť
//		0-9�����ּ���ť
		if("0123456789".indexOf(comm)!=-1){
			String textValue=text.getText();
			if(textValue==null){
				text.setText(comm);
			}else{
				text.setText(textValue + comm);
			}
//		  +-*/�������ť
		}else if("+-*/".indexOf(comm)!=-1){
			str1=text.getText();
			ysf=comm;
			text.setText(null);
//		С����.��ť
		}else if(comm.equals(".")){
			String textValue =text.getText();    //���С����.��ťʱ����ȡ�ı����е�����
			if(textValue==null){
				text.setText(comm);
			}else{
				if(textValue.indexOf(".")==-1){    //����ı����е�������С����"."   �����ı������ַ�������ƴ��һ��"."�ַ�
					text.setText(textValue + comm);
				}else if(textValue.indexOf(".")!=-1){   //����ı����е�������С����"."   �Ͳ����ظ�����С���㣬��ʱ����С���㰴ť��û�з�Ӧ
					//text.setText(textValue);
				}
			}
//		�Ⱥ�= ��ť
		}else if(comm.equals("=")){
			str2 =text.getText();      //str2���Ա�����ǣ��ڶ��������������
			double num1 =Double.parseDouble(str1);   //�ѵ�һ����ת��Ϊ����
			double num2 =Double.parseDouble(str2);   //�ѵڶ�����ת��Ϊ����
			double result = 0;
			if(ysf.equals("+")){    //ysf���Ա������:�������������������+��,��������num1+num2
				result =num1+num2;
			}else if(ysf.equals("-")){  //ysf���Ա������:�������������������-��,��������num1-num2
				result =num1-num2;
			}else if(ysf.equals("*")){
				result =num1*num2;
			}else if(ysf.equals("/")){
				result =num1/num2;
			}
			Result =String.valueOf(result);    //�Ѽ�����ת��Ϊ�ַ���		
			text.setText(Result);  //������д���ı���
//		   <����ť
		//��ִ�м�����ǰ������ı����������ݣ����һ�� <�� ��ťֻɾ��һ���ַ�������ı����������ݣ������κβ���
		//��ִ�м���󣺵�� <�� ��ť����ı����������������
		//���Ը���Result��ֵ�Ƿ�Ϊnull�����жϵ�ǰ������״̬������ִ�м���ǰ��״̬,���Ǵ���ִ�м�����״̬
		//��ִ�м�����ǰ��Result������null����ִ�м����Result�����Ƿ�null,Ȼ���ٰ�Result�ͷű�Ϊnull��ִ����һ�μ���ǰ��Result��null
		}else if(comm.equals("<��")){
			if(Result==null){   //����Result��ֵΪnull�����жϣ���ǰ����ִ�м�����ǰ��״̬
				StringBuffer textValue =new StringBuffer(text.getText());   //��ȡ�ı����е����ݣ�����ֵ��textValue����
				if(textValue.length()>=1){   //����ı����������ݣ����ַ�������>=1��
					textValue.deleteCharAt(textValue.length()-1);   //��ɾ���ַ�����ĩβ���Ǹ��ַ�
					text.setText(textValue.toString());          //Ȼ����toString()������textValue����ת��Ϊ�ַ���,���ַ���д���ı���
				}else if(textValue.length()<1){   //����ı����������ݣ����ַ�������<1��
					text.setText(textValue.toString());   //��toString()������textValue����ת��Ϊ�ַ���,���ַ���д���ı���
				}
			}else if(Result!=null){  //ִ�м����
				text.setText(null);
				Result=null;       //ִ�м����,��Result�ͷű�Ϊnull, ����Result��ֵΪnull�����жϣ���ǰ����ִ����һ�ּ���ǰ��״̬
			}
//		C��ť
		}else if(comm.equals("C")){
			text.setText(null);
		}
	}
}

