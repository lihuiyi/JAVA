package static����;
//Demo24��static���ε������Ǿ�̬���ԣ������йأ��Ͷ����޹ء�Ҫ���������̬���Ը�ʽΪ������.������
public class Demo24 {

	public static void main(String[] args) {
		//������д��������Сд
		User user=new User();
		//������.������  ���ʵ��Ƕ��������
		user.name="���һ";
		user.age=25;
		//����.������   ���ʵ�����ľ�̬����
		User.num=100;
		System.out.println(user.name+","+user.age+","+User.num);
	}

}
//������д
class User{
	String name;   //ʵ������
	int age;       //ʵ������
	//static���ε������Ǿ�̬����
	static int num;    //��̬����
}