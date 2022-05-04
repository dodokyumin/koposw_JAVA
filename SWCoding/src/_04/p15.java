package _04;

public class p15 {

	public static void main(String[] args) {

		int k44_iA, k44_iB;					//정수형 자료형 iA와 iB를 선언해준다.

		k44_iA = 0;							//k44_iA = 0으로 설정해주어 매 차례마다 1씩 더하는 카운트로 편히 사용할 수 있게 해준다
		while (true) {						//while문은 괄호 안에

			k44_iB = 0;						//k44_iB = 0으로 설정해주어 매 차례마다 1씩 더하는 카운트로 편히 사용할 수 있게 해준다
			while (true) {					//반복문 속 반복문. iA의 반복 1회마다 그 안의 iB의 전체 반복.
				System.out.printf("*");		//break앞에 "*"를 먼저 찍어주어 1라인에서 iA(0) == iB(0)로 break걸리기 전에 별하나를 찍고 나온다.

				if (k44_iA == k44_iB) {		//만약 k44_iA가 k44_iB와 값이 같다면
					break;					//break로 2번째 while문을 나온다.
				}
				k44_iB++;					//그렇지 않으면 iB에 1을 더해 한번 더 반복한다.
			}

			System.out.printf("\n");		//iA가 다음번 루프 돌기 전 줄바꿈 입력해주기.
			k44_iA++;						//iA에 1을 더해줘서 무한 루프가 되지 않게, 30에 점점 가까워지도록 만들어주기
			if (k44_iA == 30) {				//그래서 iA가 결국 30이 되면
				break;						//break로 제일 바깥 iA의 반복문도 나와 별찍기를 마무리.
			}

		}

	}

}
