package p04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p08 {

	public static void main(String[] args) {
		DateFormat k44_dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); //import한 클래스 DateFormat의 인스턴스(dateFormat)를 생성하고, 출력포맷을 지정해준다.
		Calendar k44_cal = Calendar.getInstance(); 	//캘린더 클래스의 cal인스턴스에 캘린더 클래스의 getInstance값을 저장해준다.
		
		String k44_itemname1="퓨어에어 비말차단용마스크(최고급형)";	//구매한 아이템들의 데이터들을 세팅해준다.
		String k44_itemcode1="1031615";
		int k44_price1 = 1;
		int k44_amount1 = 1;
		double k44_totPrice1 = k44_price1 * k44_amount1;	//해당 목록 아이템의 총 가격은 금액과 수량을 곱한 값.
		
		String k44_itemname2="슬라이드식명찰(가로형)(100호)";
		String k44_itemcode2="11008152";
		int k44_price2 = 1000;
		int k44_amount2 = 0;
		double k44_totPrice2 = k44_price2 * k44_amount2;
		
		String k44_itemname3="매직흡착 인테리어후크(알루미늄타입)";
		String k44_itemcode3="1020800";
		int k44_price3 = 1000;
		int k44_amount3 = 0;
		double k44_totPrice3 = k44_price3 * k44_amount3;
		
		double k44_totPriceAll = k44_totPrice1 + k44_totPrice2 + k44_totPrice3;	//아이템1,2,3의 금액을 모두 더해준 합계를 변수에 저
		
		int k44_tax;
		
		if (k44_totPriceAll/11 % 1 == 0) {	//전체 합계를 11분의 1이 부가세이다. 이때 소수점이 나타난다면, 과세합계를 버림해야 한다. 그래야 부가세에 1이 더해지기 때문.
			k44_tax = (int)(k44_totPriceAll/11);
		} else {
			k44_tax = (int)(k44_totPriceAll/11)+1;	
		}
		
		int k44_noTaxPriceAll = (int)k44_totPriceAll - k44_tax;	//과세합계는 전체 판매 합계에서 부과세를 뺀 값이므로 다음과 같이 작성.
		
		
		System.out.printf("%25s\n","\"국민가게, 다이소\"");
		System.out.printf("%s\n","(주)아성다이소_분당서현점");
		System.out.printf("%s\n","전화:031-702-6016");
		System.out.printf("%s\n","본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.printf("%s\n%s\n","매장:경기도 성남시 분당구 분당로 53번길 11 (서현","동");
		System.out.printf("================================================\n");
		System.out.printf("%27s\n","소비자중심경영(CCM) 인증기업");
		System.out.printf("%29s\n","ISO 9001 품질경영시스템 인증기업");
		System.out.printf("================================================\n");
		System.out.printf("%29s\n","교환/환불 14일(03월12일)이내,");
		System.out.printf("%s\n","(전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.printf("%27s\n","포장/가격 택 훼손시 교환/환불 불가");
		System.out.printf("%27s\n","체크카드 취소 시 최대 7일 소요");
		System.out.printf("================================================\n");
		System.out.printf("%s%35s\n","[POS 1058231]",k44_dateFormat.format(k44_cal.getTime()));
		System.out.printf("================================================\n");
		System.out.printf("%s%,9d%4d%,9d\n[%s]\n",p08.k44_substringByBytes(k44_itemname1, 0, 27),k44_price1, k44_amount1, k44_price1*k44_amount1,k44_itemcode1);	
		System.out.printf("%s%,9d%4d%,9d\n[%s]\n",p08.k44_substringByBytes(k44_itemname2, 0, 27),k44_price2, k44_amount2, k44_price2*k44_amount2,k44_itemcode2);
		System.out.printf("%s%,9d%4d%,9d\n[%s]\n",p08.k44_substringByBytes(k44_itemname3, 0, 27),k44_price3, k44_amount3, k44_price3*k44_amount3,k44_itemcode3);
		System.out.printf("%18s%,26d\n","과세합계",k44_noTaxPriceAll);
		System.out.printf("%19s%,26d\n","부가세",(int)k44_totPriceAll - k44_noTaxPriceAll);
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%s%,40d\n","판매합계",(int)k44_totPriceAll);
		System.out.printf("================================================\n");
		System.out.printf("%s%,40d\n","신용카드",(int)k44_totPriceAll);
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%s%40s\n","우리카드","538720**********");
		System.out.printf("%s%12s%18s%,6d\n","승인번호","77982843(0)","승인금액",(int)k44_totPriceAll);
		System.out.printf("================================================\n");
		System.out.printf("%28s%6s\n",k44_dateFormat.format(k44_cal.getTime()),"분당서현점");	//거래 일시는 캘린더 클래스의 getTime() 메소드를 이용하여 지정했던 format에 맞춰 출력한다.
		System.out.printf("%s\n","상품 및 기타 문의 : 1522-4400");
		System.out.printf("%s\n","멤버십 및 샵다이소 관련 문의 : 1599-2211");
		System.out.printf("%36s\n","||||||||||||||||||||||||");
		System.out.printf("%36s\n","||||||||||||||||||||||||");
		System.out.printf("%32s\n","2112820610158231");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%28s\n%27s\n","◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서","회원가입 후 다양한 혜택을 누려보세요! ◈");
		
	}

	public static String k44_substringByBytes(String k44_str, int k44_beginBytes, int k44_endBytes) { //substringByBytes함수는 설정한 endBytes에 맞춰 itemname을 출력할 때 한글 중간에 짤리지 않도록 한다.

		if (k44_str == null || k44_str.length() == 0) { // str내용이 null이거나 길이가 0이면 아무것도 아니므로 ""을 리턴한다(예외처리문).
			return "";
		}

		if (k44_beginBytes < 0) { // beginBytes의 값이 음수이면, 시작점 0으로 다시 맞춰준다.
			k44_beginBytes = 0;
		}

		if (k44_endBytes < 1) { // 바이트는 정수형으로 계산하므로 endBytes가 1보다 작으면 ""을 리턴한다(예외처리문).
			return "";
		}

		int k44_strLen = k44_str.length(); // 입력한 string의 길이를 정수형 변수 len에 저장.

		int k44_beginIndex = -1; // return할 substring의 beginIndex 파라미터.
		int k44_endIndex = 0; // return할 substring의 endIndex 파라미터.

		int k44_cutBytesSavelen = 0; // str을 매 byte로 나누고, 그 byte 크기들을 모아 저장할 cutBytesSavelen 변수 설정.

		String k44_ch = null; //

		for (int k44_i = 0; k44_i < k44_strLen; k44_i++) { // 입력한 string의 길이만큼 매 byte칸마다 절삭, 저장하기를 반복.
			k44_ch = k44_str.substring(k44_i, k44_i + 1); // 매칸마다 절삭한 string을 변수 ch에 저장
			k44_cutBytesSavelen += k44_ch.getBytes().length; // 매칸마다 절삭한 string의 byte크기를 정수형으로 계산하여 정수형 변수 cutBytesSavelen에 저장.

			if (k44_beginIndex == -1 && k44_cutBytesSavelen >= k44_beginBytes) { // 만약 beginIndex가 -1이면서 beginBytes가
																		// cutBytesSavelen보다 작거나 같으면, beginIndex는 i로.
				k44_beginIndex = k44_i;
			}

			if (k44_cutBytesSavelen > k44_endBytes) { //함수 종료시점 설정해주기. 절삭한 바이트 수가 설정한 칸 수를 넘으면 함수를 빠져나오게 만든다.
				break;
			} else {
				k44_endIndex = k44_i + 1;
			}
		}

		return k44_str.substring(k44_beginIndex, k44_endIndex);
	}

}
