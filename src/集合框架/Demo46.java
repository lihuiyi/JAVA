package ���Ͽ��;
//Demo46��ArrayList���Ͽ��
import java.util.ArrayList;
public class Demo46 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Teacher teacher =new Teacher("���һ",25);
		Student student =new Student("��",8000);
		//ArrayList���Ͽ��
		ArrayList list =new ArrayList();
		//�����Ͽ�������Ԫ�أ�ʹ��add(����)��
		list.add(teacher);
		list.add(student);
		//�Ӽ��Ͽ���л�ȡ����ʹ��get(����)������ǿ������ת��
		Teacher teacher1=(Teacher) list.get(0);
		Student student1 =(Student) list.get(1);
		System.out.println(teacher1.name);
		System.out.println(student1.name);
		//������Ԫ�ظ���
		System.out.println("������Ԫ�ظ�����"+list.size());
		//ɾ�������е�Ԫ��
		list.remove(1);
		System.out.println("ɾ������Ϊ1��Ԫ��֮�󣬻��ж��ٸ�Ԫ�أ�"+list.size());
		//����toString()����
		//�����е�Ԫ�������дtoString()����,�����ϵ���toString()����ʱ������ֱ����������а����Ķ�����Ϣ
		System.out.println(list.toString());
		
	}

}
class Teacher{
	String name;
	int age;
	Teacher(String name,int age){
		this.name=name;
		this.age=age;
	}
	//��дtoString()����
	public String toString(){
		return "�����ǣ�"+name+","+"�����ǣ�"+age;
	}
}
class Student{
	String name;
	double salary;
	Student(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	//��дtoString()����
	public String toString(){
		return "�����ǣ�"+name+","+"�����ǣ�"+salary;
	}
}