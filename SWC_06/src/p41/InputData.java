package p41;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InputData {

	public static int[] k44_num, k44_kor, k44_eng, k44_mat, k44_sum; // 번호 성적 이 들어갈 정수형 배열 선언
	public static float[] k44_avg; //평균이 들어갈 실수형 배열 선언
	public static String[] k44_name; // 이름이 들어갈 문자형 배열 선언
	public static int k44_iPerson, k44_iPages, k44_iPageNum; // 전역에서 사용할 변수 선언
	
	public InputData(int k44_iPerson, int k44_iPageNum, int k44_iPages) { //클래스 내에서 사용할 배열 설정
				
		this.k44_iPages = k44_iPages; //페이지당 출력할 인원
		this.k44_iPerson = k44_iPerson;//총 인원
		
		k44_num = new int [k44_iPerson]; //배열 크기 총 인원수로 선언
		k44_kor = new int [k44_iPerson]; 
		k44_eng = new int [k44_iPerson]; 
		k44_mat = new int [k44_iPerson]; 
		k44_sum = new int [k44_iPerson]; 
		k44_avg = new float [k44_iPerson];
		k44_name = new String [k44_iPerson]; 
		
	}
	
	public void printHeader(int k44_iPageNum) { //헤더 부분 인쇄(변수는 페이지번호)
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //출력일자 형식 지정
		String k44_date = sdf.format(new Date());// Date로 현재시간 받아와서 형식에 대입
		System.out.printf("%30s\n","성적집계표");
		System.out.printf("%s%d%26s%10s\n","PAGE:", k44_iPageNum+1, "출력일자: ", k44_date); //page번호는 1부터 라  +1해줘야 맞음
		System.out.printf("========================================================\n");
		System.out.printf("%s%6s%6s%7s%7s%7s%7s\n","번호","이름","국어","영어","수학","총점","평균");
		System.out.printf("========================================================\n");
			
	}
	
	public void SetData (int k44_i, String k44_name, int k44_kor, int k44_eng, int k44_mat ) { // 배열에 집어 넣는 메소드
		
		this.k44_num[k44_i] = k44_i+1; //1번부터 200번까지
		this.k44_name[k44_i] = k44_name;//배열의 첫번째는  0번이므로 
		this.k44_kor[k44_i] = k44_kor; 
		this.k44_eng[k44_i] = k44_eng; 
		this.k44_mat[k44_i] = k44_mat; 
		k44_sum[k44_i] = k44_kor + k44_eng + k44_mat;//각 성적의 합
		k44_avg[k44_i] = k44_sum[k44_i]/3.0f;//각 성적의 평균(실수형으로 출력하기위해 float로 나눔)
		
	}
	
	public void Result(int k44_i,int k44_countAll) { // 결과 출력 메소드 (몇 페이지 인지 와 전체 인원수를 변수로 받음)
		
		int k44_countPage = 0; //페이지내 인원수를 세어 그만큼 저장할 변수 세팅
		int k44_korPageSum = 0; //페이지내 국어점수 합
		int k44_engPageSum = 0; //페이지내 영어점수 합
		int k44_matPageSum = 0; //페이지내 수학점수 합
		int k44_sumPageSum = 0; //페이지내 점수 합
		float k44_avgPageSum = 0;//페이지내 평균 
		int k44_korAccuSum = 0; //누적 국어점수
		int k44_engAccuSum = 0; //누적 영어점수
		int k44_matAccuSum = 0; //누적 수학점수
		int k44_sumAccuSum = 0; //누적 점수 합
		float k44_avgAccuSum = 0; //누적 평균

		for (int k44_j = k44_iPages * k44_i; k44_j < k44_iPages *(k44_i+1); k44_j++) { //0~29 / 30~59 ...

			k44_korPageSum += k44_kor[k44_j]; // 각 학생의 국어점수를 페이지내 국어점수 합에 더함
			k44_engPageSum += k44_eng[k44_j]; // 각 학생의 영어점수를 페이지내 영어점수 합에 더함
			k44_matPageSum += k44_mat[k44_j]; // 각 학생의 수학점수를 페이지내 수학점수 합에 더함
			k44_sumPageSum += k44_sum[k44_j]; // 각 학생의 점수합계를 페이지내 점수 합에 더함
			k44_avgPageSum += k44_avg[k44_j]; // 각 학생의 점수평균을 페이지내 평균 에  더함
			k44_countPage++; //페이지내 학생이 몇명인지 체크
			if (k44_j >= k44_iPerson-1) { //0부터 시작한 j가 199면 200번 돌았다는 뜻 
				break; // 반복 멈춤
			}
			
		}

		for (int k44_k = 0; k44_k < k44_iPages * (k44_i + 1); k44_k++) {

			k44_korAccuSum += k44_kor[k44_k]; // 각 학생의 국어점수를 누적 국어점수 합에 더함
			k44_engAccuSum += k44_eng[k44_k]; // 각 학생의 영어점수를 누적 영어점수 합에 더함
			k44_matAccuSum += k44_mat[k44_k]; // 각 학생의 수학점수를 누적 수학점수 합에 더함
			k44_sumAccuSum += k44_sum[k44_k]; // 각 학생의 점수합계를 누적 점수 합에 더함
			k44_avgAccuSum += k44_avg[k44_k]; // 각 학생의 점수평균을 누적 평균 에  더함
			if (k44_k >= k44_iPerson-1) { //0부터 시작한 k가 199면 200번 돌았다는 뜻
				break; //반복 멈춤
			}

		}
		System.out.printf("========================================================\n");
		System.out.println("현재 페이지");
		System.out.printf("%s%16d%9d%9d%9d%9.2f\n", "합계", k44_korPageSum, k44_engPageSum, k44_matPageSum, k44_sumPageSum, k44_avgPageSum); //현재페이지 합계 
		System.out.printf("%s%16.2f%9.2f%9.2f%9.2f%9.2f\n", "평균", (float)k44_korPageSum / k44_countPage, (float)k44_engPageSum / k44_countPage, //페이지 내 점수 합을 페이지 내 학생수로 나눔
				(float)k44_matPageSum / k44_countPage, (float)k44_sumPageSum / k44_countPage, (float)k44_avgPageSum / k44_countPage); //소수점 표현하기위해 (float)처리함
		System.out.printf("========================================================\n");
		System.out.println("누적 페이지");
		System.out.printf("%s%16d%9d%9d%9d%9.2f\n", "합계", k44_korAccuSum, k44_engAccuSum, k44_matAccuSum, k44_sumAccuSum, k44_avgAccuSum); //누적 페이지 합계
		System.out.printf("%s%16.2f%9.2f%9.2f%9.2f%9.2f\n\n\n", "평균", (float)k44_korAccuSum / k44_countAll, (float)k44_engAccuSum / k44_countAll, // 누적 점수 합을 누적 학생수로 나눔
				(float)k44_matAccuSum / k44_countAll, (float)k44_sumAccuSum / k44_countAll, (float)k44_avgAccuSum / k44_countAll); //소수점 표현하기위해 (float)처리함
		

	}
}
