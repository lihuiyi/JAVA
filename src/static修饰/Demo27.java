package static����;
//Demo27��
//���һ����Ա��
//���԰��������������䡢�Ա𡢹��ʡ���������̬���ԣ�
//ͳ��ȫ���˵Ĺ����ܺͣ������ܺ�=����*�����˹��ʣ�
//����һ���������ڼ��㹤���ܺͣ������ܺ��뵥��Ա�������޹أ����Է����þ�̬����������������޹أ�����ʹ�þ�̬���ԡ������ھ�̬�����У����Թ���ֻ���Ǿ�̬���ԡ�
public class Demo27 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Hhh hhh1=new Hhh("��",25,"��",8000);
		Hhh hhh2=new Hhh("��",30,"��",5000);
		Hhh hhh3=new Hhh("��",32,"Ů",6000);
		Hhh.show();

	}

}
class Hhh{
	String name;
	int age;
	String sex;
	//gongziҪ��show�����������num��show�����Ǿ�̬������ֻ�ܷ��ʾ�̬���ԣ�����gongziҪ���static���εľ�̬����
	static double gongzi;
	//num���������͵��������޹أ�������static���εľ�̬����
	static int num;
	Hhh(String name,int age,String sex,double gongzi){
		this.name=name;
		this.age=age;
		this.sex=sex;
		//��Ϊ�����Ǿ�̬���ԣ�����������.��̬������
		Hhh.gongzi=gongzi;
		//ÿ����һ������͵��ù��췽������ִ��num��1�����������ͼ�1
		num++;
	}
//	show��������������*���ʵõ������˵��ܹ��ʣ������͵���Ա�������޹أ�����show������static���εľ�̬������
	static void show(){
		double result=num*gongzi;
		System.out.println("�����˵��ܹ����ǣ� "+result);
	}
}