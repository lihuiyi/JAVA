package final����;
//final���εķ������ܱ�������д�����ǣ�
public class Demo32 {

	public static void main(String[] args) {
		
		
	}

}
class Too1{
	//final���εķ���
	final void show(){
		System.out.println("���һ");
	}
}
class Too2 extends Too1{
//	��������дshow��������Ϊ������show������final���Σ�����show�����������в��ܱ���д��ֻ�ܱ��̳С�������뱨���ˡ�
//	void show(){
//		system.out.println("��");
//	}
}