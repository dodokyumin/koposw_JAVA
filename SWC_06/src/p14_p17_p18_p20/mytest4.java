package p14_p17_p18_p20;

public class mytest4 {

		public static void main (String[] args) {
			
			k44_Elevater4 k44_elev4;	//같은 패키지에 있는 클래스 elevater4를 전역변수 elev4에 담아 호출
			
			k44_elev4 = new k44_Elevater4();//해당 전역변수를 인스턴스로 활용가능하게 만들어준다.
			
			for(int k44_i=0; k44_i<10; k44_i++) {	//10번만큼 elev4인스턴스의 up함수를 호출.
				k44_elev4.k44_up();
				System.out.printf("MSG elev[%s]\n", k44_elev4.k44_help);
			}
			
			for (int k44_i=0; k44_i<10; k44_i++) {	//10번만큼 elev4인스턴스의 down함수를 호출.
				k44_elev4.k44_down();
				System.out.printf("MSG elev[%s]\n", k44_elev4.k44_help);
			}
			
			k44_elev4.k44_repair();	//elev4인스턴스의 repair함수를 호출.
			System.out.printf("MSG elev[%s]\n", k44_elev4.k44_help);
			
		}
	
}