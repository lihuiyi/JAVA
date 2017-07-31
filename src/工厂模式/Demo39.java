package ����ģʽ;
//Demo39��
//���һ������Car:
//              ���ԣ�����
//              ����:show()��ʾCar������
//              ���췽�����չ��췽���ʹ������Ĺ��췽��
//Car������Bmw: ���ԣ��ٶ�
//             ������show����������ʾ����
//Car������Benz�����ԣ��۸�
//             ������show()������ʾ����
//Car��������QQ:���ԣ���ɫ
//            ������show()������ʾ����
//���һ������ģʽ�����Ը����û���������������ͬ���������
public class Demo39 {

	public static void main(String[] args) {
		Car bmw = CarFactory.getInstance("bmw");
		//      = new Bmw();
		bmw.show();
		Car benz =CarFactory.getInstance("benz");
		//       = new Benz();
		benz.show();
		Car qq = CarFactory.getInstance("qq");
		//     = new QQ();
		qq.show();
	}

}
class CarFactory{
	public static Car getInstance(String carType){
		Car car=null;         //��������
		if(carType=="bmw"){
			car =new Bmw();   //���ഴ������
			return car;
		}else if(carType=="benz"){
			car =new Benz();       //����̴�������
			return car;
		}else if(carType=="qq"){
			car =new QQ();       //���ഴ������
			return car;
		}
		return  car;
	}
}
class Car{
	String name;
	void show(){
		System.out.println(name);
	}
	Car(){}
	Car(String name){
		this.name=name;
	}
}
class Bmw extends Car{
	int sudu;
	//��дshow����
	void show(){
		this.name="bmw";
		System.out.println("�����ǣ�"+name);
	}
}
class Benz extends Car{
	int price;
	//��дshow����
	void show(){
		this.name="benz";
		System.out.println("�����ǣ�"+name);
	}
}
class QQ extends Car{
	String color;
	//��дshow����
	void show(){
	this.name="qq";
		System.out.println("�����ǣ�"+name);
	}
}
