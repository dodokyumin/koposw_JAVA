package p11;

public class k44_ReportCard {

	public static int k44_sum;	//메소드를 오버로딩하며 함수를 통해 얻는 값들을 저장할 전역변수를 설정한다.
	public static float k44_avg;	//메소드를 오버로딩하며 함수를 통해 얻는 값들을 저장할 전역변수를 설정한다.
	
	public void k44_printMon (int k44_a, int k44_b, int k44_c) {	//정수형 파라미터 셋을 받는 함수 printMon
		
		k44_sum = k44_a + k44_b + k44_c;	//받은 인자들을 더하여 전역변수에 저장.
		k44_avg = (k44_a + k44_b + k44_c)/3;	//받은 인자들을 더하고 인자 갯수만큼 나눈 평균값을 전역변수에 저장
		
		System.out.printf("%d월 성적표\n", 3);
		System.out.println("==============================================");
		System.out.printf("%-4s%-4s%-4s%-4s%-4s%-4s\n","이름","국어","영어","수학","총점","평균");
		System.out.println("=============================================");
		System.out.printf("%-4s%-4d%-5d%-5d%-5d%-6.1f\n\n","폴리융",k44_a, k44_b, k44_c, k44_sum, k44_avg);

		
	}
	
	public void k44_printMon (int k44_a, int k44_b, int k44_c, int k44_d) {	//정수형 파라미터 넷을 받는 함수 printMon
		
		k44_sum = k44_a + k44_b + k44_c + k44_d;	//받은 인자들을 더하여 전역변수에 저장.
		k44_avg = (k44_a + k44_b + k44_c + k44_d)/4;	//받은 인자들을 더하고 인자 갯수만큼 나눈 평균값을 전역변수에 저장
		
		System.out.printf("%d월 성적표\n", 4);
		System.out.println("==============================================");
		System.out.printf("%-4s%-4s%-4s%-4s%-4s%-4s%-4s\n","이름","국어","영어","수학","과학","총점","평균");
		System.out.println("==============================================");
		System.out.printf("%-4s%-4d%-5d%-5d%-5d%-5d%-6.1f\n\n","폴리융",k44_a, k44_b, k44_c, k44_d, k44_sum, k44_avg);
		
	}
	
	public void k44_printMon (int k44_a, int k44_b, int k44_c, int k44_d, int k44_e) {	//정수형 파라미터 다섯을 받는 함수 printMon
		
		k44_sum = k44_a + k44_b + k44_c + k44_d + k44_e;	//받은 인자들을 더하여 전역변수에 저장.
		k44_avg = (k44_a + k44_b + k44_c + k44_d + k44_e)/5;	//받은 인자들을 더하고 인자 갯수만큼 나눈 평균값을 전역변수에 저장
		
		System.out.printf("%d월 성적표\n", 5);
		System.out.println("==============================================");
		System.out.printf("%-4s%-4s%-4s%-4s%-4s%-4s%-4s%-4s\n","이름","국어","영어","수학","과학","사회","총점","평균");
		System.out.println("==============================================");
		System.out.printf("%-4s%-4d%-5d%-5d%-5d%-5d%-5d%-6.1f\n\n","폴리융",k44_a, k44_b, k44_c, k44_d, k44_e, k44_sum, k44_avg);
		
	}	
	
}