
package static修饰;
//Demo25是创建Student类，然后统计学生对象个数。
//在类中使用static学生的静态属性num用于统计学生对象的个数，每new一个对象的时候，调用构造方法并执行num加1，new了第3个对象的时候num是3
//说明统计结果是：学生对象的个数是3
public class Demo25 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Student student1 =new Student("李",25,"软件");
		Student student2 =new Student("张",30,"程序");
		Student student3= new Student("刘",40,"项目");
		System.out.println("学生个数是："+Student.num);
	}

}
class Student{
	String name;
	int age;
	String job;
	static int num=0;
	Student(String name,int age,String job){
		this.name=name;
		this.age=age;
		this.job=job;
		//num是静态属性，用于统计学生对象的个数。每new一个对象的时候，调用构造方法并执行num加1
		num++;
	}
}