package p30;

import java.util.ArrayList;

public class Main01 {
	
	static ArrayList<OneRec> ArrayOneRec = new ArrayList <OneRec>();
	static int sumkor = 0;
	static int sumeng = 0;
	static int summat = 0;
	static int sumsum = 0;
	static int sumave = 0;
	static final int iPerson = 20;
	
	public static void dataSet() {
		
		for(int i=0; i<iPerson; i++) {
			String name = String.format("홍길%02d", i);	//이름만들기
			int kor = (int)(Math.random()*100);	//국어점수 만들기
			int eng = (int)(Math.random()*100);	//영어점수 만들기
			int mat = (int)(Math.random()*100);	//수학점수 만들기
			ArrayOneRec.add(new OneRec(i, name, kor, eng, mat));	//하나의  OneRec클래스를 생성후 ArrayList에 집어넣었다.
		}
		
	}
	
	//헤더 인쇄
	public static void HeaderPrint() {
		System.out.println("****************************************");
		System.out.printf("%2s %4s %2s %2s %2s %2s   %2s\n","번호","이름","국어","영어","수학","합계","평균");
		System.out.println("****************************************");
	}
	
	//내용 인쇄
	public static void ItemPrint(int i) {
		OneRec rec;
		
		rec = ArrayOneRec.get(i);
		System.out.printf("%4d %4s %3d %3d %3d    %3d   %6.2f\n", rec.student_id(), rec.name(), rec.kor(), rec.eng(), rec.mat(),rec.sum(),rec.ave());

		sumkor+=rec.kor();
		sumeng+=rec.eng();
		summat+=rec.mat();
		sumsum+=rec.sum();
		sumave+=rec.ave();
	}
		
	//꼬리 인쇄
	public static void TailPrint() {
		System.out.println("****************************************");
		System.out.printf("국어합계 %d   국어평균: %6.2f\n",sumkor ,sumkor/(double)ArrayOneRec.size());
		System.out.printf("영어합계 %d   영어평균: %6.2f\n",sumeng ,sumeng/(double)ArrayOneRec.size());
		System.out.printf("수학합계 %d   수학평균: %6.2f\n",summat ,summat/(double)ArrayOneRec.size());
		System.out.println("****************************************");
		System.out.printf("반평균합계 %d   반평균: %6.2f\n",sumave ,sumave/(double)ArrayOneRec.size());
	}

}
