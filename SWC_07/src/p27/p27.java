package p27;

import java.util.ArrayList;

public class p27 {

	public static void main(String[] args) {
		
		ArrayList iAL= new ArrayList();
		iAL.add("abc");
		iAL.add("abcd");
		iAL.add("efga");
		iAL.add("������0");
		iAL.add("1234");
		iAL.add("12rk34");
		// i AL.add(356); 021102ES ESO 17 �߰��� ���� ������ �ȵ�
		
		System.out.printf("*************************\n");
		System.out.printf(" ���� ArraySize %d \n", iAL.size());
		
		for (int i=0; i < iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %s\n", i, iAL.get(i));
		}
		
		iAL.set(3, "������"); //3�� ��̸���Ʈ ���뺯��
		System.out.printf("******************************\n"); 
		System.out.printf(" ���뺯�� ArraySize %d \n", iAL.size());
		
		for (int i=0; i < iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %s\n", i, iAL.get(i));
		}
		iAL.remove(4); //4�� ��̸���Ʈ ����
		System.out.printf("******************************\n");
		System.out.printf(" ���뺯�� ArraySize %d \n", iAL.size());
		for (int i=0; i < iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %s\n", i, iAL.get(i));
		}
		
		iAL.sort(null); //��̸���Ʈ sort
		System.out.printf("******************************\n");
		System.out.printf(" ����Ʈ Sort ArraySize %d \n", iAL.size()); 
		for (int i=0; i < iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %s\n", i, iAL.get(i));
		}
		
		iAL.clear(); //��̸���Ʈ ����
		System.out.printf("******************************\n"); 
		System.out.printf(" ���� ���� ArraySize %d \n", iAL.size()); 
		for (int i=0; i < iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %s\n", i, iAL.get(i));
		}
	}

}
