package ���Ͽ��;
//Demo47��HashMap��ʹ��
import java.util.HashMap;
public class Demo47 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashMap map =new HashMap();
		//ʹ��put()���������������Ԫ��
		map.put("k1", new Person("���һ"));
		map.put("k2", new Person("��"));
		map.put("k3", "����������");
		//���map���ϵ���Ϣ��map�а����������ʱĬ�ϵ���toString����������Ҫ��дtoString����
		System.out.println(map);
		//ʹ��get()������ȡ�����е�Ԫ�أ�����ǿ������ת��
		Person k1=(Person) map.get("k1");
		System.out.println("��ȡ������k1��value:"+k1);
		
	}

}
class Person{
	String name;
	Person(String name){
		this.name=name;
	}
	//��дtoString����
	public String toString() {
		return name;
	}
	
}