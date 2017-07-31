package Ñ­»·;

public class Demo5 {

	public static void main(String[] args) {
		int sum1=0,sum2=0,sum3=0;
		//1+2+3+4+.....+20
		for(int n1=1;n1<20;n1++){
			sum1=sum1+n1;
			System.out.println(sum1);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		//2+4+6+8+.....+18
		for(int n2=1;n2<18;n2++){
			sum2=sum2+n2*2;
			System.out.println(sum2);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		//1+3+5+7+.....+19
		for(int n3=1;n3<19;n3++){
			sum3=sum3+2*n3-1;
			System.out.println(sum3);
		}
	}

}
