package _04;

public class p17 {

	public static void main(String[] args) {
		
		int k44_iVal;																			//5�� ����� �־��� ������ ���� ����
		
		for (int k44_i = 0; k44_i < 300; k44_i++) {												//0���� 299���� ���� for�� �ۼ�
			k44_iVal = 5 * k44_i;																//iVal ���� for���� ���� ���������� 5�� ���� �־��ش�.
			
			if(k44_iVal >= 0 && k44_iVal < 10) System.out.printf("�� %d\n", k44_iVal);			// ���ǹ��� �̿��� iVal�� 0 ~ 9�� ������ ���� �ڸ� ���
			
			else if(k44_iVal >= 10 && k44_iVal < 100) System.out.printf("�� %d\n", k44_iVal);	// ���ǹ��� �̿��� iVal�� 10 ~ 99�� ������ ���� �ڸ� ���
			
			else if(k44_iVal >= 100 && k44_iVal < 1000) System.out.printf("�� %d\n", k44_iVal);	// ���ǹ��� �̿��� iVal�� 100 ~ 999�� ������ ���� �ڸ� ���
			
			else System.out.printf("õ %d\n",k44_iVal);											//1000�� �̻� Ȥ�� �������� õ�̶�� �޼��� ���
		}

	}

}
