package ��װ;
//Demo16�� ��װ����һ�����У����з�����˽�����Է�װ��һ�� 
//public���з�������private˽������
//��main������person.setName("���һ")��ע�͵���run as����һ�£�����ͨ��new�����ʱ��ͨ�����췽������(д��)˽�����ԣ���ͨ��get��ȡ��
//Ȼ���person.setName("���һ");ȡ��ע�ͣ�����һ�£�����ͨ��public���з���get��set����˽�����ԡ�
public class Demo16 {

	public static void main(String[] args) {
		//new�����ʱ�򣬵���person���еĹ��췽��person,ͨ�����еĹ��췽������˽������(д��ܲ٣�����ͨ��get��ȡ���ٴ�ӡ����)
		Person person =new Person("�ܲ�",30);
		//ͨ�����з���д��˽��name���ԣ���ǰ��д������һ������
		person.setName("���һ");       
		//ͨ�����з�����ȡ˽��name����
		person.getName();
		//��ӡ��ȡ����˽��name����
		System.out.println(person.getName());
	}

}
class Person{
	//˽������
	private String name;
	private int age;
	//��ȡname���ԵĹ��з�����������ӹ��з��������Ե�����Ҽ���ѡ��source,��ѡ��generate getter and setter
	public String getName() {
		return name;
	}
	//д��name���ԵĹ��з���
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//�չ��췽��
	Person(){}
	//���ù��췽��ʱ�����д�룬Ȼ�����ù��з���get��ȡ
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
}


