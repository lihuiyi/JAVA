package 字符串;
//Demo52是字符串的方法
//substring(下标m)
//substring(下标m,下标n)
//endswhth(String字符串)
//split(拆分标识)
//length()
//equals()
//trim()
//toUpperCase()
//toLowerCaase()
//StringBuffer对象，     append()方法
//StringBuilder对象，   append()方法
public class Demo52 {

	public static void main(String[] args) {
		String s2="lihuiyi";
		//substring(下标m)
		String sub1= s2.substring(2);
		System.out.println("取出从下标为2开始到最后的字符，组成的字符串："+sub1);
		//substring(下标m,下标n)
		String sub2=s2.substring(2, 4);
		System.out.println("取出从下标为2开始到下标为4终止的字符，组成的字符串："+sub2);
		
		
		
		String s3="hello.txt";
		//endswith(字符串a),如果字符串以字符串a结尾就返回true,反之返回false
		boolean ends = s3.endsWith(".txt");
		System.out.println("s3字符串是不是以.txt结尾的： "+ends);
		//startswith(字符串a),如果字符串以字符串a开头就返回true,反之返回false
		boolean starts=s3.startsWith("he");
		System.out.println("s3是不是以he开头的： "+starts);
		
		
		//split(拆分标识)，通过拆分标识来拆分字符串
		String s4="1/3/yi";
		String [] s4s=s4.split("/");
		System.out.println("s4s第一项："+s4s[0]+"   "+"s4s第二项："+s4s[1]+"   "+"s4s第三项："+s4s[2]);
		
		
		//length()返回字符串的长度
		String s5="guog";
		int s5s=s5.length();
		System.out.println("s5的长度： "+s5s);
		
		
		//equals()判断2个字符串是否相等
		String s6="abcd";
		String s7="Abcd";
		boolean boo1=s6.equals(s7);  //区分大小写
		System.out.println("s6和s7是否相等，区分大小写： "+boo1);
		boolean boo2=s6.equalsIgnoreCase(s7);   //忽略大小写
		System.out.println("s6和s7是否相等，忽略大小写：  "+boo2);
		
		
		//trim()方法,去掉字符串首尾的空格
		String s8="  abc  ";
		System.out.println("s8去掉首尾的空格："+s8.trim());
		
		
		//touppercase()方法，把字符串所有字符变成大写
		//toLowerCase()方法，把字符串所有字符变成小写
		String s9="tAGyouFli李慧一";
		System.out.println("把s9所有字符变成大写："+s9.toUpperCase());
		System.out.println("把s9所有字符变成小写："+s9.toLowerCase());
		
	}

}

