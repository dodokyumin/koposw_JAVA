package p06;

public class p09 {

	public static void main(String[] args) {

		k44_EmartData k44_ED = new k44_EmartData();	//이마트 데이터 클래스의 인스턴스 ED를 생성했다.
		k44_EmartPrint k44_EP = new k44_EmartPrint();	//이마트 데이터 프린트의 인스턴스 EP를 생성했다.

		k44_ED.k44_setSumPrice();	//ED클래스의 setSumPrice 함수 실행하여 프린트 전에 sumPrice를 미리 구현하여 저장해놓기.

		k44_EP.k44_head();	//EP클래스의 head함수 호출하기.
		
		
		for(int i = 0; i<k44_ED.k44_itemname.length; i++)
			k44_ED.k44_printItem(i);	//항목 갯수만큼 반복문을 돌려 아이템 출력하기
		
		
		
		k44_EP.k44_tail();	//EP클래스의 tail함수 호출하기.

	}

}
