package static����;
//Demo28��static���εĴ��������Ǿ�̬����飬����new���ٸ����󣬾�̬�����ִֻ��һ�Ρ�
public class Demo28 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//new��3�����󡣲���new�˶��ٸ����󣬾�̬�����ִֻ��һ��
		Ppp ppp1=new Ppp();
		Ppp ppp2=new Ppp();
		Ppp ppp3=new Ppp();
	}

}
class Ppp{
	//static���εľ�̬�����
	static{
		System.out.println("���");
	}
}