package Java_03;

public class StringClass {

	public static void main(String[] args) {
		String text = "Hello,hi";
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(2));

		char[] c = text.toCharArray();
		System.out.println(c[0]);

		System.out.println(text.replace("H", "h"));

		String[] t = text.split(",");
		System.out.println(t[0]);
		System.out.println(t[1]);
		System.out.println(t[2]);

	}

}
