package p28;

import java.util.ArrayList;

public class p28 {

	public static void main(String[] args) {
		
		int k44_iTestMax = 1000000;	//TestMax���� �������ش�.
		ArrayList k44_iAL = new ArrayList();	//ArrayList iAL�� �����Ͽ���.
		
		for(int k44_i = 0; k44_i < k44_iTestMax; k44_i++) {	//ArrayList�� �����ŭ ������ ���� add�޼ҵ带 ���� ��� ����Ʈ�� �ִ´�.
			k44_iAL.add((int)(Math.random()*1000000)); //math.random���� 0~1������ �Ҽ��� 1000000�� ���ϰ� int������ �ٲ� �Ҽ��ڸ����� �����Ѵ�.
		}
		
		for(int k44_i=0; k44_i < k44_iAL.size(); k44_i++) {	//ArrayList�� �����ŭ �����ߴ� ������ ���� ȣ���Ѵ�.
			System.out.printf(" ArrayList %d = %d\n", k44_i, k44_iAL.get(k44_i));
		}
		
		System.out.printf("*****************************\n");
		k44_iAL.sort(null);	//�������� ����
		
		for(int k44_i=0; k44_i<k44_iAL.size(); k44_i++) {
			System.out.printf(" ArrayList %d = %d\n", k44_i, k44_iAL.get(k44_i));	//���������� �����  ���
		}
		
		
	}

}
