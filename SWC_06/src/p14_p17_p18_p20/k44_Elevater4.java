package p14_p17_p18_p20;

public class k44_Elevater4 extends k44_Elevater2 {	//�� Ŭ������ Elevater2Ŭ������ �ڽ� Ŭ�����̴�.

	void k44_repair ( ) {
		k44_help = String.format("�������Դϴ�.");	//���� ������ help�� �̾�޾� ������ �� �ִ�.
	}
	
	void k44_up() {	//������ up�Լ��� �ڽ�Ŭ������ �޾Ƽ� ���������� �Է��ϸ� �� �Լ��� ����ȴ�. �������̵�!
		
		if (k44_floor >= k44_limit_up_floor) {
			k44_help = "���������Դϴ�.";
		} else {
			k44_floor += 2;
			k44_help = String.format("%d���Դϴ�",k44_floor);
		}
		this.k44_down();
	}
	
	void k44_down() {	//������ up�Լ��� �ڽ�Ŭ������ �޾Ƽ� ���������� �Է��ϸ� �� �Լ��� ����ȴ�. �������̵�!
		super.k44_down();
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.k44_help);
	}
	
}