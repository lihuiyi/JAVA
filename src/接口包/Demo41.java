package �ӿڰ�;
//Demo41��
//�ӿں�����֮���ʵ�֣�Demo42�ǽӿںͽӿ�֮��ļ̳У�
//�ӿ�û�й��췽��������ֱ�Ӵ������󣬱���ͨ��������д���󷽷������ܴ�������ʵ�ֽӿڹ��ܡ�
public class Demo41 {

	public static void main(String[] args) {
		//����ֱ�Ӵ�������
		Emp emp1=new Emp();
		emp1.show();
		emp1.sum();
		System.out.println();
		//��������ָ��������󣬿��Է���������д�ķ��������ܷ���������еķ��������౻��д�ķ���
		Moo emp2 =new Emp();
		emp2.show();
		//��������ָ���������
		Noo emp3=new Emp();
		emp3.sum();
	}

}
interface Moo{
	public abstract void show();
}
interface Noo{
	public abstract void sum();
}
//һ�������Ӧ����ӿڣ��ö��ŷֿ�
class Emp implements Moo,Noo{
	public void show(){
		System.out.println("��дMoo�ӿڵķ���");
	}
	public void sum(){
		System.out.println("��дNoo�ӿڵķ���");
	}
}