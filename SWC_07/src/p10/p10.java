package p10;

public class p10 {

	public static void main(String[] args) {

		System.out.printf("HanBlankForeword[%s]\n",HanBlankForeword("�ѱ�abcd",15));
		System.out.printf("HanBlankForeword[%s]\n",HanBlankForeword("�ѱ��ѱ�aa",15));
		System.out.printf("HanBlankBackword[%s]\n",HanBlankBackword("�ѱ�aa",15));
		System.out.printf("HanBlankBackword[%s]\n",HanBlankBackword("�ѱ��ѱ�aa",15));
		System.out.printf("�ѱ���[%d]��\n",HanCount("�ѱ��ѱ�aa"));

	}


	private static String HanBlankBackword(String string, int i) {
		
		String str = string;
		for(int j=0; j<i; j++) {
			str += " ";
			
		}
		return str;
	}
	
	private static String HanBlankForeword(String string, int i) {
		
		String str = string;
		for(int j=0; j<i; j++) {
			str = " "+str;
			
		}
		return str;
	}

	private static int HanCount(String string) {
		
		String k44_str = string;
		int k44_bitCount = 0;  
		 
		for (int k44_i = 0; k44_i < k44_str.length();) {
		
			if (k44_str.substring(k44_i, k44_i + 1).getBytes().length == 2) { 
				k44_bitCount += 1;
			}
			
			k44_i++;

		}
		
		return k44_bitCount; 
	}
}
