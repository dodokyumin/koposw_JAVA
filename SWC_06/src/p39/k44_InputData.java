package p39;

public class k44_InputData {

	public static int[] k44_i, k44_kor, k44_eng, k44_mat, k44_sum;	//static�� ���� ���� Ŭ������ �ִ� �Լ��鵵 ���� ����� �� �ִ� ���������� �����ߴ�.
	public static float[] k44_ave;	//��հ��� �����ϴ� �迭 ����
	public static String[] k44_name;	//�̸��� �����ϴ� �迭 ����
	
	public k44_InputData(int k44_iPerson) {	//�ش� �޼ҵ�� ������ �Ķ���͸� �޾� �� �׸�� �迭 ������ �´� �ڷ���� �����ش�.
		
		k44_i = new int [k44_iPerson];
		k44_kor = new int [k44_iPerson];
		k44_eng = new int [k44_iPerson];
		k44_mat = new int [k44_iPerson];
		k44_sum = new int [k44_iPerson];
		k44_ave = new float [k44_iPerson];
		k44_name = new String [k44_iPerson];
		
	}
	
	public void k44_SetData (int k44_i, String k44_name, int k44_kor, int k44_eng, int k44_mat ) {	//�Ķ���ͷ� ���� ������ ���� �� Ŭ������ �������� �迭��(this.)�ϳ��� ������� �����Ѵ�
		
		this.k44_i[k44_i] = k44_i;
		this.k44_name[k44_i] = k44_name;
		this.k44_kor[k44_i] = k44_kor;
		this.k44_eng[k44_i] = k44_eng;
		this.k44_mat[k44_i] = k44_mat;
		this.k44_sum[k44_i] = k44_kor + k44_eng + k44_mat;
		this.k44_ave[k44_i] = (float)((k44_sum[k44_i])/3.0);
		
	}
}