package _03;

public class ex7 {

	public static void main(String[] args) {
		
		String[] k44_item = { "ũ���굵", "�������ڳ�", "�����", "���Ҽ���", "���簻" };						//������ ��ǰ�� String �ڷ����� k44_item Array�� �����Ѵ�. 
		int[] k44_price = { 1000, 2000, 3000, 2500, 1450 };															//������ ��ǰ����(�ܰ�)�� ������ Array 
		int[] k44_amount = { 10, 2, 1, 3, 5 }; 																		//�� ��ǰ�� ���� ���� ������ ������ Array 
		double k44_tax_rate=0.1;																					//������ �Ҽ��� ���� k44_tax_rate�� �����ϱ�
		int k44_total_sum = 0;																						//���� ���� ������ ������ ������ ���� k44_total_sum set.

		System.out.printf("=====================================================\n");
		System.out.printf("\t\t  ���� ���� ���ڵ�\t\t\n");
		System.out.printf("=====================================================\n");

		System.out.printf(" %s\t\t%s\t\t%s\t\t%s \n", "�� ��","�� ��","�� ��","�� ��");
		for (int i = 0; i < k44_item.length; i++) {																	//������ ��ǰ�� Array�� ���̸�ŭ(5) for�ݺ����� iteration�Ѵ�.
			int k44_sum = k44_price[i] * k44_amount[i];																//��ǰ ���ݰ� ������ ���ؼ� ������ ���� k44_sum ����, i���� �����ϸ鼭 Array���� �������ʷ� �����
			k44_total_sum = k44_total_sum + k44_sum;																//total_sum�� ���� total_sum�� ���� k44_sum(�հ�)�� ������ ��
			System.out.printf("%-10s\t%-7d\t%12d\t%13d\n", k44_item[i], k44_price[i], k44_amount[i], k44_sum);		//�� Array�� ����� �׸���� ������� ����, �׸��� ���� k44_sum(�հ�)���
		}
		System.out.printf("=====================================================\n");
		System.out.printf("���ұݾ� : %42d\n", k44_total_sum);
		
		int k44_total_net_price = (int) (k44_total_sum / (1 + k44_tax_rate));										//���� ������ ���ݿ� "1.(����)"�� ���� ������, �Ҽ����ڸ��� int�� ��ȯ�� �Ͽ� �����ְ��� ���ұݾ׿� ����.
		System.out.printf("�����ݾ� : %42d\n", k44_total_net_price);
		int k44_tax = k44_total_sum - k44_total_net_price; 															//������ �� ������ ���� ���ұݾ׿��� �����ݾ��� �� �������̴�. 
		System.out.printf("��    �� : %42d\n", k44_tax);

	}
}
