package �̳�;
//Demo23��
//this(����)���� �����ڹ��췽������ʹ��this�����õ�ǰ��Ĺ��췽��
//super(����)�� �Ǳ����ڹ��췽������ʹ��super�����ø���Ĺ��췽��
public class Demo23 {

	public static void main(String[] args) {
		//new��ʱ����Ϊ2��eee���أ����ݲ���ȷ�����õ��ǵڶ���eee���췽����
		//�ڶ���eee���췽������ʹ��this���õ�ǰ��Ĺ��췽��(Ҳ���ǵ�һ��eee���췽��)��
		//��һ��eee���췽��ʹ��super���ø���Ĺ��췽��
		eee eee =new eee("���һ",25,"��",8000);
		eee.show();
		
	}

}
class ddd{
	String name;
	int age;
	//�����͵Ĺ��췽��
	ddd(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class eee extends ddd{
	String sex;
	double gongzi;
	eee(String name,int age,String sex){
		//ʹ��super�����ø���Ĺ��췽��
		super(name,age);
		this.sex=sex;
	}
	eee(String name,int age,String sex,double gongzi){
		//ʹ��this�����õ�ǰ��Ĺ��췽��
		this(name, age,sex);
		this.gongzi=gongzi;
	}
	void show(){
		System.out.println(name+","+age+","+sex+","+gongzi);
	}
}