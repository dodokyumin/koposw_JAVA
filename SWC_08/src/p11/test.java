package p11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		String startTime = null;
		String endTime = null;
		 
		 
		Date date = new Date();
		 
		// 포맷변경 ( 년월일 시분초)
		SimpleDateFormat sdformat = new SimpleDateFormat("HH:mm:ss"); 
		 
		// Java 시간 더하기
		 
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		 
		startTime = sdformat.format(cal.getTime());  
		System.out.println("시작 시간 : " + startTime); //05/13/2021 13:25:57
		 
		// 3분 더하기
		cal.add(Calendar.SECOND, 10);
		endTime = sdformat.format(cal.getTime());
		System.out.println("완료 시간 : " + endTime); //05/13/2021 13:25:57
		 

	}

}
