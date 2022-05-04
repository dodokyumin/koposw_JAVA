package aaa;

	public class k44_EmartData { //구매 목록의 데이터들을 각각의 종류에 맞게 순서대로 배열에 저장해준다.
		String[] k44_itemname = { "해피홈 SAFE365 핸드워시", "(G)LH원형유리화병 10인치", "상투과자E", "더블링 나일론 깡 롤", "해피홈 SAFE 핸드워시",
				"농심 신라면120g*5", "(대)국내산삼겹살찌개", "오뚜기 진비빔면 156g", "GAP 죽장사과 4-6입", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴",
				"(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족C_WH", "프리미엄생연어초밥 10pcs", "새우깡 110g", "피코크 들깨미역국500g",
				"남양 맛있는우유GT 저지방 1L", "녹차원흑당시럽10입", "진라면소컵(매)65g*6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루우유", "자일로스갈색설탕500g",
				"CJ비비고칩 20g", "피코크 들깨미역국500g", "흑원당 말차 밀크티", "1+ 등급란 10개입 특", "동원양반볶음김치기획", "바나나맛우유 4입", "코카콜라 500ml",
				"유기농 얼갈이 배추 1포기", "동원양반볶음김치기획","홍교수님의 코딩교실 제1권" };
		int[] k44_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130, 1350,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980, 5400, 1980, 3480, 7980, 9990000 };
		int[] k44_amount = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 52 };
		boolean[] k44_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false, false, false,
				false, false, false, true, false, false, false, false, false, false, false, false, true, false, false,
				false, true, false, false };
		int[] k44_sumPrice = new int[k44_itemname.length];	//각 아이템별로 총 가격을 담을 배열 생성. 크기는 아이템배열의 길이만큼.
		static int k44_cutBytesSaveLength; //상품명 칸을 나눌

		public void k44_setSumPrice() { //항목의 갯수만큼 반복을 돌며 금액과 수량을 곱한 총 가격을 순서대로 아이템별 총 가격 배열에 저장해준다.

			for (int k44_i = 0; k44_i < k44_itemname.length; k44_i++) {	//
				k44_sumPrice[k44_i] = k44_price[k44_i] * k44_amount[k44_i];
			}
		}

		public int k44_getTotPrice() {	//합계를 구하는 함수.
			int k44_totPrice = 0;	//각 아이템별 구매 금액을 합해 totPrice변수에 저장하고 리턴한다.
			k44_setSumPrice();
			for (int k44_i = 0; k44_i < k44_sumPrice.length; k44_i++) {
				k44_totPrice += k44_sumPrice[k44_i];
			}
			return k44_totPrice;
		}

		public int k44_sumTaxFreePrice() {	//면세 품목들의 총 가격을 구하는 함수
			int k44_totTaxFreePrice = 0;
			for (int k44_i = 0; k44_i < k44_itemname.length; k44_i++) {
				if (k44_taxfree[k44_i]) {	//면세 여부는 boolean 자료형의 배열이므로 면세가 true일 때 해당 아이템의 구매금액을 더해준다. 그리고 리턴.
					k44_totTaxFreePrice += k44_price[k44_i] * k44_amount[k44_i];
				}
			}
			return k44_totTaxFreePrice;
		}

		public int k44_sumTaxPrice() {	//과세 품목들의 총 가격을 구하는 함수
			int k44_totTaxPrice = 0;
			for (int k44_i = 0; k44_i < k44_itemname.length; k44_i++) {
				if (!k44_taxfree[k44_i]) {	//면세 여부는 boolean 자료형의 배열이므로 면세가 false일 때,즉 과세일 때 해당 아이템의 구매금액을 더해준다. 그리고 리턴.
					k44_totTaxPrice += k44_price[k44_i] * k44_amount[k44_i];
				}
			}
			return k44_totTaxPrice;
		}

		public int k44_getTotTax() {	//부가세를 리턴하는 함수
			int k44_totTax;
			k44_totTax = (int)(k44_sumTaxPrice()/ 1.1);	//부가세는 과세물품의 총 가격에 1.1을 나누고 소수점으로 떨어지면 int형으로 타입캐스팅하여 버림을 한다. 
				
			return k44_totTax;
		}
		
		public void k44_printItem() {	//아이템을 상품명, 단가, 수량, 금액에 맞춰 순서대로 프린트해주는 함수.
			
			for (int k44_i = 0; k44_i < k44_itemname.length; k44_i++) {	//printItem의 횟수는 아이템의 갯수이므로 종료 조건을 itemname배열의 길이만큼으로 유동적 설정해준다.
				if (k44_taxfree[k44_i]) {	//면세 여부를 저장한 taxfree 배열을 불러와 해당 아이템이 면세 물품이면 * 를 출력하고 아니면 그 칸만큼 공백을 넣어준다.
					System.out.printf("* ");
				} else {
					System.out.printf("  ");
				}

				System.out.printf("%s%,10d%3d%,11d\n", k44_setBlank(k44_itemname[k44_i], 15), k44_price[k44_i], k44_amount[k44_i], k44_sumPrice[k44_i]); //한 라인마다 출력할 상품명(상품명은 왼쪽부터 쓰므로 따로 함수를 만듦) 단가 수량 금액을 printf에 넣어준다.

				if (k44_i % 5 == 4) {
					System.out.printf("-----------------------------------------\n"); //영수증의 가독성을 위해 5칸마다 줄 긋기
				}
			}
		}

		public static String k44_setBlank(String k44_str, int k44_itemNameCellSize) { //상품명을 출력할 란에 칸을 지정하여 해당 비트 수 만큼 상품명을 잘라 출력하는 함수. 한글 깨짐 없이.
			//itemNameCellSize는 상품명을 출력할 칸을 int형 파라미터로 받는다.
			String k44_cutStr = ""; //상품명을 정제한 후 담을 String 변수 생성해놓기.

			// item 문자열의 칸수 계산하여 charCount에 저장하기.
			int k44_bitCount = 0; //한글자 한글자 검사하며 해당 문자의 비트 수(칸 수)를 저장, 누적할 변수 생성. 
			int k44_i = 0; //이때! i를 미리 빼주어 for문 안이 끝날 때 시점의 i값을 for문 밖에서도 사용가능하게 살려놓을 수 있도록 하는게 키포인트였다!!
			for (; k44_i < k44_str.length() && k44_bitCount < k44_itemNameCellSize;) { //상품명 길이만큼 iteration하며, 잘라저장하는 비트 수가 itemNameCellSize보다 작을 때 끝나도록 설정한다.
				//!!이때 i번째 글자가 한글이면 2가 더해지므로 itemNameCellSize보다 1이 더 큰 bitCount가 생성될 수 있음!!
				if (k44_str.substring(k44_i, k44_i + 1).getBytes().length == 2) { // str의 i번째 글자가 한글이면 2bit 더하기
					k44_bitCount += 2;
				} else if (k44_str.substring(k44_i, k44_i + 1).getBytes().length == 1) { // str의 i번째 글자가 영어면 1bit 더하기
					k44_bitCount += 1;
				}
				
				k44_i++;

			}
			
			// str의 총 bit 수가 설정한 칸을 넘을경우. 즉 i번째 글자가 한글이여서 앞for문에서 bitCount에 2가 추가로 더해져 나오는 경우가 있다.
			if (k44_bitCount > k44_itemNameCellSize) {
				// 그럼 i에 해당하는 문자가 2비트짜리 문자이냐?
				if (k44_str.substring(k44_i-1,k44_i).getBytes().length == 2) {
					k44_cutStr = k44_str.substring(0, k44_i-1) + " "; //해당 i번째 문자를 중간에 자르면 글자가 깨지기 때문에 바로 앞 i-1번째 문자까지만 출력하고, 비는 1비트만큼 공백" "더하기.
				//비트 카운트가 설정한 itemNameCellSize와 같냐?
				} else {
					k44_cutStr = k44_str.substring(0, k44_i); //그러면 반복했던 i까지 만큼의 문자를 substring으로 잘라 출력하기만 하면 된다.

				}
			} else {
				
			//str의 총 bit 수가 설정한 칸을 넘지않을 경우str에 설정한 칸 숫자까지 공백채우기 ex)농심 신라면120g*5
				int k44_addBlankLen = k44_itemNameCellSize - k44_bitCount; //추가할 공백의 수를 설정한 상품명 칸 수에서 해당 상품명의 비트 카운트를 뺀 값으로 설정한다.
				k44_cutStr = k44_str.substring(0,k44_i); //리턴할 cutStr함수에 해당 상품명의 i번까지만큼 저장한다.

				while (k44_addBlankLen > 0) {	//그리고 리턴할 cutStr함수에 addBlankLen 길이만큼 +" " 해준다.
					
					k44_cutStr += " ";
					
					k44_addBlankLen--;
				}
			
			}

			return k44_cutStr; //각 상품명마다 최종 정제된 cutStr을 리턴한다.
		}

}
