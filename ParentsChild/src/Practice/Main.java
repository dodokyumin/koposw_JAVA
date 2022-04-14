package Practice;
//parents를 extends 해서 객체생성을 따로 안해도 된다. extends는 내용이 있는거
//extends를 쓰고있는 (왼쪽애) 자식
public class Main extends Parents{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.myName();
	}

	@Override
	public void myName() {
		// TODO Auto-generated method stub
		super.myName();
		System.out.println("Son : Jade");
	}

	@Override
	public void myAge() {
		// TODO Auto-generated method stub
		super.myAge();
		System.out.println("Son : 20");
	}

	//우클릭 소스 -> 오버라이드
	
}
