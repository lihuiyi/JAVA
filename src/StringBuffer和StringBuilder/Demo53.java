package StringBuffer��StringBuilder;
//Demo53��StringBuffer��StringBuilder�Ĳ���
//append()
//insert(�±�m��Ҫ������ַ���)
//delete(��ʼ�±�m�������±�n)
//deleteCharAt(�±�)
public class Demo53 {

	public static void main(String[] args) {
		//StirngBuffer�ַ�������
		//StringBuffer�����append()��������ʾ�ַ���ƴ��
		StringBuffer s10= new StringBuffer("abcd");
		StringBuffer s11=new StringBuffer("ef");
		System.out.println("s10�ַ�����s11�ַ�����ƴ�ӣ�"+s10.append(s11));
		
		
		//StringBUilder�ַ�������
		StringBuilder s12=new StringBuilder("����ϣ��,");
		
		//StringBuilder�����append(�ַ���)��������ʾ�ַ���ƴ��
		s12.append("������°ࡣ");
		String s13="��ϧ����Ҫ�Ӱ࣡����";
		s12.append(s13);
		
		//insert(�±꣬�ַ���)���ڶ�Ӧ�±�ǰ������ַ���
		s12.insert(2, "����");    //���±�Ϊ2���ַ�ǰ������ַ�"����"
		System.out.println("s12����appnd()�������ַ���ƴ�ӣ�"+s12);
		
		//delete(��ʼ�±꣬�����±�)��ɾ���ӿ�ʼ�±굽�����±���ǰ�������������±֮꣩����ַ���
		s12.delete(13 ,15);      //ɾ���±��13��ʼ��15��ǰ��������15�����ַ���
		System.out.println("s12����delete()������ɾ����Ӧ�±���ַ�����"+s12);
		
		//deleeteCharAt(�±�)������ɾ����Ӧ�±���ַ�
		s12.deleteCharAt(19);   //ɾ���±�Ϊ19���ַ�
		System.out.println("s12����deleteChar()������ɾ����Ӧ�±���ַ���"+s12);
		
		
		//toString()��������StringBuffer����StringBuilderת����String���͵��ַ���
		String str=s12.toString();
		System.out.println("s12����toString()��������StringBufferת����String���͵��ַ����� "+str);		

	}

}
