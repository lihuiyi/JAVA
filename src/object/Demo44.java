package object;
//Demo44��
//������Ĭ�ϼ̳�object�ࡣ
//toString()������object��ķ�����Ĭ�Ϸ��أ�����.����@16���Ƶ��ַ�����
//����Ƶ����̳л�̳�object���е�toString()�����������дtoString()������returnһ������ֵ
//ֱ���������ʱ��Ĭ�ϵ���toString()����
public class Demo44 {

	public static void main(String[] args) {
		User user=new User("���һ",25);
		System.out.println(user.toString());
		System.out.println();
		//ֱ���������ʱ��Ĭ�ϵ���toString()����
		System.out.println(user);
	}

}
//User��Ĭ�ϼ̳�object�࣬ͬʱҲ�̳���object����toString()����
class User{
	String name;
	int age;
	
	User(String name,int age){
		this.name=name;
		this.age=age;
	}
	//��дtoString()������Ҫreturnһ������ֵ
	public String toString(){
		String message="User���У�"+"\n"+"����������ǣ�"+name+"\n"+"����������ǣ�"+age;
		return message;
	}
}