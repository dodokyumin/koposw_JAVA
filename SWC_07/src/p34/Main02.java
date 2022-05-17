package p34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main02 {
	// Ŭ����(pg34_OneRec) ��� ����Ʈ ���� 
	static ArrayList<k44_OneRec> k44_ArrayOncRec = new ArrayList <k44_OneRec>();
	
	static int k44_sumKor = 0;	//������ ����, �����
	static int k44_sumEng = 0;	//������ ����, �����
	static int k44_sumMat = 0;	//������ ����, ���м���
	static int k44_sumSum = 0;	//������ ����, ������
	static int k44_sumAve = 0;	//������ ����, �������
	static final int k44_iPerson = 20;	//�л��� �Է�
	
	public static void main(String[] args) {
		// pg34 ArrayList ����(Sort)
		k44_dataSet();	//������ ���� �޼ҵ�
		k44_dataSort();	//�����͸� ���������ϴ� �޼ҵ�
		k44_HeaderPrint();	//�Ӹ��� ��� �޼ҵ�
		for (int k44_i = 0; k44_i < k44_ArrayOncRec.size(); k44_i++) {
			k44_ItemPrint(k44_i);	//�� �л��� ������ ����ϴ� �޼ҵ� ����
		}	
		k44_TailPrint();	// ������ �� ��� �޼ҵ�
		
	}
	
	public static void k44_dataSet() {	//�����͸� �����ϴ� �޼ҵ�
		for(int i = 1; i <= k44_iPerson; i++) {	// 1���� �� �л��� ��ŭ �ݺ��ϴ� for�� �ۼ�
			String k44_name = String.format("ȫ��%02d", i);	// �л��� �̸� �Է�
			int k44_kor = (int)(Math.random()*100);	//�л��� ���� �Է�, ����, 0���� 99���� �����ϴ� �����Լ�
			int k44_eng = (int)(Math.random()*100);	//�л��� ���� �Է�, ����, 0���� 99���� �����ϴ� �����Լ�
			int k44_mat = (int)(Math.random()*100);	//�л��� ���� �Է�, ����, 0���� 99���� �����ϴ� �����Լ�
			k44_ArrayOncRec.add(new k44_OneRec(i, k44_name, k44_kor, k44_eng, k44_mat));	//�Է��� ������ ��� ����Ʈ�� ��Ŭ���� ���·� �߰��Ѵ�.
		}
	}
	
	public static void k44_dataSort() {	// �����͸� ���������ϴ� �޼ҵ�
		// pg34_OneRec�� ���� Comparator ����
		Comparator <k44_OneRec> k44_sort = new Comparator <k44_OneRec>() {
			public int compare (k44_OneRec a1, k44_OneRec a2) {	// ���� �� ���� ����
				return (a2.k44_getSum() - a1.k44_getSum());	//�����տ� ���� �����͸� ���Ѵ�.
			}
		};
		Collections.sort(k44_ArrayOncRec, k44_sort);	//�׿� ���� Ŭ���� ����Ʈ�� ������ �ٲ۴�.
	}
	
	public static void k44_HeaderPrint() {	// �Ӹ��� ��� �޼ҵ�
		System.out.println("*************************************");
		System.out.printf("%2s %2s  %2s %2s %2s  %2s  %2s\n","��ȣ","�̸�","����","����","����","�հ�","���");
		System.out.println("*************************************");
	}
	
	public static void k44_ItemPrint(int i) {	//�� �л��� ������ ����ϴ� �޼ҵ�
		k44_OneRec k44_rec;	//Ŭ���� ����
		
		k44_rec = k44_ArrayOncRec.get(i);	//Ŭ���� ����Ʈ�� i��° Ŭ������ ���ܿ´�.
		// ����, �л� id, �̸�, �����, �����, ���м���, �հ�, ��������� ����Ѵ�.
		System.out.printf("%2d %4s %4d %4d %4d   %3d %6.2f\n", k44_rec.k44_getStudentId(), k44_rec.k44_getName(), k44_rec.k44_getKor(),
				k44_rec.k44_getEng(), k44_rec.k44_getMat(), k44_rec.k44_getSum(), k44_rec.k44_getAve());
		//������ ������ ���ϱ����� ������ ������ �����Ѵ�
		k44_sumKor += k44_rec.k44_getKor();	
		k44_sumEng += k44_rec.k44_getEng();
		k44_sumMat += k44_rec.k44_getMat();
		k44_sumSum += k44_rec.k44_getSum();
		k44_sumAve += k44_rec.k44_getAve();
	}
	
	public static void k44_TailPrint() {	//������ ������� ���
		System.out.println("*************************************");
		// ���� ���� �հ�, ����� ����Ѵ�.
		System.out.printf("�����հ�  %4d    �������: %6.2f\n",k44_sumKor, k44_sumKor/(double)k44_ArrayOncRec.size());
		// ���� ���� �հ�, ����� ����Ѵ�.
		System.out.printf("�����հ�  %4d    �������: %6.2f\n",k44_sumEng, k44_sumEng/(double)k44_ArrayOncRec.size());
		// ���� ���� �հ�, ����� ����Ѵ�.
		System.out.printf("�����հ�  %4d    �������: %6.2f\n",k44_sumMat, k44_sumMat/(double)k44_ArrayOncRec.size());
		System.out.println("*************************************");
		// ����� ���� �հ�, ����� ����Ѵ�.
		System.out.printf("������հ� %4d   �����: %6.2f\n",k44_sumAve, k44_sumAve/(double)k44_ArrayOncRec.size());
	}
	
}
