package p11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p11 {

	public static void main(String[] args) {
		String[] OneRec = { 
				"01   해피홈 SAFE365          7,500        2        15,000",
				"02   (G)LH원형유리화         6,900        1         6,900",
				"03   상투과자E               5,980        1         5,980",
				"04   더블링 나일론           3,300        1         3,300",
				"05   해피홈 SAFE 핸          5,500        2        11,000",
				"06   농심 신라면120g         3,380        1         3,380",
				"07*    (대)국내산삼겹        6,610        1         6,610",
				"08   오뚜기 진비빔면         2,750        1         2,750",
				"09*    GAP 죽장사과 4-      10,800        1        10,800",
				"10   코카콜라 500ml          1,980        1         1,980",
				"11*    순 유기농 바나        4,980        1         4,980",
				"12   피코크 탄두리           2,480        1         2,480",
				"13   (달콤)순살닭강          7,920        1         7,920",
				"14   DZ주니어양말3족         4,980        1         4,980",
				"15   장미꽃1송이             1,800        7        12,600",
				"16   프리미엄생연어          7,130        1         7,130",
				"17   새우깡 110g             1,350        3         4,050",
				"18   피코크 들깨미역         3,980        1         3,980",
				"19*    남양 맛있는우유       4,480        1         4,480",
				"20   녹차원흑당시럽1         4,980        1         4,980",
				"21   진라면소컵(매)6         3,210        1         3,210",
				"22   케라시스 앰플           6,950        1         6,950",
				"23   푸르밀 미숫가루         2,980        2         5,960",
				"24   자일로스갈색설          1,990        1         1,990",
				"25   CJ비비고칩 20g          1,980        1         1,980",
				"26   피코크 들깨미역         3,980        1         3,980",
				"27   흑원당 말차 밀          4,480        1         4,480",
				"28*    1+ 등급란 10개        3,480        1         3,480",
				"29   동원양반볶음김          7,980        1         7,980",
				"30   바나나맛우유 4          5,400        1         5,400"

		};

		ArrayList<ArrayList<String>> OneRec2Arr = new ArrayList<ArrayList<String>>();	//값들을 저장할 2차원 배열을 생성한다.(1.아이템 내용, 2.해당 아이템 내용을 포함한 아이템들의 리스트)

		for (int i = 0; i < OneRec.length; i++) {	//2차원 배열의 길이만큼 반복을 돌린다. 30까지

			String[] StrArr = OneRec[i].split("  ");	//각 항목들은 띄어쓰기로 구분이 되어 있으므로 띄어쓰기를 기준으로 split하여 4가지 항목을 우선 대충 정제하고, 나뉜 값들을 배열에 담아 저장한다.

			for (int j = 0; j < StrArr.length; j++) {	//담아 저장한 배열의 길이만큼 반복문을 돌리는데,
				StrArr[j] = StrArr[j].trim().replace(",", "");	//해당 항목의 앞 뒤 공백을 자르는 trim() 메소드로 1차, ","를 없애주는 replace()메소드로 2차 정제하여 다시 배열에 저장한다.
			}

			ArrayList<String> OneRecArr = new ArrayList<>(Arrays.asList(StrArr));	//2차 정제한 항목들이 있는 배열을 새 ArrayList를 선언하며 담는다.(arraylist의 remove를 통해서 쉽게 쓰레기값을 제거할 수 있기 때문)

			for (int k = 0; k < OneRecArr.size(); k++) {	//쓰레기값이 포함된 ArrayList를 처음부터 끝가지 훑으면서,
				if (OneRecArr.get(k).equals("")) {	//만약 쓰레기값""이 포함되어있으면
					OneRecArr.remove(k);	//해당 순번k의 값을 remove()메소드로 지운다.
					k--;	//값을 지웠으니 순번은 하나씩 앞당겨져야 하므로 k--;
				}
			}

			OneRec2Arr.add(OneRecArr);	//마지막 3차 정제된 ArrayList를 OneRec2Arr 2차 배열에 넣어준다.

		}

		for (int i = 0; i < OneRec2Arr.size(); i++) {	//2차 배열의 크기만큼 처음부터 돌리는데,
			int price = Integer.parseInt(OneRec2Arr.get(i).get(2));	//이때 정제된 데이터는 각 줄마다 값 종류가 일정하므로, 2번 줄에 해당하는 price와
			int amount = Integer.parseInt(OneRec2Arr.get(i).get(3));	//3번 줄에 해당하는 수량 amount를 변수에 담아주고
			int wrongTotal = Integer.parseInt(OneRec2Arr.get(i).get(4));	//잘못 입력할 값(4번째 줄에 해당)을 변수 wrongTotal에 담아준다.
			int correctTotal = price * amount;	//wrongTotal값을 정정해줄 제대로 된 price와 amount를 곱한 correctTotal도 만들어준다.

			if (correctTotal != wrongTotal) {	//만약 입력된 값이 제대로된 값이랑 다르다면 아래 실행문 실행.

				System.out.println("*************************************");
				System.out.printf("오류[%d\t%s/t/t%,d\t%d\t%,d]\n", i + 1, OneRec2Arr.get(i).get(1), price, amount,	//출력 메세지 입력.
						wrongTotal);
				System.out.printf("수정[%d\t%s/t/t%,d\t%d\t%,d]\n", i + 1, OneRec2Arr.get(i).get(1), price, amount,
						correctTotal);
				System.out.println("*************************************");
			}

		}

	}

}
