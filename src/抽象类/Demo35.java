package 抽象类;
//Demo35是抽象类没有功能。要实现抽象类功能：在子类中重写方法
//抽象类不能直接创建对象，要通过子类创建对象。抽象类创建对象格式：抽象类 对象 =new 子类();
//子类可以创建自己的对象
public class Demo35 {

	public static void main(String[] args) {
		//抽象类不能直接创建对象，要通过子类创建对象。创建抽象类对象格式：抽象类 对象名 =new 子类（）；
		User1 user1=new User2();     //user1是抽象类的对象
		user1.show();
		//user2是子类的对象
		User2 user2=new User2();
		user2.show();
	}

}
//抽象类
abstract class User1{
	//抽象方法，没有功能
	public abstract void show();
	public abstract void strat();
	
}
class User2 extends User1{
	 //父类是抽象类，有抽象方法，但没有功能。要实现抽象类功能：是在子类重写方法
	public void show() {
		System.out.println("你好");
	}
	public void strat() {
		System.out.println("嗨");
	}
}

