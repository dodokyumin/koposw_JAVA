package p34;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class k44_InputData {

	public static int[] k44_i, k44_kor, k44_eng, k44_mat, k44_sum;	//static�� ���� ���� Ŭ������ �ִ� �Լ��鵵 ���� ����� �� �ִ� ���������� �����ߴ�.
	public static int[] k44_ave;	//��հ��� �����ϴ� �迭 ����
	public static String[] k44_name;	//�̸��� �����ϴ� �迭 ����
	public static int k44_iPerson;
	
	public k44_InputData(int k44_iPerson) {	//�ش� �޼ҵ�� ������ �Ķ���͸� �޾� �� �׸�� �迭 ������ �´� �ڷ���� �����ش�.
		
		String k44_pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat k44_simpleDateFormat = new SimpleDateFormat(k44_pattern);
		String k44_date = k44_simpleDateFormat.format(new Date());		
		
		this.k44_iPerson = k44_iPerson;
		k44_i = new int [k44_iPerson];
		k44_kor = new int [k44_iPerson];
		k44_eng = new int [k44_iPerson];
		k44_mat = new int [k44_iPerson];
		k44_sum = new int [k44_iPerson];
		k44_ave = new int [k44_iPerson];
		k44_name = new String [k44_iPerson];
		
		System.out.printf("%30s\n","��������ǥ");	//�������� ���� ��� ���� �����ϱ�
		System.out.printf("%33s%10s\n","��� ����: ", k44_date);
		System.out.printf("========================================================\n");
		System.out.printf("%s%5s%7s%7s%7s%7s%7s\n","��ȣ","�̸�","����","����","����","����","���");
		System.out.printf("========================================================\n");
		
		
	}
	
	public void k44_SetData (int k44_i, String k44_name, int k44_kor, int k44_eng, int k44_mat ) {
		//�Ķ���ͷ� ���� ������ ���� �� Ŭ������ �������� �迭��(this.)�ϳ��� ������� �����Ѵ�
		
		this.k44_i[k44_i] = k44_i;	//���� Ŭ���� ���� ���������� ��Ī�ϴ� this�� �Ķ���ͷ� ���� ������ ���������� �����Ѵ�.
		this.k44_name[k44_i] = k44_name;
		this.k44_kor[k44_i] = k44_kor;
		this.k44_eng[k44_i] = k44_eng;
		this.k44_mat[k44_i] = k44_mat;
		this.k44_sum[k44_i] = k44_kor + k44_eng + k44_mat;
		this.k44_ave[k44_i] = k44_sum[k44_i]/3;
		
	}
	
	public void k44_Conclude () {	//Arrays.stream().sum()�� ���� �迭�� ����� ������ �հ� sum �� ��հ� average ���ϱ�
		int k44_korSum = Arrays.stream(k44_kor).sum();
		int k44_engSum = Arrays.stream(k44_eng).sum();
		int k44_matSum = Arrays.stream(k44_mat).sum();
		int k44_sumSum = Arrays.stream(k44_sum).sum();
		int k44_aveSum = Arrays.stream(k44_ave).sum();
		
		System.out.printf("========================================================\n");
		System.out.printf("%s%16d%9d%9d%9d%9d\n","�հ�" ,k44_korSum ,k44_engSum ,k44_matSum, k44_sumSum, k44_aveSum);
		System.out.printf("%s%16d%9d%9d%9d%9d\n","���" ,k44_korSum/k44_iPerson ,k44_engSum/k44_iPerson ,k44_matSum/k44_iPerson, k44_sumSum/k44_iPerson, k44_aveSum/k44_iPerson);
		
	}
}