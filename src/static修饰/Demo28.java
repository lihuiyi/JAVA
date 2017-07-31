package static修饰;
//Demo28是static修饰的代码块叫做是静态代码块，不管new多少个对象，静态代码块只执行一次。
public class Demo28 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//new了3个对象。不管new了多少个对象，静态代码块只执行一次
		Ppp ppp1=new Ppp();
		Ppp ppp2=new Ppp();
		Ppp ppp3=new Ppp();
	}

}
class Ppp{
	//static修饰的静态代码块
	static{
		System.out.println("你好");
	}
}