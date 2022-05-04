package _04;

public class p16 {

	public static void main(String[] args) {

		int k44_il;																//정수형 변수 il선언
		double k44_iD;															//실수형 변수 iD선언

		k44_il = 10 / 3;														//il은 정수형이기 때문에 10/3의 값 3.333..에서 소수점은 버리고 3만 il에 저장된다.
		k44_iD = 10 / 3.0;														//iD는 실수형이기 때문에 10/3.0 double범위 내의 값 3.333..이 모두 저장된다.

		if (k44_il == k44_iD)													//만약 il과 iD가 같다면 (3 == 3.33..은 false이기 때문에 else가 실행된다.)
			System.out.printf("equal \n");										//출력
		else																	//그렇지 않다면
			System.out.printf("Not equal [%f][%f]\n", (double) k44_il, k44_iD);	//이때 il을 타입캐스팅 (double)il 해주어 int 3이 double 3.000000으로 되어 출력된다.

		if (k44_iD == 3.333333)													//iD가 3.333333이면 아래 실행문 실행 (true)
			System.out.printf("equal \n");
		else																	//iD가 3.333333이 아니면
			System.out.printf("Not equal [3.333333] [%f]\n", k44_iD);			

		k44_iD = (int) k44_iD;													//iD(3.333333)을 정수형으로 타입 캐스팅해주어 소수자리들을 버렸다. => 3

		if (k44_il == k44_iD)													//만약 il == iD가 같으면, (3 == 3 은 true이다)
			System.out.printf("equal \n");								
		else
			System.out.printf("Not equal [%f][%f]\n", (double) k44_il, k44_iD);

		System.out.printf("int로 인쇄 [%d] [%f] \n", k44_il, k44_iD);			//printf함수에서 %로 공간을 만들고 받는 il을 d(정수형)으로 하면 3출력.iD를 f(실수형)으로 하면 3.000000출력
		System.out.printf("double로 인쇄 [%f][%f]\n", (double) k44_il, k44_iD);	//기존 il은 정수 3, 실수형으로 타입캐스팅(double)하여 3.000000으로 출력.

		char k44_a = 'c';														//캐릭터형 변수 a에 캐릭터 'c'를 담아준다.
		if (k44_a == 'b')														//캐릭터변수 a는 'c' 이므로 'b'가 아니다. 이 if는 false이다.
			System.out.printf("k44_a는 b이다\n");
		if (k44_a == 'c')														//캐릭터변수 a는 'c' 이므로 'c'다. 이 if는 true이다.
			System.out.printf("k44_a는 c이다\n");
		if (k44_a == 'd')														//캐릭터변수 a는 'c' 이므로 'd'가 아니다. 이 if는 false이다.				
			System.out.printf("k44_a는 d이다\n");

		String k44_aa = "abcd";													//문자열형 변수 aa에 문자열 "abcd"를 담아준다.

		if (k44_aa.equals("abcd"))												//문자열끼리의 비교는 ==로는 불가능!!! .equals()메소드를 이용하여 비교한다. aa는 "abcd"에 epual이다. =true
			System.out.printf("k44_aa는 abcd이다\n");							//true이기 때문에 이 실행문 실행되고 if문 탈출
		else
			System.out.printf("k44_aa는 abcd가 아니다\n");

		boolean k44_bb = true;													//불리언형 변수는 true와 false 이 두가지 값만 가질 수 있다. 변수 bb에 불리언 true를 넣어준다.

		if (!!k44_bb)															//!!는 not not. 결국 bb의 값 그대로. bb는 true이기 때문에 아래 실행문 실행.
			System.out.printf("k44_bb가 아니고 아니면 참이다\n");
		else
			System.out.printf("k44_bb가 아니고 아니면 거짓이다\n");
	}

}
