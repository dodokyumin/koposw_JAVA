package p30;

import java.util.ArrayList;

public class Main01 {
	
	static ArrayList<k44_OneRec> k44_ArrayOneRec = new ArrayList <k44_OneRec>();
	static int k44_sumkor = 0; //국어 점수를 전역변수로 세팅하고 초기화
	static int k44_sumeng = 0; //영어 점수를 전역변수로 세팅하고 초기화
	static int k44_summat = 0; //수학 점수를 전역변수로 세팅하고 초기화
	static int k44_sumsum = 0; //점수 합계를 전역변수로 세팅하고 초기화
	static int k44_sumave = 0; //점수 평균을 전역변수로 세팅하고 초기화
	static final int k44_iPerson = 20; //학생 수 설정. 상수로 만들어 변하지 않게끔 세팅
	
	public static void k44_dataSet() {//학생들의 점수를 랜덤을 통해 세팅하는 함수
		
		for(int k44_i=0; k44_i<k44_iPerson; k44_i++) {
			String k44_name = String.format("홍길%02d", k44_i);	//이름만들기
			int k44_kor = (int)(Math.random()*100);	//국어점수 만들기
			int k44_eng = (int)(Math.random()*100);	//영어점수 만들기
			int k44_mat = (int)(Math.random()*100);	//수학점수 만들기
			k44_ArrayOneRec.add(new k44_OneRec(k44_i, k44_name, k44_kor, k44_eng, k44_mat));	//하나의  OneRec클래스를 생성후 ArrayList에 집어넣었다.
		}
		
	}
	
	//헤더 인쇄
	public static void k44_HeaderPrint() { //줄긋기 함수
		System.out.println("****************************************");
		System.out.printf("%2s %4s %2s %2s %2s %2s   %2s\n","번호","이름","국어","영어","수학","합계","평균");
		System.out.println("****************************************");
	}
	
	//내용 인쇄
	public static void k44_ItemPrint(int k44_i) {//정수형 인자를 받고 그만큼 ArrayOneRec의 get함수에 전달,
		k44_OneRec k44_rec; //클래스 생성
		
		k44_rec = k44_ArrayOneRec.get(k44_i);
		System.out.printf("%4d %4s %3d %3d %3d    %3d   %6.2f\n", k44_rec.k44_student_id(), k44_rec.k44_name(), k44_rec.k44_kor(), k44_rec.k44_eng(), k44_rec.k44_mat(),
				k44_rec.k44_sum(),k44_rec.k44_ave()); //포맷에 맞게 출력하기.
		
		k44_sumkor+=k44_rec.k44_kor();//각 과목의 합계점수를 누적하기.
		k44_sumeng+=k44_rec.k44_eng();
		k44_summat+=k44_rec.k44_mat();
		k44_sumsum+=k44_rec.k44_sum();
		k44_sumave+=k44_rec.k44_ave();
	}
		
	//꼬리 인쇄
	public static void k44_TailPrint() {//평균은 어레이 사이즈로 각 과목 합계 점수를 나눈 값이다.
		System.out.println("****************************************");
		System.out.printf("국어합계 %d   국어평균: %6.2f\n",k44_sumkor ,k44_sumkor/(double)k44_ArrayOneRec.size());
		System.out.printf("영어합계 %d   영어평균: %6.2f\n",k44_sumeng ,k44_sumeng/(double)k44_ArrayOneRec.size());
		System.out.printf("수학합계 %d   수학평균: %6.2f\n",k44_summat ,k44_summat/(double)k44_ArrayOneRec.size());
		System.out.println("****************************************");
		System.out.printf("반평균합계 %d   반평균: %6.2f\n",k44_sumave ,k44_sumave/(double)k44_ArrayOneRec.size());
	}

}
