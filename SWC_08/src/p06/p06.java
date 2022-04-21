package p06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p06 {

	public static void k44_FileWrite() throws IOException { //���� ���⸦ ���� �Լ� �����ϱ�.
		
		File k44_f = new File("C:\\Users\\501-01\\Desktop\\Mytest1.txt");	//File Ŭ������ �ν��Ͻ� f�� ����� .txt������ �ҷ��´�.
		BufferedWriter k44_bw = new BufferedWriter(new FileWriter(k44_f));	//import�� BufferedWriterŬ������ �ν��Ͻ� bw�� ����� ������ �ҷ��� ���Ͽ� �����尡 ������� ������ش�.

		k44_bw.write("�ȳ� ����!");	//BufferedWriterŬ������ write�޼ҵ带 ���� ��ȣ ���� string�� �ҷ��� bw�� �Է��Ѵ�.
		k44_bw.newLine();
		k44_bw.write("hello ���!");	
		k44_bw.newLine();

		k44_bw.close();	//BufferedWriterŬ������ close�޼ҵ带 ���� �����带 �������ش�.

	}

	public static void k44_FileRead() throws IOException {	 //���� �б⸦ ���� �Լ� �����ϱ�.

		File f = new File("C:\\Users\\501-01\\Desktop\\Mytest1.txt");	//File Ŭ������ �ν��Ͻ� f�� ����� .txt������ �ҷ��´�.
		BufferedReader k44_br = new BufferedReader(new FileReader(f));	//import�� BufferedReaderŬ������ �ν��Ͻ� br�� ����� ������ �ҷ��� ���Ͽ� �б��尡 ������� ������ش�.

		String k44_readtxt;	//�о�� �����͸� ������ String �ڷ����� readtxt ���� ����

		while ((k44_readtxt = k44_br.readLine()) != null) {	//!!!!!�̶� �켱 readline�޼ҵ�� �о�� ���� �����͵��� ���� String�� �����ϴ°� 1��! �׸��� ���� �� ���� null���� ���ǰ˻��ϴ°� 2��!!!
			System.out.printf("%s\n", k44_readtxt);	//����� readtxt String�� �ݺ����� ���� �ݺ� ��µȴ�.
		}

		k44_br.close();	//BufferedReaderŬ������ close�޼ҵ带 ���� �����带 �������ش�.
	}

	public static void main(String[] args) throws IOException {	//���θ޼ҵ�

		k44_FileWrite();	//���Ͼ��⸦ �ϴ� �Լ��� ȣ��
		k44_FileRead();		//���� �б⸦ �ϴ� �Լ��� ȣ��
	}
}
