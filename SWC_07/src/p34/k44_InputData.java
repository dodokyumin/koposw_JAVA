package p34;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class k44_InputData {

	public static int[] k44_i, k44_kor, k44_eng, k44_mat, k44_sum;	//static을 통해 같은 클래스에 있는 함수들도 같이 사용할 수 있는 전역변수를 설정했다.
	public static int[] k44_ave;	//평균값을 저장하는 배열 변수
	public static String[] k44_name;	//이름을 저장하는 배열 변수
	public static int k44_iPerson;
	
	public k44_InputData(int k44_iPerson) {	//해당 메소드는 정수형 파라미터를 받아 각 항목당 배열 순서에 맞는 자료들을 꺼내준다.
		
		String k44_pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat k44_simpleDateFormat = new SimpleDateFormat(k44_pattern);
		String k44_date = k44_simpleDateFormat.format(new Date());		
		
		this.k44_iPerson = k44_iPerson;
		k44_i = new int [k44_iPerson];
		k44_kor = new int [k44_iPerson];
		k44_eng = new int [k44_iPerson];
		k44_mat = new int [k44_iPerson];
		k44_sum = new int [k44_iPerson];
		k44_ave = new int [k44_iPerson];
		k44_name = new String [k44_iPerson];
		
		System.out.printf("%30s\n","성적집계표");	//가독성을 위해 출력 포맷 세팅하기
		System.out.printf("%33s%10s\n","출력 일자: ", k44_date);
		System.out.printf("========================================================\n");
		System.out.printf("%s%5s%7s%7s%7s%7s%7s\n","번호","이름","국어","영어","수학","총점","평균");
		System.out.printf("========================================================\n");
		
		
	}
	
	public void k44_SetData (int k44_i, String k44_name, int k44_kor, int k44_eng, int k44_mat ) {
		//파라미터로 받은 값들을 현재 이 클래스의 전역변수 배열에(this.)하나씩 순서대로 저장한다
		
		this.k44_i[k44_i] = k44_i;	//현재 클래스 내의 전역변수를 지칭하는 this로 파라미터로 받은 값들을 전역변수에 저장한다.
		this.k44_name[k44_i] = k44_name;
		this.k44_kor[k44_i] = k44_kor;
		this.k44_eng[k44_i] = k44_eng;
		this.k44_mat[k44_i] = k44_mat;
		this.k44_sum[k44_i] = k44_kor + k44_eng + k44_mat;
		this.k44_ave[k44_i] = k44_sum[k44_i]/3;
		
	}
	
	public void k44_Conclude () {	//Arrays.stream().sum()을 통해 배열에 저장된 데이터 합계 sum 및 평균값 average 구하기
		int k44_korSum = Arrays.stream(k44_kor).sum();
		int k44_engSum = Arrays.stream(k44_eng).sum();
		int k44_matSum = Arrays.stream(k44_mat).sum();
		int k44_sumSum = Arrays.stream(k44_sum).sum();
		int k44_aveSum = Arrays.stream(k44_ave).sum();
		
		System.out.printf("========================================================\n");
		System.out.printf("%s%16d%9d%9d%9d%9d\n","합계" ,k44_korSum ,k44_engSum ,k44_matSum, k44_sumSum, k44_aveSum);
		System.out.printf("%s%16d%9d%9d%9d%9d\n","평균" ,k44_korSum/k44_iPerson ,k44_engSum/k44_iPerson ,k44_matSum/k44_iPerson, k44_sumSum/k44_iPerson, k44_aveSum/k44_iPerson);
		
	}
}