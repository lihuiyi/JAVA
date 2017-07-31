package 方法;

public class Demo9 {

	public static void main(String[] args) {
		Person person =new Person();
		person.show();

	}

}
class Person{
	String name;
	int age;
	double salary;
	void show(){
		System.out.println("定义无参数的方法");
	}
}