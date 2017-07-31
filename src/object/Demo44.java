package object;
//Demo44是
//所有类默认继承object类。
//toString()方法是object类的方法，默认返回：包名.类名@16进制的字符串。
//新设计的类会继承会继承object类中的toString()方法，最好重写toString()方法，return一个返回值
//直接输出对象时会默认调用toString()方法
public class Demo44 {

	public static void main(String[] args) {
		User user=new User("李慧一",25);
		System.out.println(user.toString());
		System.out.println();
		//直接输出对象时会默认调用toString()方法
		System.out.println(user);
	}

}
//User类默认继承object类，同时也继承了object类中toString()方法
class User{
	String name;
	int age;
	
	User(String name,int age){
		this.name=name;
		this.age=age;
	}
	//重写toString()方法，要return一个返回值
	public String toString(){
		String message="User类中："+"\n"+"对象的名字是："+name+"\n"+"对象的年龄是："+age;
		return message;
	}
}