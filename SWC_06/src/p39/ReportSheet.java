package p39;

public class ReportSheet {

	public static void main(String[] args) {
		
		int k44_iPerson = 10;	//��� �� �����ϱ�
		
		k44_InputData k44_inData = new k44_InputData(k44_iPerson); //InputDataŬ������ �޾� ���ο� inData�ν��Ͻ��� �����Ѵ�.
		
		for (int k44_i=0; k44_i<k44_iPerson; k44_i++) {	//��� ����ŭ �ݺ��� ���� �ش� ��������Ÿ���� ������ ��Ƶξ� SetData�� �Ķ���ͷ� �������ش�.
			String k44_name = String.format("ȫ��%02d", k44_i);
			int k44_kor = (int)(Math.random()*100);
			int k44_eng = (int)(Math.random()*100);
			int k44_mat = (int)(Math.random()*100);
			k44_inData.k44_SetData(k44_i, k44_name, k44_kor, k44_eng, k44_mat);
			
		}

		for(int k44_i=0; k44_i<k44_iPerson; k44_i++) { //������ ������ ����Ÿ���� ����� ����ŭ ���� �� �׸��� �迭�� �����Ͽ� ����Ʈ�� �̴´�.
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n",
					k44_i, k44_inData.k44_name[k44_i], k44_inData.k44_kor[k44_i], k44_inData.k44_eng[k44_i], k44_inData.k44_mat[k44_i], k44_inData.k44_sum[k44_i], k44_inData.k44_ave[k44_i]);
		}
		
	}

}