package p14_p17_p18_p20;

public class mytest {

	static k44_Elevater2 k44_elev1;	//���� ��Ű���� �ִ� Ŭ���� elevater2�� �������� elev1�� ��� ȣ��
	static k44_Elevater2 k44_elev2;	//���� ��Ű���� �ִ� Ŭ���� elevater2�� �������� elev2�� ��� ȣ��
	static k44_Elevater2 k44_elev3;	//���� ��Ű���� �ִ� Ŭ���� elevater2�� �������� elev3�� ��� ȣ��
	
	public static void main(String[] args) {

		k44_elev1 = new k44_Elevater2();	//�ش� ���������� �ν��Ͻ��� Ȱ�밡���ϰ� ������ش�.
		k44_elev2 = new k44_Elevater2();
		k44_elev3 = new k44_Elevater2();
	
		for(int k44_i=0; k44_i < 20; k44_i++) {

			k44_elev1.k44_up();	k44_elev1.k44_msg("1������ ���� ������");
		//	elev2.up();	elev2.msg("2������ ���� ������");
		//	elev3.up();	elev3.msg("3������ ���� ������");	
			
		}

		for(int k44_i=0; k44_i < 20; k44_i++) {

			k44_elev1.k44_up(2);	k44_elev1.k44_msg("1������ 2���� ������");
		//	elev2.up(2);	elev2.msg("2������ 2���� ������");
		//	elev3.up(2);	elev3.msg("3������ 2���� ������");	
			
		}
		
		for(int k44_i=0; k44_i < 20; k44_i++) {

			k44_elev1.k44_down(3);	k44_elev1.k44_msg("1������ 3���� ������");
		//	elev2.down(3);	elev2.msg("2������ 3���� ������");
		//	elev3.down(3);	elev3.msg("3������ 3���� ������");	
			
		}
				

	}

}