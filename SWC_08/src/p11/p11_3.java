package p11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class p11_3 {

	public static void main(String[] args) throws IOException {
		String k44_startTime = null; //��������� ����Ʈ�� ���۽ð��� ����ð� ���� ����.
		String k44_endTime = null;
		Date k44_date = new Date();
		// ���˺��� ( ����� �ú���)
		SimpleDateFormat k44_sdformat = new SimpleDateFormat("HH�� mm�� ss��"); 
		//  Java �ð� ���ϱ�
		Calendar k44_cal = Calendar.getInstance();
		k44_cal.setTime(k44_date);
		//���۽ð� ���
		k44_startTime = k44_sdformat.format(k44_cal.getTime());  
		
		//���α׷� ���۽ð� ī��Ʈ
		long k44_start = System.currentTimeMillis();
		
		int k44_rCnt = 0; //BufferedReader�� ������ ���� ������ ī��Ʈ��++ �ϰ�, ++�� ī��Ʈ�� ������ ������ �����Ѵ�.
		int k44_wCnt = 0; //BufferedWriter�� ������ �� ������ ī��Ʈ��++ �ϰ�, ++�� ī��Ʈ�� ������ ������ �����Ѵ�.
		
		File k44_f = new File("C:\\Users\\501-01\\Desktop\\day_data\\THTSKS010H00.dat"); // File Ŭ������ �ν��Ͻ� f�� ����� .dat������ �ҷ��´�.
		BufferedReader k44_br = new BufferedReader(new FileReader(k44_f)); // �ν��Ͻ� f������ �д� buffer�ν��Ͻ� br�� �����ߴ�.

		String k44_readtxt;	//�о�� �����͸� ������ ���ڿ� ���� ������ �Ͽ���.
		
		double  k44_k44_Min = 0, k44_Max = 0;	
		String k44_MinDay = "";
		String k44_MaxDay = "";
		while ((k44_readtxt = k44_br.readLine()) != null) {	//�켱������ �ش� ������ ���� ������ readtxt�������ٰ� ������ �Ѵ�! �׸��� ���������� ���� null�� ������ �ݺ����� �����ٴ� ��.
			k44_rCnt ++;	//�ѹ� ���� ������ ī��Ʈ 1�߰�
			StringBuffer k44_s = new StringBuffer(); // StringBuffer Ŭ������ �ν��Ͻ� s�� �����.
			String[] k44_field = k44_readtxt.split("%_%");	//����� ������ ������(�������� ����) ���̻����� %_%�� �������� ����� �ʵ� �迭�� ����
				
			if (k44_field.length > 1 && k44_field[2].replace("^", "").trim().equals("A005930")&& k44_field[1].replace("^", "").trim().contains("2015")) {	//�׸� ������ 2���� �����鼭 ���ÿ� �ش� ����Ʈ�� ������ ���� �ش� ���ڿ��� ���� ��
				k44_wCnt ++; //���� ī��Ʈ 1�߰�
				

				k44_s.append(k44_field[3].replace("^", "").trim());
				int k44_stockClosingPrice = Integer.valueOf(k44_s.toString());
				
				k44_k44_Min = ( k44_k44_Min == 0)? k44_stockClosingPrice : k44_k44_Min;	//ó���� ������ �ڱ��ڽ��� �ǹǷ�, ������ true�� �� ���ۿ� ���� ���׿����ڸ� ����� �ʱⰪ�� 1��° �ʵ尪���� ����.
				k44_Max = ( k44_k44_Min == 0)? k44_stockClosingPrice : k44_Max;
				
				if ( k44_k44_Min > k44_stockClosingPrice) {	//�ڱ� ���� �ڱ⺸�� ���� ������ ������ �׶������� ���� �������ش�.
					k44_k44_Min = k44_stockClosingPrice;
					k44_MinDay = (k44_field[1].replace("^", "").trim()).toString();
				}
				
				if (k44_Max < k44_stockClosingPrice) {	//�ڱ� ���� �ڱ⺸�� ū ������ ������ �׶������� ���� �������ش�.
					k44_Max = k44_stockClosingPrice;
					k44_MaxDay = (k44_field[1].replace("^", "").trim()).toString();
				}
			}
		}
		k44_br.close();	//���� ���� ����

		System.out.printf("2015�� ���� �ִ밪 ���� : %,d ��\n" , (int)k44_Max);
		System.out.println("2015�� ���� �ִ밪 ��¥ : " + k44_MaxDay);
		System.out.printf("2015�� ���� �ּҰ� ���� : %,d ��\n" , (int)k44_k44_Min);
		System.out.println("2015�� ���� �ּҰ� ��¥ : " + k44_MinDay);
		
		long k44_end = System.currentTimeMillis(); //���α׷��� ������ ���� ���
		int k44_takeSec = (int) (( k44_end - k44_start )/1000.0);	//�����½��� -���۽��� = �� �ɸ��ð�
		k44_cal.add(Calendar.SECOND, k44_takeSec); //�� �ɸ� �ð���ŭ ������ ����
		k44_endTime = k44_sdformat.format(k44_cal.getTime());	//���α׷��� ������ ���� �ð��� ������
		
		System.out.println();
		System.out.println("���� �ð� : " + k44_startTime); 
		System.out.println( "�Ϸ� �ð� : " + k44_endTime);
		System.out.println( "�ɸ� �ð� : " + ( k44_end - k44_start )/1000 +"��"); //�и��ʸ� �� ������ �ٲ���
		System.out.println("���� ���� : " + k44_rCnt);
		System.out.println("��� ���� : " + k44_wCnt);
	}
}
