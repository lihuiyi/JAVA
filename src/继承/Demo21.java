package �̳�;
//Demo21�������ж�����������͸���̳е�������ͬ���������ͬ�����Ը��Ǽ̳�����
public class Demo21 {

	public static void main(String[] args) {
		aaa2 aaa2=new aaa2();
		System.out.println(aaa2.name);
		int result=aaa2.abc(20, 30);
		System.out.println(result);

	}

}
class aaa{
	String name="���һ";
	int abc(int num1,int num2){
		return num1+num2;
	}
}
//aaa2��̳�aaa��
class aaa2 extends aaa{
	//������name���Ժ͸���̳е�name����ͬ���������ͬ�����Ը��Ǽ̳е�����
	String name="�ܲ�";
	int abc(int num1,int num2){
		return num1*num2;
	}
}

