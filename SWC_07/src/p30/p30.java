package p30;

public class p30 extends Main01 {

	public static void main(String[] args) {
		
		dataSet(); //데이터셋팅
		HeaderPrint(); //헤더인쇄
		
		for( int i=0; i<ArrayOneRec.size(); i++) {
			ItemPrint(i);
		}
		
		TailPrint();
	}

}
