package _04;

public class p18 {

	public static void main(String[] args) {
		
		//������ �˾ƺ� �� �ֵ��� ���������� �ڵ��ض�.ª�� ���ٰ� ���� �ڵ��� �ƴϴ�.
		
		for(int k44_i=1; k44_i<13; k44_i++) {			// i�� 1���� 13������ 1�� �����ϸ鼭 ���� for�� �ۼ�
			System.out.printf(" %d�� =>", k44_i);		// i�� ���¿� �°� ���, 1������ 12������ ���
			
			for(int k44_j=1; k44_j<32; k44_j++) {		// 1���� 1�� �����ϸ� 31���� ���� for�� �ۼ�
				System.out.printf("%d,",k44_j);			//�ش� ������ ����ϰ� �Ʒ� if ���� ����ϸ鼭 �����ϸ� ������ for�� Ż�� (���� �޷� �Ѿ)

				if(k44_i==1  && k44_j==31) break;	
				if(k44_i==2  && k44_j==28) break;	
				if(k44_i==3  && k44_j==31) break;
				if(k44_i==4  && k44_j==30) break;
				if(k44_i==5  && k44_j==31) break;
				if(k44_i==6  && k44_j==30) break;
				if(k44_i==7  && k44_j==31) break;
				if(k44_i==8  && k44_j==31) break;
				if(k44_i==9  && k44_j==30) break;
				if(k44_i==10 && k44_j==31) break;
				if(k44_i==11 && k44_j==30) break;
				if(k44_i==12 && k44_j==31) break;
			}
			System.out.println();
		}

	}

}
