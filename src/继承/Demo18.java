package �̳�;
//Demo18�Ǹ������д������Ĺ��췽��������ͨ��super�����ø����͵Ĺ��췽�������಻������Լ��Ĺ��췽��
public class Demo18 {

	public static void main(String[] args) {
		abc abc=new abc("���һ",25,"��");
		System.out.println(abc.name);

	}

}
class emp{
	String name;
	int age;
	//�����д������Ĺ��췽��
	emp(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class abc extends emp{
	String sex;
	//ͨ��super�����ø���Ĺ��췽��������Ĺ��췽����name��age������superֻ����name��age��
	abc(String name, int age,String sex) {
		super(name, age);
		this.sex=sex;
	}
}


