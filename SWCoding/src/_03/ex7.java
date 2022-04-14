package _03;

public class ex7 {

	public static void main(String[] args) {
		
		String[] k44_item = { "크라운산도", "빠다코코낫", "사루비아", "참쌀선병", "연양갱" };						//구매할 상품을 String 자료형의 k44_item Array에 저장한다. 
		int[] k44_price = { 1000, 2000, 3000, 2500, 1450 };															//각각의 상품가격(단가)를 저장한 Array 
		int[] k44_amount = { 10, 2, 1, 3, 5 }; 																		//각 상품의 각각 구매 갯수를 저장한 Array 
		double k44_tax_rate=0.1;																					//세율을 소수형 변수 k44_tax_rate에 저장하기
		int k44_total_sum = 0;																						//최종 더한 가격을 저장할 정수형 변수 k44_total_sum set.

		System.out.printf("=====================================================\n");
		System.out.printf("\t\t  내가 지른 과자들\t\t\n");
		System.out.printf("=====================================================\n");

		System.out.printf(" %s\t\t%s\t\t%s\t\t%s \n", "항 목","단 가","수 량","합 계");
		for (int i = 0; i < k44_item.length; i++) {																	//구매한 상품의 Array의 길이만큼(5) for반복문을 iteration한다.
			int k44_sum = k44_price[i] * k44_amount[i];																//상품 가격과 갯수를 곱해서 저장할 변수 k44_sum 설정, i값이 증가하면서 Array순서 차례차례로 실행됨
			k44_total_sum = k44_total_sum + k44_sum;																//total_sum은 이전 total_sum에 변수 k44_sum(합계)을 저장한 값
			System.out.printf("%-10s\t%-7d\t%12d\t%13d\n", k44_item[i], k44_price[i], k44_amount[i], k44_sum);		//각 Array에 저장된 항목들을 순서대로 나열, 그리고 계산된 k44_sum(합계)출력
		}
		System.out.printf("=====================================================\n");
		System.out.printf("지불금액 : %42d\n", k44_total_sum);
		
		int k44_total_net_price = (int) (k44_total_sum / (1 + k44_tax_rate));										//최종 더해진 가격에 "1.(세율)"을 나눈 값에서, 소수점자리는 int형 변환을 하여 떼어주고나서 지불금액에 저장.
		System.out.printf("과세금액 : %42d\n", k44_total_net_price);
		int k44_tax = k44_total_sum - k44_total_net_price; 															//지불한 총 세금은 최종 지불금액에서 과세금액을 뺀 나머지이다. 
		System.out.printf("세    금 : %42d\n", k44_tax);

	}
}
