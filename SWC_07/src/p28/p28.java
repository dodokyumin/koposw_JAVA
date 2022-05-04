package p28;

import java.util.ArrayList;

public class p28 {

	public static void main(String[] args) {
		
		int iTestMax = 1000000;	//TestMax값을 설정해준다.
		ArrayList iAL = new ArrayList();	//ArrayList iAL을 선언하였다.
		
		for(int i = 0; i < iAL.size(); i++) {	//ArrayList의 사이즈만큼 랜덤한 수를 add메소드를 통해 어레이 리스트에 넣는다.
			iAL.add((int)(Math.random()*1000000));
		}
		
		for(int i=0; i < iAL.size(); i++) {	//ArrayList의 사이즈만큼 저장했던 램덤한 수를 호출한다.
			System.out.printf(" ArrayList %d = %d\n", i, iAL.get(i));
		}
		
		System.out.printf("*****************************\n");
		iAL.sort(null);	//오름차순 정렬
		
		for(int i=0; i<iAL.size(); i++) {
			System.out.printf(" ArrayList %d = %d\n", i, iAL.get(i));	//오름차순한 결과를  출력
		}
		
		
	}

}
