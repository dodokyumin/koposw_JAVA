package A1_001;

public class a5_001 {

	public static void main(String[] args) {
		int year = 2022;
		int myBDayYear = 1996;
		String introduce = "Hi, my name is ";
		String myName = "kyumin";
		
		System.out.println(introduce + myName);
		System.out.println("I'm " + (year-myBDayYear+1)+"years old.");
		//���⼭ year-myBDayYear+1�� ��ȣ�� ���־�� �Ѵ�!
		
		myName = "Anthony";
		System.out.println(introduce + myName);
	}	
}
