package _04;

public class p26 {
//sin �޼ҵ� �ȿ��� ���� ������ ����.
	public static void main(String[] args) {
		double k44_fSin;													//�Ǽ���(double) ���� ����
		
		for(int k44_i=0; k44_i<360; k44_i++) {								//0���� 1�� �����ϸ鼭 360������ ���� �������� k�� ������ for�� �ۼ�
			
			k44_fSin = Math.sin(k44_i * Math.PI/180);						//Math.sin() ��ȣ �ȿ� �ش� ������ ���� ���� �־��ش�. ��ȣ �ȿ� ���� �������� ��ȯ ��
			
			System.out.printf("%d sin ==> %f\n", k44_i, k44_fSin);			//����(����)�� Math.sin(������ ���� ��)�� ���� ��� ���

		}
		
		
		for(int k44_i=0; k44_i<360; k44_i++) {								//0���� 1�� �����ϸ� 360������ ���� for�� �ۼ�
			
			k44_fSin=Math.sin( k44_i * Math.PI/180); 						//���ΰ��� -1~1. Math.sin() ��ȣ �ȿ� �ش� ������ ���� ���� �־��ش�. ��ȣ �ȿ� ���� �������� ��ȯ ��
			
			int k44_iSpace = (int)((1.0 - k44_fSin)*50); 					//0~2, 50�� ���ؼ� 0~100���� .(1.0 - fSin)�� sin���� ���� 0���� 2������ �Դٰ����Ѵ�. 50�� ���ؼ� 0���� 100������ ��ĭ�� ������ ����
			
			for(int k44_j=0; k44_j < k44_iSpace; k44_j++)					//iSpace ���� ���� �� ĭ ���� 0������ 100�� ����
				System.out.printf(" ");
			
			System.out.printf("*[%f][%d]\n", k44_fSin, k44_iSpace);			// ��ĭ ����, fSin�� sin ���� iSpace�� ��ĭ ���� ��µȴ�.
		}

	}

}
