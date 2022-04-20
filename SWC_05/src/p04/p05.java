package p04;

public class p05 {

	public static void main(String[] args) {

		int k44_count = 0;	//세로줄을 카운트해줄 변수를 설정해준다.

		for (int k44_i = 1; k44_i < 10; k44_i++) {	//구구단의 앞자리 설정. 옆으로 3단씩 출력할 것이기 때문에 밑으로 내려가면 +3을 해준다.
			if (k44_count == 3)	//세로로 총 3라인(3*3)으로 출력이 될 수 있도록 count가 3이 되면 출력을 종료하게 설정해준다.
				break;
			System.out.printf("***********\t***********\t***********\n");	//줄긋기
			System.out.printf(String.format("구구단 %d단\t", k44_i) + (String.format("구구단 %d단\t", k44_i + 3))
					+ (String.format("구구단 %d단\n", k44_i + 6)));	//가로로 보면 1,4,7이기 때문에 포맷에서 %d에 들어갈 수를 i,i+3,i+6 로 설정.
			System.out.printf("***********\t***********\t***********\n");

			for (int k44_j = 1; k44_j < 10; k44_j++) {

				System.out.printf("%d * %d = %d\t%d * %d = %d\t%d * %d = %d\n", k44_i, k44_j, k44_i * k44_j, k44_i + 3, k44_j, (k44_i + 3) * k44_j,
						k44_i + 6, k44_j, (k44_i + 6) * k44_j); //가로기준 구구단의 앞자리가 +3 +6 되므로 앞자리 들어갈 자리에 i+3, i+6으로 설정해준다.

			}
			k44_count++;	//구구단이 가로로 한번 출력 완료하면 count에 1을 더해주게 만들어 종료지점을 설정할 수 있게끔 변동값을 만들어주기.

		}

	}

}
