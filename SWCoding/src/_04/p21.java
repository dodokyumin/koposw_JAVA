package _04;

public class p21 {

	public static void main(String[] args) {
		
		int[] k44_iLMD = {31,28,31,30,31,30,31,31,30,31,30,31};			//일수를 담아두는 정수형 배열 iLMD선언 후 달의 마지막날 입력
		
		for(int k44_i = 1; k44_i<13; k44_i++) {							//1부터 1씩 증가하며 12까지 도는 지역변수를가지는 for문 선언 (월수)
			System.out.printf(" %d월 =>", k44_i);						//현재 몇월인지 출력하는 포멧
			
			for (int k44_j=1; k44_j<32;k44_j++) {						//1부터 1씩 증가하며 31까지 도는 for문 작성(일수)
				System.out.printf("%d",k44_j);							//일을 출력하는 포멧
			
				if( k44_iLMD[k44_i-1]==k44_j) break;					//배열의 위치에 맞게 비교하기위헤 -1을 하고 배열에 넣어둔 달의 마지막 일수와 j가 같으면 break;
				
				System.out.printf(",");									//아니라면 ,를 찍고 다음 일로 넘어간다.
			}
			System.out.printf("\n");									//달이 끝나면 줄바꿈
		}

	}

}
