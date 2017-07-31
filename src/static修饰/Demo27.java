package static修饰;
//Demo27是
//设计一个雇员类
//属性包含：姓名、年龄、性别、工资、人数（静态属性）
//统计全部人的工资总和（工资总和=人数*单个人工资）
//创建一个方法用于计算工资总和，工资总和与单个员工对象无关，所以方法用静态方法。人数与对象无关，所以使用静态属性。工资在静态方法中，所以工资只能是静态属性。
public class Demo27 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Hhh hhh1=new Hhh("李",25,"男",8000);
		Hhh hhh2=new Hhh("张",30,"男",5000);
		Hhh hhh3=new Hhh("刘",32,"女",6000);
		Hhh.show();

	}

}
class Hhh{
	String name;
	int age;
	String sex;
	//gongzi要在show方法里面乘以num，show方法是静态方法，只能访问静态属性，所以gongzi要变成static修饰的静态属性
	static double gongzi;
	//num是人数，和单个对象无关，所以用static修饰的静态属性
	static int num;
	Hhh(String name,int age,String sex,double gongzi){
		this.name=name;
		this.age=age;
		this.sex=sex;
		//因为工资是静态属性，所以用类名.静态属性名
		Hhh.gongzi=gongzi;
		//每创建一个对象就调用构造方法，并执行num加1，这样人数就加1
		num++;
	}
//	show方法里面是人数*工资得到所以人的总工资，方法和单个员工对象无关，所以show方法用static修饰的静态方法。
	static void show(){
		double result=num*gongzi;
		System.out.println("所有人的总工资是： "+result);
	}
}