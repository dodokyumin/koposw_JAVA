package p35;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Main03 {
	static ArrayList<k44_OneRec> k44_ArrayOncRec = new ArrayList<k44_OneRec>();
	static int k44_sumKorCurrent = 0; // 현재페이지의 국어성적 합
	static int k44_sumEngCurrent = 0; // 현재페이지의 영어성적 합
	static int k44_sumMatCurrent = 0; // 현재페이지의 수학성적 합
	static int k44_sumSumCurrent = 0; // 현재페이지의 성적 합
	static double k44_sumAveCurrent = 0; // 현재페이지의 평균 합
	static int k44_sumKorTotal = 0; // 누적페이지의 국어성적 합
	static int k44_sumEngTotal = 0; // 누적페이지의 영어성적 합
	static int k44_sumMatTotal = 0; // 누적페이지의 수학성적 합
	static int k44_sumSumTotal = 0; // 누적페이지의 성적 합
	static double k44_sumAveTotal = 0; // 누적페이지의 평균의 합

	static int k44_counter = 0; // 인원수 측정용 카운터

	static final int k44_iPerson = 200; // 총인원수
	static final int k44_pgPerson = 30; // 페이지당 인원수
	static int k44_currentPagePerson = 0; // 현재페이지의 인원수
	static int k44_currentPageStackPerson = 0; // 현재페이지의 누적 인원수

	static int k44_totalPages = 0; // 총 페이지 수

	public static void main(String[] args) {
		// pg30 클래스의 ArrayList
		k44_dataSet(); // 데이터 세팅 메소드
		k44_dataSort();
		for (int k44_i = 0; k44_i < k44_totalPages; k44_i++) { // 페이지수만큰 도는 for문 작성(현재7페이지)
			k44_HeaderPrint(k44_i); // 페이지 정보, 출력일자가 담긴 머릿글 출력

			for (int k44_j = 0; k44_j < k44_currentPagePerson; k44_j++) {
				k44_ItemPrint(); // 학생의 성적을 출력한다.
			}
			k44_TailPrint(); // 마지막 현재,누적 페이지의 성적합계와 평균을 출력한다.
		}
	}

	public static void k44_dataSet() { // 데이터 세팅 메소드
		for (int k44_i = 1; k44_i <= k44_iPerson; k44_i++) { // 총 인원수 만큼 도는 for문 작성
			String k44_name = String.format("홍길%02d", k44_i); // 포멧에 맞게 이름입력
			int k44_kor = (int) (Math.random() * 100); // 0부터 99까지 생성하는 랜덤함수로 성적입력
			int k44_eng = (int) (Math.random() * 100); // 0부터 99까지 생성하는 랜덤함수로 성적입력
			int k44_mat = (int) (Math.random() * 100); // 0부터 99까지 생성하는 랜덤함수로 성적입력
			// 클래스 어레이에 입력한 값들을 가진 클래스 추가
			k44_ArrayOncRec.add(new k44_OneRec(k44_i, k44_name, k44_kor, k44_eng, k44_mat));
		}
		// 총페이지 계산하는 if
		if (k44_iPerson % k44_pgPerson == 0) {
			k44_totalPages = k44_iPerson / k44_pgPerson;
		} else {
			k44_totalPages = (k44_iPerson / k44_pgPerson) + 1;
		}
	}

	public static void k44_dataSort() { // 데이터를 오름차순하는 메소드
		// pg34_OneRec에 대한 Comparator 선언
		Comparator<k44_OneRec> k44_sort = new Comparator<k44_OneRec>() {
			public int compare(k44_OneRec a1, k44_OneRec a2) { // 비교할 두 값을 선언
				return (a2.k44_getSum() - a1.k44_getSum()); // 성적합에 대한 데이터를 비교한다.
			}
		};
		Collections.sort(k44_ArrayOncRec, k44_sort); // 그에 따라 클레스 리스트의 순서를 바꾼다.
	}

	public static void k44_HeaderPrint(int k44_i) {
		// 시간의 형태를 짜둔다.
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		// 현재시간을 가져온다.
		Date k44_time = new Date();
		// 선언한 문자열에 포멧에 맞춰 시간을 입력한다.
		String k44_time1 = format1.format(k44_time);

		System.out.printf("PAGE: %d            출력일자 : " + k44_time1 + "\n", k44_i + 1); // 현재 페이지(0이라 + 1)와 날짜를 출력한다.
		System.out.println("==================================================");
		System.out.printf("%-2.2s %-4.4s %4.4s %5.5s %5.5s %5.5s %4.4s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균"); // 구분
		System.out.println("==================================================");
		// 페이지별 인원수 설정
		if (k44_i + 1 == k44_totalPages) { // 마지막페이지라면
			if (k44_iPerson % k44_pgPerson == 0) { // 총인원 = 페이지당 인원 동일할때 0명 뜨는 에레 수정
				k44_currentPagePerson = k44_pgPerson; // 총인원수 입력
			} else {
				k44_currentPagePerson = k44_iPerson % k44_pgPerson; // 200 30 이라면 20명이 들어간다.
			}
		} else {
			k44_currentPagePerson = k44_pgPerson; // 나머지의 경우 페이지에 페이지당 인원을 넣는다.
		}
		// 페이지당 누적인원 계산
		k44_currentPageStackPerson += k44_currentPagePerson;

	}

	public static void k44_ItemPrint() { // 학생 성적출력 메소드
		k44_OneRec k44_rec; // 클래스 선언
		// 클래스 리스트에서 k44_counter번째 클래스 선언
		k44_rec = k44_ArrayOncRec.get(k44_counter);
		// 학번, 이름, 국어, 영어, 수학, 합계, 평균을 출력하는 printf 선언
		System.out.printf("%03d %5.5s %5d %7d %7d %7d %7.2f\n", k44_rec.k44_getStudentId(), k44_rec.k44_getName(),
				k44_rec.k44_getKor(), k44_rec.k44_getEng(), k44_rec.k44_getMat(), k44_rec.k44_getSum(),
				k44_rec.k44_getAve());

		k44_counter++; // 다음학생으로 넘기는 ++
		// 학생의 성적을 페이지 점수와 누적 점수별 / 과목별로 나눠서 누적한다.
		k44_sumKorCurrent += k44_rec.k44_getKor();
		k44_sumKorTotal += k44_rec.k44_getKor();
		k44_sumEngCurrent += k44_rec.k44_getEng();
		k44_sumEngTotal += k44_rec.k44_getEng();
		k44_sumMatCurrent += k44_rec.k44_getMat();
		k44_sumMatTotal += k44_rec.k44_getMat();
		k44_sumSumCurrent += k44_rec.k44_getSum();
		k44_sumSumTotal += k44_rec.k44_getSum();
		k44_sumAveCurrent += k44_rec.k44_getAve();
		k44_sumAveTotal += k44_rec.k44_getAve();

	}

	public static void k44_TailPrint() {
		System.out.println("==================================================");

		System.out.println("현재페이지");
		// 현재 페이지의 과목별 성적합을 보여준다. k44_inData 클래스에서 k44_curSubjectSum 메소드에 k44_i(몇 페이지)와
		// 각 성적의 배열을 보내주고, 과목별 성적합을 리턴.
		// 평균은 실수형이기 때문에 k44_curAveSum의 메소드 따로 생성
		System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "합계", k44_sumKorCurrent, k44_sumEngCurrent,
				k44_sumMatCurrent, k44_sumSumCurrent, k44_sumAveCurrent);

		// 현재 페이지의 과목별 평균을 보여준다. k44_inData 클래스에서 k44_cursubjectAve 메소드에 k44_i(몇 페이지)와 각
		// 성적의 배열을 보내주고, 과목별 평균을 리턴.
		// 평균은 실수형이기 때문에 k44_curaveAve의 메소드 따로 생성
		System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n", "평균",
				(double) k44_sumKorCurrent / k44_currentPagePerson, (double) k44_sumEngCurrent / k44_currentPagePerson,
				(double) k44_sumMatCurrent / k44_currentPagePerson, (double) k44_sumSumCurrent / k44_currentPagePerson,
				(double) k44_sumAveCurrent / k44_currentPagePerson);

		System.out.println("==================================================");

		// 지금까지 페이지의 과목별 성적합을 보여준다. k44_inData 클래스에서 k44_totalSubjectSum 메소드에 k44_i(몇
		// 페이지)와 각 성적의 배열을 보내주고, 과목별 성적합을 리턴.
		// 평균은 실수형이기 때문에 k44_totalAveSum의 메소드 따로 생성
		System.out.println("누적페이지");
		System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "합계", k44_sumKorTotal, k44_sumEngTotal, k44_sumMatTotal,
				k44_sumSumTotal, k44_sumAveTotal);

		// 지금까지 페이지의 과목별 평균을 보여준다. k44_inData 클래스에서 k44_totalsubjectAve 메소드에 k44_i(몇
		// 페이지)와 각 성적의 배열을 보내주고, 과목별 평균을 리턴.
		// 평균은 실수형이기 때문에 k44_totalaveAve의 메소드 따로 생성
		System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n\n\n", "평균",
				(double) k44_sumKorTotal / k44_currentPageStackPerson,
				(double) k44_sumEngTotal / k44_currentPageStackPerson,
				(double) k44_sumMatTotal / k44_currentPageStackPerson,
				(double) k44_sumSumTotal / k44_currentPageStackPerson,
				(double) k44_sumAveTotal / k44_currentPageStackPerson);
		// 다음페이지로 넘어갈때 페이지별 성적 초기화
		k44_sumKorCurrent = 0;
		k44_sumEngCurrent = 0;
		k44_sumMatCurrent = 0;
		k44_sumSumCurrent = 0;
		k44_sumAveCurrent = 0;

	}

}