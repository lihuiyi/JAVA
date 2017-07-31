package final修饰;

public class Demo31 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Person person=new Person();
//		person.num1=200;     //final修饰的属性，初始化后不能修改。num1初始化是100，现在改为200，报错了。是不能修改的。
		

	}

}
class Person{
	//final修饰的属性
	final int num1=100;
}
