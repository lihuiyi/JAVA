package 异常;

public class Demo54 {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		try{
			int i=100/0;     //
			String str=null;
			System.out.println(str.length());    //空指针异常，字符串不能为空
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("除数不能为0");
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("String类型的字符串不能为null");
		}
	}
}
