package 接口包;
//Demo43是抽象类和接口总和的使用
//抽象类Car：属性：名字、颜色、速度
//         方法：启动、行驶、刹车
//接口1：方法：getMoney用于收费
//接口2：方法：getControlDegree用于控制温度
//类Taxi:属性：名字、颜色、速度、温度
//      方法：启动、行驶、刹车、控制温度、收费
//类Bmw:属性：名称、颜色、速度、温度
//      方法：启动、行驶、刹车、控制温度
public class Demo43 {

	public static void main(String[] args) {
		Taxi taxi =new Taxi();
		taxi.qd();
		taxi.xs();
		taxi.sc();
		taxi.getControlDgree();
		taxi.getMoney();
		Bmw bmw=new Bmw();
		bmw.qd();
		bmw.xs();
		bmw.sc();
		bmw.getControlDgree();
		

	}

}
abstract class Car{
	String name;
	String color;
	int sudu;
	public abstract void qd();
	public abstract void xs();
	public abstract void sc();
	Car(){}
	Car(String name,String color,int sudu){
		this.name=name;
		this.color=color;
		this.sudu=sudu;
	}
}
interface jiekou1{
	public void getMoney();
}
interface jiekou2{
	public void getControlDgree();
}
class Taxi extends Car implements jiekou1,jiekou2{
	int wd;
	public void qd(){
		sudu=0;
		System.out.println("出租车正在启动中，"+"速度="+sudu);
	}
	public void xs(){
		sudu=100;
		System.out.println("出租车正在行驶中，"+"速度="+sudu);
	}
	public void sc(){
		sudu=0;
		System.out.println("出租车刹车成功，"+"速度是"+sudu);
	}
	public void getMoney(){
		System.out.println("出租车收费");
	}
	public void getControlDgree(){
		wd=20;
		System.out.println("出租车温度控制在"+wd+"摄氏度");
	}	
}
class Bmw extends Car implements jiekou2{
	int wd;
	public void qd(){
		sudu=0;
		System.out.println("宝马车真正启动中,速度="+sudu);
	}
	public void xs(){
		sudu=120;
		System.out.println("宝马车正在行驶，速度="+sudu);
	}
	public void sc(){
		sudu=0;
		System.out.println("宝马车刹车成功，速度="+sudu);
	}
	public void getControlDgree(){
		wd=21;
		System.out.println("宝马车温度控制在"+wd+"摄氏度");
	}
}
