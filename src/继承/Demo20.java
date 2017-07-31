package 继承;
//Demo20是父类有空构造方法、带参数的构造方法。这是企业开发中常用的(类里面包含：私有属性、公有方法、空构造方法、带参数的构造方法)。
//因为父类有空构造方法，所以子类可以设计自己的构造方法。因为父类有带参数的构造方法，所以子类可以通过super来调用父类带参数的构造方法，
public class Demo20 {

	public static void main(String[] args) {
		user2 user2 =new user2("李慧一",25);
		System.out.println(user2.getName());

	}
}
class user{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	父类空构造方法
	user(){}
//	父类带参数的构造方法
	user(String name,int age){
		this.name=name;   //通过调用公有方法并传递参数来初始化属性
		this.age=age;
	}
	
}
class user2 extends user{
	private String sex;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
//	子类空构造方法
	user2(){}
//	因为父类有空构造方法，所以子类可以设计自己的构的造方法（子类带参数的构造方法）
	user2(String name,int age,String sex){
		this.setName(name);    //因为name属性是继承自user类，是user类中的私有属性。在user2类中只能通过公有方法才能访问，this.name是不能访问的
		this.setAge(age);
		this.setSex(sex);
	}
//	因为父类有带参数的构造方法，所以子类可以通过super来调用父类带参数的构造方法
	user2(String name,int age){
		super(name,age);
	}
}





