package ����;
//Demo1�Ǳ������飬Ϊ���鸳ֵ��
//��һ������num1��ֵ1��100
//�ڶ�������num2��ֵż��
//����������nuum3��ֵ����
public class Demo8 {

	public static void main(String[] args) {
		//��������num1��ʹ��forѭ���������飬Ϊ���鸳ֵ1��2��3��4��5....100����
		int num1 [] =new int [100];
		for (int i=0;i<100 ;i++ ) {
			num1[i]=i+1;    //��һ��ѭ��i����0��num1[0]=1���ڶ���ѭ��i����1��num1[1]=2
			System.out.println("num1"+"  "+num1[i]);
		}
		//��������num2��ʹ��forѭ���������飬Ϊ���鸳ֵ2��4��6��8��10.....200��ż��
		int num2 [] =new int [100];
		for (int i=0;i<100 ;i++ ) {
			num2[i]=(i+1)*2;     //��һ��ѭ��i����0��num2[0]=2���ڶ���ѭ��i����1��num2[1]=4
			System.out.println("               "+"num2��"+"  "+num2[i]);
		}
		//��������num3��ʹ��forѭ���������飬Ϊ���鸳ֵ1��3��5��7��9......99������
		int num3 [] =new int [100];
		for (int i=0;i<100 ;i++ ) {
			num3[i]=(i+1)*2-1;    //��һ��ѭ��i����0��num3[0]=1���ڶ���ѭ��i����1��num3[1]=3
			System.out.println("num3"+"  "+num3[i]);
		}
	}

}
