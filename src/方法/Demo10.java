package 方法;

public class Demo10 {

	public static void main(String[] args) {
		Student student =new Student();
		student.show(10, 5);

	}

}
class Student{
	String name;
	int age;
	void show(int num1,int num2){
		int sum=num1+num2;
		System.out.println("定义有参数的方法");
		System.out.println("sum=" + " "+sum);
	}
}