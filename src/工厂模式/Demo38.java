package ����ģʽ;
//Demo38�ǹ���ģʽ
public class Demo38 {

	public static void main(String[] args) {
		//����person�����ǣ���������.��̬������
		Person person=PersonFactory.getInstance();
		person.show();

	}

}
//PersonFactory���ǹ���ģʽ��
//person��Ķ����ڹ����д����������д�������ʹ�ù��о�̬�������ھ�̬�����д�������
//��main�����е�����.��̬��������PersonFactory.getInstance()
class PersonFactory{
	public static Person getInstance(){
		Person person=new Person("���һ",25,"��");
		return person;
	}
}
class Person{
	String name;
	int age;
	String sex;
	Person(String name,int age,String sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	void show(){
		System.out.println(name+","+age+","+sex);
	}
}
