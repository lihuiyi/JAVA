package 字符串;
//Demo51是字符串的方法
//char(index)
//indexOf(char)       indexOf(String)
//lastIndexOf(char)   lastIndexOf(String)

public class Demo51 {

	public static void main(String[] args) {
		String s1= "lihuiyi";
		//取出字符串中对应下标的字符
		char zf= s1.charAt(2);
		System.out.println("下标为2的字符："+zf);
		
		//字符i在字符串中第一次出现的下标
		int index1= s1.indexOf("i");
		System.out.println("字符i在字符串中的第一次出现的下标："+index1);
		
		//字符i在字符串中最后一次出现的下标
		int index2= s1.lastIndexOf("i");
		System.out.println("字符i在字符串中最后一次出现的下标："+index2);
		
		//字符串hu字字符串中第一次出现的下标
		int index3=s1.indexOf("hu");
		System.out.println("字符串hu第一次出现的下标："+index3);
	}

}


