package Java_01;

public class Main2 {
	
	public static void gugu(int N) {
		for(int i=1; i<10; i++) {
			int sum = N * i;
			System.out.println(N +" X "+i+" = "+sum);
		}
	}

	public static void main(String[] args) {

		gugu(5);
		
	}
}

