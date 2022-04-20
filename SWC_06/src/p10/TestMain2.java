package p10;

public class TestMain2 {

	public static void main(String[] args) {
		
		k44_Calc1 k44_cc = new k44_Calc1();	//Clac1클래스를 불러와 새로운 인스턴스 cc를 만들었다.

		System.out.printf("2개 덧셈이 호출됨 [%d]\n", k44_cc.k44_sum(1,2)); 
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", k44_cc.k44_sum(1,2,3));
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", k44_cc.k44_sum(1,2,3,4));
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n", k44_cc.k44_sum(1.2, 3.4));
		
		//서로 인자를 달리하여 한가지 메소드로 다양한 결과값들을 불러오는 메소드 오버로딩
	}

}