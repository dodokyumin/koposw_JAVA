package p07_p08;

public class TestMain {

	private static int k44_inVal;
	
	public static void up() {
		k44_inVal++;
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", k44_inVal);
	}
	
	public static void main(String[] args) {
		
		k44_inVal = 0;
		
		Elevater k44_elev;							//Ŭ������ �޾� ��ü�� ���� 
		
		k44_elev = new Elevater();					//�ν��Ͻ��� �����Ͽ� ��ü�� ���� 
		//Elevater elev = new Elevater();
		
		up(); //�� �׳� ���� �ҽ��� �޼ҵ�
		for(int k44_i=0; k44_i < 10; k44_i++) {
			k44_elev.up();							//�� ���������� Ŭ���� �� elev��ü
			
			System.out.printf("MSG[%s]\n", k44_elev.k44_help);
			
		}
		
		for(int k44_i=0; k44_i < 10; k44_i++) {
			k44_elev.down();			//�� ���������� Ŭ���� �� elev��ü
			
			System.out.printf("MSG[%s]\n", k44_elev.k44_help);
			
		}
		
		
		

	}

}