package Java_03;

import java.util.Date;

public class Operation {

	public static void main(String[] args) {
		//��ü(Object)�����ϱ�.
		Operation oper = new Operation();
//		Head head = new Head();
		
		
		
		Date date = new Date(); //import java.util
		//���� �ð�
		System.out.println(date.toString());//date.�ȿ� �������� �ִ� ��.
		System.out.println(date.getYear()); 
		System.out.println(date.getDate()); 
	}

}
