package 单列设计模式;
//Demo30是懒汉单利模式
public class Demo30 {

	public static void main(String[] args) {
		//第一次调用getInstance()时，没有foo对象，就创建foo对象返回
		Foo foo1=Foo.getInstance();
		//第二次调用fgetInstance()时，已经有了foo对象,就不再创建对象，直接返回对象
		Foo foo2=Foo.getInstance();
		System.out.println(foo1==foo2);

	}

}
class Foo{
	//构造方法私有
	private Foo(){}
	//私有静态属性，不创建对象，只定义
	private static Foo foo=null;
	//公有静态方法对外提供对象（方法中判断，判断如果没有对象就创建对象，如果有对象就return对象）
	public static Foo getInstance(){
		//判断是否有对象
		if(foo==null){
			foo=new Foo();
		}
		return foo;
	}
}
