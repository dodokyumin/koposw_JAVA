package p30;

public class p30 extends Main01 {

	public static void main(String[] args) {
		
		dataSet(); //�����ͼ���
		HeaderPrint(); //����μ�
		
		for( int i=0; i<ArrayOneRec.size(); i++) {
			ItemPrint(i);
		}
		
		TailPrint();
	}

}
