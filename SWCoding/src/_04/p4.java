package _04;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		Scanner k44_sc = new Scanner(System.in);			//Scanner클래스의 System.in을 파라미터로 받는 새로운 인스턴스 k44_sc를 지정해준다!
		System.out.printf("제 점수는요?");					//유저에게 점수 인풋 안내멘트 출력하기
		int k44_score = k44_sc.nextInt();					//integer자료형의 변수 k44_score에 인스턴스 k44_sc의 nextInt메소드 값을 넣어준다!

		if (k44_score > 60) {								//k44_score가 60점 이상이라면 아래 실행문을 실행
			System.out.println("합격입니다.");				//그에게 주어지는 합격 목걸이
		} else {											//else를 통해 if문의 예외를 처리할 수 있다. if에 걸러지지 않으면 밑의 실행문 실행
			System.out.println("불합격입니다.");			//즉, 60점과 같거나 보다 낮으면 불합격 출력
		}			
															
		if (k44_score >= 90) {								//k44_score값이 90과 같거나 크면 
			System.out.println("A등급");					//A등급이 출력된다.
		} else if (k44_score >= 80 && k44_score < 90) {		// 80 <= k44_score < 90 이면,
			System.out.println("B등급");
		} else if (k44_score >= 70 && k44_score < 80) {		// 70 <= k44_score < 80 이면,
			System.out.println("C등급");
		} else if (k44_score >= 60 && k44_score < 70) {		// 60 <= k44_score < 70 이면,
			System.out.println("D등급");
		} else {											// 예외처리 즉, k44_score < 60 이면 실행됨
			System.out.println("F등급");
		}

		System.out.printf("\n제 숫자는요?");				//유저에게 숫자 인풋 안내멘트 출력하기
		int k44_num = k44_sc.nextInt();						//integer자료형의 변수 k44_num에 인스턴스 k44_sc의 nextInt메소드 값을 넣어준다!
		k44_sc.close();										//scanner 클래스를 사용완료 했으면 닫아주어 메모리 낭비 방지
		
		if (k44_num > 0) {									//k44_num 이 0보다 크다면,
			System.out.println("양수입니다.");
		} else if (k44_num < 0) {							//k44_num 이 0보다 크지는 않은데 또 0보다 작다면,
			System.out.println("음수입니다.");
		} else {											//나머지 예외처리 즉, k44_num 가 0이라면.
			System.out.println("영입니다.");				
		}

	}

}
