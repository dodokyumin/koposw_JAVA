package p08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class p8 {

	public static void main(String[] args) throws IOException {
		
		File k44_f = new File("C:\\Users\\501-01\\Desktop\\������_���������������.txt");	//File Ŭ������ �ν��Ͻ� f�� ����� .txt������ �ҷ��´�.
		BufferedReader k44_br = new BufferedReader(new FileReader(k44_f));	//�ν��Ͻ� f������ �д� buffer�ν��Ͻ� br�� �����ߴ�.
		
		String k44_readtxt;
		
		if((k44_readtxt= k44_br.readLine())==null) {	//!!�̶� readtxt�� br.readLine()(ù° ��)�� �־��ִ� ��(ù° ���� ����Ʈ ���� �̸�), �׸��� ���� �װ��� null���� Ȯ���ϴ� ��
			System.out.printf("�� �����Դϴ�\n");
			return;
		}
		String[] k44_field_name = k44_readtxt.split("\t");	//ù°��(�ֳ��ϸ� �ݺ��� ����) = �׸� ���� ������ String���� readtxt�� ","�� ������ field_name �迭�� �����Ѵ�

	
		//�츮��(�д� �����) ���� �浵 �� ������ �����ϱ�. ���� ������ ���� ���� ������.
		double k44_lat = 37.3860521;
		double k44_lng = 127.1214038;
		
		int k44_LineCnt = 0; //���° ������ ������ ����
		while((k44_readtxt = k44_br.readLine())!=null) {	//while�� ���� ������ br.readLine�� readtxt�� ��� �ڵ带 ���� �����ϴ� ���̿���!!!�׷��� ������ ������ ������ �� �־���!!!
			
			String[] k44_field = k44_readtxt.split("\t");	//������ �����͵��� ������ txt �����̹Ƿ� ù �׸��� ������ �� split�� ���ص� �翬 ��!
			System.out.printf("**[%d��° �׸�]*************\n",k44_LineCnt);
			
			System.out.printf(" %s : %s\n", k44_field_name[9], k44_field[9]);	//�׸��� 9��° �����Ͱ� ���� �ּ��̴�.
			System.out.printf(" %s : %s\n", k44_field_name[13], k44_field[13]);	//12�� : �����ּ�
			System.out.printf(" %s : %s\n", k44_field_name[14], k44_field[14]);	// : �浵�ּ�
			double k44_dist = Math.sqrt( Math.pow(Double.parseDouble(k44_field[13])-k44_lat,2)	//��Ÿ����� ������ �̿��� �غ��� ���� �����͸� ������ ���� �� �ִܰŸ��� ���
					+ Math.pow(Double.parseDouble(k44_field[14])-k44_lng,2));			//(������ ������ �ձ״� �ﰢ�Լ��� �����ؾ���) ����� �Ǽ��� �����͸� ���� distance�� ����.
			System.out.printf(" ���������� �Ÿ� : %f\n",k44_dist);
			System.out.printf("****************************\n");
			
			k44_LineCnt++;
		}
		k44_br.close();	//BufferedReaderŬ������ close�޼ҵ带 ���� �����带 �������ش�.
	}

}
