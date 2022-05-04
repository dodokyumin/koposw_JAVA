package p26;

public class ReportSheet {

	public static void main(String[] args) {
		
		int k44_iPerson = 10;	//사람 수 설정하기
		
		OneRec[] inData = new OneRec[k44_iPerson];	//인스턴스 데이터들을 담을 OneRec자료형의 배열 inData를 선언해준다.

		inData[0] = new OneRec("홍길01",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));	//인스턴스를 생성하면서 값을 넣어주고 배열에 담는다
		inData[1] = new OneRec("홍길02",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		inData[2] = new OneRec("홍길03",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		inData[3] = new OneRec("홍길04",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		inData[4] = new OneRec("홍길05",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		
		System.out.printf("이름 %s, 국어 %d, 영어 %d, 수학 %d, 총점 %d, 평균 %.2f\n",inData[0].name(),inData[0].kor(),inData[0].eng(),inData[0].mat(),inData[0].sum(),inData[0].ave());	//해당 값들을 포맷에 맞게 프린트한다.
		System.out.printf("이름 %s, 국어 %d, 영어 %d, 수학 %d, 총점 %d, 평균 %.2f\n",inData[1].name(),inData[1].kor(),inData[1].eng(),inData[1].mat(),inData[1].sum(),inData[1].ave());
		System.out.printf("이름 %s, 국어 %d, 영어 %d, 수학 %d, 총점 %d, 평균 %.2f\n",inData[2].name(),inData[2].kor(),inData[2].eng(),inData[2].mat(),inData[2].sum(),inData[2].ave());
		System.out.printf("이름 %s, 국어 %d, 영어 %d, 수학 %d, 총점 %d, 평균 %.2f\n",inData[3].name(),inData[3].kor(),inData[3].eng(),inData[3].mat(),inData[3].sum(),inData[3].ave());
		System.out.printf("이름 %s, 국어 %d, 영어 %d, 수학 %d, 총점 %d, 평균 %.2f\n",inData[4].name(),inData[4].kor(),inData[4].eng(),inData[4].mat(),inData[4].sum(),inData[4].ave());

		
	}

}