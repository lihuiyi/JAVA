package �������ģʽ;
//Demo30����������ģʽ
public class Demo30 {

	public static void main(String[] args) {
		//��һ�ε���getInstance()ʱ��û��foo���󣬾ʹ���foo���󷵻�
		Foo foo1=Foo.getInstance();
		//�ڶ��ε���fgetInstance()ʱ���Ѿ�����foo����,�Ͳ��ٴ�������ֱ�ӷ��ض���
		Foo foo2=Foo.getInstance();
		System.out.println(foo1==foo2);

	}

}
class Foo{
	//���췽��˽��
	private Foo(){}
	//˽�о�̬���ԣ�����������ֻ����
	private static Foo foo=null;
	//���о�̬���������ṩ���󣨷������жϣ��ж����û�ж���ʹ�����������ж����return����
	public static Foo getInstance(){
		//�ж��Ƿ��ж���
		if(foo==null){
			foo=new Foo();
		}
		return foo;
	}
}
