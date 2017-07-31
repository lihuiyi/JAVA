package StringBuffer和StringBuilder;
//Demo53是StringBuffer和StringBuilder的操作
//append()
//insert(下标m，要插入的字符串)
//delete(开始下标m，结束下标n)
//deleteCharAt(下标)
public class Demo53 {

	public static void main(String[] args) {
		//StirngBuffer字符串对象
		//StringBuffer对象的append()方法，表示字符串拼接
		StringBuffer s10= new StringBuffer("abcd");
		StringBuffer s11=new StringBuffer("ef");
		System.out.println("s10字符串和s11字符串的拼接："+s10.append(s11));
		
		
		//StringBUilder字符串对象
		StringBuilder s12=new StringBuilder("今天希望,");
		
		//StringBuilder对象的append(字符串)方法，表示字符串拼接
		s12.append("能早点下班。");
		String s13="可惜晚上要加班！！！";
		s12.append(s13);
		
		//insert(下标，字符串)，在对应下标前面插入字符串
		s12.insert(2, "迫切");    //在下标为2的字符前面插入字符"迫切"
		System.out.println("s12调用appnd()方法，字符串拼接："+s12);
		
		//delete(开始下标，结束下标)，删除从开始下标到结束下标以前（不包含结束下标）之间的字符串
		s12.delete(13 ,15);      //删除下标从13开始到15以前（不包含15）的字符串
		System.out.println("s12调用delete()方法，删除对应下标的字符串："+s12);
		
		//deleeteCharAt(下标)方法，删除对应下标的字符
		s12.deleteCharAt(19);   //删除下标为19的字符
		System.out.println("s12调用deleteChar()方法，删除对应下标的字符："+s12);
		
		
		//toString()方法，把StringBuffer或者StringBuilder转换成String类型的字符串
		String str=s12.toString();
		System.out.println("s12调用toString()方法，把StringBuffer转换成String类型的字符串： "+str);		

	}

}
