package �̳�;
//Demo20�Ǹ����пչ��췽�����������Ĺ��췽����������ҵ�����г��õ�(�����������˽�����ԡ����з������չ��췽�����������Ĺ��췽��)��
//��Ϊ�����пչ��췽�������������������Լ��Ĺ��췽������Ϊ�����д������Ĺ��췽���������������ͨ��super�����ø���������Ĺ��췽����
public class Demo20 {

	public static void main(String[] args) {
		user2 user2 =new user2("���һ",25);
		System.out.println(user2.getName());

	}
}
class user{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	����չ��췽��
	user(){}
//	����������Ĺ��췽��
	user(String name,int age){
		this.name=name;   //ͨ�����ù��з��������ݲ�������ʼ������
		this.age=age;
	}
	
}
class user2 extends user{
	private String sex;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
//	����չ��췽��
	user2(){}
//	��Ϊ�����пչ��췽�������������������Լ��Ĺ����췽��������������Ĺ��췽����
	user2(String name,int age,String sex){
		this.setName(name);    //��Ϊname�����Ǽ̳���user�࣬��user���е�˽�����ԡ���user2����ֻ��ͨ�����з������ܷ��ʣ�this.name�ǲ��ܷ��ʵ�
		this.setAge(age);
		this.setSex(sex);
	}
//	��Ϊ�����д������Ĺ��췽���������������ͨ��super�����ø���������Ĺ��췽��
	user2(String name,int age){
		super(name,age);
	}
}





