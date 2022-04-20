package p41;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InputData {

	public static int[] k44_num, k44_kor, k44_eng, k44_mat, k44_sum; // ��ȣ ���� �� �� ������ �迭 ����
	public static float[] k44_avg; //����� �� �Ǽ��� �迭 ����
	public static String[] k44_name; // �̸��� �� ������ �迭 ����
	public static int k44_iPerson, k44_iPages, k44_iPageNum; // �������� ����� ���� ����
	
	public InputData(int k44_iPerson, int k44_iPageNum, int k44_iPages) { //Ŭ���� ������ ����� �迭 ����
				
		this.k44_iPages = k44_iPages; //�������� ����� �ο�
		this.k44_iPerson = k44_iPerson;//�� �ο�
		
		k44_num = new int [k44_iPerson]; //�迭 ũ�� �� �ο����� ����
		k44_kor = new int [k44_iPerson]; 
		k44_eng = new int [k44_iPerson]; 
		k44_mat = new int [k44_iPerson]; 
		k44_sum = new int [k44_iPerson]; 
		k44_avg = new float [k44_iPerson];
		k44_name = new String [k44_iPerson]; 
		
	}
	
	public void printHeader(int k44_iPageNum) { //��� �κ� �μ�(������ ��������ȣ)
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //������� ���� ����
		String k44_date = sdf.format(new Date());// Date�� ����ð� �޾ƿͼ� ���Ŀ� ����
		System.out.printf("%30s\n","��������ǥ");
		System.out.printf("%s%d%26s%10s\n","PAGE:", k44_iPageNum+1, "�������: ", k44_date); //page��ȣ�� 1���� ��  +1����� ����
		System.out.printf("========================================================\n");
		System.out.printf("%s%6s%6s%7s%7s%7s%7s\n","��ȣ","�̸�","����","����","����","����","���");
		System.out.printf("========================================================\n");
			
	}
	
	public void SetData (int k44_i, String k44_name, int k44_kor, int k44_eng, int k44_mat ) { // �迭�� ���� �ִ� �޼ҵ�
		
		this.k44_num[k44_i] = k44_i+1; //1������ 200������
		this.k44_name[k44_i] = k44_name;//�迭�� ù��°��  0���̹Ƿ� 
		this.k44_kor[k44_i] = k44_kor; 
		this.k44_eng[k44_i] = k44_eng; 
		this.k44_mat[k44_i] = k44_mat; 
		k44_sum[k44_i] = k44_kor + k44_eng + k44_mat;//�� ������ ��
		k44_avg[k44_i] = k44_sum[k44_i]/3.0f;//�� ������ ���(�Ǽ������� ����ϱ����� float�� ����)
		
	}
	
	public void Result(int k44_i,int k44_countAll) { // ��� ��� �޼ҵ� (�� ������ ���� �� ��ü �ο����� ������ ����)
		
		int k44_countPage = 0; //�������� �ο����� ���� �׸�ŭ ������ ���� ����
		int k44_korPageSum = 0; //�������� �������� ��
		int k44_engPageSum = 0; //�������� �������� ��
		int k44_matPageSum = 0; //�������� �������� ��
		int k44_sumPageSum = 0; //�������� ���� ��
		float k44_avgPageSum = 0;//�������� ��� 
		int k44_korAccuSum = 0; //���� ��������
		int k44_engAccuSum = 0; //���� ��������
		int k44_matAccuSum = 0; //���� ��������
		int k44_sumAccuSum = 0; //���� ���� ��
		float k44_avgAccuSum = 0; //���� ���

		for (int k44_j = k44_iPages * k44_i; k44_j < k44_iPages *(k44_i+1); k44_j++) { //0~29 / 30~59 ...

			k44_korPageSum += k44_kor[k44_j]; // �� �л��� ���������� �������� �������� �տ� ����
			k44_engPageSum += k44_eng[k44_j]; // �� �л��� ���������� �������� �������� �տ� ����
			k44_matPageSum += k44_mat[k44_j]; // �� �л��� ���������� �������� �������� �տ� ����
			k44_sumPageSum += k44_sum[k44_j]; // �� �л��� �����հ踦 �������� ���� �տ� ����
			k44_avgPageSum += k44_avg[k44_j]; // �� �л��� ��������� �������� ��� ��  ����
			k44_countPage++; //�������� �л��� ������� üũ
			if (k44_j >= k44_iPerson-1) { //0���� ������ j�� 199�� 200�� ���Ҵٴ� �� 
				break; // �ݺ� ����
			}
			
		}

		for (int k44_k = 0; k44_k < k44_iPages * (k44_i + 1); k44_k++) {

			k44_korAccuSum += k44_kor[k44_k]; // �� �л��� ���������� ���� �������� �տ� ����
			k44_engAccuSum += k44_eng[k44_k]; // �� �л��� ���������� ���� �������� �տ� ����
			k44_matAccuSum += k44_mat[k44_k]; // �� �л��� ���������� ���� �������� �տ� ����
			k44_sumAccuSum += k44_sum[k44_k]; // �� �л��� �����հ踦 ���� ���� �տ� ����
			k44_avgAccuSum += k44_avg[k44_k]; // �� �л��� ��������� ���� ��� ��  ����
			if (k44_k >= k44_iPerson-1) { //0���� ������ k�� 199�� 200�� ���Ҵٴ� ��
				break; //�ݺ� ����
			}

		}
		System.out.printf("========================================================\n");
		System.out.println("���� ������");
		System.out.printf("%s%16d%9d%9d%9d%9.2f\n", "�հ�", k44_korPageSum, k44_engPageSum, k44_matPageSum, k44_sumPageSum, k44_avgPageSum); //���������� �հ� 
		System.out.printf("%s%16.2f%9.2f%9.2f%9.2f%9.2f\n", "���", (float)k44_korPageSum / k44_countPage, (float)k44_engPageSum / k44_countPage, //������ �� ���� ���� ������ �� �л����� ����
				(float)k44_matPageSum / k44_countPage, (float)k44_sumPageSum / k44_countPage, (float)k44_avgPageSum / k44_countPage); //�Ҽ��� ǥ���ϱ����� (float)ó����
		System.out.printf("========================================================\n");
		System.out.println("���� ������");
		System.out.printf("%s%16d%9d%9d%9d%9.2f\n", "�հ�", k44_korAccuSum, k44_engAccuSum, k44_matAccuSum, k44_sumAccuSum, k44_avgAccuSum); //���� ������ �հ�
		System.out.printf("%s%16.2f%9.2f%9.2f%9.2f%9.2f\n\n\n", "���", (float)k44_korAccuSum / k44_countAll, (float)k44_engAccuSum / k44_countAll, // ���� ���� ���� ���� �л����� ����
				(float)k44_matAccuSum / k44_countAll, (float)k44_sumAccuSum / k44_countAll, (float)k44_avgAccuSum / k44_countAll); //�Ҽ��� ǥ���ϱ����� (float)ó����
		

	}
}
