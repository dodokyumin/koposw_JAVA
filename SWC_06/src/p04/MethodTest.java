package p04;

public class MethodTest {

	public static void main(String[] args) {
		
		MethodTest.k44_iamMethod();	//MethodTest클래스에서(본인) iamMethod라는 함수를 찾아온다. 본인 클래스 안에 있다면 함수 이름만으로 불러올 수 있다.
		
		k44_iamMethod();	//함수 실행하기.
	}
	
	public static void k44_iamMethod() {
		System.out.printf("메소드라 불러줘요~\n");
	}

}