package p14_p17_p18_p20;

public class k44_Elevater4 extends k44_Elevater2 {	//이 클래스는 Elevater2클래스의 자식 클래스이다.

	void k44_repair ( ) {
		k44_help = String.format("수리중입니다.");	//전역 변수인 help를 이어받아 수정할 수 있다.
	}
	
	void k44_up() {	//기존의 up함수를 자식클래스가 받아서 수정내용을 입력하면 이 함수가 실행된다. 오버라이딩!
		
		if (k44_floor >= k44_limit_up_floor) {
			k44_help = "마지막층입니다.";
		} else {
			k44_floor += 2;
			k44_help = String.format("%d층입니다",k44_floor);
		}
		this.k44_down();
	}
	
	void k44_down() {	//기존의 up함수를 자식클래스가 받아서 수정내용을 입력하면 이 함수가 실행된다. 오버라이딩!
		super.k44_down();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.k44_help);
	}
	
}