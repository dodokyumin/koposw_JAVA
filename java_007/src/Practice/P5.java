package Practice;

import java.util.Arrays;

public class P5 {

	public static void main(String[] args) {
		
		int[][] scoresArr = {{70, 80, 100},{60, 70, 86},{54, 100, 82},{87,95,79}};
		int scores = 0;
		String subject;
		
		for (int i = 0; i < scoresArr.length; i++) {
			for (int j = 0; j < scoresArr[i].length; j++) {
				System.out.print(scoresArr[i][j] + "  ");
			}
			System.out.println();
		}
		
		int i=0;
		int j=0;
		for (i = 0; i < scoresArr.length; i++) {
			scores += scoresArr[i][j];
		}
		System.out.println("�л����� " + "����" + " ��� : " + scores/scoresArr.length);
		
		
		j=1;
		scores = 0;
		for (i = 0; i < scoresArr.length; i++) {
			scores += scoresArr[i][j];
		}
		System.out.println("�л����� " + "����" + " ��� : " + scores/scoresArr.length);
		
		j=2;
		scores = 0;
		for (i = 0; i < scoresArr.length; i++) {
			scores += scoresArr[i][j];
		}
		System.out.println("�л����� " + "����" + " ��� : " + scores/scoresArr.length);
		
		// ���� ����
		i = 0;
		int min = 0, max = 0;
		scores = 0;
		for (j = 0; j < scoresArr[i].length; j++) {				
				scores += scoresArr[i][j];
			}
		Arrays.sort(scoresArr[i]);
		min = scoresArr[i][0];
		max = scoresArr[i][scoresArr[i].length-1];
			
		System.out.println("Jeong�� ���� ��� : " + scores/scoresArr[i].length);
		System.out.println("Jeong�� ���� ���� ���� ���� : " + min);
		System.out.println("Jeong�� ���� ���� ���� ���� : " + max);
		
		// ǥ ����
		i = 1;
		min = 0;
		max = 0;
		scores = 0;
		for (j = 0; j < scoresArr[i].length; j++) {				
				scores += scoresArr[i][j];
			}
		Arrays.sort(scoresArr[i]);
		min = scoresArr[i][0];
		max = scoresArr[i][scoresArr[i].length-1];
			
		System.out.println("Pyo ���� ��� : " + scores/scoresArr[i].length);
		System.out.println("Pyo�� ���� ���� ���� ���� : " + min);
		System.out.println("Pyo�� ���� ���� ���� ���� : " + max);
		
		// ���� ����
		i = 2;
		min = 0;
		max = 0;
		scores = 0;
		for (j = 0; j < scoresArr[i].length; j++) {				
				scores += scoresArr[i][j];
			}
		Arrays.sort(scoresArr[i]);
		min = scoresArr[i][0];
		max = scoresArr[i][scoresArr[i].length-1];
			
		System.out.println("Choi�� ���� ��� : " + scores/scoresArr[i].length);
		System.out.println("Choi�� ���� ���� ���� ���� : " + min);
		System.out.println("Choi�� ���� ���� ���� ���� : " + max);
		
		// ����ũ�� ����
		i = 3;
		min = 0;
		max = 0;
		scores = 0;
		for (j = 0; j < scoresArr[i].length; j++) {				
				scores += scoresArr[i][j];
			}
		Arrays.sort(scoresArr[i]);
		min = scoresArr[i][0];
		max = scoresArr[i][scoresArr[i].length-1];
			
		System.out.println("Mike�� ���� ��� : " + scores/scoresArr[i].length);
		System.out.println("Mike�� ���� ���� ���� ���� : " + min);
		System.out.println("Mike�� ���� ���� ���� ���� : " + max);
		
		
	}

}
