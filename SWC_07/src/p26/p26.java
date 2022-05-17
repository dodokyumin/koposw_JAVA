package p26;

public class p26 {

	public static void main(String[] args) {
		int k44_iPerson = 5; //변수에 iperson 저장
		
		k44_OneRec [] k44_inData = new k44_OneRec[k44_iPerson]; //onerec메소드에 iperson값을 파라미터로 보내는 array인스턴스 생성

		k44_inData[0] = new k44_OneRec("홍길01", 100, 100, 90); //0번쨰 인스턴스의 파라미터에 해당 값들을 넣어주기.
		k44_inData[1] = new k44_OneRec("홍길02", 90, 90, 90);//1번쨰 인스턴스의 파라미터에 해당 값들을 넣어주기.
		k44_inData[2] = new k44_OneRec("홍길03", 80, 70, 90);//2번쨰 인스턴스의 파라미터에 해당 값들을 넣어주기.
		k44_inData[3] = new k44_OneRec("홍길04", 70, 60, 90);//3번쨰 인스턴스의 파라미터에 해당 값들을 넣어주기.
		k44_inData[4] = new k44_OneRec("홍길05", 60, 100, 90);//4번쨰 인스턴스의 파라미터에 해당 값들을 넣어주기.

	}

	
}
