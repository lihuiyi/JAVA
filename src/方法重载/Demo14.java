package ��������;
//Demo8�ǹ��췽��������
public class Demo14 {

	public static void main(String[] args) {
		//����user1���󣬸��ݴ��ݵĲ���ȷ�����õ�һ��user���췽��
		user user1=new user("�ܲ�");
		System.out.println(user1);
		//����user2���󣬸��ݴ��ݵĲ���ȷ�����õڶ���user���췽��
		user user2 =new user("���һ",25,"13529027562");
		System.out.println(user2);
	}
}
class user{
	String name;
	int age;
	String tel;
//	�����2��user���췽����������
	//��һ��user���췽��
	user(String name){
		this.name=name;
	}
	//�ڶ���user���췽��
	user(String name,int age,String tel){
		this.name=name;
		this.age=age;
		this.tel=tel;
	}
	public String toString() {
		return name+"   "+age+"   "+tel;
	}
	
}