package �ӿڰ�;
//Demo42��
//�ӿںͽӿ�֮��ļ̳У�Demo41�ǽӿں�����֮���ʵ�֣�
//1���ӿڿ��Լ̳ж���ӿ�
public class Demo42 {

	public static void main(String[] args) {
		//����Allsxֱ�Ӵ�������
		Allsx allsx=new Allsx();
		//show1��show2��show3��Allsx������д�ķ���
		allsx.show1();
		allsx.show2();
		allsx.show3();
		allsx.sum();
		System.out.println();
		//��������ָ���������
		All all=new Allsx();
		//show1��show2��show3��������д�ķ���
		all.show1();
		all.show2();
		all.show3();
		//sum��дAll�ӿڵķ���
		all.sum();
	}

}
//3���ӿڣ�Aoo1��Aoo2��Aoo3
interface Aoo1{
	public abstract void show1();
}
interface Aoo2{
	public abstract void show2();
}
interface Aoo3{
	public abstract void show3();
}
//�ӿڿ��Զ�̳У�All�ӿڼ̳���Aoo1�ӿڡ�Aoo2�ӿڡ�Aoo3�ӿ�
interface All extends Aoo1,Aoo2,Aoo3{
	//�ӿ�All���еĳ��󷽷�
	public abstract void sum();
}
//Allsx��All�ӿڵ����࣬����ʵ��All�ӿ�
class Allsx implements All{
	public void show1(){
		System.out.println("��дshow1���󷽷���show1���ڽӿ�All�м̳��ڽӿ�Aoo1�ĳ��󷽷�");
	}
	public void show2(){
		System.out.println("��дshow2���󷽷���show2���ڽӿ�All�м̳��ڽӿ�Aoo2�ĳ��󷽷�");
	}
	public void show3(){
		System.out.println("��дshow3���󷽷���show3���ڽӿ�All�м̳��ڽӿ�Aoo3�ĳ��󷽷�");
	}
	public void sum(){
		System.out.println("��дsum���󷽷���sum���ڽӿ�All�ж��еĳ��󷽷�");
	}
}