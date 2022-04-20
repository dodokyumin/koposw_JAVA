package p15_p18;

public class TestMain2 {

	public static void main(String[] args) {
		
		new k44_TVRemocon();
		
		k44_TVRemoconX k44_MSG = new k44_TVRemoconX();	//TVRemoconX클래스의 인스턴스를 만들어 변수 MSG에 저장한다.
		
		k44_MSG.k44_checkBat();	//인스턴스MSG의 메소드 checkBat을 불러온다.
		
	}

}