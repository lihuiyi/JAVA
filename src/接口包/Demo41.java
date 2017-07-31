package 接口包;
//Demo41是
//接口和子类之间的实现（Demo42是接口和接口之间的继承）
//接口没有构造方法，不能直接创建对象，必须通过子类重写抽象方法，才能创建对象、实现接口功能。
public class Demo41 {

	public static void main(String[] args) {
		//子类直接创建对象
		Emp emp1=new Emp();
		emp1.show();
		emp1.sum();
		System.out.println();
		//父类声明指向子类对象，可以访问子类重写的方法，不能访问子类独有的方法、父类被重写的方法
		Moo emp2 =new Emp();
		emp2.show();
		//父类声明指向子类对象
		Noo emp3=new Emp();
		emp3.sum();
	}

}
interface Moo{
	public abstract void show();
}
interface Noo{
	public abstract void sum();
}
//一个子类对应多个接口，用逗号分开
class Emp implements Moo,Noo{
	public void show(){
		System.out.println("重写Moo接口的方法");
	}
	public void sum(){
		System.out.println("重写Noo接口的方法");
	}
}