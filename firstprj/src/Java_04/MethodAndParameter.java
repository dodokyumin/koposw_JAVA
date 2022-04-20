package Java_04;

public class MethodAndParameter {
	public static void sexy(String text) {
		System.out.println(text + 1);
	}
	public static void sexy(String text, String text2) {//이것이 바로 함수의 오버로딩
		System.out.println(text +" "+ text2);
	}
	
	
	
	public static void main(String[] args) {
		sexy("abc");
		sexy("kim","min");
	}


}
