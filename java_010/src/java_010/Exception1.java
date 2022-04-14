package java_010;

public class Exception1 {

	public static void main(String[] args) {
		int[] numbers = { 5, 10, 12 };

		try {
			System.out.println(numbers[3]);
		} catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBounds Exception");

		} catch (NullPointerException e) {

			e.printStackTrace();
			System.out.println("NullPointer Exception");

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("General Exception");
			
		} finally {
			System.out.println("finally");
		}

	}

}
