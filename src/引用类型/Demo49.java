package ��������;
//Demo�ǻ������ͺ��������Ϳ����໥ת�����Զ�ת����
import java.util.HashMap;
public class Demo49 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//���������Զ�ת��Ϊ��������
		int num1 = new Integer(12);
		System.out.println("���������Զ�ת��Ϊ�������ͣ�"+num1);
		//���������Զ�ת��Ϊ��������
		Integer num2 = 13;
		System.out.println("���������Զ�ת��Ϊ�������ͣ�"+num2);
		
		//�ַ���ת��Ϊ����
		@SuppressWarnings("unused")
		int a = Integer.parseInt("2");
		
//		�������͵����ݷ��뼯�Ͽ����ʱ�����Զ�ת��Ϊ�������ͣ���Ϊ������ֻ�ܱ������
		HashMap map =new HashMap();
		map.put("k1",new Integer(13));
		map.put("k2", new Double(15.6));
		//28�ǻ����������ͣ��ŵ�������ʱ���Զ�ת��Ϊ��������new Integer(28)
		map.put("k3", 28);
		int v= (Integer) map.get("k3");     //�Ⱥź����Ǵ�HashMap��ȡ��k3��Ҫǿ������ת�����Ⱥ�ǰ�������������Զ�ת��Ϊ��������
		System.out.println("�������͵����ݷŵ�������ʱ���Զ�ת��Ϊ�������ͣ�"+v);
		
		
	}

}
