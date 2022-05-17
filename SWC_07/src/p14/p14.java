package p14;

public class p14 {

	public static void main(String[] args) {
		String[] k44_OneRec = {
				"구분,`04 금액,`05 금액,`06 금액,`07 금액,`08 금액,`09 금액,`10 금액,`11 금액,`12 금액,`13 금액,`14 금액,`15 금액,`16 금액,`17 금액,`18 금액,`19 금액,`20 1Q 금액",
				"정보통신기술 제조,56,310,328,751,689,974,1580,1240,1644,2285,1462,1009,712,964,1160,1092,327",
				"정보통신기술 서비스,15,61,220,344,262,505,958,698,915,1171,1534,3668,3109,3568,5174,8094,1385",
				"전기 기계 장비,45,94,293,1038,551,1536,1977,2752,1753,1633,1113,1364,1641,1403,2011,1660,250",
				"화학 소재,4,12,66,390,716,751,840,727,1286,475,656,1194,1261,811,1059,906,292",
				"바이오 의료,0,0,168,239,308,552,899,858,760,1191,2584,3004,3686,3240,5771,7677,1879",
				"영상 공연 음반,0,272,234,467,867,1073,1527,2207,2364,2345,2309,2383,2230,2159,2236,2522,300",
				"게임,0,15,117,488,229,561,647,1024,756,899,1331,1514,1165,1149,1201,891,193",
				"유통 서비스,0,23,86,557,401,723,539,632,690,652,1770,2426,2183,3553,3998,5495,879",
				"기타,0,37,47,416,193,344,571,470,311,379,539,1479,1448,1089,1779,2543,400",
				"합계,120,824,1559,4690,4216,7019,9538,10608,10479,11030,13298,18041,17435,17936,24389,30880,5905"

		};

		String[] k44_field_name = k44_OneRec[0].split(","); //onerec array의 첫 라인 즉, 필드 항목들을 ,기준으로 나눈 값을 필드 name배열에 저장한다.
		for (int k44_i = 1; k44_i < k44_OneRec.length; k44_i++) {	//onerec 갯수만큼 반복을 도는데, 시작값을 1로 설정하여 필드항목 다음의 값들부터 가져온다.
			String[] k44_field = k44_OneRec[k44_i].split(","); //각 라인들을 ,기준으로 substring하여 배열에 넣는다.
			System.out.printf(" %s : %s\n", k44_field_name[0], k44_field[0]); //필드 항목을 맨 위에 출력
			for (int k44_j = 3; k44_j < k44_field_name.length; k44_j++) { //나머지 값들을 루프를 통해 출력하기.
				System.out.printf(" %s : %s\n", k44_field_name[k44_j], k44_numberRead(k44_field[k44_j]));
			}
			System.out.println("=============================="); //구분선 출력
		}

	}

	public static String k44_numberRead(String k44_text) {
		String[] k44_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // 문자열 배열 units 선언 및 초기화
		String[] k44_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" }; // 문자열 배열 unitX 선언 및 초기화
		String k44_sNumVoice = "";
		int k44_i = 0; // 변수 i를 0으로 초기화
		int k44_j = k44_text.length() - 1; // 변수 j를 sNumVal의 길이 - 1로 초기화 > 배열은 0번째부터 시작하기 때문

		while (true) { // 무한 반복문
			if (k44_i >= k44_text.length()) // 변수 i가 sNumVal.length()보다 같거나 클 때
				break; // 반복문을 중단하고 다음으로 넘어간다

			if (k44_text.substring(k44_i, k44_i + 1).equals("0")) { // sNumVal을 i에서 i+1만큼 자른 수가 0일 때 (if문) (.equals > 문자열 같은 것 비교 확인시 사용)
				if (k44_text.length() <= 8) {
					k44_sNumVoice = k44_sNumVoice // sNumVoice에 sNumVoice +
							+ k44_units[Integer.parseInt(k44_text.substring(k44_i, k44_i + 1))] // sNumVal을 i에서 i+1만큰 자른 문자열을 정수로 변환 후(Integer.parseInt()활용)
							+ k44_unitX[k44_j]; // + unitX[j]를 대입한다 // String 배열 units의 위치에 있는 문자를 출력
				} else {
					if (k44_text.substring(k44_text.length() - 8, k44_text.length() - 4).equals("0000") 
							&& k44_unitX[k44_j].equals("만")) { // sNumVal의 길이-8 부터 sNumVal의 길이-4까지를 sNumVal에서 자르고 그것이 0000이고 배열 unitX[j] 가 "만"이면 아무 것도 하지 않는다.
					} else if (k44_unitX[k44_j].equals("만") || k44_unitX[k44_j].equals("억")) { // 위의 조건이 false이고unitX[j]가 "만" 또는 "억"이면 (||는 또는 의미)
						k44_sNumVoice = k44_sNumVoice + "" + k44_unitX[k44_j]; // sNumVoice에 sNumVoice + "" + unitX[j]를 대입
					}
				}

			} else { // sNumVal을 i에서 i+1만큼 자른 수가 0이 아니면
				k44_sNumVoice = k44_sNumVoice // sNumVoice에 sNumVoice +
						+ k44_units[Integer.parseInt(k44_text.substring(k44_i, k44_i + 1))] // sNumVal을 i에서 i+1만큰 자른 문자열을 정수로 변환 후(Integer.parseInt()활용)
						+ k44_unitX[k44_j]; // + unitX[j]를 대입한다 // String 배열 units의 위치에 있는 문자를 출력
			}
			k44_i++; // 변수 i를 1만큼 증가
			k44_j--; // 변수 j를 1만큼 감소
		}
		return k44_sNumVoice;
	}

}