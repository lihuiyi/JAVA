package �������ģʽ;
//Demo29�Ƕ�������ģʽ
public class Demo29 {

	public static void main(String[] args) {
		//ʹ������.���о�̬���ԣ�return����moo���󣬸�ֵ��moo1
		Moo moo1=Moo.getInstance();
		Moo moo2=Moo.getInstance();
		System.out.println(moo1==moo2);
	}

}
class Moo{
	//���췽��˽��
	private Moo(){}
	//˽�о�̬���Ա������
	private static Moo moo=new Moo();
	//���о�̬���������ṩ����
	public static Moo getInstance(){
		return moo;
	}
}
