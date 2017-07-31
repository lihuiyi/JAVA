package 父类声明指向子类对象;
//Demo36是  父类 对象 =new 子类();
//这样创建对象可以访问父类的方法、子类重写的方法，不能访问父类被重写的方法、子类独有的方法
public class Demo36 {

	public static void main(String[] args) {
		//父类 对象 =new 子类（）；
		Person person =new Person2();    //persons是父类声明，子类new出来的对象
		//person可以访问父类的方法、子类重写的方法。不能访问父类被重写的方法、子类型独有的方法
		person.ff(20, 10);     //访问的是父类的方法，不能访问父类被重写的方法
		person.add(20, 10);    //访问的是子类重写的方法
//		person.shoow(20,10);   //不能访问子类独有的方法。已经报错了。
	}

}
class Person{
	//父类被重写的方法
	void add(int num1,int num2){
		System.out.println(num1+num2);
	}
	//父类的方法
	void ff(int num1,int num2){
		System.out.println(num1/num2);
	}
}
class Person2 extends Person{
	//子类型重写的方法
	void add(int num1,int num2){
		System.out.println(num1-num2);
	}
	//子类型独有的方法
	void show(int num1,int num2){
		System.out.println(num1*num2);
	}
}