package private��public����;
//Demo9�ǹ���privateֻ�������з��ʣ�����޷�����
public class Demo15 {

	public static void main(String[] args) {
		 teacher teacher =new teacher("���һ",25,8000); //����ͨ�����췽������private name������Ϊ���������ʱ�������teacher���е�teacher���췽����ͨ�����еĹ��췽��������private name
		 //teacher�����棬���ܷ��ʼ���private�ľֲ�����
		 //teacher.name="��";                   //nameǰ�����private��������д�ᱨ���Ѿ������ˣ���x��
		 //System.out.println(teacher.name);   //nameǰ�����private,������д�ᱨ���Ѿ������ˣ���x��
		 teacher.age=30;      
		 //ageû�м�private�����Կ��Է���
		 System.out.println(teacher.age);
		 
		 
	}
}
class teacher{
	//teacher���У���name����ǰ�����private��name�����teacher���еľֲ�������ֻ����teacher���з��ʣ�����teacher��Ͳ��ܷ��ʣ��ᱨ��
	private String name;
	int age;
	double salary;
	String show(){
		System.out.println("������"+ name);
		System.out.println("���䣺"+ age +"��");
		System.out.println("�����ǣ�"+salary+"Ԫ");
		return name;
	}
	teacher(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	
}
