package �ӿڰ�;
//Demo43�ǳ�����ͽӿ��ܺ͵�ʹ��
//������Car�����ԣ����֡���ɫ���ٶ�
//         ��������������ʻ��ɲ��
//�ӿ�1��������getMoney�����շ�
//�ӿ�2��������getControlDegree���ڿ����¶�
//��Taxi:���ԣ����֡���ɫ���ٶȡ��¶�
//      ��������������ʻ��ɲ���������¶ȡ��շ�
//��Bmw:���ԣ����ơ���ɫ���ٶȡ��¶�
//      ��������������ʻ��ɲ���������¶�
public class Demo43 {

	public static void main(String[] args) {
		Taxi taxi =new Taxi();
		taxi.qd();
		taxi.xs();
		taxi.sc();
		taxi.getControlDgree();
		taxi.getMoney();
		Bmw bmw=new Bmw();
		bmw.qd();
		bmw.xs();
		bmw.sc();
		bmw.getControlDgree();
		

	}

}
abstract class Car{
	String name;
	String color;
	int sudu;
	public abstract void qd();
	public abstract void xs();
	public abstract void sc();
	Car(){}
	Car(String name,String color,int sudu){
		this.name=name;
		this.color=color;
		this.sudu=sudu;
	}
}
interface jiekou1{
	public void getMoney();
}
interface jiekou2{
	public void getControlDgree();
}
class Taxi extends Car implements jiekou1,jiekou2{
	int wd;
	public void qd(){
		sudu=0;
		System.out.println("���⳵���������У�"+"�ٶ�="+sudu);
	}
	public void xs(){
		sudu=100;
		System.out.println("���⳵������ʻ�У�"+"�ٶ�="+sudu);
	}
	public void sc(){
		sudu=0;
		System.out.println("���⳵ɲ���ɹ���"+"�ٶ���"+sudu);
	}
	public void getMoney(){
		System.out.println("���⳵�շ�");
	}
	public void getControlDgree(){
		wd=20;
		System.out.println("���⳵�¶ȿ�����"+wd+"���϶�");
	}	
}
class Bmw extends Car implements jiekou2{
	int wd;
	public void qd(){
		sudu=0;
		System.out.println("��������������,�ٶ�="+sudu);
	}
	public void xs(){
		sudu=120;
		System.out.println("����������ʻ���ٶ�="+sudu);
	}
	public void sc(){
		sudu=0;
		System.out.println("����ɲ���ɹ����ٶ�="+sudu);
	}
	public void getControlDgree(){
		wd=21;
		System.out.println("�����¶ȿ�����"+wd+"���϶�");
	}
}
