package Java_04;

public class MethodAndParameter {
	public static void sexy(String text) {
		System.out.println(text + 1);
	}
	public static void sexy(String text, String text2) {//�̰��� �ٷ� �Լ��� �����ε�
		System.out.println(text +" "+ text2);
	}
	
	
	
	public static void main(String[] args) {
		sexy("abc");
		sexy("kim","min");
	}


}
