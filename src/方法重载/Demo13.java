package 方法重载;
//Demo13是方法重载：方法名相同，参数不同。
//参数不同：参数的数据类型、数据类型顺序、数量。
//根据不同的参数，调用不同的方法。
public class Demo13 {

	public static void main(String[] args) {
		ABC abc =new ABC();
		abc.show(10, 20);
		abc.show(8, 5.3);

	}

}
class ABC{
	String name;
	int age;
	double salary;
	void show(int num1,int num2){
		int sum=num1+num2;
		System.out.println(sum);
	}
	void show(int num1,double num2){
		double sum=num1*num2;
		System.out.println("方法重载："+sum);
	}
}