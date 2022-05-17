package p30;

public class p30 extends Main01 {

	public static void main(String[] args) {
		
		k44_dataSet(); //데이터셋팅
		k44_HeaderPrint(); //헤더인쇄
		
		for( int k44_i=0; k44_i<k44_ArrayOneRec.size(); k44_i++) {
			k44_ItemPrint(k44_i);
		}
		
		k44_TailPrint();
	}

}
