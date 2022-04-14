package _03;

public class ex1 {

	public static void main(String[] args) {
		int K44_ii; 									//자료형이 integer인 변수 k44_ii 생성하기 
		K44_ii = 1+2;									//변수 k44_ii에 1 + 2를 더한 값(3) 을 넣어준다
		System.out.printf("#1-1 : %d\n", K44_ii);		//printf로 콘솔창 출력할 때 %로 공간을 만들고 d(integer형)을 받게 만들어주었다. 해당 공간에 넣을 값을 ","뒤에 입력(k44_ii). 결과는 3.
		
		K44_ii = 1+2*3;									//변수 k44_ii에 새로운 값(1+2*3)을 넣어준다. 이때 사칙연산 순서에 의해 1+3*2 즉, 7이 변수에 저장된다. 
		System.out.printf("#1-1 : %d\n", K44_ii);		//printf로 콘솔창 출력할 때 %로 공간을 만들고 d(integer형)을 받게 만들어주었다. 해당 공간에 넣을 값을 ","뒤에 입력(k44_ii). 결과는 7.

	}

}
