package _03;

public class ex6 {	
	
	private static int k44_taxcal(int k44_val, int k44_rate)  {					//������ �޼ҵ� k44_taxcal�� ������ְ� ���ڷ� int�� ���� k44_val�� k44_rate�� �޾��ְ� �����Ѵ�.
		int k44_ret;															//���� k44_ret�� �����Ͽ���. 
		
		if(((double)k44_val*(double)k44_rate/100) == k44_val*k44_rate/100)		//���� ����� ���� �� ���� ��ݿ� �Ҽ����� ���ٸ� �Ʒ� ���๮�� ����
			k44_ret = k44_val * k44_rate/100;									//k44_ret�� k44_val(���)�� k44_rate(��)�� ���� 100���� ���� ���� �����Ѵ�.
		else																	//���� ����� ���� �� ���� ��ݿ� �Ҽ����� �ִٸ� �Ʒ� ���๮�� ����
			k44_ret = k44_val * k44_rate/100 + 1;								//�Ҽ��� �ڸ��� ���� �������� �����Ƿ� +1 �ø��� �Ͽ� ���� �� �޴´�.

		return k44_ret;															//���๮�� ���ؼ� ������ k44_ret�� ���� �����Ѵ�.
	}


	public static void main(String[] args) {
		
		int k44_val = 271; 														//���� ���� ��
		int k44_rate = 3; 														//���� 3�ۼ�Ʈ

		int k44_tax = k44_taxcal(k44_val,k44_rate);								//���� ���� ���� ������ k44_taxcal�� �Լ� ���ڷ� �־� �Լ��� ������.
		
		System.out.printf("************************************\n");
		System.out.printf("*	�ܼ� ���� ���	*\n");
		System.out.printf("���� ���ݰ��: %f\n", k44_val*k44_rate/100.0);		//�ϳ��� double���� ������ �ϸ� �Ǽ��� ǥ��
		
		System.out.printf("�������� : %d ����:%d �����԰���: %d\n", k44_val, k44_tax, k44_val + k44_tax);

		System.out.printf("************************************\n");
	}	
}
