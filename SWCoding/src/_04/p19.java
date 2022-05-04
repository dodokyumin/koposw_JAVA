package _04;

public class p19 {

	public static void main(String[] args) {
		
		for ( int k44_i=1; k44_i<13; k44_i++) {							//1부터 1씩 증가하면서 12까지 도는 지역변수를 받는 for문 작성
			System.out.printf(" %d월 =>",k44_i);						// 1월부터 12월까지를 for문 돌때마다 출력
			
			for( int k44_j=1; k44_j<32 ; k44_j++) {						//1부터 1씩 증가하면서 31까지 도는 지역변수를 받는 for문 작성
				
				System.out.printf("%d ",k44_j);							//일을 출력
				
				if( k44_i==4 || k44_i==6 || k44_i==9 || k44_i==11) {	//조건문을 통해 4 6 7 9 11월은 30일에 for문을 나옴
					if(k44_j==30) break;
				}
				
				if(k44_i==2) {											//조건문을 통해서 2월달은 28일때 for문에서 나옴
					if(k44_j==28) break;
				}
				
			}
			
			System.out.println();										//한달이 끝나면 줄바꿈
		}
		
	}

}
