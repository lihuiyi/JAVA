package 计算器;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class 计算器 {
	public static void main(String[] args) {
		new Jsq();
	}
}
@SuppressWarnings("serial")
class Jsq extends JFrame implements ActionListener{
	String str1;   //用于保存第一个数字
	String ysf;    //用于保存运算符
	String str2;   //用于保存第二个数
	String Result=null;  //用于保存计算结果
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
		String [] buttonName ={"C","","<—","+","7","8","9","-","4","5","6","*","1","2","3","/","0","",".","="};
		for(int i=0;i<button.length;i++){
			button[i] =new JButton(buttonName[i]);
			jpane12.add(button[i]);
			button[i].addActionListener(this);   //为按钮添加事件监听器
		}
		jpane11.setLayout(new GridLayout(1,1));
		jpane12.setLayout(new GridLayout(5,4,4,4));
		this.setVisible(true);
		this.setSize(300,300);
		this.setTitle("计算器");
		this.setLocation(500,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
//actionPerformed()方法是：实现ActionListener接口,点击某个按钮时,触发相应的事件。
	public void actionPerformed(ActionEvent e) {
		String comm =e.getActionCommand();
//20个按钮分类：0-9的数字按钮            +-*/运算符按钮	           小数点.按钮            等号= 按钮 	   <-按钮               C按钮
//		0-9的数字键按钮
		if("0123456789".indexOf(comm)!=-1){
			String textValue=text.getText();
			if(textValue==null){
				text.setText(comm);
			}else{
				text.setText(textValue + comm);
			}
//		  +-*/运算符按钮
		}else if("+-*/".indexOf(comm)!=-1){
			str1=text.getText();
			ysf=comm;
			text.setText(null);
//		小数点.按钮
		}else if(comm.equals(".")){
			String textValue =text.getText();    //点击小数点.按钮时，获取文本框中的内容
			if(textValue==null){
				text.setText(comm);
			}else{
				if(textValue.indexOf(".")==-1){    //如果文本框中的内容无小数点"."   就在文本框中字符串后面拼接一个"."字符
					text.setText(textValue + comm);
				}else if(textValue.indexOf(".")!=-1){   //如果文本框中的内容有小数点"."   就不再重复输入小数点，这时候点击小数点按钮是没有反应
					//text.setText(textValue);
				}
			}
//		等号= 按钮
		}else if(comm.equals("=")){
			str2 =text.getText();      //str2属性保存的是：第二个数或最近的数
			double num1 =Double.parseDouble(str1);   //把第一个数转换为数字
			double num2 =Double.parseDouble(str2);   //把第二个数转换为数字
			double result = 0;
			if(ysf.equals("+")){    //ysf属性保存的是:运算符。如果与运算符是+号,计算结果是num1+num2
				result =num1+num2;
			}else if(ysf.equals("-")){  //ysf属性保存的是:运算符。如果与运算符是-号,计算结果是num1-num2
				result =num1-num2;
			}else if(ysf.equals("*")){
				result =num1*num2;
			}else if(ysf.equals("/")){
				result =num1/num2;
			}
			Result =String.valueOf(result);    //把计算结果转换为字符串		
			text.setText(Result);  //计算结果写入文本框
//		   <—按钮
		//在执行计算以前：如果文本框中有内容，点击一次 <— 按钮只删除一个字符。如果文本框中无内容，不做任何操作
		//在执行计算后：点击 <— 按钮会把文本框中所有内容清空
		//可以根据Result的值是否为null，来判断当前所处的状态：处于执行计算前的状态,还是处于执行计算后的状态
		//在执行计算以前，Result属性是null。在执行计算后Result属性是非null,然后再把Result释放变为null，执行下一次计算前：Result是null
		}else if(comm.equals("<—")){
			if(Result==null){   //根据Result的值为null可以判断：当前处于执行计算以前的状态
				StringBuffer textValue =new StringBuffer(text.getText());   //获取文本框中的内容，并赋值给textValue对象
				if(textValue.length()>=1){   //如果文本框中有内容（即字符串长度>=1）
					textValue.deleteCharAt(textValue.length()-1);   //就删除字符串最末尾的那个字符
					text.setText(textValue.toString());          //然后用toString()方法把textValue对象转换为字符串,把字符串写入文本框
				}else if(textValue.length()<1){   //如果文本框中无内容（即字符串长度<1）
					text.setText(textValue.toString());   //用toString()方法把textValue对象转换为字符串,把字符串写入文本框
				}
			}else if(Result!=null){  //执行计算后
				text.setText(null);
				Result=null;       //执行计算后,把Result释放变为null, 根据Result的值为null可以判断：当前处于执行下一轮计算前的状态
			}
//		C按钮
		}else if(comm.equals("C")){
			text.setText(null);
		}
	}
}

