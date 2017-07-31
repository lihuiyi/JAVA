package object;
//Demo45��toString������hashCode������equals�����ۺ�����
//��дtoString����������return����ķ���ֵ���˴�������Ϊname+","+age+","+salary
//��дhashCode����������return����ķ���ֵ���˴�������Ϊage
//��дequals������
//����1.equals(null);  ��˼��:����1�Ƿ����null   ִ�е�һ��if���
//����1.equals(����1);  ��˼�ǣ�����1�Ƿ���ڶ���1   ִ�еڶ���if���
//����1.equals(����2);  ��˼�ǣ�����1�Ƿ���ڶ���2   ִ�е�����if���������Ǹ�if��䣬��if���������԰��������Լ����뷨������2�������Ƿ���ȵ�����,�˴�������Ϊ����1�����ֵ��ڶ���2�����ֲ��Ҷ���1��������ڶ��� 2������
public class Demo45 {

	public static void main(String[] args) {
		Abc abc1= new Abc("���һ",25, 5000);
		Abc abc2 =new Abc("���һ",25,8000);
		Abc abc3 =new Abc("���һ",30,9000);
		//������д��toString()����
		System.out.println("������д��toString������"+abc1);
		//������д��hsahCode()����
		System.out.print("��д���hashCode����ֵ��age���ԡ�           ");
		System.out.println("abc1����:"+abc1.hashCode()+"  "+"abc2���أ�"+abc2.hashCode()+"  "+"abc3���أ�"+abc3.hashCode());
		//�����ǵ�����д��equals()����
		//ִ�е�һ��if���
		System.out.println("�Ƚ�abc1��null�Ƿ���ȣ�"+abc1.equals(null));
		//ִ�еڶ���if���
		System.out.println("�Ƚ�abc1�����Լ��Ƿ���ȣ�"+abc1.equals(abc1));
		//����3�д����ǣ�ִ�е�����if���������Ǹ�if���
		System.out.println("�Ƚ�abc1��abc2�Ƿ���ȣ�"+abc1.equals(abc2));
		System.out.println("�Ƚ�abc2��abc3�Ƿ���ȣ�"+abc2.equals(abc3));
		System.out.println("�Ƚ�ab1c��abc3�Ƿ���ȣ�"+abc1.equals(abc3));
	}

}
class Abc{
	String name;
	int age;
	double salary;
	Abc(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void show(){
		System.out.println(name+","+age+","+salary);
	}
	public int hashCode() {
		return age;
	}
	public boolean equals(Object obj) {
		//���������obj��main�����д������new�����Ķ���
		//new�����Ķ����Ƿ����null��        ��main������д��obj.equals(null)����˼�ǣ�new�����Ķ����Ƿ����null
		if(obj==null){
			return false;
		}
		//new�����Ķ����Ƿ�������Լ���       ��main������д��obj.equals(obj),��˼�ǣ�new�����Ķ����Ƿ�������Լ�
		if(obj==this){
			return true;
		}
		//new�����Ķ����Ƿ�����Abc����࣬������ڵĻ�����ִ��new�����Ķ���ǿ��ת�����ͣ���ΪAbc��,��ִ�������if���
		if(obj instanceof Abc){
			//new�����Ķ���ǿ������ת�������Abc��
			Abc abc= (Abc) obj;
			//if������ڸ���2�������Ƿ���ȵ�������������Ȳ���������ȣ��ͷ���true    
			//main������д������1.equals(����2)����˼�ǣ�����1�����ֺ�����Ķ���2�����ֺ����䣬�ͷ���true
			if(abc.name==this.name && this.age==abc.age){
				return true;
			}
		}
		//ǰ�漸��if��䶼������ͷ���false
		return false;
	}
	public String toString() {
		return name+","+age+","+salary;
	}
	
}