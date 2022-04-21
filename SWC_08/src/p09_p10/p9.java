package p09_p10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class p9 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\501-01\\Desktop\\day_data\\THTSKS010H00.dat");	//File Ŭ������ �ν��Ͻ� f�� ����� .dat������ �ҷ��´�.
		BufferedReader br = new BufferedReader(new FileReader(f));	//�ν��Ͻ� f������ �д� buffer�ν��Ͻ� br�� �����ߴ�.
		
		String readtxt;
		int LineCnt = 0;	//���� ī��Ʈ�� ����� ���� LineCnt�� �����Ѵ�.
		int n = -1;
		StringBuffer s = new StringBuffer(); //StringBuffer Ŭ������ �ν��Ͻ� s�� �����.
		
		while(true) {
			
			char[] ch = new char[1000];	//ĳ������ �迭 ���� ch�� ũ�⸦ �˳���� 1000���� �������־���.
			
			n = br.read(ch);	//br ����(dat)�� �о���鼭 �迭ch�� ������ �ϴµ�, 
			
			if (n == -1) break;	//n�� ���� -1��, null�� �� �� �ݺ����� �����Ѵ�.
			
			for(char c : ch) {	//ch���� ���ʴ�� ��ü�� ������ c���ٰ� �ְڴٴ� �ǹ�!!!
				if(c =='\n') {	//���� ���� ������ c�� �ٹٲ��̸�
					System.out.printf("[%s]***\n",s.toString());	//��Ʈ�������� �޼ҵ� toString�Ͽ� ���
					s.delete(0, s.length());	//�׸��� �ش� s�� 0���� ���ں��� ������(s.length)�� ����
				}else {
					s.append(c);	//�ƴ϶�� s�� c���̱�
				}
			}
			LineCnt++;	//����ī��Ʈ++ ���־� while���� ���� �� �ְ�.
		}
		
		System.out.printf("[%s]***\n",s.toString());
		br.close();
		
	}

}
