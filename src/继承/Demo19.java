package �̳�;
//Demo19�Ǹ����пչ��췽���������������Լ��Ĺ��췽��
public class Demo19 {

	public static void main(String[] args) {
		//new�����ʱ����õ�������car2���еĹ��췽��
		car2 car2 =new car2("���һ",25,"��");
		System.out.println(car2.name);
		
	}

}
class car1{
	String name;
	int age;
	//�����пչ��췽��
	car1(){}
}
class car2 extends car1{
	String sex;
	//�����пչ��췽���������������Լ��Ĺ��췽��
	car2(String name,int age,String sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
}
