package p14_p17_p18_p20;

public class k44_Elevater2 {
	
	public int k44_limit_up_floor = 10;	//�ִ� ���� 10������ ����
	public int k44_limit_down_floor = 0; 	//���� �� ���� 0������ ����
	public int k44_floor = 1;	//���� ���� 1������ ����
	public String k44_help;	//�޼ҵ带 ���� String�� ���� �������� help�� ���Ѵ�.
	
	k44_Elevater2(){	//�����ڴ� �ν��Ͻ��� �������ڸ��� ����Ǵ�, �� ������ �ٷ� �������� �� �ִ� �Լ��̴�.
		k44_limit_up_floor = 10;
		k44_limit_down_floor = 1;
		k44_floor = 1;
		k44_help = "���������� �ذ� �Ϸ�";
		System.out.println(k44_help);
	}
	
	k44_Elevater2(int k44_up_floor, int k44_d_floor, int k44_in_floor){	//�Ķ���� ���� �޴� �Լ�
		k44_limit_up_floor = k44_up_floor;
		k44_limit_down_floor = k44_d_floor;
		k44_floor = k44_in_floor;
		k44_help = "���������� ���� �ذ� �Ϸ�";
	}
	
	void k44_up() {	//���������� �� ���ϱ� 1
	
		if (k44_floor == k44_limit_up_floor) {
			k44_help = "���������Դϴ�.";
		} else {
			k44_floor++;
			k44_help = String.format("%d���Դϴ�",k44_floor);
		}
	}

	void k44_down() {	//���������� �� ���� 1
		
		if (k44_floor == k44_limit_down_floor) {
			k44_help = "ó�����Դϴ�.";
		} else {
			k44_floor--;
			k44_help = String.format("%d���Դϴ�.", k44_floor);
		}
		
	}
	
	void k44_up(int k44_u) {	//���������� ���� ���� �� ������ ���ڸ� ������ �׸�ŭ �ݺ��� �� �� �ְ� �ϴ� for�� ����.
		for(int k44_i=0; k44_i<k44_u; k44_i++) {
			this.k44_up();
		}
	}
	
	void k44_down(int k44_u) {	//���������� ���� �E �� ������ ���ڸ� ������ �׸�ŭ �ݺ��� �� �� �ְ� �ϴ� for�� ����.
		for(int k44_i=0; k44_i<k44_u; k44_i++) {
			k44_down();
		}
	}
	
	void k44_msg(String k44_id) {	//String ���ڸ� �޾� �޼����� ����ϴ� �Լ� ����.
		System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d] ������[%d]\n", k44_id, k44_help, k44_limit_up_floor, k44_limit_down_floor, k44_floor);
	}
	
}