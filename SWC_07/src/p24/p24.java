package p24;

public class p24 {

	public static void main(String[] args) {

		int[] iArray = { 1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };	//iArray 선언과 동시에 값들을 넣어준다.

		for (int i = 0; i < iArray.length; i++)	//iArray를 자기 크기만큼 도는 반복문을 통해 하나씩 출력하기
			System.out.printf("iArray[%d]=%d\n", i, iArray[i]);

		int iMax = iArray[0];	//처음 비교 기준을 0번째 인덱스의 값으로 설정한다.
		int iMaxPt = 0;	//비교했을 때 원래 값보다 큰 값이 생기면 그 값을 담을 int자료형 iMaxPt설정.
		for (int i = 0; i < iArray.length; i++) {	//iArray의 길이만큼 반복.
			if (iMax < iArray[i]) {	//만약 각 자리에 있는 정수형 값들이 기존 Max값보다 크면
				iMax = iArray[i];	//기존 Max값에 현 i번쨰의 값 순번을 저장함.
				iMaxPt = i; //현 i번쨰의 값 순번(최대값)을 저장함
			}
		}

		System.out.printf("MAX : iArray[%d] = %d\n", iMaxPt, iMax);
	}

}
