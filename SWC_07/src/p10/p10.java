package p10;

public class p10 {

	public static void main(String[] args) {

		System.out.printf("HanBlankForeword[%s]\n", k44_HanBlankForeword("�ѱ�abcd", 15)); //������ �޼ҵ忡 ���ڿ��� ������ �� �Ķ���ͷ� ����.
		System.out.printf("HanBlankForeword[%s]\n", k44_HanBlankForeword("�ѱ��ѱ�aa", 15));//������ �޼ҵ忡 ���ڿ��� ������ �� �Ķ���ͷ� ����.
		System.out.printf("HanBlankBackword[%s]\n", k44_HanBlankBackword("�ѱ�aa", 15));//������ �޼ҵ忡 ���ڿ��� ������ �� �Ķ���ͷ� ����.
		System.out.printf("HanBlankBackword[%s]\n", k44_HanBlankBackword("�ѱ��ѱ�aa", 15));//������ �޼ҵ忡 ���ڿ��� ������ �� �Ķ���ͷ� ����.
		System.out.printf("�ѱ���[%d]��\n", HanCount("�ѱ��ѱ�aa"));//������ �޼ҵ忡 ���ڿ� �Ķ���� �����ϱ�

	}

	private static String k44_HanBlankBackword(String k44_string, int k44_i) { //�� �޼ҵ�� ���ڿ� ���� ������ �Ķ���͸� �޴´�.

		String str = k44_string; //���� ���ڿ��� ���� �� ���ϰ��� ��� ������ ���� ����
		for (int k44_j = 0; k44_j < k44_i; k44_j++) { //�Ķ���ͷ� ���� ���� �� ��ŭ�� ������ ������.
			str += " "; //������ ���ڿ��� �ڿ� ��ĭ�� ������ �ٿ��ִ� �޼ҵ�

		}
		return str; //������ ���ڿ� ����
	}

	private static String k44_HanBlankForeword(String string, int k44_i) {//�� �޼ҵ�� ���ڿ� ���� ������ �Ķ���͸� �޴´�.

		String k44_str = string;//���� ���ڿ��� ���� �� ���ϰ��� ��� ������ ���� ����
		for (int k44_j = 0; k44_j < k44_i; k44_j++) {//�Ķ���ͷ� ���� ���� �� ��ŭ�� ������ ������.
			k44_str = " " + k44_str;//������ ���ڿ��� �տ� ��ĭ�� ������ �ٿ��ִ� �޼ҵ�

		}
		return k44_str; //������ ���ڿ� ����
	}

	private static int HanCount(String k44_string) {//�� �޼ҵ�� ���ڿ� �Ķ���͸� �޴´�.

		String k44_str = k44_string;//���� ���ڿ��� ���� �� ���ϰ��� ��� ������ ���� ����
		int k44_bitCount = 0;//���� ���ڿ��� ��Ʈ ������ ������ ������ �� ���� ���� ������ ���� ����

		for (int k44_i = 0; k44_i < k44_str.length();) {//������ ���� ���ڿ��� ���̸�ŭ ����.

			if (k44_str.substring(k44_i, k44_i + 1).getBytes().length == 2) {//�ѱ��ھ� ����µ�, ���� ����Ʈ ���̰� 2�� �ȴٸ�,(�ѱ�)
				k44_bitCount += 1; //ī��Ʈ�� 1�� �� ���Ͽ��ش�.
			}

			k44_i++;
		}

		return k44_bitCount; //���������� �� ������ ���� ī��Ʈ�� ���.
	}
}
