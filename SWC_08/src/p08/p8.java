package p08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class p8 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\501-01\\Desktop\\������_���������������.txt");	//File Ŭ������ �ν��Ͻ� f�� ����� .txt������ �ҷ��´�.
		BufferedReader br = new BufferedReader(new FileReader(f));	//�ν��Ͻ� f������ �д� buffer�ν��Ͻ� br�� �����ߴ�.
		
		String readtxt;
		
		if((readtxt= br.readLine())==null) {	//!!�̶� readtxt�� br.readLine()(ù° ��)�� �־��ִ� ��(ù° ���� ����Ʈ ���� �̸�), �׸��� ���� �װ��� null���� Ȯ���ϴ� ��
			System.out.printf("�� �����Դϴ�\n");
			return;
		}
		String[] field_name = readtxt.split("\t");	//ù°��(�ֳ��ϸ� �ݺ��� ����) = �׸� ���� ������ String���� readtxt�� ","�� ������ field_name �迭�� �����Ѵ�
		System.out.println("field anem �迭 ���� : "+field_name.length);
	
		
		
		
		//�츮��(�д� �����) ���� �浵 �� ������ �����ϱ�. ���� ������ ���� ���� ������.
		double lat = 37.3860521;
		double lng = 127.1214038;
		
		int LineCnt = 0; //���° ������ ������ ����
		while((readtxt = br.readLine())!=null) {	//while�� ���� ������ br.readLine�� readtxt�� ��� �ڵ带 ���� �����ϴ� ���̿���!!!�׷��� ������ ������ ������ �� �־���!!!
			
			String[] field = readtxt.split("\t");	//������ �����͵��� ������ txt �����̹Ƿ� ù �׸��� ������ �� split�� ���ص� �翬 ��!
			System.out.printf("**[%d��° �׸�]*************\n",LineCnt);
			
			System.out.printf(" %s : %s\n", field_name[9], field[9]);	//�׸��� 9��° �����Ͱ� ���� �ּ��̴�.
			System.out.printf(" %s : %s\n", field_name[13], field[13]);	//12�� : �����ּ�
			System.out.printf(" %s : %s\n", field_name[14], field[14]);	// : �浵�ּ�
			double dist = Math.sqrt( Math.pow(Double.parseDouble(field[13])-lat,2)	//��Ÿ����� ������ �̿��� �غ��� ���� �����͸� ������ ���� �� �ִܰŸ��� ���
					+ Math.pow(Double.parseDouble(field[14])-lng,2));			//(������ ������ �ձ״� �ﰢ�Լ��� �����ؾ���) ����� �Ǽ��� �����͸� ���� distance�� ����.
			System.out.printf(" ���������� �Ÿ� : %f\n",dist);
			System.out.printf("****************************\n");
			
			LineCnt++;
		}
		br.close();	//BufferedReaderŬ������ close�޼ҵ带 ���� �����带 �������ش�.
	}

}
