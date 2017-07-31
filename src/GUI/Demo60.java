package GUI;
//Demo60是模拟QQ登录、注册界面。并且为按钮添加了点击事件。
//点击事件先设计一个类，继承JFrame,再实现Actionlistener接口,重写接口的方法，方法中是触发事件时执行的代码。
//为按钮添加监听器addActionlistener(this)。参数是实现接口的对象,当类的前对象实现了接口，this表示当前对象，所有参数用this
//实现接口的方法中：e.getActionCommand()  返回值是：触发事件的按钮名字
//文本框名.geText() 表示获取文本框中的内容
//文本框名.setText(字符串)  表示把字符串写入文本框中
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
class Login extends JFrame implements ActionListener{   //Login继承了JFrame,并且实现了接口Actionlistener
	//重写Actionlistener接口的方法,事件触发时执行这个方法
	public void actionPerformed(ActionEvent e) {
		String comm = e.getActionCommand();    //返回值是：触发事件的按钮名字
		if(comm=="登录"){
			if(userName.getText().equals("") && passWord.getPassword().equals("")){
				System.out.println("请输入账号、密码。如果没有账号，请点击注册。");
			}else if(userName.getText().equals("1620164006") && passWord.getPassword().equals("123456")){
				System.out.println("登录成功");
			}else{
				System.out.println("账号或密码错误");
			}
		}else if(comm.equals("注册")){
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
		userNameLabel =new JLabel("QQ账号");
		passWordLabel =new JLabel("QQ密码");
		userName =new JTextField();
		passWord =new JPasswordField();
		login =new JButton("登录");
		zhuce =new JButton("注册");
		jpane11.add(userNameLabel);
		jpane11.add(userName);
		jpane12.add(passWordLabel);
		jpane12.add(passWord);
		jpane13.add(login);
		jpane13.add(zhuce);
		//为login按钮添加事件
		//addActiontener()方法是为login按钮添加事件。
		//具体添加的事件是那一个事件就要看参数，参数是实现接口的对象，用对象才会调用实现接口的方法
		login.addActionListener(this);   //this是当前对象,当前对象实现了接口
		zhuce.addActionListener(this);
		this.setVisible(true);
		this.setTitle("QQ登录");
		this.setSize(500,400);
		this.setLocation(400,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
@SuppressWarnings("serial")
class Zhuce extends JFrame implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String comm=e.getActionCommand();
		if(comm.equals("注册")){
			if(userName.getText().equals("")){
				System.out.println("请输入账号");
			}else if(passWord.getPassword().equals("")){
				System.out.println("请输入密码");
			}else if(tel.getText().equals("")){
				System.out.println("请输入电话号码");
			}else if(yzm.getText().equals("")){
				System.out.println("请输入验证码");
			}else if(!userName.getText().equals("") && !tel.getText().equals("") && !yzm.getText().equals("")){
				System.out.println("注册成功");
				new Login();
			this.setVisible(false);
			}
		}else if(comm.equals("点击获取验证码")){ 
			UUID uuid =UUID.randomUUID();
			System.out.println("【腾讯QQ】你的手机验证码为："+ uuid +"，验证码有效时间10分钟。请勿向任何单位或个人透露。");
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
		userNameLabel =new JLabel("QQ账号");
		passWordLabel =new JLabel("QQ密码");
		telLabel =new JLabel("电话");
		yzmLabel =new JLabel("验证码");
		userName =new JTextField();
		passWord =new JPasswordField();
		tel =new JTextField();
		yzm =new JTextField();
		djhqyzm =new JButton("点击获取验证码");
		zhuce =new JButton("注册");
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
		this.setTitle("QQ注册");
		this.setSize(500,400);
		this.setLocation(400,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
} 


