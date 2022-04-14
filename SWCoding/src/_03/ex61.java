package _03;

public class ex61 {
	public static int k44_netprice(int k44_price, double k44_rate) {						//가격(int)와 세율(double)을 인자로 받는 netprice함수
		return (int) (k44_price / (1 + k44_rate));										//가격을 "1.세율"로 나눈 몫에 정수형을 씌워 소수점을 버린후 리턴
	}

	public static void main(String[] args) {

		int k44_price = 1234;														//가격 설정
		double k44_tax_rate = 0.1;													//세율 책정

		int k44_netprice = k44_netprice(k44_price, k44_tax_rate);								//가격과 세율을 netprice함수에 넣어 보내기
		int k44_tax = k44_price - k44_netprice;												//세금은 가격-세전가격

		System.out.printf("*******************************************\n");
		System.out.printf("*\t소비자가, 세전가격, 세금 계산\t*\n");
		System.out.printf("소비자가격: %d, 세전가격: %d, 세금: %d\n", k44_price, k44_netprice, k44_tax);
		System.out.printf("*******************************************\n");

	}

}
