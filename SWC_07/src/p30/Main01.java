package p30;

import java.util.ArrayList;

public class Main01 {
	
	static ArrayList<k44_OneRec> k44_ArrayOneRec = new ArrayList <k44_OneRec>();
	static int k44_sumkor = 0; //���� ������ ���������� �����ϰ� �ʱ�ȭ
	static int k44_sumeng = 0; //���� ������ ���������� �����ϰ� �ʱ�ȭ
	static int k44_summat = 0; //���� ������ ���������� �����ϰ� �ʱ�ȭ
	static int k44_sumsum = 0; //���� �հ踦 ���������� �����ϰ� �ʱ�ȭ
	static int k44_sumave = 0; //���� ����� ���������� �����ϰ� �ʱ�ȭ
	static final int k44_iPerson = 20; //�л� �� ����. ����� ����� ������ �ʰԲ� ����
	
	public static void k44_dataSet() {//�л����� ������ ������ ���� �����ϴ� �Լ�
		
		for(int k44_i=0; k44_i<k44_iPerson; k44_i++) {
			String k44_name = String.format("ȫ��%02d", k44_i);	//�̸������
			int k44_kor = (int)(Math.random()*100);	//�������� �����
			int k44_eng = (int)(Math.random()*100);	//�������� �����
			int k44_mat = (int)(Math.random()*100);	//�������� �����
			k44_ArrayOneRec.add(new k44_OneRec(k44_i, k44_name, k44_kor, k44_eng, k44_mat));	//�ϳ���  OneRecŬ������ ������ ArrayList�� ����־���.
		}
		
	}
	
	//��� �μ�
	public static void k44_HeaderPrint() { //�ٱ߱� �Լ�
		System.out.println("****************************************");
		System.out.printf("%2s %4s %2s %2s %2s %2s   %2s\n","��ȣ","�̸�","����","����","����","�հ�","���");
		System.out.println("****************************************");
	}
	
	//���� �μ�
	public static void k44_ItemPrint(int k44_i) {//������ ���ڸ� �ް� �׸�ŭ ArrayOneRec�� get�Լ��� ����,
		k44_OneRec k44_rec; //Ŭ���� ����
		
		k44_rec = k44_ArrayOneRec.get(k44_i);
		System.out.printf("%4d %4s %3d %3d %3d    %3d   %6.2f\n", k44_rec.k44_student_id(), k44_rec.k44_name(), k44_rec.k44_kor(), k44_rec.k44_eng(), k44_rec.k44_mat(),
				k44_rec.k44_sum(),k44_rec.k44_ave()); //���˿� �°� ����ϱ�.
		
		k44_sumkor+=k44_rec.k44_kor();//�� ������ �հ������� �����ϱ�.
		k44_sumeng+=k44_rec.k44_eng();
		k44_summat+=k44_rec.k44_mat();
		k44_sumsum+=k44_rec.k44_sum();
		k44_sumave+=k44_rec.k44_ave();
	}
		
	//���� �μ�
	public static void k44_TailPrint() {//����� ��� ������� �� ���� �հ� ������ ���� ���̴�.
		System.out.println("****************************************");
		System.out.printf("�����հ� %d   �������: %6.2f\n",k44_sumkor ,k44_sumkor/(double)k44_ArrayOneRec.size());
		System.out.printf("�����հ� %d   �������: %6.2f\n",k44_sumeng ,k44_sumeng/(double)k44_ArrayOneRec.size());
		System.out.printf("�����հ� %d   �������: %6.2f\n",k44_summat ,k44_summat/(double)k44_ArrayOneRec.size());
		System.out.println("****************************************");
		System.out.printf("������հ� %d   �����: %6.2f\n",k44_sumave ,k44_sumave/(double)k44_ArrayOneRec.size());
	}

}
