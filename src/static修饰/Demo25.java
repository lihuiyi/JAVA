
package static����;
//Demo25�Ǵ���Student�࣬Ȼ��ͳ��ѧ�����������
//������ʹ��staticѧ���ľ�̬����num����ͳ��ѧ������ĸ�����ÿnewһ�������ʱ�򣬵��ù��췽����ִ��num��1��new�˵�3�������ʱ��num��3
//˵��ͳ�ƽ���ǣ�ѧ������ĸ�����3
public class Demo25 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Student student1 =new Student("��",25,"���");
		Student student2 =new Student("��",30,"����");
		Student student3= new Student("��",40,"��Ŀ");
		System.out.println("ѧ�������ǣ�"+Student.num);
	}

}
class Student{
	String name;
	int age;
	String job;
	static int num=0;
	Student(String name,int age,String job){
		this.name=name;
		this.age=age;
		this.job=job;
		//num�Ǿ�̬���ԣ�����ͳ��ѧ������ĸ�����ÿnewһ�������ʱ�򣬵��ù��췽����ִ��num��1
		num++;
	}
}