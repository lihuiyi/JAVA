package ����;

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
		System.out.println("�����в����ķ���");
		System.out.println("sum=" + " "+sum);
	}
}