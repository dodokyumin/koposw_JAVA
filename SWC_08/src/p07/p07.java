package p07;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;

import java.io.IOException;

public class p07 {

	public static void main(String[] args) throws IOException {//try catch���� ���� �ʰ� ������ ���� throw�� �� �ֵ��� ����

		File k44_f = new File("C:\\Users\\501-01\\Desktop\\������_���������������.csv"); //File Ŭ������ �ν��Ͻ� f�� ����� .csv������ �ҷ��´�.
		BufferedReader k44_br = new BufferedReader(new FileReader(k44_f)); // import�� BufferedWriterŬ������ �ν��Ͻ� bw�� ����� ������ �ҷ��� ���Ͽ� �����尡 ������� ������ش�.

		String k44_readtxt;	//�о�� �����͸� ������ String �ڷ����� readtxt ���� ����

		if ((k44_readtxt = k44_br.readLine()) == null) {	//!!!!!�̶� �켱 readline�޼ҵ�� �о�� ���� �����͵��� ���� String�� �����ϴ°� 1��! �׸��� ���� �� ���� null���� ���ǰ˻��ϴ°� 2��!!!
			System.out.printf("�� �����Դϴ�.\n");	//���� null�̶�� �� �����̶�� �ȳ����� ����Ѵ�.
			return;
		}

		String[] k44_field_name = k44_readtxt.split(",");	//ù°��(�ֳ��ϸ� �ݺ��� ����) = �׸� ���� ������ String���� readtxt�� ","�� ������ field_name �迭�� �����Ѵ�.

		int k44_LineCnt = 0;	//���° �������� ī��Ʈ�� ���� ����
		while ((k44_readtxt = k44_br.readLine()) != null) {	//while�� ���� ������ br.readLine�� readtxt�� ��� �ڵ带 ���� �����ϴ� ���̿���!!!�׷��� ������ ������ ������ �� �־���!!!
			
			String[] k44_field = k44_readtxt.split(",");	//�����͵�(������Ʈ��)(�ֳ�? ������ readLine���� ���� �о�J� ���� 2��° ����)�� ������ String���� readtxt�� ","�� ������ field �迭�� �����Ѵ�.
			System.out.printf("**[%d��° �׸�]*************\n", k44_LineCnt);
			for (int k44_j = 0; k44_j < k44_field_name.length; k44_j++) {	//�׸��� (������) ��������ŭ �ݺ��Ѵ�. while�ȿ� �����Ƿ� 2�߹ݺ�.
				System.out.printf(" %s : %s\n", k44_field_name[k44_j], k44_field[k44_j]);
			}
			System.out.printf("****************************\n");
			if (k44_LineCnt == 100)	//100������ while���� �������� ����������.
				break;

			k44_LineCnt++; //���ѷ��� ���� �ʵ��� ���Ǻ������� 1�� ���ϱ�.

		}
		k44_br.close();//BufferedReaderŬ������ close�޼ҵ带 ���� �����带 �������ش�.

	}

}
