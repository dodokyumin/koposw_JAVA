package PackA;

//다른 패키지의 자바파일 불러오기
import PackB.Sub2;

public class Main {

	public static void main(String[] args) {
		System.out.println("iloveyou");
		
		//객체(클래스) 생성
		SubA suba = new SubA("kyumin"/*여기에 인자를 넣어주면 오버로드된 클래스가 실행된다*/);
		
		suba.printMultiple();
		suba.printHelloWorld();
	}	
	
	Sub2 addA = new Sub2();
	Sub2 addB = new Sub2();
	Sub2 addC = new Sub2();
	Sub2 addD = new Sub2();
}
