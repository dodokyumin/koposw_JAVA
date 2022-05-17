package p28;

import java.util.ArrayList;

public class p28 {

	public static void main(String[] args) {
		
		int k44_iTestMax = 1000000;	//TestMax값을 설정해준다.
		ArrayList k44_iAL = new ArrayList();	//ArrayList iAL을 선언하였다.
		
		for(int k44_i = 0; k44_i < k44_iTestMax; k44_i++) {	//ArrayList의 사이즈만큼 랜덤한 수를 add메소드를 통해 어레이 리스트에 넣는다.
			k44_iAL.add((int)(Math.random()*1000000)); //math.random으로 0~1사이의 소수에 1000000을 곱하고 int형으로 바꿔 소수자리들을 버림한다.
		}
		
		for(int k44_i=0; k44_i < k44_iAL.size(); k44_i++) {	//ArrayList의 사이즈만큼 저장했던 램덤한 수를 호출한다.
			System.out.printf(" ArrayList %d = %d\n", k44_i, k44_iAL.get(k44_i));
		}
		
		System.out.printf("*****************************\n");
		k44_iAL.sort(null);	//오름차순 정렬
		
		for(int k44_i=0; k44_i<k44_iAL.size(); k44_i++) {
			System.out.printf(" ArrayList %d = %d\n", k44_i, k44_iAL.get(k44_i));	//오름차순한 결과를  출력
		}
		
		
	}

}
