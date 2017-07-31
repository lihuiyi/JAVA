package 继承;
//Demo22是
//this.方法名 ：是调用当前类的方法
//super.方法名 ：调用父类的方法
public class Demo22 {

	public static void main(String[] args) {
		ccc ccc =new ccc();
		//使用this来调用当前类型的方法
		ccc.f1(20,30);
		//使用supper来调用父类的方法
		ccc.f2(20, 30);

	}

}
class bbb{
	//父类方法
	int fun(int num1,int num2){
		int sum=num1+num2;
		return sum;
	}
}
class ccc extends bbb{
	//子类重写的方法
	int fun(int num1,int num2){
		int sum = num1*num2;
		return sum;
	}
	void f1(int num1,int num2){
		//使用this来调用当前类的方法
		int result1= this.fun(num1,num2);
		System.out.println("使用this来调用当前类的方法   "+result1);
	}
	void f2(int num1,int num2){
		//使用super来调用父类的方法
		int result2=super.fun(num1, num2);
		System.out.println("使用super来调用父类的方法  "+result2);
	}
	
}


