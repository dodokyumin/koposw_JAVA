package _04;

public class p27 {

	public static void main(String[] args) {
		
		int K44_n,K44_m;								//������ ���� 2�� ����
					
		K44_m=20; K44_n=1;								//������ ������ ������ 20�� 1�� ���� �Է�
		
		while(true) {									//while true�� ���� ���ѷ��� ����

			for(int K44_i=0; K44_i<K44_m; K44_i++)		//20���� ������ ���, while���� �������� 1���� �پ�� ����	20 19 18
				System.out.printf(" ");
			for(int K44_i=0; K44_i<K44_n; K44_i++)		//1���� �� ���, while�� �������� 2���� �þ ���� 1 3 5 ...
				System.out.printf("*");
			System.out.println();
			
			K44_m=K44_m-1;								//�� ĭ�� 1���� ���δ�.
			K44_n=K44_n+2;								//���� 2���� �ø���
			
			if (K44_m<0) break;							//��ĭ�� 0���� �۾����� while�� Ż��
		}

	}

}
