package 时间类;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Demo50 {

	public static void main(String[] args) {
		Date date1 =new Date();
		System.out.println("当前系统时间是："+date1);
		
		SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd");
		String date2 = dateFormat.format(date1);
		System.out.println("简化后的系统时间："+date2);
		
		
	}
}

