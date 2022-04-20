package p41;

public class ReportSheet {

	public static void main(String[] args) {

		int k44_iPerson = 200; // 전체 인원수 설정하기
		int k44_iPages = 30; // 한 페이지당 출력할 인원 수 설정하기
		int k44_amountPage = k44_iPerson / k44_iPages; // 전체인원을 페이지로 나눈값 즉, 페이지 수

		InputData inData = new InputData(k44_iPerson, k44_amountPage, k44_iPages); // InputData클래스의 인스턴스 inData설정

		int countAll = 0; // 전체 학생수 체크하는 변수
		if (k44_iPerson != 0) {
			for (int k44_pageNum = 0; k44_pageNum <= k44_amountPage; k44_pageNum++) { // 반복문 ..6장 인쇄하면 20명 잘린다 그래서 <=으로
																						// 처리

				inData.printHeader(k44_pageNum);
				for (int k44_i = k44_iPages * k44_pageNum; k44_i < k44_iPages * (k44_pageNum + 1); k44_i++) {
					String k44_name = String.format("홍길%03d", k44_i + 1);// 001번부터 순차적으로 이름을 생성한다.
					int k44_kor = (int) (Math.random() * 100); // 랜덤 점수를 받아 변수에 저장한다.
					int k44_eng = (int) (Math.random() * 100); 
					int k44_mat = (int) (Math.random() * 100); 

					if (k44_i >= k44_iPerson) { //전체 인원수에 맞춰 반복한다.
						break;
					}
					countAll++;// 총 학생수 체크(초기화 없이 계속 누적)
					inData.SetData(k44_i, k44_name, k44_kor, k44_eng, k44_mat);// 획득한 값들을 메소드를 활용하여 배열에 입력
				}
				for (int j = 0; j < k44_iPages; j++) { // 페이지 인원수 만큼 돌아가는 반복문
					System.out.printf("%03d%7s %7d%9d%9d%9d%9.2f\n", (j + 1) + k44_iPages * k44_pageNum,
							inData.k44_name[j + k44_iPages * k44_pageNum], // 학생의 번호는 000부터가 아닌 001부터이다. 그러므로 j+1
							inData.k44_kor[j + k44_iPages * k44_pageNum], inData.k44_eng[j + k44_iPages * k44_pageNum],
							inData.k44_mat[j + k44_iPages * k44_pageNum], // 학생의 이름,점수,합계,평균을 배열에서 꺼내옴
							inData.k44_sum[j + k44_iPages * k44_pageNum], inData.k44_avg[j + k44_iPages * k44_pageNum]);
					if ((j + k44_iPages * k44_pageNum) >= k44_iPerson - 1) {// 200번학생의 정보는 배열199번에 들어있으므로 j값이 199보다 커지면
																			// 반복 멈춤
						break;
					}
				}
				inData.Result(k44_pageNum, countAll); // 현재 페이지와,현재까지 누적된 학생수를 변수로 결과 값을 출력한다.
			}
		} else {
			System.out.println("No student");
		}
	}
}
