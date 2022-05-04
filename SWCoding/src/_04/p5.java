package _04;

public class p5 {

	public static void main(String[] args) {
		String jumin = "12345-1234567";							//주민번호 값을 String 변수에 저장한다.
		
		switch(jumin.charAt(6)) {								//()안의 값 주민번호 String의 6번째(0부터 시작) 값에 대해서 각각의 case들과 해당 실행문들을 설정해주는 switch문
		case '1' :												//jumin.charAt(6)의 값이 '1'일 경우 즉 주민번호 뒷자리 첫번째가 1일 때 다음 라인을 실행
			System.out.printf("20세기전 태어난 남자 사람\n");	//주민번호 뒷자리가 1이면 20세기 전에 태어난 남자다.
			break;												//switch case 문의 특징으로, 만약 break가 없으면 빠져나오지 않고 이어서 다음 케이스가 실행된다.
		case '2' :												//jumin.charAt(6)의 값이 '2'일 경우 즉 주민번호 뒷자리 첫번째가 2일 때 다음 라인을 실행
			System.out.printf("20세기전 태어난 여자 사람\n");	
			break;
		case '3' :												//jumin.charAt(6)의 값이 '3'일 경우 즉 주민번호 뒷자리 첫번째가 3일 때 다음 라인을 실행
			System.out.printf("20세기후 태어난 남자 사람\n");	
			break;
		case '4' :												//jumin.charAt(6)의 값이 '4'일 경우 즉 주민번호 뒷자리 첫번째가 4일 때 다음 라인을 실행
			System.out.printf("20세기후 태어난 여자 사람\n");	
			break;
		default :												//switch case의 default는 if문의 else와 같은 예외 처리문
			System.out.printf("사람\n");	
			break;
		}

	}

}
