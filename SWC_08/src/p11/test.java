package p11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		String startTime = null;
		String endTime = null;
		 
		 
		Date date = new Date();
		 
		// ���˺��� ( ����� �ú���)
		SimpleDateFormat sdformat = new SimpleDateFormat("HH:mm:ss"); 
		 
		// Java �ð� ���ϱ�
		 
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		 
		startTime = sdformat.format(cal.getTime());  
		System.out.println("���� �ð� : " + startTime); //05/13/2021 13:25:57
		 
		// 3�� ���ϱ�
		cal.add(Calendar.SECOND, 10);
		endTime = sdformat.format(cal.getTime());
		System.out.println("�Ϸ� �ð� : " + endTime); //05/13/2021 13:25:57
		 

	}

}
