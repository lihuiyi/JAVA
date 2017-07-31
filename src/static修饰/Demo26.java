package static修饰;

public class Demo26 {

	public static void main(String[] args) {
		//static修饰的属性、方法跟类有关，和对象无关，可以不创建对象，用类直接访问静态属性和静态方法。
		Ggg.show();
		//实例属性和对象有关，只有创建对象才能访问实例属性
		Ggg ggg=new Ggg();
		ggg.num=20;
		System.out.println(ggg.num);
	}

}
class Ggg{
	int num;   //实例属性
	//static修饰的静态方法可以用类直接访问
	static void show(){
		System.out.println("你好");
	}
//	static修饰的静态方法不访问实例属性,因为num是实例属性,所以下面代码会报错。只有创建对象后，通过对象才能访问实例属性。
//	static void show2(num){
//		System.out.println("李慧一");
//	}
}