package p04;

public class p05 {

	public static void main(String[] args) {

		int k44_count = 0;	//�������� ī��Ʈ���� ������ �������ش�.

		for (int k44_i = 1; k44_i < 10; k44_i++) {	//�������� ���ڸ� ����. ������ 3�ܾ� ����� ���̱� ������ ������ �������� +3�� ���ش�.
			if (k44_count == 3)	//���η� �� 3����(3*3)���� ����� �� �� �ֵ��� count�� 3�� �Ǹ� ����� �����ϰ� �������ش�.
				break;
			System.out.printf("***********\t***********\t***********\n");	//�ٱ߱�
			System.out.printf(String.format("������ %d��\t", k44_i) + (String.format("������ %d��\t", k44_i + 3))
					+ (String.format("������ %d��\n", k44_i + 6)));	//���η� ���� 1,4,7�̱� ������ ���˿��� %d�� �� ���� i,i+3,i+6 �� ����.
			System.out.printf("***********\t***********\t***********\n");

			for (int k44_j = 1; k44_j < 10; k44_j++) {

				System.out.printf("%d * %d = %d\t%d * %d = %d\t%d * %d = %d\n", k44_i, k44_j, k44_i * k44_j, k44_i + 3, k44_j, (k44_i + 3) * k44_j,
						k44_i + 6, k44_j, (k44_i + 6) * k44_j); //���α��� �������� ���ڸ��� +3 +6 �ǹǷ� ���ڸ� �� �ڸ��� i+3, i+6���� �������ش�.

			}
			k44_count++;	//�������� ���η� �ѹ� ��� �Ϸ��ϸ� count�� 1�� �����ְ� ����� ���������� ������ �� �ְԲ� �������� ������ֱ�.

		}

	}

}