package ������;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		System.out.println("�������һ������");
		int num1 = scanner.nextInt();
		System.out.println("������ڶ�������");
		int num2 =scanner.nextInt();
		int sum =num1+num2;
		System.out.println("�������ĺ��ǣ�"+sum);
	}

}
