package private和public修饰;
//Demo9是关于private只能在类中访问，外界无法访问
public class Demo15 {

	public static void main(String[] args) {
		 teacher teacher =new teacher("李慧一",25,8000); //可以通过构造方法访问private name，是因为创建对象的时候调用了teacher类中的teacher构造方法，通过类中的构造方法来访问private name
		 //teacher类外面，不能访问加了private的局部变量
		 //teacher.name="张";                   //name前面加了private，像这样写会报错（已经报错了，有x）
		 //System.out.println(teacher.name);   //name前面加了private,像这样写会报错（已经报错了，有x）
		 teacher.age=30;      
		 //age没有加private，所以可以访问
		 System.out.println(teacher.age);
		 
		 
	}
}
class teacher{
	//teacher类中，在name变量前面加上private，name变成了teacher类中的局部变量，只能在teacher类中访问，超出teacher类就不能访问，会报错
	private String name;
	int age;
	double salary;
	String show(){
		System.out.println("姓名："+ name);
		System.out.println("年龄："+ age +"岁");
		System.out.println("工资是："+salary+"元");
		return name;
	}
	teacher(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	
}
