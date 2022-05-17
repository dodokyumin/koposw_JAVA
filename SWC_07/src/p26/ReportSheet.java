package p26;

public class ReportSheet {

	public static void main(String[] args) {
		
		int k44_iPerson = 10;	//사람 수 설정하기
		
		k44_OneRec[] k44_inData = new k44_OneRec[k44_iPerson];	//인스턴스 데이터들을 담을 OneRec자료형의 배열 inData를 선언해준다.

		k44_inData[0] = new k44_OneRec("홍길01",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));	//인스턴스를 생성하면서 값을 넣어주고 배열에 담는다
		k44_inData[1] = new k44_OneRec("홍길02",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		k44_inData[2] = new k44_OneRec("홍길03",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		k44_inData[3] = new k44_OneRec("홍길04",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		k44_inData[4] = new k44_OneRec("홍길05",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		//해당 값들을 포맷에 맞게 프린트한다.
		System.out.printf("이름 %s, 국어 %d, 영어 %d, 수학 %d, 총점 %d, 평균 %.2f\n",k44_inData[0].k44_name(),k44_inData[0].k44_kor(),k44_inData[0].k44_eng(),k44_inData[0].k44_mat(),k44_inData[0].k44_sum(),k44_inData[0].k44_ave());	
		System.out.printf("이름 %s, 국어 %d, 영어 %d, 수학 %d, 총점 %d, 평균 %.2f\n",k44_inData[1].k44_name(),k44_inData[1].k44_kor(),k44_inData[1].k44_eng(),k44_inData[1].k44_mat(),k44_inData[1].k44_sum(),k44_inData[1].k44_ave());
		System.out.printf("이름 %s, 국어 %d, 영어 %d, 수학 %d, 총점 %d, 평균 %.2f\n",k44_inData[2].k44_name(),k44_inData[2].k44_kor(),k44_inData[2].k44_eng(),k44_inData[2].k44_mat(),k44_inData[2].k44_sum(),k44_inData[2].k44_ave());
		System.out.printf("이름 %s, 국어 %d, 영어 %d, 수학 %d, 총점 %d, 평균 %.2f\n",k44_inData[3].k44_name(),k44_inData[3].k44_kor(),k44_inData[3].k44_eng(),k44_inData[3].k44_mat(),k44_inData[3].k44_sum(),k44_inData[3].k44_ave());
		System.out.printf("이름 %s, 국어 %d, 영어 %d, 수학 %d, 총점 %d, 평균 %.2f\n",k44_inData[4].k44_name(),k44_inData[4].k44_kor(),k44_inData[4].k44_eng(),k44_inData[4].k44_mat(),k44_inData[4].k44_sum(),k44_inData[4].k44_ave());

		
	}

}