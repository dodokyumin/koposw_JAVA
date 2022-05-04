package _04;

import java.text.DecimalFormat;

public class p28 {

	public static void main(String[] args) {
		
		String K44_item = "사과";																//문자열 변수 선언과 동시에 사과 입력
		int K44_unit_price = 5000;																//정수형 변수 선언과 동시에 5000입력, 가격으로 추정
		int K44_num = 500;																		//정수형 변수 선언, 500입력, 개수로 추정
		
		DecimalFormat K44_df = new DecimalFormat ( "###,###,###,###,### " );					//DeciamlFormat 내장함수를 df의 명으로 사용할 예정, package 아래 import함

		System.out.printf("=========================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","품목","단가","수량","합계");				//품목 단가 수량 합계 메세지 출력
		System.out.printf("=========================================================\n");
		
		System.out.printf("%20.20s%10.10s%10.10s%11.10s\n",										//상품이름을 출력하고 DecimalFormat에 선언해둔 형태로 개당 가격, 구매 개수, 1개당 가격 * 개수로 총가격 출력
				K44_item, K44_df.format(K44_unit_price),K44_df.format(K44_num),K44_df.format(K44_unit_price*K44_num));
		System.out.printf("=========================================================\n");

	}

}
