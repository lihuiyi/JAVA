package ��������;
//Demo13�Ƿ������أ���������ͬ��������ͬ��
//������ͬ���������������͡���������˳��������
//���ݲ�ͬ�Ĳ��������ò�ͬ�ķ�����
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
		System.out.println("�������أ�"+sum);
	}
}