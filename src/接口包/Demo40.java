package �ӿڰ�;
//Demo40�ǽӿڵ�д��
//��һ��д���͵ڶ���д���ȼ�
public class Demo40 {

	public static void main(String[] args) {
		//�����������
		Eoo1 eoo1= new Eoo1();
		eoo1.show();
		//��������ָ���������
		Eoo eoo2 =new Eoo1();
		eoo2.show(10,10);
	}

}
//�ӿڵ�һ��д��
interface Eoo{
	public static final int MAX=100;
	public static final int MIN=1;
	public abstract void show();
	public abstract void show(int num1,int num2);
}
//�ӿڵڶ���д��
interface Doo{
	int MAX=100;
	int MIN=1;
	void show();
}

class Eoo1 implements Eoo{
	public void show(){
		System.out.println(MAX);
	}
	public void show(int num1,int num2){
		System.out.println(num1+num2);
	}
}