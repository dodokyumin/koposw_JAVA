package p08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class p82 {
	
//�д�������� ���� ����� ����, �հ��� ã�� �μ� �ǽ� �� �ϳ�(��)
	
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
		
		double k44_distMin = 0, k44_distMax = 0;	//�Ÿ��� ���� �ִ� �Ÿ��� ������ ���� ����
		int k44_cntMin = 0, k44_cntMax = 0;	//���� �ִܰŸ��� ������ �� �ش� ī��带 ������ �� ������ ����.
		String k44_longiMin = "", k44_latiMin = "", k44_longiMax = "", k44_latiMax = "", k44_addressMin = "", k44_addressMax = "";	// �ּڰ��� �ִ��� ���� ���� �� ������ �浵, ������ ����� ������ ����
		
		int k44_LineCnt = 0; //���° ������ ������ ����
		
		while((k44_readtxt = k44_br.readLine())!=null) {	//while�� ���� ������ br.readLine�� readtxt�� ��� �ڵ带 ���� �����ϴ� ���̿���!!!�׷��� ������ ������ ������ �� �־���!!!
			
			String[] k44_field = k44_readtxt.split("\t");	//������ �����͵��� ������ txt �����̹Ƿ� ù �׸��� ������ �� split�� ���ص� �翬 ��!
			
			double k44_dist = Math.sqrt( Math.pow(Double.parseDouble(k44_field[13])-k44_lat,2)	//��Ÿ����� ������ �̿��� �غ��� ���� �����͸� ������ ���� �� �ִܰŸ��� ���
					+ Math.pow(Double.parseDouble(k44_field[14])-k44_lng,2));			//(������ ������ �ձ״� �ﰢ�Լ��� �����ؾ���) ����� �Ǽ��� �����͸� ���� distance�� ����.
			
			k44_distMin = (k44_distMin == 0)? k44_dist : k44_distMin;	//ó���� ������ �ڱ��ڽ��� �ǹǷ�, ������ true�� �� ���ۿ� ���� ���׿����ڸ� ����� �ʱⰪ�� 1��° �ʵ尪���� ����.
			k44_distMax = (k44_distMin == 0)? k44_dist : k44_distMax;
			
			if(k44_distMin > k44_dist) {	//�ڱ� ���� �ڱ⺸�� ���� �Ÿ��� ������ �׶������� ����, ����, �浵���� �������ش�.
				k44_distMin = k44_dist;
				k44_addressMin = k44_field[9];
				k44_longiMin = k44_field[13];
				k44_latiMin = k44_field[14];
				k44_cntMin = k44_LineCnt;
				
			}
			if(k44_distMax < k44_dist) {	//�ڱ� ���� �ڱ⺸�� �� �Ÿ��� ������ �׶������� ����, ����, �浵���� �������ش�.
				k44_distMax = k44_dist;
				k44_addressMax = k44_field[9];
				k44_longiMax = k44_field[13];
				k44_latiMax = k44_field[14];
				k44_cntMax = k44_LineCnt;
			}
			
			k44_LineCnt++;
		}	
			
			System.out.printf("**[%d��° �׸�(�ִܰŸ�)]*************\n",k44_cntMin);
			System.out.printf(" %s : %s\n", k44_field_name[9], k44_addressMin);	//�׸��� 9��° �����Ͱ� ���� �ּ��̴�.
			System.out.printf(" %s : %s\n", k44_field_name[13], k44_longiMin);	//12�� : �����ּ�
			System.out.printf(" %s : %s\n", k44_field_name[14],k44_latiMin);	// : �浵�ּ�
			System.out.printf(" ������������ �Ÿ� : %fm\n",k44_distMin*100000);
			System.out.printf("****************************\n");
			
			System.out.printf("\n**[%d��° �׸�(����Ÿ�)]*************\n",k44_cntMax);
			System.out.printf(" %s : %s\n", k44_field_name[9], k44_addressMax);	//�׸��� 9��° �����Ͱ� ���� �ּ��̴�.
			System.out.printf(" %s : %s\n", k44_field_name[13], k44_longiMax);	//13�� : �����ּ�
			System.out.printf(" %s : %s\n", k44_field_name[14], k44_latiMax);	//14��: �浵�ּ�
			System.out.printf(" ������������ �Ÿ� : %fm\n",k44_distMax*100000);
			System.out.printf("****************************\n");
			
		
		
		k44_br.close();	//BufferedReaderŬ������ close�޼ҵ带 ���� �����带 �������ش�.
	}

}
