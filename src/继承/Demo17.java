package �̳�;
//Demo17�Ǽ̳�
//person����name��age��sex���ԣ���speak������
//student����name��age��sex��job��tel���ԣ���speak��add������
//person���student�඼�е����Ժͷ�����name��age��sex���Ժ�speak������
//student��̳�person���name��age��sex���Ժ�speak������job��tel���Ժ�add������student�����е����Ժͷ�����
public class Demo17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		student student =new student();
		//student���е�name��age��sex��speak�̳���person��
		student.name="���һ";
		student.age=25;
		student.sex="��";
		student.speak();

	}

}
class person{
	String name;
	int age;
	String sex;
	void speak(){
		System.out.println("���ǣ�"+name);
	}
}
//student��ʹ��extends���̳���person���name��age��sex���Ժ�speak����
class student extends person{
	String job;
	String tel;	
	int add(int num1,int num2){
		int sum=num1+num2;
		return sum;
	}
}
//teacher��ӵ��student�����е����Ժ� ������name��age��sex��job��tel��speak��add����salary��teacher���е�
class teacher extends student{
	double salary;
}
