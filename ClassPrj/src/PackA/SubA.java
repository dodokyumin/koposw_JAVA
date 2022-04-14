package PackA;

public class SubA {
	//클래스와 같은 이름의 자료형이 없는 생성자 => 오브젝트를 생성하면 무조건 호출이 된다.
	public SubA() {
		System.out.println("Object Created");
	}
	//생성자의 오버로드(인자갯수나 자료형이 변경 되면서 오버로드됨)
	public SubA(String name) {
		System.out.println(name + "Object Created");
	}
	
	//메소드 생성
	public void printMultiple( ) {
		System.out.println("multipple");
	}
	//메소드 생성
	public void printHelloWorld( ) {
			System.out.println("Hello World");
	}
}
