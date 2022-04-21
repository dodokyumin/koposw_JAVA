package p09_p10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p10 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\501-01\\Desktop\\day_data\\THTSKS010H00.dat");	//File Ŭ������ �ν��Ͻ� f�� ����� .dat������ �ҷ��´�.
		BufferedReader br = new BufferedReader(new FileReader(f));	//�ν��Ͻ� f������ �д� buffer�ν��Ͻ� br�� �����ߴ�.
		
		File f1 = new File("C:\\Users\\501-01\\Desktop\\day_data\\StockDailyPrice.csv");	//File Ŭ������ �ν��Ͻ� f�� ����� .dat������ �ҷ��´�.
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));	//�ν��Ͻ� f������ �д� buffer�ν��Ͻ� br�� �����ߴ�.
		
		String readtxt;
		
		int cnt= 0; int wcnt = 0;
		
		
		while((readtxt=br.readLine())!=null) {
			StringBuffer s = new StringBuffer(); //StringBuffer Ŭ������ �ν��Ͻ� s�� �����.
			String[] field = readtxt.split("%_%");
			
			if(field.length > 2&&field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				s.append(field[0].replace("^", "").trim());
				for (int j=0; j<field.length; j++) {
					s.append("."+field[j].replace("^", "").trim());
				}
				
				bw1.write(s.toString());
				bw1.newLine();
				wcnt++;
			}
			cnt++;
		}
		
		br.close();
		bw1.close();
		
		System.out.printf("Program End [%d][%d]records\n",cnt,wcnt);
	
		
	}

}
