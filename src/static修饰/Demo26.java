package static����;

public class Demo26 {

	public static void main(String[] args) {
		//static���ε����ԡ����������йأ��Ͷ����޹أ����Բ�������������ֱ�ӷ��ʾ�̬���Ժ;�̬������
		Ggg.show();
		//ʵ�����ԺͶ����йأ�ֻ�д���������ܷ���ʵ������
		Ggg ggg=new Ggg();
		ggg.num=20;
		System.out.println(ggg.num);
	}

}
class Ggg{
	int num;   //ʵ������
	//static���εľ�̬������������ֱ�ӷ���
	static void show(){
		System.out.println("���");
	}
//	static���εľ�̬����������ʵ������,��Ϊnum��ʵ������,�����������ᱨ��ֻ�д��������ͨ��������ܷ���ʵ�����ԡ�
//	static void show2(num){
//		System.out.println("���һ");
//	}
}