package _04;

public class p23 {

	public static void main(String[] args) {
		
		int k44_iNumVal = 2000000000;
		
		String k44_sNumVal = String.valueOf(k44_iNumVal);									//정수를 다루기 쉬운 문자열로 변환. "1001034567"
		
		String k44_sNumVoice="";															//읽는 소리(발음)을 담아둘 문자열 생성
		
		System.out.printf("==> %s [%d자리]\n", k44_sNumVal, k44_sNumVal.length() );			//.length()메소드로 문자열의 길이, 즉 자릿수를 센다.
		
		int k44_i,k44_j;
		
		String[] k44_units = {"영","일","이","삼","사","오","육","칠","팔","구"};			//1의 자릿수 발음을 배열에 저장. 10개의 인자
		String[] k44_unitX = {"","십","백","천","만","십","백","천","억","십"};				//단위 발음을 개별로 배열에 저장. 10개의 인자
	
		k44_i=0;
		k44_j= k44_sNumVal.length();														//j는 정수의 자릿수
		
		while (true) {
			
			if ( k44_i >= k44_sNumVal.length()) break;										//0이 (숫자1001034567의 자릿수)10에 같거나 클 때까지 1씩 더하며 반복.
			
			System.out.printf("%s[%s]",													
					k44_sNumVal.substring(k44_i, k44_i+1),									//숫자 문자열을 한자리씩 끊기 (0,1)="1", (1,2)="0", (1,3)="0", ... (8,9)="6", (9,10)="7";
					k44_units[Integer.parseInt(k44_sNumVal.substring(k44_i,k44_i+1))]);		//앞서 끊은 한자리씩 1의자릿수 발음 배열에 값을 가져옴 "1"="일", "0"="영", "0"="영" ... "6"="육", "7"="칠";
			
			if(k44_sNumVal.substring(k44_i, k44_i+1).equals("0")) {							//만약 끊은 한자리씩의 문자열이 "0"이라면,
				
				if(k44_unitX[k44_j].equals("만") || k44_unitX[k44_j].equals("억")) {		//만약 단위 발음 배열 중 거꾸로 세는 j에 매칭하는 값이 "만"이거나 "억"이 오면,
					
					k44_sNumVoice = k44_sNumVoice + ""+ k44_unitX[k44_j];					//해당 자리가 0이면 단위 발음만 붙여줌
	
				
					
					if(k44_sNumVal.substring((k44_sNumVal.length( )-8), k44_sNumVal.length()-4).equals("0000")){	//이때 0자리에 만 억이 들어갔고, 이후 남은 네자리가 0000이면 만을 지워 이십억'만'을 방지한다.
						k44_sNumVoice = k44_sNumVoice.replace("만", "");
						
					} else {
						
					}
						
				} else {
					
					
					
				}
				
			} else {																		//만약 끊은 한자리씩의 문자열이 "0"이 아니라면
				
				k44_sNumVoice = k44_sNumVoice 												//기존 발음에
						+ k44_units[Integer.parseInt(k44_sNumVal.substring(k44_i,k44_i+1))]	//앞서 끊은 한자리씩 1의자릿수 발음 배열에 값을 더함 "1"="일", "0"="영", "0"="영" ... "6"="육", "7"="칠";
						+ k44_unitX[k44_j-1];												//unitX[j] = X(배열의 자릿수는 0번째 자리부터 시작. 크기는 1부터 시작) //단위 발음을 저장
			
			}
			k44_i++; k44_j--;																// 1 iteration 마다 i++, j-- (j는 숫자 문자열의 자릿수 이므로)
		}
		
		System.out.printf( "\n %s[%s}\n", k44_sNumVal, k44_sNumVoice); 
		

	}

}
