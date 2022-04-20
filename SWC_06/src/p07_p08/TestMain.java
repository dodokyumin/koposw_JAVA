package p07_p08;

public class TestMain {

	private static int k44_inVal;
	
	public static void up() {
		k44_inVal++;
		System.out.printf("난 그냥 메소드[%d]\n", k44_inVal);
	}
	
	public static void main(String[] args) {
		
		k44_inVal = 0;
		
		Elevater k44_elev;							//클래스를 받아 객체를 만듦 
		
		k44_elev = new Elevater();					//인스턴스를 생성하여 객체에 연결 
		//Elevater elev = new Elevater();
		
		up(); //난 그냥 현재 소스내 메소드
		for(int k44_i=0; k44_i < 10; k44_i++) {
			k44_elev.up();							//난 엘리베이터 클래를 찍어낸 elev객체
			
			System.out.printf("MSG[%s]\n", k44_elev.k44_help);
			
		}
		
		for(int k44_i=0; k44_i < 10; k44_i++) {
			k44_elev.down();			//난 엘리베이터 클래를 찍어낸 elev객체
			
			System.out.printf("MSG[%s]\n", k44_elev.k44_help);
			
		}
		
		
		

	}

}