package p14_p17_p18_p20;

public class mytest3 {

		public static void main (String[] args) {
			
			k44_Elevater3 k44_elev3;	//같은 패키지에 있는 클래스 elevater3를 전역변수 elev3에 담아 호출
			
			k44_elev3 = new k44_Elevater3();	//해당 전역변수를 인스턴스로 활용가능하게 만들어준다.
			
			for(int k44_i=0; k44_i<10; k44_i++) {	//10번만큼 elev3인스턴스의 up함수를 호출.
				k44_elev3.k44_up();
				System.out.printf("MSG elev[%s]\n", k44_elev3.k44_help);
			}
			
			for (int i=0; i<10; i++) {	//10번만큼 elev3인스턴스의 up함수를 호출.
				k44_elev3.k44_up();
				System.out.printf("MSG elev[%s]\n", k44_elev3.k44_help);
			}
			
			k44_elev3.k44_repair();	//elev인스턴스의 repair함수를 호출.
			System.out.printf("MSG elev[%s]\n", k44_elev3.k44_help);
			
		}
	
}