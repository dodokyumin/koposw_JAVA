package p24;

public class p24 {

	public static void main(String[] args) {

		int[] k44_iArray = { 1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };	//iArray ����� ���ÿ� ������ �־��ش�.

		for (int k44_i = 0; k44_i < k44_iArray.length; k44_i++)	//iArray�� �ڱ� ũ�⸸ŭ ���� �ݺ����� ���� �ϳ��� ����ϱ�
			System.out.printf("iArray[%d]=%d\n", k44_i, k44_iArray[k44_i]);

		int k44_iMax = k44_iArray[0];	//ó�� �� ������ 0��° �ε����� ������ �����Ѵ�.
		int k44_iMaxPt = 0;	//������ �� ���� ������ ū ���� ����� �� ���� ���� int�ڷ��� iMaxPt����.
		for (int k44_i = 0; k44_i < k44_iArray.length; k44_i++) {	//iArray�� ���̸�ŭ �ݺ�.
			if (k44_iMax < k44_iArray[k44_i]) {	//���� �� �ڸ��� �ִ� ������ ������ ���� Max������ ũ��
				k44_iMax = k44_iArray[k44_i];	//���� Max���� �� i������ �� ������ ������.
				k44_iMaxPt = k44_i; //�� i������ �� ����(�ִ밪)�� ������
			}
		}
		System.out.printf("MAX : iArray[%d] = %d\n", k44_iMaxPt, k44_iMax);
	}

}
