package 工具类;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int num2 =scanner.nextInt();
		int sum =num1+num2;
		System.out.println("两个数的和是："+sum);
	}

}
