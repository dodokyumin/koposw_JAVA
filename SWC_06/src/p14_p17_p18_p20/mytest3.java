package p14_p17_p18_p20;

public class mytest3 {

		public static void main (String[] args) {
			
			k44_Elevater3 k44_elev3;	//���� ��Ű���� �ִ� Ŭ���� elevater3�� �������� elev3�� ��� ȣ��
			
			k44_elev3 = new k44_Elevater3();	//�ش� ���������� �ν��Ͻ��� Ȱ�밡���ϰ� ������ش�.
			
			for(int k44_i=0; k44_i<10; k44_i++) {	//10����ŭ elev3�ν��Ͻ��� up�Լ��� ȣ��.
				k44_elev3.k44_up();
				System.out.printf("MSG elev[%s]\n", k44_elev3.k44_help);
			}
			
			for (int i=0; i<10; i++) {	//10����ŭ elev3�ν��Ͻ��� up�Լ��� ȣ��.
				k44_elev3.k44_up();
				System.out.printf("MSG elev[%s]\n", k44_elev3.k44_help);
			}
			
			k44_elev3.k44_repair();	//elev�ν��Ͻ��� repair�Լ��� ȣ��.
			System.out.printf("MSG elev[%s]\n", k44_elev3.k44_help);
			
		}
	
}