package 继承;
//Demo17是继承
//person类有name、age、sex属性，和speak方法。
//student类有name、age、sex、job、tel属性，和speak、add方法。
//person类和student类都有的属性和方法：name、age、sex属性和speak方法。
//student类继承person类的name、age、sex属性和speak方法。job、tel属性和add方法是student类特有的属性和方法。
public class Demo17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		student student =new student();
		//student类中的name、age、sex、speak继承自person类
		student.name="李慧一";
		student.age=25;
		student.sex="男";
		student.speak();

	}

}
class person{
	String name;
	int age;
	String sex;
	void speak(){
		System.out.println("我是："+name);
	}
}
//student类使用extends来继承了person类的name、age、sex属性和speak方法
class student extends person{
	String job;
	String tel;	
	int add(int num1,int num2){
		int sum=num1+num2;
		return sum;
	}
}
//teacher类拥有student类所有的属性和 方法（name、age、sex、job、tel、speak、add），salary是teacher独有的
class teacher extends student{
	double salary;
}
