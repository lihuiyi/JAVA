package �쳣;
//Demo54���Զ����쳣��
//�쳣�������һ�ַ�����
//	����ֵ����    ������(����)  throws  �쳣��{
//		throw new �쳣����
//	} 
import java.util.Scanner;
public class Demo55 {
	public static void main(String[] args) throws namePswdErrorExecption {    //����ֵ����    ������(����)  throws  �쳣��{ }  
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		System.out.println("�������û�����");
		String name=scanner.nextLine();
		System.out.println("���������룺");
		
		String passWord=scanner.nextLine();
		if(name.equals("lihui") && passWord.equals("123")){
			System.out.println("��¼�ɹ�");
		}else{
			throw new namePswdErrorExecption("�û������������");     // throw new �쳣����
		}

	}

}
//�Զ������ǵ��쳣��namePswdErrorExecption, �ȼ̳�Execption, Ȼ����дExecption�е��ĸ����췽����������Ҽ�����source, �㵹���ڶ��ȫ����
@SuppressWarnings("serial")
class namePswdErrorExecption extends Exception{
			public namePswdErrorExecption() {
				super();
			}
			public namePswdErrorExecption(String message, Throwable cause) {
				super(message, cause);
			}
			public namePswdErrorExecption(String message) {
				super(message);
			}
			public namePswdErrorExecption(Throwable cause) {
				super(cause);
			}
		}