package p05;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class p5 {

	public static void main(String[] args) {

		try {	//try ������ ���� �Ʒ� �ڵ���� �����ϰ�, catch�� ���� �ش� �̺�Ʈ�� �߻��ϸ� catch�ڵ带 �����Ѵ�.
			File k44_f = new File("C:\\Users\\501-01\\Desktop\\Mytest.txt");	//import�� FileŬ������ �ν��Ͻ�f�� ����� �ش� ��ο� �ִ� txt������ �ҷ��´�.
			FileWriter k44_fw = new FileWriter(k44_f);	//import�� FileWriterŬ������ �ν��Ͻ� fw�� ����� ������ �ҷ��� ���Ͽ� �����尡 ������� ������ش�.

			k44_fw.write("�ȳ� ����\n");	//FileWriterŬ������ write�޼ҵ带 ���� ��ȣ ���� string�� �ҷ��� fw�� �Է��Ѵ�.

			k44_fw.write("hello ���\n");	//FileWriterŬ������ write�޼ҵ带 ���� ��ȣ ���� string�� �ҷ��� fw�� �Է��Ѵ�.

			k44_fw.close();	//FileWriterŬ������ close�޼ҵ带 ���� �����带 �������ش�.

			FileReader k44_fr = new FileReader(k44_f);	//import�� FileReaderŬ������ �ν��Ͻ� fr�� ����� ������ �ҷ��� ���Ͽ� �б��尡 ������� ������ش�.

			int k44_n = -1;	
			char[] k44_ch;	

			while (true) {
				k44_ch = new char[100];	//ĳ������ �迭 ���� ch�� ũ�⸦ �˳���� 100���� �������־���.
				k44_n = k44_fr.read(k44_ch);	//fr����(txt)�� �о���鼭 �迭ch�� ������ �ϴµ�, 
				//read �޼ҵ��� ����Ÿ���� int�� �̹Ƿ� �о�� ĳ���Ͱ� ������ 1, ������ -1�� ��ȯ�Ѵ�.

				if (k44_n == -1)	//n�� ���� -1��, null�� �� �� �ݺ����� �����Ѵ�.
					break;

				for (int k44_i = 0; k44_i < k44_n; k44_i++) {	
					System.out.printf("%c", k44_ch[k44_i]);	//�迭�� ������ ĳ���� �ϳ��ϳ��� �ҷ��� ����Ѵ�.

				}

				k44_fr.close();	//FileReaderŬ������ close�޼ҵ带 ���� �б��带 �������ش�.

				System.out.printf("\n FILE READ END ");
			}
		} catch (Exception k44_e) {	//����ó�������� ���� Exception ��, ��� ���ܿ����߻����� ����e�� ���, �� �̺�Ʈ�� �߻��ϸ� e�� ��� ������
			System.out.printf("�� ����[%s]\n", k44_e);	//ȭ�鿡 ���,printf �Ѵ�.
		}
	}
}
