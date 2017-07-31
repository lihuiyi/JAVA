package 类和对象;

public class Demo11 {

	public static void main(String[] args) {
		Stu stu =new Stu("李慧一",25,8000);
		System.out.println(stu);
		

	}

}
class Stu{
	String name;
	int age;
	double salary;
	void show(){
		System.out.println("这是一个方法");
	}
	public String toString() {
		return name+"  "+age+"  "+salary;
	}
	Stu(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}