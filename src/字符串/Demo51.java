package �ַ���;
//Demo51���ַ����ķ���
//char(index)
//indexOf(char)       indexOf(String)
//lastIndexOf(char)   lastIndexOf(String)

public class Demo51 {

	public static void main(String[] args) {
		String s1= "lihuiyi";
		//ȡ���ַ����ж�Ӧ�±���ַ�
		char zf= s1.charAt(2);
		System.out.println("�±�Ϊ2���ַ���"+zf);
		
		//�ַ�i���ַ����е�һ�γ��ֵ��±�
		int index1= s1.indexOf("i");
		System.out.println("�ַ�i���ַ����еĵ�һ�γ��ֵ��±꣺"+index1);
		
		//�ַ�i���ַ��������һ�γ��ֵ��±�
		int index2= s1.lastIndexOf("i");
		System.out.println("�ַ�i���ַ��������һ�γ��ֵ��±꣺"+index2);
		
		//�ַ���hu���ַ����е�һ�γ��ֵ��±�
		int index3=s1.indexOf("hu");
		System.out.println("�ַ���hu��һ�γ��ֵ��±꣺"+index3);
	}

}


