package _04;

public class p18 {

	public static void main(String[] args) {
		
		//누구나 알아볼 수 있도록 직관적으로 코딩해라.짧게 쓴다고 좋은 코딩이 아니다.
		
		for(int k44_i=1; k44_i<13; k44_i++) {			// i가 1부터 13전까지 1씩 증가하면서 도는 for문 작성
			System.out.printf(" %d월 =>", k44_i);		// i를 형태에 맞게 출력, 1월부터 12월까지 출력
			
			for(int k44_j=1; k44_j<32; k44_j++) {		// 1부터 1씩 증가하며 31까지 도는 for문 작성
				System.out.printf("%d,",k44_j);			//해당 변수를 출력하고 아래 if 문을 통과하면서 만족하면 안쪽의 for문 탈출 (다음 달로 넘어감)

				if(k44_i==1  && k44_j==31) break;	
				if(k44_i==2  && k44_j==28) break;	
				if(k44_i==3  && k44_j==31) break;
				if(k44_i==4  && k44_j==30) break;
				if(k44_i==5  && k44_j==31) break;
				if(k44_i==6  && k44_j==30) break;
				if(k44_i==7  && k44_j==31) break;
				if(k44_i==8  && k44_j==31) break;
				if(k44_i==9  && k44_j==30) break;
				if(k44_i==10 && k44_j==31) break;
				if(k44_i==11 && k44_j==30) break;
				if(k44_i==12 && k44_j==31) break;
			}
			System.out.println();
		}

	}

}
