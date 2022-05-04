package _04;

public class p20 {

	public static void main(String[] args) {
		
		for (int k44_i=1; k44_i<13; k44_i++) {							//1부터 1씩 증가하면서 12월까지 도는 for문 작성
			
			System.out.printf(" %d월 =>",k44_i);						//해당 월 출력, 1월부터 12월까지
			LOOP:for(int k44_j=1; k44_j<32; k44_j++) {					//LOOP선언, 1부터 1씩증가하면서 31까지 도는 for문을 선언
				
				System.out.printf("%d,",k44_j);							//일수를 출력
					
				switch(k44_i) {											//받아온 월수를 스위치의 조건에 따라 분류
				case 4:case 6:case 7:case 9:case 11:					//4 6 7 9 11월은 30일에 탈출
					if(k44_j==30) break LOOP;							//if 를 실행하면 위에 선언한 LOOP로 돌아간다.
					
					break;												//switch에서 case를 탈출하면 break;
					
				case 2:
					if(k44_j==28) break LOOP;							//2월이고 28일일때 LOOP로 돌아간다.
					break;												//스위치문을 탈출하는 break
				}
			}
		System.out.println();											//월이 끝날때마다 줄바꿈을 해준다.
		}

	}

}
