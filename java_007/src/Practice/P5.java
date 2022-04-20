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
		System.out.println("학생들의 " + "국어" + " 평균 : " + scores/scoresArr.length);
		
		
		j=1;
		scores = 0;
		for (i = 0; i < scoresArr.length; i++) {
			scores += scoresArr[i][j];
		}
		System.out.println("학생들의 " + "영어" + " 평균 : " + scores/scoresArr.length);
		
		j=2;
		scores = 0;
		for (i = 0; i < scoresArr.length; i++) {
			scores += scoresArr[i][j];
		}
		System.out.println("학생들의 " + "수학" + " 평균 : " + scores/scoresArr.length);
		
		// 정이 점수
		i = 0;
		int min = 0, max = 0;
		scores = 0;
		for (j = 0; j < scoresArr[i].length; j++) {				
				scores += scoresArr[i][j];
			}
		Arrays.sort(scoresArr[i]);
		min = scoresArr[i][0];
		max = scoresArr[i][scoresArr[i].length-1];
			
		System.out.println("Jeong의 점수 평균 : " + scores/scoresArr[i].length);
		System.out.println("Jeong의 제일 낮은 과목 점수 : " + min);
		System.out.println("Jeong의 제일 높은 과목 점수 : " + max);
		
		// 표 점수
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
			
		System.out.println("Pyo 점수 평균 : " + scores/scoresArr[i].length);
		System.out.println("Pyo의 제일 낮은 과목 점수 : " + min);
		System.out.println("Pyo의 제일 높은 과목 점수 : " + max);
		
		// 최의 점수
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
			
		System.out.println("Choi의 점수 평균 : " + scores/scoresArr[i].length);
		System.out.println("Choi의 제일 낮은 과목 점수 : " + min);
		System.out.println("Choi의 제일 높은 과목 점수 : " + max);
		
		// 마이크의 점수
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
			
		System.out.println("Mike의 점수 평균 : " + scores/scoresArr[i].length);
		System.out.println("Mike의 제일 낮은 과목 점수 : " + min);
		System.out.println("Mike의 제일 높은 과목 점수 : " + max);
		
		
	}

}
