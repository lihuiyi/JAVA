package 工厂模式;
//Demo38是工厂模式
public class Demo38 {

	public static void main(String[] args) {
		//调用person对象是：工厂类名.静态方法名
		Person person=PersonFactory.getInstance();
		person.show();

	}

}
//PersonFactory类是工厂模式。
//person类的对象在工厂中创建。工厂中创建对象：使用公有静态方法，在静态方法中创建对象。
//在main方法中调用类.静态方法名：PersonFactory.getInstance()
class PersonFactory{
	public static Person getInstance(){
		Person person=new Person("李慧一",25,"男");
		return person;
	}
}
class Person{
	String name;
	int age;
	String sex;
	Person(String name,int age,String sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	void show(){
		System.out.println(name+","+age+","+sex);
	}
}
