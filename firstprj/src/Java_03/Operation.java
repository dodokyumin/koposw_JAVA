package Java_03;

import java.util.Date;

public class Operation {

	public static void main(String[] args) {
		//객체(Object)생성하기.
		Operation oper = new Operation();
//		Head head = new Head();
		
		
		
		Date date = new Date(); //import java.util
		//현재 시각
		System.out.println(date.toString());//date.안에 여러개가 있는 것.
		System.out.println(date.getYear()); 
		System.out.println(date.getDate()); 
	}

}
