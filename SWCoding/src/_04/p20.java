package _04;

public class p20 {

	public static void main(String[] args) {
		
		for (int k44_i=1; k44_i<13; k44_i++) {							//1���� 1�� �����ϸ鼭 12������ ���� for�� �ۼ�
			
			System.out.printf(" %d�� =>",k44_i);						//�ش� �� ���, 1������ 12������
			LOOP:for(int k44_j=1; k44_j<32; k44_j++) {					//LOOP����, 1���� 1�������ϸ鼭 31���� ���� for���� ����
				
				System.out.printf("%d,",k44_j);							//�ϼ��� ���
					
				switch(k44_i) {											//�޾ƿ� ������ ����ġ�� ���ǿ� ���� �з�
				case 4:case 6:case 7:case 9:case 11:					//4 6 7 9 11���� 30�Ͽ� Ż��
					if(k44_j==30) break LOOP;							//if �� �����ϸ� ���� ������ LOOP�� ���ư���.
					
					break;												//switch���� case�� Ż���ϸ� break;
					
				case 2:
					if(k44_j==28) break LOOP;							//2���̰� 28���϶� LOOP�� ���ư���.
					break;												//����ġ���� Ż���ϴ� break
				}
			}
		System.out.println();											//���� ���������� �ٹٲ��� ���ش�.
		}

	}

}
