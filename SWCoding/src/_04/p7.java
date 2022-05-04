package _04;

public class p7 {

	public static void main(String[] args) {
		int k44_sum = 0;															//자료형이 정수형인 변수 k44_sum을 선언 및 값 설정.
		for (int k44_i = 0; k44_i < 10; k44_i++) {									//1~9까지의 합을 구하는 반복문. 변수 k44_i는 1에서 9까지 총 9번 루프를 돈다.
			k44_sum = k44_sum + k44_i;												//loop 한번 전의 sum 값에 i를 더한 값을 총합 sum에 저장, 누적.
		}
		System.out.printf("k44_sum %d\n", k44_sum);									//printf로 콘솔창 출력할 때 %로 공간을 만들고 d(integer형)을 받게 만들어주었다. 해당 공간에 넣을 값을 ","뒤에 입력(k44_sum). 결과는 45

		for (int k44_i = 1; k44_i < 10; k44_i++) {									//구구단의 앞자리. 1단부터 9단까지 총 9번의 루프를 돌아야하기 때문에 1<10의 조건문에 변동값i++을 넣었다.
			System.out.printf("****************\n");							
			System.out.printf("  구구단 %d 단 \n", k44_i);							//총 1단부터 9단까지 1부터 +1씩 더해져간다.
			System.out.printf("****************\n");
			
			for (int k44_j = 1; k44_j < 10; k44_j++) {								//구구단의 뒷자리. 9번의 1~9를 반복하는 정수를 만들기 위해 루프 안에 루프를 만들어 총 9*9 81번의 루프를 돈다.
				
				System.out.printf(" %d * %d = %d \n", k44_i, k44_j, k44_i * k44_j);	//올라가는 변수의 값들을 그때그때마다 구구단 포맷에 맞게 출력해주기
			}

		}

	}
}