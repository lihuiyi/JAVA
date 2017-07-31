package 数组;
//Demo1是遍历数组，为数组赋值。
//第一个数组num1赋值1到100
//第二个数组num2赋值偶数
//第三个数组nuum3赋值奇数
public class Demo8 {

	public static void main(String[] args) {
		//创建数组num1，使用for循环遍历数组，为数组赋值1、2、3、4、5....100的数
		int num1 [] =new int [100];
		for (int i=0;i<100 ;i++ ) {
			num1[i]=i+1;    //第一次循环i等于0，num1[0]=1。第二次循环i等于1，num1[1]=2
			System.out.println("num1"+"  "+num1[i]);
		}
		//创建数组num2，使用for循环遍历数组，为数组赋值2、4、6、8、10.....200的偶数
		int num2 [] =new int [100];
		for (int i=0;i<100 ;i++ ) {
			num2[i]=(i+1)*2;     //第一次循环i等于0，num2[0]=2。第二次循环i等于1，num2[1]=4
			System.out.println("               "+"num2是"+"  "+num2[i]);
		}
		//创建数组num3，使用for循环遍历数组，为数组赋值1、3、5、7、9......99的奇数
		int num3 [] =new int [100];
		for (int i=0;i<100 ;i++ ) {
			num3[i]=(i+1)*2-1;    //第一次循环i等于0，num3[0]=1。第二次循环i等于1，num3[1]=3
			System.out.println("num3"+"  "+num3[i]);
		}
	}

}
