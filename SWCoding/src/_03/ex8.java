package _03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex8 {

	public static void main(String[] args) {
		int k44_MyWon = 1000000;															//���� ������ �ִ� ��ȭ
		double k44_MoneyEx=1238.21;															//��ȭ�� �޷��� �ٲ� ���� ȯ������
		double k44_commission = 0.003;														//ȯ�� ������
		
		int k44_usd = (int) (k44_MyWon/k44_MoneyEx);										//���� ����� ���������� ����� ����ó��. ��ü �ݾ��� ȯ���� ����
		int k44_remain = (int)(k44_MyWon - k44_usd*k44_MoneyEx);							//�ܵ��� ���������� ����� ����ó���Ѵ�.
																							//��ü�ݾ׿��� �޷��ݾ�(�޷�*ȯ��)�� �M. �Ҽ����� �� �� ����.
		System.out.printf("*******************************************\n");
		System.out.printf("*\t������ ���� ���\t*\n");
		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ:�Һ��ڰ���: %d�޷�, �ܵ�: %d��\n", k44_MyWon, k44_usd, k44_remain);
		System.out.printf("*******************************************\n\n\n");

		double k44_ComPerOne = k44_MoneyEx * k44_commission;								//��ȭto�޷� ȯ�� * ȯ�� ������ = 1�޷��� ������
		
		double k44_totalcom = k44_usd * k44_ComPerOne;										//��ȭ:�Һ��ڰ���*1�޷��� ������ = �� ������
		
		System.out.printf("*******************************************\n");
		System.out.printf("*\t������ ���\t*\n");
		System.out.printf("�� ������: %f�� => ��ȭ:%d�޷�, �޷��� ������: %f��\n", k44_totalcom, k44_usd, k44_ComPerOne);
		System.out.printf("*******************************************\n\n\n");
	
		int k44_i_totalcom = 0;																//������ ���� ȯ���� �� ������ ����

		if (k44_totalcom != (double)((int)k44_totalcom))									//�Ѽ����ᰡ �Ҽ����� ������ �Ʒ��� ���๮ ����
			k44_i_totalcom=(int)k44_totalcom+1;												//�Ҽ����� ������ �ø��ؼ� ����. ������ ���� ���� ���� ����.
		else
			k44_i_totalcom=(int)k44_totalcom;												//�Ѽ����ῡ �Ҽ����� ������ �״�� ���������� .
	
		System.out.printf("*******************************************\n");
		System.out.printf("*\t������ ���� ȯ��\t*\n");
		System.out.printf("�� ������ : %d�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n",k44_i_totalcom, k44_usd, k44_ComPerOne);
		
		k44_remain = (int) (k44_MyWon - k44_usd *k44_MoneyEx - k44_i_totalcom);
		System.out.printf("�� ������ : %d�� => ��ȭ: %d�޷�, ������û��: %d�� �ܵ�:�� %d��\n", k44_MyWon, k44_usd,k44_i_totalcom, k44_remain);
		System.out.printf("*******************************************\n\n\n");
		
		
		k44_usd = (int) (k44_MyWon/(k44_MoneyEx + k44_ComPerOne));							//��Ȯ�� �Һ��� ������ �� �ѱ����� (��ȭto�޷� ȯ��+1�޷��� ������)�� ���� ��
		k44_totalcom = k44_usd* k44_ComPerOne;												//��ȭ:�Һ��ڰ���*1�޷��� ������ = �� ������
		
		if (k44_totalcom != (double)((int)k44_totalcom))									//�Ѽ����ᰡ �Ҽ����� ������ �Ʒ��� ���๮ ����
			k44_i_totalcom = (int)k44_totalcom+1;											//�Ҽ����� ������ �ø��ؼ� �� ���� �� ����. ������ ���� ���� ���� ����.
		else
			k44_i_totalcom = (int)k44_totalcom;												//�Ѽ����ῡ �Ҽ����� ������ �״�� ���������� .
		

		System.out.printf("*******************************************\n");
		System.out.printf("*\t (��Ȯ��)������ ���� ȯ��\t*\n");
		System.out.printf("�� ������ : %d�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n",k44_i_totalcom, k44_usd, k44_ComPerOne);
		
		k44_remain = (int) (k44_MyWon - k44_usd *k44_MoneyEx - k44_i_totalcom);
		System.out.printf("�� ������ : %d�� => ��ȭ: %d�޷�, ������û��: %d�� �ܵ�:�� %d��\n", k44_MyWon, k44_usd,k44_i_totalcom, k44_remain);
		System.out.printf("*******************************************\n\n\n");
		
		
		
		System.out.printf("*******************************************\n");
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");						//DecimalFormat Ŭ������ import�Ͽ� �� ���� 1000���� �޸���� 
		System.out.printf("*\t �޸����, ��¥ ����\t*\n");
		System.out.printf("�� ������ : %s�� => ��ȭ: %s�޷�, �޷��� ������: %f��\n",
				df.format(k44_i_totalcom),													//DecimalFormat �� df.format() ��� �� �����Ͽ� ����ϱ�
				df.format(k44_usd),
				k44_ComPerOne);
		
		k44_remain = (int) (k44_MyWon - k44_usd *k44_MoneyEx - k44_i_totalcom);
		System.out.printf("�� ������ : %s�� => ��ȭ: %s�޷�, ������û��: %s�� �ܵ�:�� %s��\n", 
				df.format(k44_MyWon),
				df.format(k44_usd),
				df.format(k44_i_totalcom),
				df.format(k44_remain));

		Calendar calt = Calendar.getInstance();												//CalendarŬ������ �ν��Ͻ�ȭ�Ͽ� (calt)������ �ֱ�
		SimpleDateFormat sdt=new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");					//������ �� �� �� �ð� �� �ʷ� ����
		System.out.printf("��������ð�: %s\n", sdt.format(calt.getTime()));
		System.out.printf("*******************************************\n");

	}

}
