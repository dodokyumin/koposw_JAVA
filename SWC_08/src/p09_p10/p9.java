package p09_p10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class p9 {

	public static void main(String[] args) throws IOException {
		File k44_f = new File("C:\\Users\\501-01\\Desktop\\day_data\\THTSKS010H00.dat");	//File Ŭ������ �ν��Ͻ� f�� ����� .dat������ �ҷ��´�.
		BufferedReader k44_br = new BufferedReader(new FileReader(k44_f));	//�ν��Ͻ� f������ �д� buffer�ν��Ͻ� br�� �����ߴ�.
		
		String k44_readtxt;
		int k44_LineCnt = 0;	//���� ī��Ʈ�� ����� ���� LineCnt�� �����Ѵ�.
		int k44_n = -1;
		StringBuffer k44_s = new StringBuffer(); //StringBuffer Ŭ������ �ν��Ͻ� s�� �����.
		
		while(true) {
			
			char[] k44_ch = new char[1000];	//ĳ������ �迭 ���� ch�� ũ�⸦ �˳���� 1000���� �������־���.
			
			k44_n = k44_br.read(k44_ch);	//br ����(dat)�� �о���鼭 �迭ch�� ������ �ϴµ�, 
			
			if (k44_n == -1) break;	//n�� ���� -1��, null�� �� �� �ݺ����� �����Ѵ�.
			
			for(char k44_c : k44_ch) {	//ch���� ���ʴ�� ��ü�� ������ c���ٰ� �ְڴٴ� �ǹ�!!!
				if(k44_c =='\n') {	//���� ���� ������ c�� �ٹٲ��̸�
					System.out.printf("[%s]***\n",k44_s.toString());	//��Ʈ�������� �޼ҵ� toString�Ͽ� ���
					k44_s.delete(0, k44_s.length());	//�׸��� �ش� s�� 0���� ���ں��� ������(s.length)�� ����
				}else {
					k44_s.append(k44_c);	//�ƴ϶�� s�� c���̱�
				}
			}
			k44_LineCnt++;	//����ī��Ʈ++ ���־� while���� ���� �� �ְ�.
		}
		
		System.out.printf("[%s]***\n",k44_s.toString()); //���۽�Ʈ���� ��Ʈ������ Ÿ��ĳ���� ���� �Ŀ� ���
		k44_br.close();
		
	}

}
