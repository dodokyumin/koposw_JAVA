package p24;

public class p24 {

	public static void main(String[] args) {

		int[] iArray = { 1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };	//iArray ����� ���ÿ� ������ �־��ش�.

		for (int i = 0; i < iArray.length; i++)	//iArray�� �ڱ� ũ�⸸ŭ ���� �ݺ����� ���� �ϳ��� ����ϱ�
			System.out.printf("iArray[%d]=%d\n", i, iArray[i]);

		int iMax = iArray[0];	//ó�� �� ������ 0��° �ε����� ������ �����Ѵ�.
		int iMaxPt = 0;	//������ �� ���� ������ ū ���� ����� �� ���� ���� int�ڷ��� iMaxPt����.
		for (int i = 0; i < iArray.length; i++) {	//iArray�� ���̸�ŭ �ݺ�.
			if (iMax < iArray[i]) {	//���� �� �ڸ��� �ִ� ������ ������ ���� Max������ ũ��
				iMax = iArray[i];	//���� Max���� �� i������ �� ������ ������.
				iMaxPt = i; //�� i������ �� ����(�ִ밪)�� ������
			}
		}

		System.out.printf("MAX : iArray[%d] = %d\n", iMaxPt, iMax);
	}

}
