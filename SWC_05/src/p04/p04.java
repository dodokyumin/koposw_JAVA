package p04;

public class p04 {

	public static void main(String[] args) {

		int k44_dan = 1;	//첫 프린트할 1단 설정.
		System.out.printf("***********\t***********\t***********\n");	//줄 긋기
		System.out.printf(String.format("구구단 %d단\t", k44_dan) + (String.format("구구단 %d단\t", k44_dan + 1))
				+ (String.format("구구단 %d단\n", k44_dan + 2)));	//구구단 1단 1+1단 1+2단 먼저 출력해준다.
		System.out.printf("***********\t***********\t***********\n");

		for (int k44_i = 1; k44_i < 10; k44_i += 3) {	//구구단의 앞자리 설정. 옆으로 3단씩 출력할 것이기 때문에 밑으로 내려가면 +3을 해준다.
			for (int k44_j = 1; k44_j < 10; k44_j++) {	//구구단의 뒷자리 설정. 1~9까지 iteration 하게 해준다.

				System.out.printf("%d * %d = %d\t %d * %d = %d\t%d * %d = %d\n", k44_i, k44_j, k44_i * k44_j, k44_i + 1, k44_j, k44_j * (k44_i + 1),
						k44_i + 2, k44_j, k44_j * (k44_i + 2));	//구구단의 앞자리와 뒷자리를 for문을 통해 변경해주면서 값을 도출.

				if (k44_j % 9 == 0) {	//이때, 구구단 뒷자리가 9가 되면 다시 줄긋고 구구단 제목을 붙여주게끔 조건을 설정한다.
					if (k44_dan == 7)	//구구단의 종료지점 설정해주기. 구구단 뒷자리가 9이면서 마지막 출력될 단(i, i+1, i+2)에서 i가 7일 때 출력 끝내기
						break;
					System.out.println(); //뒷자리가 9이면 한칸 띄워주기

					k44_dan += 3;	//아래줄에 출력할 단은 1,2,3에서 4,5,6이 되므로 dan에 +3을 해준다.

					System.out.printf("***********\t***********\t***********\n");	//x*9까지 출력이 되면 다음 단을 프린트하는 코드
					System.out.printf(String.format("구구단 %d단\t", k44_dan) + (String.format("구구단 %d단\t", k44_dan + 1))
							+ (String.format("구구단 %d단\n", k44_dan + 2)));
					System.out.printf("***********\t***********\t***********\n");

				}

			}

		}

	}

}
