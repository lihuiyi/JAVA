package 继承;
//Demo21是子类中定义的属性名和父类继承的属性名同名，子类的同名属性覆盖继承属性
public class Demo21 {

	public static void main(String[] args) {
		aaa2 aaa2=new aaa2();
		System.out.println(aaa2.name);
		int result=aaa2.abc(20, 30);
		System.out.println(result);

	}

}
class aaa{
	String name="李慧一";
	int abc(int num1,int num2){
		return num1+num2;
	}
}
//aaa2类继承aaa类
class aaa2 extends aaa{
	//子类中name属性和父类继承的name属性同名，子类的同名属性覆盖继承的属性
	String name="曹操";
	int abc(int num1,int num2){
		return num1*num2;
	}
}

