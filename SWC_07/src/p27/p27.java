package p27;

import java.util.ArrayList;

public class p27 {

	public static void main(String[] args) {
		
		ArrayList k44_iAL= new ArrayList();
		k44_iAL.add("abc"); //��� ����Ʈ�� add�޼ҵ�� �ش� ���ڸ� ����Ʈ�� ��´�.
		k44_iAL.add("abcd");
		k44_iAL.add("efga");
		k44_iAL.add("������0");
		k44_iAL.add("1234");
		k44_iAL.add("12rk34");
		// i AL.add(356); 021102ES ESO 17 �߰��� ���� ������ �ȵ�
		
		System.out.printf("*************************\n");
		System.out.printf(" ���� ArraySize %d \n", k44_iAL.size()); //�� �߱�
		
		for (int k44_i=0; k44_i < k44_iAL.size(); k44_i++) {
			System.out.printf(" ArrayList %d = %s\n", k44_i, k44_iAL.get(k44_i)); //��̸���Ʈ�� �����ŭ �ݺ��� ���� ���빰 ����Ѵ�.
		}//��̸���Ʈ�� ���̸� ���ϴ� �޼ҵ�� .size()
		
		k44_iAL.set(3, "������"); //3�� ��̸���Ʈ ���뺯��
		System.out.printf("******************************\n"); 
		System.out.printf(" ���뺯�� ArraySize %d \n", k44_iAL.size());
		
		for (int k44_i=0; k44_i < k44_iAL.size(); k44_i++) { //��̸���Ʈ�� �����ŭ �ݺ��� ���� ���빰 ����Ѵ�.
			System.out.printf(" ArrayList %d = %s\n", k44_i, k44_iAL.get(k44_i));
		}
		k44_iAL.remove(4); //4�� ��̸���Ʈ ����
		System.out.printf("******************************\n");
		System.out.printf(" ���뺯�� ArraySize %d \n", k44_iAL.size());
		for (int k44_i=0; k44_i < k44_iAL.size(); k44_i++) {
			System.out.printf(" ArrayList %d = %s\n", k44_i, k44_iAL.get(k44_i));
		}
		
		k44_iAL.sort(null); //��̸���Ʈ sort
		System.out.printf("******************************\n");
		System.out.printf(" ����Ʈ Sort ArraySize %d \n", k44_iAL.size()); 
		for (int k44_i=0; k44_i < k44_iAL.size(); k44_i++) {
			System.out.printf(" ArrayList %d = %s\n", k44_i, k44_iAL.get(k44_i));
		}
		
		k44_iAL.clear(); //��̸���Ʈ ����
		System.out.printf("******************************\n"); 
		System.out.printf(" ���� ���� ArraySize %d \n", k44_iAL.size()); 
		for (int k44_i=0; k44_i < k44_iAL.size(); k44_i++) {
			System.out.printf(" ArrayList %d = %s\n", k44_i, k44_iAL.get(k44_i));
		}
	}

}
