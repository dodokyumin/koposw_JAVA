package p14_p17_p18_p20;

public class mytest4 {

		public static void main (String[] args) {
			
			k44_Elevater4 k44_elev4;	//���� ��Ű���� �ִ� Ŭ���� elevater4�� �������� elev4�� ��� ȣ��
			
			k44_elev4 = new k44_Elevater4();//�ش� ���������� �ν��Ͻ��� Ȱ�밡���ϰ� ������ش�.
			
			for(int k44_i=0; k44_i<10; k44_i++) {	//10����ŭ elev4�ν��Ͻ��� up�Լ��� ȣ��.
				k44_elev4.k44_up();
				System.out.printf("MSG elev[%s]\n", k44_elev4.k44_help);
			}
			
			for (int k44_i=0; k44_i<10; k44_i++) {	//10����ŭ elev4�ν��Ͻ��� down�Լ��� ȣ��.
				k44_elev4.k44_down();
				System.out.printf("MSG elev[%s]\n", k44_elev4.k44_help);
			}
			
			k44_elev4.k44_repair();	//elev4�ν��Ͻ��� repair�Լ��� ȣ��.
			System.out.printf("MSG elev[%s]\n", k44_elev4.k44_help);
			
		}
	
}