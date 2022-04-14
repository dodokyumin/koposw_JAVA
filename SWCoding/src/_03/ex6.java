package _03;

public class ex6 {	
	
	private static int k44_taxcal(int k44_val, int k44_rate)  {					//정수형 메소드 k44_taxcal을 만들어주고 인자로 int형 변수 k44_val과 k44_rate를 받아주게 설정한다.
		int k44_ret;															//변수 k44_ret을 생성하였다. 
		
		if(((double)k44_val*(double)k44_rate/100) == k44_val*k44_rate/100)		//세후 계산을 했을 때 최종 요금에 소수점이 없다면 아래 실행문을 실행
			k44_ret = k44_val * k44_rate/100;									//k44_ret에 k44_val(요금)과 k44_rate(세)의 곱을 100으로 나눈 값을 저장한다.
		else																	//세후 계산을 했을 때 최종 요금에 소수점이 있다면 아래 실행문을 실행
			k44_ret = k44_val * k44_rate/100 + 1;								//소수점 자리의 돈은 존재하지 않으므로 +1 올림을 하여 값을 더 받는다.

		return k44_ret;															//실행문을 통해서 저장한 k44_ret의 값을 리턴한다.
	}


	public static void main(String[] args) {
		
		int k44_val = 271; 														//세전 물건 값
		int k44_rate = 3; 														//세금 3퍼센트

		int k44_tax = k44_taxcal(k44_val,k44_rate);								//세전 물건 값과 세금을 k44_taxcal의 함수 인자로 넣어 함수를 돌린다.
		
		System.out.printf("************************************\n");
		System.out.printf("*	단순 세금 계산	*\n");
		System.out.printf("실제 세금계산: %f\n", k44_val*k44_rate/100.0);		//하나라도 double형식 연산을 하면 실수로 표시
		
		System.out.printf("세전가격 : %d 세금:%d 세포함가격: %d\n", k44_val, k44_tax, k44_val + k44_tax);

		System.out.printf("************************************\n");
	}	
}
