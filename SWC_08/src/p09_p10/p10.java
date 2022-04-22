package p09_p10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class p10 {

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
		System.out.println("���� �ð� : " + k44_startTime); 
		
		//���α׷� ���۽ð� ī��Ʈ
		long k44_start = System.currentTimeMillis();
		int k44_rCnt = 0; //BufferedReader�� ������ ���� ������ ī��Ʈ��++ �ϰ�, ++�� ī��Ʈ�� ������ ������ �����Ѵ�.
		int k44_wCnt = 0; //BufferedWriter�� ������ �� ������ ī��Ʈ��++ �ϰ�, ++�� ī��Ʈ�� ������ ������ �����Ѵ�.
		
		File k44_f = new File("C:\\Users\\501-01\\Desktop\\day_data\\THTSKS010H00.dat");	//File Ŭ������ �ν��Ͻ� f�� ����� .dat������ �ҷ��´�.
		BufferedReader k44_br = new BufferedReader(new FileReader(k44_f));	//�ν��Ͻ� f������ �д� buffer�ν��Ͻ� br�� �����ߴ�.
		File k44_f1 = new File("C:\\Users\\501-01\\Desktop\\day_data\\StockDailyPrice.csv");	//File Ŭ������ �ν��Ͻ� f�� ����� .dat������ �ҷ��´�.
		BufferedWriter k44_bw1 = new BufferedWriter(new FileWriter(k44_f1));	//�ν��Ͻ� f������ �д� buffer�ν��Ͻ� br�� �����ߴ�.
		
		String k44_readtxt;	//�����͸� �о�ö� �ش� ������ ��Ʈ���� ����� ���� ����
		
		int k44_cnt= 0; int k44_wcnt = 0;	//�б� ī��Ʈ�� ���� ī��Ʈ�� ����� int�� ���� ����
		
		
		while((k44_readtxt=k44_br.readLine())!=null) {
			k44_rCnt ++;
			StringBuffer k44_s = new StringBuffer(); //StringBuffer Ŭ������ �ν��Ͻ� s�� �����.
			String[] k44_field = k44_readtxt.split("%_%"); //ù��° �׸� �� ����Ʈ�� ���� �����Ͽ� �ʵ� �迭�� �����ϱ�.
			
			if(k44_field.length > 2&&k44_field[2].replace("^", "").trim().substring(0, 1).equals("A")) {//�׸� ������ 2���� �����鼭 ���ÿ� �ش� ����Ʈ�� ������ ���� �ش� ���ڿ��� ���� ��
				k44_wCnt ++;
				k44_s.append(k44_field[0].replace("^", "").trim()); //ù��° ĭ�� 0�� �׸��� ����
				for (int j=0; j<k44_field.length; j++) {
					k44_s.append("."+k44_field[j].replace("^", "").trim());
				}//�� ��Ʈ�����ۿ� ������ �����͸� append���ָ鼭 ����
				
				k44_bw1.write(k44_s.toString()); //���۽�Ʈ���� ��Ʈ������ ��ȯ�� ���Ͽ� ����
				k44_bw1.newLine(); //�ٹٲ�
				k44_wcnt++;
			}
			k44_cnt++;
		}
		
		k44_br.close();//���� ���� ����
		k44_bw1.close();//���� ������ ����
		
		long k44_end = System.currentTimeMillis(); //���α׷��� ������ ���� ���
		int k44_takeSec = (int) (( k44_end - k44_start )/1000.0);	//�����½��� -���۽��� = �� �ɸ��ð�
		k44_cal.add(Calendar.SECOND, k44_takeSec); //�� �ɸ� �ð���ŭ ������ ����
		k44_endTime = k44_sdformat.format(k44_cal.getTime());	//���α׷��� ������ ���� �ð��� ������
		System.out.println( "�Ϸ� �ð� : " + k44_endTime);
		System.out.println( "�ɸ� �ð� : " + ( k44_end - k44_start )/1000 +"��"); //�и��ʸ� �� ������ �ٲ���
		System.out.println("���� ���� : " + k44_rCnt);
		System.out.println("��� ���� : " + k44_wCnt);
		
		
	}

}
