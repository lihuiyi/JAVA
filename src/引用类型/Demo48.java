package 引用类型;

public class Demo48 {

	public static void main(String[] args) {
		//声明引用类型Integer，并赋值12
		Integer integer1 = new Integer(12);
		//显示integer1信息，默认调用toString()方法
		System.out.println("显示integer1的信息："+integer1);
		//调用intvalue()方法,取出integer1的值
		int num=integer1.intValue();
		System.out.println("调用intvalue()方法："+num);
		//integer是intvalue
		//Double是Doublevalue
		//其他引用类型都相似
		
	}

}
