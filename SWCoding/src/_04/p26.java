package _04;

public class p26 {
//sin 메소드 안에는 라디안 단위로 들어간다.
	public static void main(String[] args) {
		double k44_fSin;													//실수형(double) 변수 선언
		
		for(int k44_i=0; k44_i<360; k44_i++) {								//0부터 1씩 증가하면서 360전까지 도는 지역변수 k를 가지는 for문 작성
			
			k44_fSin = Math.sin(k44_i * Math.PI/180);						//Math.sin() 괄호 안에 해당 각도의 라디안 값을 넣어준다. 괄호 안에 식은 라디안으로 변환 식
			
			System.out.printf("%d sin ==> %f\n", k44_i, k44_fSin);			//각도(정수)와 Math.sin(정수의 라디안 값)을 넣은 결과 출력

		}
		
		
		for(int k44_i=0; k44_i<360; k44_i++) {								//0부터 1씩 증가하며 360전까지 도는 for문 작성
			
			k44_fSin=Math.sin( k44_i * Math.PI/180); 						//사인값은 -1~1. Math.sin() 괄호 안에 해당 각도의 라디안 값을 넣어준다. 괄호 안에 식은 라디안으로 변환 식
			
			int k44_iSpace = (int)((1.0 - k44_fSin)*50); 					//0~2, 50을 곱해서 0~100까지 .(1.0 - fSin)는 sin값에 따라 0부터 2까지를 왔다갔다한다. 50을 곱해서 0부터 100까지의 빈칸을 생성할 예정
			
			for(int k44_j=0; k44_j < k44_iSpace; k44_j++)					//iSpace 값에 따라 빈 칸 생성 0개에서 100개 생성
				System.out.printf(" ");
			
			System.out.printf("*[%f][%d]\n", k44_fSin, k44_iSpace);			// 빈칸 이후, fSin의 sin 값과 iSpace의 빈칸 수가 출력된다.
		}

	}

}
