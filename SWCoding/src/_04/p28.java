package _04;

import java.text.DecimalFormat;

public class p28 {

	public static void main(String[] args) {
		
		String K44_item = "���";																//���ڿ� ���� ����� ���ÿ� ��� �Է�
		int K44_unit_price = 5000;																//������ ���� ����� ���ÿ� 5000�Է�, �������� ����
		int K44_num = 500;																		//������ ���� ����, 500�Է�, ������ ����
		
		DecimalFormat K44_df = new DecimalFormat ( "###,###,###,###,### " );					//DeciamlFormat �����Լ��� df�� ������ ����� ����, package �Ʒ� import��

		System.out.printf("=========================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","ǰ��","�ܰ�","����","�հ�");				//ǰ�� �ܰ� ���� �հ� �޼��� ���
		System.out.printf("=========================================================\n");
		
		System.out.printf("%20.20s%10.10s%10.10s%11.10s\n",										//��ǰ�̸��� ����ϰ� DecimalFormat�� �����ص� ���·� ���� ����, ���� ����, 1���� ���� * ������ �Ѱ��� ���
				K44_item, K44_df.format(K44_unit_price),K44_df.format(K44_num),K44_df.format(K44_unit_price*K44_num));
		System.out.printf("=========================================================\n");

	}

}
