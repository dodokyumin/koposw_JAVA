package _03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex8 {

	public static void main(String[] args) {
		int k44_MyWon = 1000000;															//내가 가지고 있는 한화
		double k44_MoneyEx=1238.21;															//한화를 달러로 바꿀 때의 환율설정
		double k44_commission = 0.003;														//환전 수수료
		
		int k44_usd = (int) (k44_MyWon/k44_MoneyEx);										//최종 결과를 정수형으로 만들어 버림처리. 전체 금액을 환율로 나눔
		int k44_remain = (int)(k44_MyWon - k44_usd*k44_MoneyEx);							//잔돈도 정수형으로 만들어 버림처리한다.
																							//전체금액에서 달러금액(달러*환율)을 뻄. 소수점은 줄 수 없음.
		System.out.printf("*******************************************\n");
		System.out.printf("*\t수수료 없이 계산\t*\n");
		System.out.printf("총 한화환전금액: %d원 => 미화:소비자가격: %d달러, 잔돈: %d원\n", k44_MyWon, k44_usd, k44_remain);
		System.out.printf("*******************************************\n\n\n");

		double k44_ComPerOne = k44_MoneyEx * k44_commission;								//한화to달러 환율 * 환전 수수료 = 1달러당 수수료
		
		double k44_totalcom = k44_usd * k44_ComPerOne;										//미화:소비자가격*1달러당 수수료 = 총 수수료
		
		System.out.printf("*******************************************\n");
		System.out.printf("*\t수수료 계산\t*\n");
		System.out.printf("총 수수료: %f원 => 미화:%d달러, 달러당 수수료: %f원\n", k44_totalcom, k44_usd, k44_ComPerOne);
		System.out.printf("*******************************************\n\n\n");
	
		int k44_i_totalcom = 0;																//수수료 적용 환전의 총 수수료 설정

		if (k44_totalcom != (double)((int)k44_totalcom))									//총수수료가 소수점이 있으면 아랫줄 실행문 실행
			k44_i_totalcom=(int)k44_totalcom+1;												//소수점이 있으면 올림해서 받음. 은행이 돈을 잃을 수는 없다.
		else
			k44_i_totalcom=(int)k44_totalcom;												//총수수료에 소수점이 없으면 그대로 정수형으로 .
	
		System.out.printf("*******************************************\n");
		System.out.printf("*\t수수료 적용 환전\t*\n");
		System.out.printf("총 수수료 : %d원 => 미화: %d달러, 달러당 수수료: %f원\n",k44_i_totalcom, k44_usd, k44_ComPerOne);
		
		k44_remain = (int) (k44_MyWon - k44_usd *k44_MoneyEx - k44_i_totalcom);
		System.out.printf("총 수수료 : %d원 => 미화: %d달러, 수수료청구: %d원 잔돈:ㅣ %d원\n", k44_MyWon, k44_usd,k44_i_totalcom, k44_remain);
		System.out.printf("*******************************************\n\n\n");
		
		
		k44_usd = (int) (k44_MyWon/(k44_MoneyEx + k44_ComPerOne));							//정확한 소비자 가격은 내 한국돈에 (한화to달러 환율+1달러당 수수료)를 나눈 몫
		k44_totalcom = k44_usd* k44_ComPerOne;												//미화:소비자가격*1달러당 수수료 = 총 수수료
		
		if (k44_totalcom != (double)((int)k44_totalcom))									//총수수료가 소수점이 있으면 아랫줄 실행문 실행
			k44_i_totalcom = (int)k44_totalcom+1;											//소수점이 있으면 올림해서 돈 조금 더 받음. 은행이 돈을 잃을 수는 없다.
		else
			k44_i_totalcom = (int)k44_totalcom;												//총수수료에 소수점이 없으면 그대로 정수형으로 .
		

		System.out.printf("*******************************************\n");
		System.out.printf("*\t (정확한)수수료 적용 환전\t*\n");
		System.out.printf("총 수수료 : %d원 => 미화: %d달러, 달러당 수수료: %f원\n",k44_i_totalcom, k44_usd, k44_ComPerOne);
		
		k44_remain = (int) (k44_MyWon - k44_usd *k44_MoneyEx - k44_i_totalcom);
		System.out.printf("총 수수료 : %d원 => 미화: %d달러, 수수료청구: %d원 잔돈:ㅣ %d원\n", k44_MyWon, k44_usd,k44_i_totalcom, k44_remain);
		System.out.printf("*******************************************\n\n\n");
		
		
		
		System.out.printf("*******************************************\n");
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");						//DecimalFormat 클래스를 import하여 돈 단위 1000마다 콤마찍기 
		System.out.printf("*\t 콤마찍기, 날짜 적용\t*\n");
		System.out.printf("총 수수료 : %s원 => 미화: %s달러, 달러당 수수료: %f원\n",
				df.format(k44_i_totalcom),													//DecimalFormat 의 df.format() 기능 을 적용하여 출력하기
				df.format(k44_usd),
				k44_ComPerOne);
		
		k44_remain = (int) (k44_MyWon - k44_usd *k44_MoneyEx - k44_i_totalcom);
		System.out.printf("총 수수료 : %s원 => 미화: %s달러, 수수료청구: %s원 잔돈:ㅣ %s원\n", 
				df.format(k44_MyWon),
				df.format(k44_usd),
				df.format(k44_i_totalcom),
				df.format(k44_remain));

		Calendar calt = Calendar.getInstance();												//Calendar클래스를 인스턴스화하여 (calt)변수에 넣기
		SimpleDateFormat sdt=new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");					//형식을 연 월 일 시간 분 초로 세팅
		System.out.printf("최종실행시간: %s\n", sdt.format(calt.getTime()));
		System.out.printf("*******************************************\n");

	}

}
