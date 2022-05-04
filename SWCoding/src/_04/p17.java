package _04;

public class p17 {

	public static void main(String[] args) {
		
		int k44_iVal;																			//5의 배수를 넣어줄 정수형 변수 선언
		
		for (int k44_i = 0; k44_i < 300; k44_i++) {												//0부터 299까지 도는 for문 작성
			k44_iVal = 5 * k44_i;																//iVal 값에 for문을 도는 지역변수의 5배 값을 넣어준다.
			
			if(k44_iVal >= 0 && k44_iVal < 10) System.out.printf("일 %d\n", k44_iVal);			// 조건문을 이용해 iVal이 0 ~ 9가 들어오면 일의 자리 출력
			
			else if(k44_iVal >= 10 && k44_iVal < 100) System.out.printf("십 %d\n", k44_iVal);	// 조건문을 이용해 iVal이 10 ~ 99가 들어오면 십의 자리 출력
			
			else if(k44_iVal >= 100 && k44_iVal < 1000) System.out.printf("백 %d\n", k44_iVal);	// 조건문을 이용해 iVal이 100 ~ 999가 들어오면 백의 자리 출력
			
			else System.out.printf("천 %d\n",k44_iVal);											//1000값 이상 혹은 음수값은 천이라고 메세지 출력
		}

	}

}
