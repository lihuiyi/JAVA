package 继承;
//Demo18是父类型有带参数的构造方法，子类通过super来调用父类型的构造方法，子类不能设计自己的构造方法
public class Demo18 {

	public static void main(String[] args) {
		abc abc=new abc("李慧一",25,"男");
		System.out.println(abc.name);

	}

}
class emp{
	String name;
	int age;
	//父类有带参数的构造方法
	emp(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class abc extends emp{
	String sex;
	//通过super来调用父类的构造方法。父类的构造方法有name、age，所以super只能有name、age。
	abc(String name, int age,String sex) {
		super(name, age);
		this.sex=sex;
	}
}


