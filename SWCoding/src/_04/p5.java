package _04;

public class p5 {

	public static void main(String[] args) {
		String jumin = "12345-1234567";							//�ֹι�ȣ ���� String ������ �����Ѵ�.
		
		switch(jumin.charAt(6)) {								//()���� �� �ֹι�ȣ String�� 6��°(0���� ����) ���� ���ؼ� ������ case��� �ش� ���๮���� �������ִ� switch��
		case '1' :												//jumin.charAt(6)�� ���� '1'�� ��� �� �ֹι�ȣ ���ڸ� ù��°�� 1�� �� ���� ������ ����
			System.out.printf("20������ �¾ ���� ���\n");	//�ֹι�ȣ ���ڸ��� 1�̸� 20���� ���� �¾ ���ڴ�.
			break;												//switch case ���� Ư¡����, ���� break�� ������ ���������� �ʰ� �̾ ���� ���̽��� ����ȴ�.
		case '2' :												//jumin.charAt(6)�� ���� '2'�� ��� �� �ֹι�ȣ ���ڸ� ù��°�� 2�� �� ���� ������ ����
			System.out.printf("20������ �¾ ���� ���\n");	
			break;
		case '3' :												//jumin.charAt(6)�� ���� '3'�� ��� �� �ֹι�ȣ ���ڸ� ù��°�� 3�� �� ���� ������ ����
			System.out.printf("20������ �¾ ���� ���\n");	
			break;
		case '4' :												//jumin.charAt(6)�� ���� '4'�� ��� �� �ֹι�ȣ ���ڸ� ù��°�� 4�� �� ���� ������ ����
			System.out.printf("20������ �¾ ���� ���\n");	
			break;
		default :												//switch case�� default�� if���� else�� ���� ���� ó����
			System.out.printf("���\n");	
			break;
		}

	}

}
