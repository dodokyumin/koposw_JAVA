package p11;

public class TestMain {

	public static void main(String[] args) {
		
		k44_ReportCard k44_rc = new k44_ReportCard(); //ReportCard클래스를 불러와 새로운 인스턴스 rc를 만들었다.

		k44_rc.k44_printMon(100, 100, 100);	//rc에 정수형 파라미터 셋을 보내 정수형 파라미터 셋을 받는 함수를 호출함
		
		k44_rc.k44_printMon(100, 100, 100, 100);	//rc에 정수형 파라미터 넷을 보내 정수형 파라미터 넷을 받는 함수를 호출함
		
		k44_rc.k44_printMon(100, 100, 100, 100, 100);	//rc에 정수형 파라미터 다섯을 보내 정수형 파라미터 다섯을 받는 함수를 호출함

	}

}