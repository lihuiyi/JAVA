package ��������ָ���������;
//Demo36��  ���� ���� =new ����();
//��������������Է��ʸ���ķ�����������д�ķ��������ܷ��ʸ��౻��д�ķ�����������еķ���
public class Demo36 {

	public static void main(String[] args) {
		//���� ���� =new ���ࣨ����
		Person person =new Person2();    //persons�Ǹ�������������new�����Ķ���
		//person���Է��ʸ���ķ�����������д�ķ��������ܷ��ʸ��౻��д�ķ����������Ͷ��еķ���
		person.ff(20, 10);     //���ʵ��Ǹ���ķ��������ܷ��ʸ��౻��д�ķ���
		person.add(20, 10);    //���ʵ���������д�ķ���
//		person.shoow(20,10);   //���ܷ���������еķ������Ѿ������ˡ�
	}

}
class Person{
	//���౻��д�ķ���
	void add(int num1,int num2){
		System.out.println(num1+num2);
	}
	//����ķ���
	void ff(int num1,int num2){
		System.out.println(num1/num2);
	}
}
class Person2 extends Person{
	//��������д�ķ���
	void add(int num1,int num2){
		System.out.println(num1-num2);
	}
	//�����Ͷ��еķ���
	void show(int num1,int num2){
		System.out.println(num1*num2);
	}
}