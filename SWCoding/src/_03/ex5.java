package _03;

public class ex5 {

	public static void main(String[] args) {
		// 05. 소수점 이하에서는 어떻게 할까?
		int k44_MyVal = 14 / 5; 						//이값은 2.8 이다. 소수점 이하 버리면 2, 반올림하면 3이다. k44_MyVal은 정수형이기 때문에 값이 2가 된다.
		
		System.out.printf("#5-1 : %d\n", k44_MyVal);	//k44_MyVal은 정수형이기 때문에 출력시에 2.8이 아닌 2가 뜬다.
		
		double k44_MyValF;								//자료형이 소수형인 변수 k44_MyValF 생성. 
		
		k44_MyValF = 14 / 5;							//14 / 5 = 2.8, 이때 소수형인 변수 k44_MyValF 에 소수점 .8까지 저장된다.
		System.out.printf("#5-2 : %f\n", k44_MyValF);	//k44_MyVal은 소수형이기 때문에 출력시에 2.8이 출력될 줄 알았지만, 땡!! 소수형 연산이 되엇을 줄 알았지?
		
		
		k44_MyValF = 14.0 / 5;							//한개라도 실수형태의 표시를 해야 결과과 실수가 나온다. 14를 14.0(소수형으로 바꾼다)
		System.out.printf("#5-3 : %f\n", k44_MyValF);	//이제야 소수형 2.800000이 뜬다.
		
		k44_MyValF = (14.0) / 5 + 0.5; 					//실수형 계산에서 0.5를 더해보자
		System.out.printf("#5-4 : %f\n", k44_MyValF);	//2.800000에 0.5를 더한 값 3.300000이 된다.
		
		k44_MyVal = (int) ((14.0) / 5 + 0.5); 			//실수형 계산을 하고 정수형 형변환을 하자. 그러면 소숫점 이하는 모두 버림 처리가 된다.
		System.out.printf("#5-5 : %d\n", k44_MyVal);	//3.300000을 int형으로 바꿔줬기 때문에 정수자리 3만 출력이 된다.
	}

}
