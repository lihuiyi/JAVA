package GUI;
//Demo60��ģ��QQ��¼��ע����档����Ϊ��ť����˵���¼���
//����¼������һ���࣬�̳�JFrame,��ʵ��Actionlistener�ӿ�,��д�ӿڵķ������������Ǵ����¼�ʱִ�еĴ��롣
//Ϊ��ť��Ӽ�����addActionlistener(this)��������ʵ�ֽӿڵĶ���,�����ǰ����ʵ���˽ӿڣ�this��ʾ��ǰ�������в�����this
//ʵ�ֽӿڵķ����У�e.getActionCommand()  ����ֵ�ǣ������¼��İ�ť����
//�ı�����.geText() ��ʾ��ȡ�ı����е�����
//�ı�����.setText(�ַ���)  ��ʾ���ַ���д���ı�����
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Demo60 {
	public static void main(String[] args) {
		new Login();
	}
}
@SuppressWarnings("serial")
class Login extends JFrame implements ActionListener{   //Login�̳���JFrame,����ʵ���˽ӿ�Actionlistener
	//��дActionlistener�ӿڵķ���,�¼�����ʱִ���������
	public void actionPerformed(ActionEvent e) {
		String comm = e.getActionCommand();    //����ֵ�ǣ������¼��İ�ť����
		if(comm=="��¼"){
			if(userName.getText().equals("") && passWord.getPassword().equals("")){
				System.out.println("�������˺š����롣���û���˺ţ�����ע�ᡣ");
			}else if(userName.getText().equals("1620164006") && passWord.getPassword().equals("123456")){
				System.out.println("��¼�ɹ�");
			}else{
				System.out.println("�˺Ż��������");
			}
		}else if(comm.equals("ע��")){
			new Zhuce();
			this.setVisible(false);
		}
	}
	JPanel jpane11,jpane12,jpane13;
	JTextField userName;
	JPasswordField passWord;
	JLabel userNameLabel,passWordLabel;
	JButton login,zhuce;
	Login(){
		jpane11 =new JPanel();
		jpane12 =new JPanel();
		jpane13 =new JPanel();
		this.add(jpane11);
		this.add(jpane12);
		this.add(jpane13);
		this.setLayout(new GridLayout(3,1,5,50));
		jpane11.setLayout(new GridLayout(1,2));
		jpane12.setLayout(new GridLayout(1,2));
		jpane13.setLayout(new FlowLayout());
		userNameLabel =new JLabel("QQ�˺�");
		passWordLabel =new JLabel("QQ����");
		userName =new JTextField();
		passWord =new JPasswordField();
		login =new JButton("��¼");
		zhuce =new JButton("ע��");
		jpane11.add(userNameLabel);
		jpane11.add(userName);
		jpane12.add(passWordLabel);
		jpane12.add(passWord);
		jpane13.add(login);
		jpane13.add(zhuce);
		//Ϊlogin��ť����¼�
		//addActiontener()������Ϊlogin��ť����¼���
		//������ӵ��¼�����һ���¼���Ҫ��������������ʵ�ֽӿڵĶ����ö���Ż����ʵ�ֽӿڵķ���
		login.addActionListener(this);   //this�ǵ�ǰ����,��ǰ����ʵ���˽ӿ�
		zhuce.addActionListener(this);
		this.setVisible(true);
		this.setTitle("QQ��¼");
		this.setSize(500,400);
		this.setLocation(400,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
@SuppressWarnings("serial")
class Zhuce extends JFrame implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String comm=e.getActionCommand();
		if(comm.equals("ע��")){
			if(userName.getText().equals("")){
				System.out.println("�������˺�");
			}else if(passWord.getPassword().equals("")){
				System.out.println("����������");
			}else if(tel.getText().equals("")){
				System.out.println("������绰����");
			}else if(yzm.getText().equals("")){
				System.out.println("��������֤��");
			}else if(!userName.getText().equals("") && !tel.getText().equals("") && !yzm.getText().equals("")){
				System.out.println("ע��ɹ�");
				new Login();
			this.setVisible(false);
			}
		}else if(comm.equals("�����ȡ��֤��")){ 
			UUID uuid =UUID.randomUUID();
			System.out.println("����ѶQQ������ֻ���֤��Ϊ��"+ uuid +"����֤����Чʱ��10���ӡ��������κε�λ�����͸¶��");
		}
	}
	JPanel [] jpane1 =new JPanel[6];
	JTextField userName,tel,yzm;
	JPasswordField passWord;
	JLabel userNameLabel,passWordLabel,telLabel,yzmLabel;
	JButton djhqyzm,zhuce;
	Zhuce(){
		for(int i=0;i<jpane1.length;i++){
			jpane1[i] =new JPanel();
			this.add(jpane1[i]);
			if(i==3 || i==5){
				jpane1[i].setLayout(new FlowLayout());
			}else{
				jpane1[i].setLayout(new GridLayout(1,2));
			}
		}
		this.setLayout(new GridLayout(6,1,5,0));
		userNameLabel =new JLabel("QQ�˺�");
		passWordLabel =new JLabel("QQ����");
		telLabel =new JLabel("�绰");
		yzmLabel =new JLabel("��֤��");
		userName =new JTextField();
		passWord =new JPasswordField();
		tel =new JTextField();
		yzm =new JTextField();
		djhqyzm =new JButton("�����ȡ��֤��");
		zhuce =new JButton("ע��");
		jpane1[0].add(userNameLabel);
		jpane1[0].add(userName);
		jpane1[1].add(passWordLabel);
		jpane1[1].add(passWord);
		jpane1[2].add(telLabel);
		jpane1[2].add(tel);
		jpane1[3].add(djhqyzm);
		jpane1[4].add(yzmLabel);
		jpane1[4].add(yzm);
		jpane1[5].add(zhuce);
		zhuce.addActionListener(this);
		djhqyzm.addActionListener(this);
		this.setVisible(true);
		this.setTitle("QQע��");
		this.setSize(500,400);
		this.setLocation(400,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
} 


