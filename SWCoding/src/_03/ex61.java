package _03;

public class ex61 {
	public static int k44_netprice(int k44_price, double k44_rate) {						//����(int)�� ����(double)�� ���ڷ� �޴� netprice�Լ�
		return (int) (k44_price / (1 + k44_rate));										//������ "1.����"�� ���� �� �������� ���� �Ҽ����� ������ ����
	}

	public static void main(String[] args) {

		int k44_price = 1234;														//���� ����
		double k44_tax_rate = 0.1;													//���� å��

		int k44_netprice = k44_netprice(k44_price, k44_tax_rate);								//���ݰ� ������ netprice�Լ��� �־� ������
		int k44_tax = k44_price - k44_netprice;												//������ ����-��������

		System.out.printf("*******************************************\n");
		System.out.printf("*\t�Һ��ڰ�, ��������, ���� ���\t*\n");
		System.out.printf("�Һ��ڰ���: %d, ��������: %d, ����: %d\n", k44_price, k44_netprice, k44_tax);
		System.out.printf("*******************************************\n");

	}

}
