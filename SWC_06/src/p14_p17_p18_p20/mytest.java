package p14_p17_p18_p20;

public class mytest {

	static k44_Elevater2 k44_elev1;	//같은 패키지에 있는 클래스 elevater2를 전역변수 elev1에 담아 호출
	static k44_Elevater2 k44_elev2;	//같은 패키지에 있는 클래스 elevater2를 전역변수 elev2에 담아 호출
	static k44_Elevater2 k44_elev3;	//같은 패키지에 있는 클래스 elevater2를 전역변수 elev3에 담아 호출
	
	public static void main(String[] args) {

		k44_elev1 = new k44_Elevater2();	//해당 전역변수를 인스턴스로 활용가능하게 만들어준다.
		k44_elev2 = new k44_Elevater2();
		k44_elev3 = new k44_Elevater2();
	
		for(int k44_i=0; k44_i < 20; k44_i++) {

			k44_elev1.k44_up();	k44_elev1.k44_msg("1번엘레 한층 오르기");
		//	elev2.up();	elev2.msg("2번엘레 한층 오르기");
		//	elev3.up();	elev3.msg("3번엘레 한층 오르기");	
			
		}

		for(int k44_i=0; k44_i < 20; k44_i++) {

			k44_elev1.k44_up(2);	k44_elev1.k44_msg("1번엘레 2층씩 오르기");
		//	elev2.up(2);	elev2.msg("2번엘레 2층씩 오르기");
		//	elev3.up(2);	elev3.msg("3번엘레 2층씩 오르기");	
			
		}
		
		for(int k44_i=0; k44_i < 20; k44_i++) {

			k44_elev1.k44_down(3);	k44_elev1.k44_msg("1번엘레 3층씩 내리기");
		//	elev2.down(3);	elev2.msg("2번엘레 3층씩 내리기");
		//	elev3.down(3);	elev3.msg("3번엘레 3층씩 내리기");	
			
		}
				

	}

}