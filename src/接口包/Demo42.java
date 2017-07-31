package 接口包;
//Demo42是
//接口和接口之间的继承（Demo41是接口和子类之间的实现）
//1个接口可以继承多个接口
public class Demo42 {

	public static void main(String[] args) {
		//子类Allsx直接创建对象
		Allsx allsx=new Allsx();
		//show1、show2、show3是Allsx类中重写的方法
		allsx.show1();
		allsx.show2();
		allsx.show3();
		allsx.sum();
		System.out.println();
		//父类声明指向子类对象
		All all=new Allsx();
		//show1、show2、show3是子类重写的方法
		all.show1();
		all.show2();
		all.show3();
		//sum重写All接口的方法
		all.sum();
	}

}
//3个接口：Aoo1、Aoo2、Aoo3
interface Aoo1{
	public abstract void show1();
}
interface Aoo2{
	public abstract void show2();
}
interface Aoo3{
	public abstract void show3();
}
//接口可以多继承，All接口继承了Aoo1接口、Aoo2接口、Aoo3接口
interface All extends Aoo1,Aoo2,Aoo3{
	//接口All独有的抽象方法
	public abstract void sum();
}
//Allsx是All接口的子类，用来实现All接口
class Allsx implements All{
	public void show1(){
		System.out.println("重写show1抽象方法，show1属于接口All中继承于接口Aoo1的抽象方法");
	}
	public void show2(){
		System.out.println("重写show2抽象方法，show2属于接口All中继承于接口Aoo2的抽象方法");
	}
	public void show3(){
		System.out.println("重写show3抽象方法，show3属于接口All中继承于接口Aoo3的抽象方法");
	}
	public void sum(){
		System.out.println("重写sum抽象方法，sum属于接口All中独有的抽象方法");
	}
}