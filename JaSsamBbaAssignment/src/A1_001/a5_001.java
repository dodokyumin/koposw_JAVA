package A1_001;

public class a5_001 {

	public static void main(String[] args) {
		int year = 2022;
		int myBDayYear = 1996;
		String introduce = "Hi, my name is ";
		String myName = "kyumin";
		
		System.out.println(introduce + myName);
		System.out.println("I'm " + (year-myBDayYear+1)+"years old.");
		//여기서 year-myBDayYear+1에 괄호를 쳐주어야 한다!
		
		myName = "Anthony";
		System.out.println(introduce + myName);
	}	
}
