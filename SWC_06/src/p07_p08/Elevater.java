package p07_p08;

public class Elevater {
		//ppt 7p
		int k44_limit_up_floor = 10; //�ֻ����� �����ϱ�
		int k44_limit_down_floor = 0;	//�������� �����ϱ�
		int k44_floor = 1;	//������ �����ϱ�
		String k44_help;
		
		void up() {	//���������Ͱ� �ö�
		
			if (k44_floor == k44_limit_up_floor) {	//���� ���� ���� �ְ����� �ٴٸ��� 
				k44_help = "���������Դϴ�.";
			} else {	//���� �ٴٸ��� �ʾҴٸ�
				k44_floor++;
				k44_help = String.format("%d���Դϴ�",k44_floor);
			}
		}

		void down() {	//���������Ͱ� ������
			
			if (k44_floor == k44_limit_down_floor) {
				k44_help = "ó�����Դϴ�.";
			} else {
				k44_floor--;	//�������� �ƴ� �� �� ���� �ö�
				k44_help = String.format("%d���Դϴ�.", k44_floor);
			}
			
		}
}