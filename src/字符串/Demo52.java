package �ַ���;
//Demo52���ַ����ķ���
//substring(�±�m)
//substring(�±�m,�±�n)
//endswhth(String�ַ���)
//split(��ֱ�ʶ)
//length()
//equals()
//trim()
//toUpperCase()
//toLowerCaase()
//StringBuffer����     append()����
//StringBuilder����   append()����
public class Demo52 {

	public static void main(String[] args) {
		String s2="lihuiyi";
		//substring(�±�m)
		String sub1= s2.substring(2);
		System.out.println("ȡ�����±�Ϊ2��ʼ�������ַ�����ɵ��ַ�����"+sub1);
		//substring(�±�m,�±�n)
		String sub2=s2.substring(2, 4);
		System.out.println("ȡ�����±�Ϊ2��ʼ���±�Ϊ4��ֹ���ַ�����ɵ��ַ�����"+sub2);
		
		
		
		String s3="hello.txt";
		//endswith(�ַ���a),����ַ������ַ���a��β�ͷ���true,��֮����false
		boolean ends = s3.endsWith(".txt");
		System.out.println("s3�ַ����ǲ�����.txt��β�ģ� "+ends);
		//startswith(�ַ���a),����ַ������ַ���a��ͷ�ͷ���true,��֮����false
		boolean starts=s3.startsWith("he");
		System.out.println("s3�ǲ�����he��ͷ�ģ� "+starts);
		
		
		//split(��ֱ�ʶ)��ͨ����ֱ�ʶ������ַ���
		String s4="1/3/yi";
		String [] s4s=s4.split("/");
		System.out.println("s4s��һ�"+s4s[0]+"   "+"s4s�ڶ��"+s4s[1]+"   "+"s4s�����"+s4s[2]);
		
		
		//length()�����ַ����ĳ���
		String s5="guog";
		int s5s=s5.length();
		System.out.println("s5�ĳ��ȣ� "+s5s);
		
		
		//equals()�ж�2���ַ����Ƿ����
		String s6="abcd";
		String s7="Abcd";
		boolean boo1=s6.equals(s7);  //���ִ�Сд
		System.out.println("s6��s7�Ƿ���ȣ����ִ�Сд�� "+boo1);
		boolean boo2=s6.equalsIgnoreCase(s7);   //���Դ�Сд
		System.out.println("s6��s7�Ƿ���ȣ����Դ�Сд��  "+boo2);
		
		
		//trim()����,ȥ���ַ�����β�Ŀո�
		String s8="  abc  ";
		System.out.println("s8ȥ����β�Ŀո�"+s8.trim());
		
		
		//touppercase()���������ַ��������ַ���ɴ�д
		//toLowerCase()���������ַ��������ַ����Сд
		String s9="tAGyouFli���һ";
		System.out.println("��s9�����ַ���ɴ�д��"+s9.toUpperCase());
		System.out.println("��s9�����ַ����Сд��"+s9.toLowerCase());
		
	}

}

