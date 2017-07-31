package 抽象类;
//Demo34是抽象类和抽象方法格式
public class Demo34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//一般的类
class Car1{
	//一般的方法
	void show(){
		System.out.println("你好");
	}
}
//类前面加abstract是抽象类
abstract class Car2{
	//方法前面加abstract,有返回值、参数，没有方法体
	public abstract void show();
	public abstract void shudu();
	public abstract void qidong();
}
