package 继承;
//Demo23是
//this(参数)：是 必须在构造方法里面使用this来调用当前类的构造方法
//super(参数)： 是必须在构造方法里面使用super来调用父类的构造方法
public class Demo23 {

	public static void main(String[] args) {
		//new的时候因为2个eee重载，根据参数确定调用的是第二个eee构造方法。
		//第二个eee构造方法里面使用this调用当前类的构造方法(也就是第一个eee构造方法)。
		//第一个eee构造方法使用super调用父类的构造方法
		eee eee =new eee("李慧一",25,"男",8000);
		eee.show();
		
	}

}
class ddd{
	String name;
	int age;
	//父类型的构造方法
	ddd(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class eee extends ddd{
	String sex;
	double gongzi;
	eee(String name,int age,String sex){
		//使用super来调用父类的构造方法
		super(name,age);
		this.sex=sex;
	}
	eee(String name,int age,String sex,double gongzi){
		//使用this来调用当前类的构造方法
		this(name, age,sex);
		this.gongzi=gongzi;
	}
	void show(){
		System.out.println(name+","+age+","+sex+","+gongzi);
	}
}