package 继承;
//Demo19是父类有空构造方法，子类可以设计自己的构造方法
public class Demo19 {

	public static void main(String[] args) {
		//new对象的时候调用的是子类car2类中的构造方法
		car2 car2 =new car2("李慧一",25,"男");
		System.out.println(car2.name);
		
	}

}
class car1{
	String name;
	int age;
	//父类有空构造方法
	car1(){}
}
class car2 extends car1{
	String sex;
	//父类有空构造方法，子类可以设计自己的构造方法
	car2(String name,int age,String sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
}
