package _04;

public class p27 {

	public static void main(String[] args) {
		
		int K44_n,K44_m;								//정수형 변수 2개 선언
					
		K44_m=20; K44_n=1;								//선언한 정수형 변수에 20과 1을 각각 입력
		
		while(true) {									//while true를 통해 무한루프 선언

			for(int K44_i=0; K44_i<K44_m; K44_i++)		//20개의 공백을 출력, while문을 돌때마다 1개씩 줄어들 예정	20 19 18
				System.out.printf(" ");
			for(int K44_i=0; K44_i<K44_n; K44_i++)		//1개의 별 출력, while문 돌때마다 2개씩 늘어날 예정 1 3 5 ...
				System.out.printf("*");
			System.out.println();
			
			K44_m=K44_m-1;								//빈 칸을 1개씩 줄인다.
			K44_n=K44_n+2;								//별을 2개씩 늘린다
			
			if (K44_m<0) break;							//빈칸이 0보다 작아지면 while문 탈출
		}

	}

}
