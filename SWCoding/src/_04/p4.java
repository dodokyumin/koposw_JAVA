package _04;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		Scanner k44_sc = new Scanner(System.in);			//ScannerŬ������ System.in�� �Ķ���ͷ� �޴� ���ο� �ν��Ͻ� k44_sc�� �������ش�!
		System.out.printf("�� �����¿�?");					//�������� ���� ��ǲ �ȳ���Ʈ ����ϱ�
		int k44_score = k44_sc.nextInt();					//integer�ڷ����� ���� k44_score�� �ν��Ͻ� k44_sc�� nextInt�޼ҵ� ���� �־��ش�!

		if (k44_score > 60) {								//k44_score�� 60�� �̻��̶�� �Ʒ� ���๮�� ����
			System.out.println("�հ��Դϴ�.");				//�׿��� �־����� �հ� �����
		} else {											//else�� ���� if���� ���ܸ� ó���� �� �ִ�. if�� �ɷ����� ������ ���� ���๮ ����
			System.out.println("���հ��Դϴ�.");			//��, 60���� ���ų� ���� ������ ���հ� ���
		}			
															
		if (k44_score >= 90) {								//k44_score���� 90�� ���ų� ũ�� 
			System.out.println("A���");					//A����� ��µȴ�.
		} else if (k44_score >= 80 && k44_score < 90) {		// 80 <= k44_score < 90 �̸�,
			System.out.println("B���");
		} else if (k44_score >= 70 && k44_score < 80) {		// 70 <= k44_score < 80 �̸�,
			System.out.println("C���");
		} else if (k44_score >= 60 && k44_score < 70) {		// 60 <= k44_score < 70 �̸�,
			System.out.println("D���");
		} else {											// ����ó�� ��, k44_score < 60 �̸� �����
			System.out.println("F���");
		}

		System.out.printf("\n�� ���ڴ¿�?");				//�������� ���� ��ǲ �ȳ���Ʈ ����ϱ�
		int k44_num = k44_sc.nextInt();						//integer�ڷ����� ���� k44_num�� �ν��Ͻ� k44_sc�� nextInt�޼ҵ� ���� �־��ش�!
		k44_sc.close();										//scanner Ŭ������ ���Ϸ� ������ �ݾ��־� �޸� ���� ����
		
		if (k44_num > 0) {									//k44_num �� 0���� ũ�ٸ�,
			System.out.println("����Դϴ�.");
		} else if (k44_num < 0) {							//k44_num �� 0���� ũ���� ������ �� 0���� �۴ٸ�,
			System.out.println("�����Դϴ�.");
		} else {											//������ ����ó�� ��, k44_num �� 0�̶��.
			System.out.println("���Դϴ�.");				
		}

	}

}
