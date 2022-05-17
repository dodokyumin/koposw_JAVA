package p35;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Main03 {
	static ArrayList<k44_OneRec> k44_ArrayOncRec = new ArrayList<k44_OneRec>();
	static int k44_sumKorCurrent = 0; // ������������ ����� ��
	static int k44_sumEngCurrent = 0; // ������������ ����� ��
	static int k44_sumMatCurrent = 0; // ������������ ���м��� ��
	static int k44_sumSumCurrent = 0; // ������������ ���� ��
	static double k44_sumAveCurrent = 0; // ������������ ��� ��
	static int k44_sumKorTotal = 0; // ������������ ����� ��
	static int k44_sumEngTotal = 0; // ������������ ����� ��
	static int k44_sumMatTotal = 0; // ������������ ���м��� ��
	static int k44_sumSumTotal = 0; // ������������ ���� ��
	static double k44_sumAveTotal = 0; // ������������ ����� ��

	static int k44_counter = 0; // �ο��� ������ ī����

	static final int k44_iPerson = 200; // ���ο���
	static final int k44_pgPerson = 30; // �������� �ο���
	static int k44_currentPagePerson = 0; // ������������ �ο���
	static int k44_currentPageStackPerson = 0; // ������������ ���� �ο���

	static int k44_totalPages = 0; // �� ������ ��

	public static void main(String[] args) {
		// pg30 Ŭ������ ArrayList
		k44_dataSet(); // ������ ���� �޼ҵ�
		k44_dataSort();
		for (int k44_i = 0; k44_i < k44_totalPages; k44_i++) { // ����������ū ���� for�� �ۼ�(����7������)
			k44_HeaderPrint(k44_i); // ������ ����, ������ڰ� ��� �Ӹ��� ���

			for (int k44_j = 0; k44_j < k44_currentPagePerson; k44_j++) {
				k44_ItemPrint(); // �л��� ������ ����Ѵ�.
			}
			k44_TailPrint(); // ������ ����,���� �������� �����հ�� ����� ����Ѵ�.
		}
	}

	public static void k44_dataSet() { // ������ ���� �޼ҵ�
		for (int k44_i = 1; k44_i <= k44_iPerson; k44_i++) { // �� �ο��� ��ŭ ���� for�� �ۼ�
			String k44_name = String.format("ȫ��%02d", k44_i); // ���信 �°� �̸��Է�
			int k44_kor = (int) (Math.random() * 100); // 0���� 99���� �����ϴ� �����Լ��� �����Է�
			int k44_eng = (int) (Math.random() * 100); // 0���� 99���� �����ϴ� �����Լ��� �����Է�
			int k44_mat = (int) (Math.random() * 100); // 0���� 99���� �����ϴ� �����Լ��� �����Է�
			// Ŭ���� ��̿� �Է��� ������ ���� Ŭ���� �߰�
			k44_ArrayOncRec.add(new k44_OneRec(k44_i, k44_name, k44_kor, k44_eng, k44_mat));
		}
		// �������� ����ϴ� if
		if (k44_iPerson % k44_pgPerson == 0) {
			k44_totalPages = k44_iPerson / k44_pgPerson;
		} else {
			k44_totalPages = (k44_iPerson / k44_pgPerson) + 1;
		}
	}

	public static void k44_dataSort() { // �����͸� ���������ϴ� �޼ҵ�
		// pg34_OneRec�� ���� Comparator ����
		Comparator<k44_OneRec> k44_sort = new Comparator<k44_OneRec>() {
			public int compare(k44_OneRec a1, k44_OneRec a2) { // ���� �� ���� ����
				return (a2.k44_getSum() - a1.k44_getSum()); // �����տ� ���� �����͸� ���Ѵ�.
			}
		};
		Collections.sort(k44_ArrayOncRec, k44_sort); // �׿� ���� Ŭ���� ����Ʈ�� ������ �ٲ۴�.
	}

	public static void k44_HeaderPrint(int k44_i) {
		// �ð��� ���¸� ¥�д�.
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		// ����ð��� �����´�.
		Date k44_time = new Date();
		// ������ ���ڿ��� ���信 ���� �ð��� �Է��Ѵ�.
		String k44_time1 = format1.format(k44_time);

		System.out.printf("PAGE: %d            ������� : " + k44_time1 + "\n", k44_i + 1); // ���� ������(0�̶� + 1)�� ��¥�� ����Ѵ�.
		System.out.println("==================================================");
		System.out.printf("%-2.2s %-4.4s %4.4s %5.5s %5.5s %5.5s %4.4s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���"); // ����
		System.out.println("==================================================");
		// �������� �ο��� ����
		if (k44_i + 1 == k44_totalPages) { // ���������������
			if (k44_iPerson % k44_pgPerson == 0) { // ���ο� = �������� �ο� �����Ҷ� 0�� �ߴ� ���� ����
				k44_currentPagePerson = k44_pgPerson; // ���ο��� �Է�
			} else {
				k44_currentPagePerson = k44_iPerson % k44_pgPerson; // 200 30 �̶�� 20���� ����.
			}
		} else {
			k44_currentPagePerson = k44_pgPerson; // �������� ��� �������� �������� �ο��� �ִ´�.
		}
		// �������� �����ο� ���
		k44_currentPageStackPerson += k44_currentPagePerson;

	}

	public static void k44_ItemPrint() { // �л� ������� �޼ҵ�
		k44_OneRec k44_rec; // Ŭ���� ����
		// Ŭ���� ����Ʈ���� k44_counter��° Ŭ���� ����
		k44_rec = k44_ArrayOncRec.get(k44_counter);
		// �й�, �̸�, ����, ����, ����, �հ�, ����� ����ϴ� printf ����
		System.out.printf("%03d %5.5s %5d %7d %7d %7d %7.2f\n", k44_rec.k44_getStudentId(), k44_rec.k44_getName(),
				k44_rec.k44_getKor(), k44_rec.k44_getEng(), k44_rec.k44_getMat(), k44_rec.k44_getSum(),
				k44_rec.k44_getAve());

		k44_counter++; // �����л����� �ѱ�� ++
		// �л��� ������ ������ ������ ���� ������ / ���񺰷� ������ �����Ѵ�.
		k44_sumKorCurrent += k44_rec.k44_getKor();
		k44_sumKorTotal += k44_rec.k44_getKor();
		k44_sumEngCurrent += k44_rec.k44_getEng();
		k44_sumEngTotal += k44_rec.k44_getEng();
		k44_sumMatCurrent += k44_rec.k44_getMat();
		k44_sumMatTotal += k44_rec.k44_getMat();
		k44_sumSumCurrent += k44_rec.k44_getSum();
		k44_sumSumTotal += k44_rec.k44_getSum();
		k44_sumAveCurrent += k44_rec.k44_getAve();
		k44_sumAveTotal += k44_rec.k44_getAve();

	}

	public static void k44_TailPrint() {
		System.out.println("==================================================");

		System.out.println("����������");
		// ���� �������� ���� �������� �����ش�. k44_inData Ŭ�������� k44_curSubjectSum �޼ҵ忡 k44_i(�� ������)��
		// �� ������ �迭�� �����ְ�, ���� �������� ����.
		// ����� �Ǽ����̱� ������ k44_curAveSum�� �޼ҵ� ���� ����
		System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "�հ�", k44_sumKorCurrent, k44_sumEngCurrent,
				k44_sumMatCurrent, k44_sumSumCurrent, k44_sumAveCurrent);

		// ���� �������� ���� ����� �����ش�. k44_inData Ŭ�������� k44_cursubjectAve �޼ҵ忡 k44_i(�� ������)�� ��
		// ������ �迭�� �����ְ�, ���� ����� ����.
		// ����� �Ǽ����̱� ������ k44_curaveAve�� �޼ҵ� ���� ����
		System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n", "���",
				(double) k44_sumKorCurrent / k44_currentPagePerson, (double) k44_sumEngCurrent / k44_currentPagePerson,
				(double) k44_sumMatCurrent / k44_currentPagePerson, (double) k44_sumSumCurrent / k44_currentPagePerson,
				(double) k44_sumAveCurrent / k44_currentPagePerson);

		System.out.println("==================================================");

		// ���ݱ��� �������� ���� �������� �����ش�. k44_inData Ŭ�������� k44_totalSubjectSum �޼ҵ忡 k44_i(��
		// ������)�� �� ������ �迭�� �����ְ�, ���� �������� ����.
		// ����� �Ǽ����̱� ������ k44_totalAveSum�� �޼ҵ� ���� ����
		System.out.println("����������");
		System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "�հ�", k44_sumKorTotal, k44_sumEngTotal, k44_sumMatTotal,
				k44_sumSumTotal, k44_sumAveTotal);

		// ���ݱ��� �������� ���� ����� �����ش�. k44_inData Ŭ�������� k44_totalsubjectAve �޼ҵ忡 k44_i(��
		// ������)�� �� ������ �迭�� �����ְ�, ���� ����� ����.
		// ����� �Ǽ����̱� ������ k44_totalaveAve�� �޼ҵ� ���� ����
		System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n\n\n", "���",
				(double) k44_sumKorTotal / k44_currentPageStackPerson,
				(double) k44_sumEngTotal / k44_currentPageStackPerson,
				(double) k44_sumMatTotal / k44_currentPageStackPerson,
				(double) k44_sumSumTotal / k44_currentPageStackPerson,
				(double) k44_sumAveTotal / k44_currentPageStackPerson);
		// ������������ �Ѿ�� �������� ���� �ʱ�ȭ
		k44_sumKorCurrent = 0;
		k44_sumEngCurrent = 0;
		k44_sumMatCurrent = 0;
		k44_sumSumCurrent = 0;
		k44_sumAveCurrent = 0;

	}

}