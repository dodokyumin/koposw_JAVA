package _03;

public class ex3 {

	public static void main(String[] args) {

		int K44_ii = 1000 / 3;							//자료형이 integer인 변수 k44_ii를 생성하면서 1000 / 3의 결과값을 저장한다. 연산자는 "/" 앞의 값을 뒤의 값으로 나눈 몫이다.
		System.out.printf("#3-1 : %d\n", K44_ii);		//printf로 콘솔창 출력할 때 %로 공간을 만들고 d(integer형)을 받게 만들어주었다. 해당 공간에 넣을 값을 ","뒤에 입력(k44_ii)

		K44_ii = 1000 % 3;								//기존 변수 k44_ii 에 1000 % 3의 결과값을 저장(초기화)한다. 연산자는 "%" 앞의 값을 뒤의 값으로 나눈 나머지이다.
		System.out.printf("#3-2 : %d\n", K44_ii);		//결과값은 1이다.

		for (int K44_i = 0; K44_i < 20; K44_i++) {		//for문을 돌리는 범위를 설정. 변수 k44_i를 1로 초기설정, 한번 iteration이 돌 때마다 ++ 해주어 1씩 더함, k44_i < 20 조건이 false가 될 때까지 iteration한다. 총 19번 돈다.
			System.out.printf("#3-3 : %d", K44_i);  	//0,1,2..~19 까지 한번씩 출력된다.

			if (((K44_i + 1) % 5) == 0) {				//만약 (k44_i + 1)의 값을 5로 나눈 나머지가 0일 때, 밑의 실행문을 실행한다.
				System.out.printf("\n");				//"\n"은 이스케이프시퀀스의 줄바꿈이다.
			}
		}

	}

}








