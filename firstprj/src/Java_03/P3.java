package Java_03;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String typo = sc.nextLine();
		
		// typo��Ʈ���� ���ڼ� ��ŭ list�� ��ƵӴϴ�.
		for (int i = 0; i < typo.length(); i++) {
			char comVal = (char) (typo.charAt(i)-0xAC00);

			if (comVal >= 0 && comVal <= 11172){
				// �ѱ��ϰ�� 
				
					// �ʼ��� �Է� ���� �ÿ� �ʼ��� �����ؼ� List�� �߰��մϴ�.
					char uniVal = (char)comVal;

					// �����ڵ� ǥ�� ���߾� �ʼ� �߼� ������ �и��մϴ�..
					char cho = (char) ((((uniVal - (uniVal % 28)) / 28) / 21) + 0x1100);
					char jung = (char) ((((uniVal - (uniVal % 28)) / 28) % 21) + 0x1161);
					char jong = (char) ((uniVal % 28) + 0x11a7);

					if(cho!=4519){
						System.out.print(cho+" ");
					}
					if(jung!=4519){
						System.out.print(jung+" ");
					}
					if(jong!=4519){
						System.out.print(jong+" ");
					}

			} else {
				// �ѱ��� �ƴҰ��
				comVal = (char) (comVal+0xAC00);
				System.out.print(comVal+" ");
			}
		}
		
		
	}
}


