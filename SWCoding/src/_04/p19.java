package _04;

public class p19 {

	public static void main(String[] args) {
		
		for ( int k44_i=1; k44_i<13; k44_i++) {							//1���� 1�� �����ϸ鼭 12���� ���� ���������� �޴� for�� �ۼ�
			System.out.printf(" %d�� =>",k44_i);						// 1������ 12�������� for�� �������� ���
			
			for( int k44_j=1; k44_j<32 ; k44_j++) {						//1���� 1�� �����ϸ鼭 31���� ���� ���������� �޴� for�� �ۼ�
				
				System.out.printf("%d ",k44_j);							//���� ���
				
				if( k44_i==4 || k44_i==6 || k44_i==9 || k44_i==11) {	//���ǹ��� ���� 4 6 7 9 11���� 30�Ͽ� for���� ����
					if(k44_j==30) break;
				}
				
				if(k44_i==2) {											//���ǹ��� ���ؼ� 2������ 28�϶� for������ ����
					if(k44_j==28) break;
				}
				
			}
			
			System.out.println();										//�Ѵ��� ������ �ٹٲ�
		}
		
	}

}
