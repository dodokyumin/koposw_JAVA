package p06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class k44_EmartPrint extends k44_EmartData {	//프린트하기 위해 필요한 데이터들을 EmartData클래스로부터 상속받아 (즉 EmartData가 부모 클래스) 함수별로 필요한 곳에 넣어주기 위해 extends해준다.
	DateFormat k44_dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");  //import한 클래스 DateFormat의 인스턴스(dateFormat)를 생성하고, 출력포맷을 지정해준다.
	Calendar k44_cal = Calendar.getInstance(); 	//캘린더 클래스의 cal인스턴스에 캘린더 클래스의 getInstance값을 저장해준다.
	DateFormat k44_dateFormat2 = new SimpleDateFormat("yyyyMMdd");  //import한 클래스 DateFormat의 인스턴스(dateFormat2)를 생성하고, 출력포맷2를 새로 지정해준다.
	Calendar k44_cal2 = Calendar.getInstance(); //캘린더 클래스의 cal2인스턴스에 캘린더 클래스의 getInstance값을 저장해준다.
	
public void k44_head() { //아이템 출력 기준 윗 head부분을 프린트하는 코드들을 묶어서 head함수로 다루기 쉽게 저장하였다.
	
	System.out.printf("%35s\n","이마트 죽전점 (031)888-1234");
	System.out.printf("%30s\n","286-86-50913 홍규민");
	System.out.printf("%29s\n\n","용인 수지구 포은대로 552");
	System.out.printf("%s\n","영수증 미지참시 교환/환불 불가");
	System.out.printf("%s\n","정상상품에 한함, 30일 이내(신선 7일)");
	System.out.printf("%s\n","※일부 브랜드매장 제외(매장 고지물참조)");
	System.out.printf("%s\n\n","교환/환불 구매점에서 가능(결제카드 지참)");
	System.out.printf("[%s]%s%15s\n","구 매",k44_dateFormat.format(k44_cal.getTime()),"POS:0011-9861");
	System.out.printf("-----------------------------------------\n");
	System.out.printf("%9s%13s%3s%7s\n","상 품 명","단 가","수량","금 액");
	System.out.printf("-----------------------------------------\n");
}




public void k44_tail() {	//아이템 출력 기준 아랫 부분을 프린트하는 코드들을 묶어서 tail함수로 다루기 쉽게 저장하였다.
	
	System.out.printf("\n%20s%16d\n","총품목수량", k44_itemname.length);	//총 품목 수량은 아이템을 저장한 itemname 배열의 길이를 구한다. itemname에 값이 추가되면 유도리있게 바꿔주기 위해.
	System.out.printf("%21s%,16d\n","(*)면세  물품", k44_sumTaxFreePrice());	//면세 물품들을 구하는 sumTaxFreePrice함수를 호출해 리턴값을 넣어준다. %뒤에 ","를 붙여주면 알아서 세자리수마다 ,를 찍어준다.
	System.out.printf("%21s%,16d\n","과세  물품", k44_getTotTax());	//총 과세물품들의 금액 구하는 getTotTax함수를 호출해 리턴값을 넣어준다.
	System.out.printf("%22s%,16d\n","부  가  세",k44_sumTaxPrice()-k44_getTotTax()); //부가세는 과세물품 금액들의 총합에서 전체 부가세를 뺀값이므로.
	System.out.printf("%23s%,16d\n","합      계", k44_getTotPrice());	//전체 금액을 리턴받는 함수 getTotPrice를 넣어준다.
	System.out.printf("%s%,24d\n","결 제 대 상 금 액", k44_getTotPrice());	// 표를 보면 결제 대상 금액은 합계랑 같다.
	System.out.printf("-----------------------------------------\n"); //줄긋기
	System.out.printf("%s%28s\n","0012 KEB 하나", "541907**0484/35860658");
	System.out.printf("%s%15s%,11d\n","카드결제(IC)", "일시불 / ",k44_getTotPrice()); //일시불로 금액의 총 합계와 같음
	System.out.printf("-----------------------------------------\n");
	System.out.printf("%22s\n","[신세계포인트 적립]");
	System.out.printf("%s\n","홍*민 고객님의 포인트 현황입니다.");
	System.out.printf("%s%19s%,8d\n","금회발생포인트","9350**9995",k44_getTotPrice()/1000); //포인트는 전체 합계의 0.001퍼센트이다.
	System.out.printf("%s%,16d(%,7d)\n","누계(가용)포인트",k44_getTotPrice()/1000,k44_getTotPrice()/1000);	//오늘 처음 적립한 포인트를 보여줌.
	System.out.printf("%s\n","*신세계포인트 유효기간은 2년입니다.");
	System.out.printf("-----------------------------------------\n");
	System.out.printf("%22s\n","구매금액기준 무료주차시간 자동부여");
	System.out.printf("%s%30s\n","차량번호 :", "34저****");
	System.out.printf("%s%31s\n","입차시간 :", k44_dateFormat.format(k44_cal.getTime())); //입차시간은 캘린더 클래스의 getTime() 메소드를 이용하여 지정했던 format에 맞춰 출력한다.
	System.out.printf("-----------------------------------------\n");
	System.out.printf("%s%25d\n","캐셔:084599 홍OO", 1150);
	System.out.printf("%38s\n","||||||||||||||||||||||||||||||||||");
	System.out.printf("%15s%s\n",k44_dateFormat2.format(k44_cal2.getTime()),"/00119861/00164980/31"); //바코드출력시간은 캘린더 클래스의 getTime() 메소드를 이용하여 지정했던 format에 맞춰 출력한다.
}

}
