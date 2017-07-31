package 方法重载;
//Demo8是构造方法的重载
public class Demo14 {

	public static void main(String[] args) {
		//创建user1对象，根据传递的参数确定调用第一个user构造方法
		user user1=new user("曹操");
		System.out.println(user1);
		//创建user2对象，根据传递的参数确定调用第二个user构造方法
		user user2 =new user("李慧一",25,"13529027562");
		System.out.println(user2);
	}
}
class user{
	String name;
	int age;
	String tel;
//	下面的2个user构造方法属于重载
	//第一个user构造方法
	user(String name){
		this.name=name;
	}
	//第二个user构造方法
	user(String name,int age,String tel){
		this.name=name;
		this.age=age;
		this.tel=tel;
	}
	public String toString() {
		return name+"   "+age+"   "+tel;
	}
	
}