package ʱ����;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Demo50 {

	public static void main(String[] args) {
		Date date1 =new Date();
		System.out.println("��ǰϵͳʱ���ǣ�"+date1);
		
		SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd");
		String date2 = dateFormat.format(date1);
		System.out.println("�򻯺��ϵͳʱ�䣺"+date2);
		
		
	}
}

