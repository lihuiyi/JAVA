package 接口包;
//Demo40是接口的写法
//第一种写法和第二种写法等价
public class Demo40 {

	public static void main(String[] args) {
		//创建子类对象
		Eoo1 eoo1= new Eoo1();
		eoo1.show();
		//父类声明指向子类对象
		Eoo eoo2 =new Eoo1();
		eoo2.show(10,10);
	}

}
//接口第一种写法
interface Eoo{
	public static final int MAX=100;
	public static final int MIN=1;
	public abstract void show();
	public abstract void show(int num1,int num2);
}
//接口第二种写法
interface Doo{
	int MAX=100;
	int MIN=1;
	void show();
}

class Eoo1 implements Eoo{
	public void show(){
		System.out.println(MAX);
	}
	public void show(int num1,int num2){
		System.out.println(num1+num2);
	}
}