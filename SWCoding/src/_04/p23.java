package _04;

public class p23 {

	public static void main(String[] args) {
		
		int k44_iNumVal = 2000000000;
		
		String k44_sNumVal = String.valueOf(k44_iNumVal);									//������ �ٷ�� ���� ���ڿ��� ��ȯ. "1001034567"
		
		String k44_sNumVoice="";															//�д� �Ҹ�(����)�� ��Ƶ� ���ڿ� ����
		
		System.out.printf("==> %s [%d�ڸ�]\n", k44_sNumVal, k44_sNumVal.length() );			//.length()�޼ҵ�� ���ڿ��� ����, �� �ڸ����� ����.
		
		int k44_i,k44_j;
		
		String[] k44_units = {"��","��","��","��","��","��","��","ĥ","��","��"};			//1�� �ڸ��� ������ �迭�� ����. 10���� ����
		String[] k44_unitX = {"","��","��","õ","��","��","��","õ","��","��"};				//���� ������ ������ �迭�� ����. 10���� ����
	
		k44_i=0;
		k44_j= k44_sNumVal.length();														//j�� ������ �ڸ���
		
		while (true) {
			
			if ( k44_i >= k44_sNumVal.length()) break;										//0�� (����1001034567�� �ڸ���)10�� ���ų� Ŭ ������ 1�� ���ϸ� �ݺ�.
			
			System.out.printf("%s[%s]",													
					k44_sNumVal.substring(k44_i, k44_i+1),									//���� ���ڿ��� ���ڸ��� ���� (0,1)="1", (1,2)="0", (1,3)="0", ... (8,9)="6", (9,10)="7";
					k44_units[Integer.parseInt(k44_sNumVal.substring(k44_i,k44_i+1))]);		//�ռ� ���� ���ڸ��� 1���ڸ��� ���� �迭�� ���� ������ "1"="��", "0"="��", "0"="��" ... "6"="��", "7"="ĥ";
			
			if(k44_sNumVal.substring(k44_i, k44_i+1).equals("0")) {							//���� ���� ���ڸ����� ���ڿ��� "0"�̶��,
				
				if(k44_unitX[k44_j].equals("��") || k44_unitX[k44_j].equals("��")) {		//���� ���� ���� �迭 �� �Ųٷ� ���� j�� ��Ī�ϴ� ���� "��"�̰ų� "��"�� ����,
					
					k44_sNumVoice = k44_sNumVoice + ""+ k44_unitX[k44_j];					//�ش� �ڸ��� 0�̸� ���� ������ �ٿ���
	
				
					
					if(k44_sNumVal.substring((k44_sNumVal.length( )-8), k44_sNumVal.length()-4).equals("0000")){	//�̶� 0�ڸ��� �� ���� ����, ���� ���� ���ڸ��� 0000�̸� ���� ���� �̽ʾ�'��'�� �����Ѵ�.
						k44_sNumVoice = k44_sNumVoice.replace("��", "");
						
					} else {
						
					}
						
				} else {
					
					
					
				}
				
			} else {																		//���� ���� ���ڸ����� ���ڿ��� "0"�� �ƴ϶��
				
				k44_sNumVoice = k44_sNumVoice 												//���� ������
						+ k44_units[Integer.parseInt(k44_sNumVal.substring(k44_i,k44_i+1))]	//�ռ� ���� ���ڸ��� 1���ڸ��� ���� �迭�� ���� ���� "1"="��", "0"="��", "0"="��" ... "6"="��", "7"="ĥ";
						+ k44_unitX[k44_j-1];												//unitX[j] = X(�迭�� �ڸ����� 0��° �ڸ����� ����. ũ��� 1���� ����) //���� ������ ����
			
			}
			k44_i++; k44_j--;																// 1 iteration ���� i++, j-- (j�� ���� ���ڿ��� �ڸ��� �̹Ƿ�)
		}
		
		System.out.printf( "\n %s[%s}\n", k44_sNumVal, k44_sNumVoice); 
		

	}

}
