package �쳣;

public class Demo54 {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		try{
			int i=100/0;     //
			String str=null;
			System.out.println(str.length());    //��ָ���쳣���ַ�������Ϊ��
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("��������Ϊ0");
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("String���͵��ַ�������Ϊnull");
		}
	}
}
