package �̳�;
//Demo22��
//this.������ ���ǵ��õ�ǰ��ķ���
//super.������ �����ø���ķ���
public class Demo22 {

	public static void main(String[] args) {
		ccc ccc =new ccc();
		//ʹ��this�����õ�ǰ���͵ķ���
		ccc.f1(20,30);
		//ʹ��supper�����ø���ķ���
		ccc.f2(20, 30);

	}

}
class bbb{
	//���෽��
	int fun(int num1,int num2){
		int sum=num1+num2;
		return sum;
	}
}
class ccc extends bbb{
	//������д�ķ���
	int fun(int num1,int num2){
		int sum = num1*num2;
		return sum;
	}
	void f1(int num1,int num2){
		//ʹ��this�����õ�ǰ��ķ���
		int result1= this.fun(num1,num2);
		System.out.println("ʹ��this�����õ�ǰ��ķ���   "+result1);
	}
	void f2(int num1,int num2){
		//ʹ��super�����ø���ķ���
		int result2=super.fun(num1, num2);
		System.out.println("ʹ��super�����ø���ķ���  "+result2);
	}
	
}


