package 单列设计模式;
//Demo29是饿汉单列模式
public class Demo29 {

	public static void main(String[] args) {
		//使用类名.公有静态属性，return返回moo对象，赋值给moo1
		Moo moo1=Moo.getInstance();
		Moo moo2=Moo.getInstance();
		System.out.println(moo1==moo2);
	}

}
class Moo{
	//构造方法私有
	private Moo(){}
	//私有静态属性保存对象
	private static Moo moo=new Moo();
	//公有静态方法对外提供对象
	public static Moo getInstance(){
		return moo;
	}
}
