package p04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p07 {

	public static void main(String[] args) {
		DateFormat k44_dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 	//import한 클래스 DateFormat의 인스턴스(dateFormat)를 생성하고, 출력포맷을 지정해준다. 
		Calendar k44_cal = Calendar.getInstance(); 	//캘린더 클래스의 cal인스턴스에 캘린더 클래스의 getInstance값을 저장해준다.

		int k44_iPrice = 1; //iPrice는 금액(공급가액) + 부가세를 합한 합계.
		
		double k44_valueOfSupply = k44_iPrice*10/11;	// = 금액 = 공급가액은 합계의 11분의 10.

		int k44_tax = k44_iPrice - (int)k44_valueOfSupply;  //부가세는 합계 - 공급가액. 공급가액을 int로 바꿔주면서 소숫점 아래 자리수들을 버림한다. 합계가 1원일 때 금액이 아닌 부가세1원 받아야한다.
		
		
		System.out.printf("신용승인\n");
		System.out.printf("단말기 : %s %15s : %s\n","2N68665898","전표번호","041218");
		System.out.printf("가맹점 : %s\n","한양김치찌개");
		System.out.printf("주  소 : %s\n%s\n","경기 성남시 분당구 황새울로351번길 10 ,", "1층");
		System.out.printf("대표자 : %s\n","유창신");
		System.out.printf("사업자 : %s%19s %d\n","752-53-00558","TEL : ",7055695);
		System.out.printf("------------------------------------------------\n");
		
		System.out.printf("금  액%,39d%2s\n",(int)k44_valueOfSupply,"원"); //valueOfSupply는 double형에서 int로 타입캐스팅 하여 버림하는 과정을 거쳐야 하므로 double에서 int로 바꿔준다.
		System.out.printf("부가세%,39d%2s\n",k44_tax,"원");
		System.out.printf("합  계%,39d%2s\n",k44_iPrice,"원");	//합계는 공급가액과 부가세를 합한 금액.
		
		System.out.printf("------------------------------------------------\n");
		System.out.printf("우리카드\n");
		System.out.printf("카드번호 : %s%12s\n","5387-20**-****-4613(S)","일시불");
		System.out.printf("거래일시 : %s\n",k44_dateFormat.format(k44_cal.getTime())); //거래 일시는 캘린더 클래스의 getTime() 메소드를 이용하여 지정했던 format에 맞춰 출력한다.
		System.out.printf("승인번호 : %d\n",70404427);
		System.out.printf("거래번호 : %s\n","357734873739");
		System.out.printf("매입 : %s%10s%d\n","비씨카드사","가맹 : ",720068568);
		System.out.printf("알림 : %s\n","EDC매출표");
		System.out.printf("문의 : %s\n","TEL)1544-4700");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%26s\n","* 감사합니다 *");
		System.out.printf("%46s\n","표준V2.08_20220418");
	}

}
