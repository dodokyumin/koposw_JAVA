package p27;

import java.util.ArrayList;

public class p27 {

	public static void main(String[] args) {
		
		ArrayList k44_iAL= new ArrayList();
		k44_iAL.add("abc"); //어레이 리스트의 add메소드로 해당 인자를 리스트에 담는다.
		k44_iAL.add("abcd");
		k44_iAL.add("efga");
		k44_iAL.add("가나다0");
		k44_iAL.add("1234");
		k44_iAL.add("12rk34");
		// i AL.add(356); 021102ES ESO 17 중간에 숫자 넣으면 안돼
		
		System.out.printf("*************************\n");
		System.out.printf(" 시작 ArraySize %d \n", k44_iAL.size()); //줄 긋기
		
		for (int k44_i=0; k44_i < k44_iAL.size(); k44_i++) {
			System.out.printf(" ArrayList %d = %s\n", k44_i, k44_iAL.get(k44_i)); //어레이리스트의 사이즈만큼 반복을 돌며 내용물 출력한다.
		}//어레이리스트의 길이를 구하는 메소드는 .size()
		
		k44_iAL.set(3, "가라라라"); //3번 어레이리스트 내용변경
		System.out.printf("******************************\n"); 
		System.out.printf(" 내용변경 ArraySize %d \n", k44_iAL.size());
		
		for (int k44_i=0; k44_i < k44_iAL.size(); k44_i++) { //어레이리스트의 사이즈만큼 반복을 돌며 내용물 출력한다.
			System.out.printf(" ArrayList %d = %s\n", k44_i, k44_iAL.get(k44_i));
		}
		k44_iAL.remove(4); //4번 어레이리스트 삭제
		System.out.printf("******************************\n");
		System.out.printf(" 내용변경 ArraySize %d \n", k44_iAL.size());
		for (int k44_i=0; k44_i < k44_iAL.size(); k44_i++) {
			System.out.printf(" ArrayList %d = %s\n", k44_i, k44_iAL.get(k44_i));
		}
		
		k44_iAL.sort(null); //어레이리스트 sort
		System.out.printf("******************************\n");
		System.out.printf(" 리스트 Sort ArraySize %d \n", k44_iAL.size()); 
		for (int k44_i=0; k44_i < k44_iAL.size(); k44_i++) {
			System.out.printf(" ArrayList %d = %s\n", k44_i, k44_iAL.get(k44_i));
		}
		
		k44_iAL.clear(); //어레이리스트 삭제
		System.out.printf("******************************\n"); 
		System.out.printf(" 전부 삭제 ArraySize %d \n", k44_iAL.size()); 
		for (int k44_i=0; k44_i < k44_iAL.size(); k44_i++) {
			System.out.printf(" ArrayList %d = %s\n", k44_i, k44_iAL.get(k44_i));
		}
	}

}
