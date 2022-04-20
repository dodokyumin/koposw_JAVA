package p41;

public class ReportSheet {

	public static void main(String[] args) {

		int k44_iPerson = 200; // ��ü �ο��� �����ϱ�
		int k44_iPages = 30; // �� �������� ����� �ο� �� �����ϱ�
		int k44_amountPage = k44_iPerson / k44_iPages; // ��ü�ο��� �������� ������ ��, ������ ��

		InputData inData = new InputData(k44_iPerson, k44_amountPage, k44_iPages); // InputDataŬ������ �ν��Ͻ� inData����

		int countAll = 0; // ��ü �л��� üũ�ϴ� ����
		if (k44_iPerson != 0) {
			for (int k44_pageNum = 0; k44_pageNum <= k44_amountPage; k44_pageNum++) { // �ݺ��� ..6�� �μ��ϸ� 20�� �߸��� �׷��� <=����
																						// ó��

				inData.printHeader(k44_pageNum);
				for (int k44_i = k44_iPages * k44_pageNum; k44_i < k44_iPages * (k44_pageNum + 1); k44_i++) {
					String k44_name = String.format("ȫ��%03d", k44_i + 1);// 001������ ���������� �̸��� �����Ѵ�.
					int k44_kor = (int) (Math.random() * 100); // ���� ������ �޾� ������ �����Ѵ�.
					int k44_eng = (int) (Math.random() * 100); 
					int k44_mat = (int) (Math.random() * 100); 

					if (k44_i >= k44_iPerson) { //��ü �ο����� ���� �ݺ��Ѵ�.
						break;
					}
					countAll++;// �� �л��� üũ(�ʱ�ȭ ���� ��� ����)
					inData.SetData(k44_i, k44_name, k44_kor, k44_eng, k44_mat);// ȹ���� ������ �޼ҵ带 Ȱ���Ͽ� �迭�� �Է�
				}
				for (int j = 0; j < k44_iPages; j++) { // ������ �ο��� ��ŭ ���ư��� �ݺ���
					System.out.printf("%03d%7s %7d%9d%9d%9d%9.2f\n", (j + 1) + k44_iPages * k44_pageNum,
							inData.k44_name[j + k44_iPages * k44_pageNum], // �л��� ��ȣ�� 000���Ͱ� �ƴ� 001�����̴�. �׷��Ƿ� j+1
							inData.k44_kor[j + k44_iPages * k44_pageNum], inData.k44_eng[j + k44_iPages * k44_pageNum],
							inData.k44_mat[j + k44_iPages * k44_pageNum], // �л��� �̸�,����,�հ�,����� �迭���� ������
							inData.k44_sum[j + k44_iPages * k44_pageNum], inData.k44_avg[j + k44_iPages * k44_pageNum]);
					if ((j + k44_iPages * k44_pageNum) >= k44_iPerson - 1) {// 200���л��� ������ �迭199���� ��������Ƿ� j���� 199���� Ŀ����
																			// �ݺ� ����
						break;
					}
				}
				inData.Result(k44_pageNum, countAll); // ���� ��������,������� ������ �л����� ������ ��� ���� ����Ѵ�.
			}
		} else {
			System.out.println("No student");
		}
	}
}
