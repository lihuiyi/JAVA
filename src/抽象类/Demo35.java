package ������;
//Demo35�ǳ�����û�й��ܡ�Ҫʵ�ֳ����๦�ܣ�����������д����
//�����಻��ֱ�Ӵ�������Ҫͨ�����ഴ�����󡣳����ഴ�������ʽ�������� ���� =new ����();
//������Դ����Լ��Ķ���
public class Demo35 {

	public static void main(String[] args) {
		//�����಻��ֱ�Ӵ�������Ҫͨ�����ഴ�����󡣴�������������ʽ�������� ������ =new ���ࣨ����
		User1 user1=new User2();     //user1�ǳ�����Ķ���
		user1.show();
		//user2������Ķ���
		User2 user2=new User2();
		user2.show();
	}

}
//������
abstract class User1{
	//���󷽷���û�й���
	public abstract void show();
	public abstract void strat();
	
}
class User2 extends User1{
	 //�����ǳ����࣬�г��󷽷�����û�й��ܡ�Ҫʵ�ֳ����๦�ܣ�����������д����
	public void show() {
		System.out.println("���");
	}
	public void strat() {
		System.out.println("��");
	}
}

