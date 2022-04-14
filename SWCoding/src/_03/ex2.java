package _03;

public class ex2 {

	public static void main(String[] args) {

		int K44_sum;										//자료형이 integer인 변수 k44_ii 생성하기

		K44_sum = 0;										//변수 k44_ii의 값을 0으로 설정해준다. 이후 "="로 값을 초기화하여 넣어줄 것이기 때문에 기본적으로 값이 이미 존재해야한다.

		for (int K44_i = 1; K44_i < 101; K44_i++) {			//for문을 돌리는 범위를 설정하기. 변수 k44_i를 1로 초기설정, 한번 iteration이 돌 때마다 ++ 해주어 1씩 더함, k44_i < 101 조건이 false가 될 때까지 iteration한다. 
			K44_sum = K44_sum + K44_i;						//k44_sum의 값은 기존 k44_sum에 k44_i를 더한값이 된다.
		}

		System.out.printf("#2 : %d\n", K44_sum);			//printf로 콘솔창 출력할 때 %로 공간을 만들고 d(integer형)을 받게 만들어주었다. 해당 공간에 넣을 값을 ","뒤에 입력(k44_sum). 결과는 5050

		System.out.printf("#2-2 : %d\n", K44_sum / 100);	//printf로 콘솔창 출력할 때 %로 공간을 만들고 d(integer형)을 받게 만들어주었다. 해당 공간에 k44_ii / 100의 결과값을 넣어준다. 결과는 50

		int[] K44_v = { 1, 2, 3, 4, 5 };					//자료형이 integer인 k44_v 배열을 생성한다. 이 배열의 내용은 { 1, 2, 3, 4, 5 } 가 된다.
		int K44_vSum;										//자료형이 integer인 변수 k44_ii 생성하기

		K44_vSum = 0;										//변수 k44_ii의 값을 0으로 설정해준다. 이후 "="로 값을 초기화하여 넣어줄 것이기 때문에 기본적으로 값이 이미 존재해야한다.

		for (int K44_i = 0; K44_i < 5; K44_i++) {			//for문을 돌리는 범위를 설정하기. 이때 k44_i변수는 왜 중복오류가 안뜰까? 왜냐하면 for문 안에서의 변수명은 for문 안에서만 적용되기 때문에 위 k44_i 변수와는 무관. 총 5번 돈다.
			K44_vSum = K44_vSum + K44_v[K44_i];				//k44_vsum의 값은 기존 k44_vsum에 행렬 k44_v의 k44_i 번째 값을 더해준다.
		}

		System.out.printf("#2-3 : %d\n", K44_vSum);			//printf로 콘솔창 출력할 때 %로 공간을 만들고 d(integer형)을 받게 만들어주었다. 해당 공간에 k44_vSum 의 값을 넣어준다. 결과는 15.
	}

}
