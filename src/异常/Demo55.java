package 异常;
//Demo54是自定义异常类
//异常处理的另一种方法：
//	返回值类型    方法名(参数)  throws  异常类{
//		throw new 异常对象
//	} 
import java.util.Scanner;
public class Demo55 {
	public static void main(String[] args) throws namePswdErrorExecption {    //返回值类型    方法名(参数)  throws  异常类{ }  
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name=scanner.nextLine();
		System.out.println("请输入密码：");
		
		String passWord=scanner.nextLine();
		if(name.equals("lihui") && passWord.equals("123")){
			System.out.println("登录成功");
		}else{
			throw new namePswdErrorExecption("用户名或密码错误");     // throw new 异常对象
		}

	}

}
//自定义我们的异常类namePswdErrorExecption, 先继承Execption, 然后重写Execption中的四个构造方法：点鼠标右键，点source, 点倒数第二项，全部打勾
@SuppressWarnings("serial")
class namePswdErrorExecption extends Exception{
			public namePswdErrorExecption() {
				super();
			}
			public namePswdErrorExecption(String message, Throwable cause) {
				super(message, cause);
			}
			public namePswdErrorExecption(String message) {
				super(message);
			}
			public namePswdErrorExecption(Throwable cause) {
				super(cause);
			}
		}