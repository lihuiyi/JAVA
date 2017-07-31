package 工厂模式;
//Demo39是
//设计一个父类Car:
//              属性：名字
//              方法:show()显示Car的名字
//              构造方法：空构造方法和带参数的构造方法
//Car的子类Bmw: 属性：速度
//             方法：show（）方法显示车名
//Car的子类Benz：属性：价格
//             方法：show()方法显示车名
//Car的子类型QQ:属性：颜色
//            方法：show()方法显示车名
//设计一个工厂模式，可以根据用户的需求来创建不同的子类对象
public class Demo39 {

	public static void main(String[] args) {
		Car bmw = CarFactory.getInstance("bmw");
		//      = new Bmw();
		bmw.show();
		Car benz =CarFactory.getInstance("benz");
		//       = new Benz();
		benz.show();
		Car qq = CarFactory.getInstance("qq");
		//     = new QQ();
		qq.show();
	}

}
class CarFactory{
	public static Car getInstance(String carType){
		Car car=null;         //父类声明
		if(carType=="bmw"){
			car =new Bmw();   //子类创建对象
			return car;
		}else if(carType=="benz"){
			car =new Benz();       //子类刺创建对象
			return car;
		}else if(carType=="qq"){
			car =new QQ();       //子类创建对象
			return car;
		}
		return  car;
	}
}
class Car{
	String name;
	void show(){
		System.out.println(name);
	}
	Car(){}
	Car(String name){
		this.name=name;
	}
}
class Bmw extends Car{
	int sudu;
	//重写show方法
	void show(){
		this.name="bmw";
		System.out.println("车名是："+name);
	}
}
class Benz extends Car{
	int price;
	//重写show方法
	void show(){
		this.name="benz";
		System.out.println("车名是："+name);
	}
}
class QQ extends Car{
	String color;
	//重写show方法
	void show(){
	this.name="qq";
		System.out.println("车名是："+name);
	}
}
