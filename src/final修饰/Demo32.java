package final修饰;
//final修饰的方法不能被子类重写（覆盖）
public class Demo32 {

	public static void main(String[] args) {
		
		
	}

}
class Too1{
	//final修饰的方法
	final void show(){
		System.out.println("李慧一");
	}
}
class Too2 extends Too1{
//	下面是重写show方法。因为父类中show方法用final修饰，所以show方法在子类中不能被重写，只能被继承。下面代码报错了。
//	void show(){
//		system.out.println("张");
//	}
}