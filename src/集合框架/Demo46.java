package 集合框架;
//Demo46是ArrayList集合框架
import java.util.ArrayList;
public class Demo46 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Teacher teacher =new Teacher("李慧一",25);
		Student student =new Student("刘",8000);
		//ArrayList集合框架
		ArrayList list =new ArrayList();
		//往集合框架中添加元素：使用add(对象)；
		list.add(teacher);
		list.add(student);
		//从集合框架中获取对象：使用get(索引)，必须强制类型转换
		Teacher teacher1=(Teacher) list.get(0);
		Student student1 =(Student) list.get(1);
		System.out.println(teacher1.name);
		System.out.println(student1.name);
		//集合中元素个数
		System.out.println("集合中元素个数："+list.size());
		//删除集合中的元素
		list.remove(1);
		System.out.println("删除索引为1的元素之后，还有多少个元素："+list.size());
		//调用toString()方法
		//集合中的元素最好重写toString()方法,当集合调用toString()方法时，可以直接输出集合中包含的对象信息
		System.out.println(list.toString());
		
	}

}
class Teacher{
	String name;
	int age;
	Teacher(String name,int age){
		this.name=name;
		this.age=age;
	}
	//重写toString()方法
	public String toString(){
		return "名字是："+name+","+"年龄是："+age;
	}
}
class Student{
	String name;
	double salary;
	Student(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	//重写toString()方法
	public String toString(){
		return "名字是："+name+","+"工资是："+salary;
	}
}