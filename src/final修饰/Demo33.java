package final修饰;

public class Demo33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//使用final修饰的类不能继承
final class Voo1{
	
}
//因为父类是final修饰的类，子类不能继承。下面代已经报错。
//class Voo2 extends Voo1{
//	
//}