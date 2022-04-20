package p04;

public class p06 {

	public static void main(String[] args) {

		int k44_iWeekday = 5; //1월의 시작은 금요일 이므로 첫 주에 월~목까지의 5요일의 공간이 생긴다. 변수로 저장해주기. 

		int[] k44_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	//매 달의 총 일 수를 다루기 쉽게 배열에 저장해준다.

		for (int k44_iMon = 0; k44_iMon < 12; k44_iMon++) {	//1년은 12개의 달. 12개월치의 달력만 출력할 수 있도록 0~11,총 12번의 iteration을 돌게 한다. 

			System.out.printf("\n\n\t%d월\n", k44_iMon + 1);	//한번 반복 될 때마다 다음 월을 출력하기 위해 i+1값을 넣어준다.
			System.out.printf("=====================\n");	//줄긋기
			System.out.printf("%2s%2s%2s%2s%2s%2s%2s\n", "일", "월", "화", "수", "목", "금", "토"); //요일 출력하기
			
			for(int k44_blank = 0; k44_blank < k44_iWeekday; k44_blank++) {	//1월은 금요일부터 시작이니 일~목 까지의 5번의 빈칸을 반복문으로 넣어준다.
				
				System.out.printf("   ");
			}
			
			for (int k44_i = 1; k44_i <= k44_iEnd[k44_iMon]; k44_i++) {	//해당 월의 총 일 수만큼 몇일인지 반복할 것이기 때문에 iEnd배열의 차례에 iMon을 넣어주어 1월부터 차례로 접근한다.
					
				System.out.printf("%3d", k44_i);	//해당 월의 총 일 수까지 1부터 칸띄우면서 출력하기

				if ((k44_i + k44_iWeekday) % 7 == 0) {	//첫 주 공백 몇칸 + 매 일을 더했을 때 7로 나누어 떨어지면 다음라인으로 내려가게 설정해주기
					System.out.println();
				}

			}
			
			k44_iWeekday = ((k44_iWeekday + k44_iEnd[k44_iMon]) % 7) ; //다음달의 첫 주 공백은 공백 포함 전 달의 총 일 수를 더하고 7로 나눈 나머지이다.
			
		}

	}
}
