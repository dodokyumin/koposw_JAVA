package p28;

import java.util.ArrayList;

public class p28 {

	public static void main(String[] args) {
		
		int iTestMax = 1000000;	//TestMax���� �������ش�.
		ArrayList iAL = new ArrayList();	//ArrayList iAL�� �����Ͽ���.
		
		for(int i = 0; i < iAL.size(); i++) {	//ArrayList�� �����ŭ ������ ���� add�޼ҵ带 ���� ��� ����Ʈ�� �ִ´�.
			iAL.add((int)(Math.random()*1000000));
		}
		
		for(int i=0; i < iAL.size(); i++) {	//ArrayList�� �����ŭ �����ߴ� ������ ���� ȣ���Ѵ�.
			System.out.printf(" ArrayList %d = %d\n", i, iAL.get(i));
		}
		
		System.out.printf("*****************************\n");
		iAL.sort(null);	//�������� ����
		
		for(int i=0; i<iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %d\n", i, iAL.get(i));	//���������� �����  ���
		}
		
		
	}

}
