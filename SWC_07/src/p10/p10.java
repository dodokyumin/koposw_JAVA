package p10;

public class p10 {

	public static void main(String[] args) {

		System.out.printf("HanBlankForeword[%s]\n", k44_HanBlankForeword("한글abcd", 15)); //생성한 메소드에 문자열과 정수형 값 파라미터로 전달.
		System.out.printf("HanBlankForeword[%s]\n", k44_HanBlankForeword("한글한글aa", 15));//생성한 메소드에 문자열과 정수형 값 파라미터로 전달.
		System.out.printf("HanBlankBackword[%s]\n", k44_HanBlankBackword("한글aa", 15));//생성한 메소드에 문자열과 정수형 값 파라미터로 전달.
		System.out.printf("HanBlankBackword[%s]\n", k44_HanBlankBackword("한글한글aa", 15));//생성한 메소드에 문자열과 정수형 값 파라미터로 전달.
		System.out.printf("한글은[%d]개\n", HanCount("한글한글aa"));//생성한 메소드에 문자열 파라미터 전달하기

	}

	private static String k44_HanBlankBackword(String k44_string, int k44_i) { //이 메소드는 문자열 값과 정수형 파라미터를 받는다.

		String str = k44_string; //받은 문자열을 정제 후 리턴값에 담아 보내줄 변수 선언
		for (int k44_j = 0; k44_j < k44_i; k44_j++) { //파라미터로 받은 정수 값 만큼의 루프를 돌린다.
			str += " "; //리턴할 문자열의 뒤에 한칸씩 공백을 붙여주는 메소드

		}
		return str; //정제한 문자열 리턴
	}

	private static String k44_HanBlankForeword(String string, int k44_i) {//이 메소드는 문자열 값과 정수형 파라미터를 받는다.

		String k44_str = string;//받은 문자열을 정제 후 리턴값에 담아 보내줄 변수 선언
		for (int k44_j = 0; k44_j < k44_i; k44_j++) {//파라미터로 받은 정수 값 만큼의 루프를 돌린다.
			k44_str = " " + k44_str;//리턴할 문자열의 앞에 한칸씩 공백을 붙여주는 메소드

		}
		return k44_str; //정제한 문자열 리턴
	}

	private static int HanCount(String k44_string) {//이 메소드는 문자열 파라미터를 받는다.

		String k44_str = k44_string;//받은 문자열을 정제 후 리턴값에 담아 보내줄 변수 선언
		int k44_bitCount = 0;//받은 문자열을 비트 단위로 나누어 갯수를 센 값을 담을 정수형 변수 선언

		for (int k44_i = 0; k44_i < k44_str.length();) {//루프는 받은 문자열의 길이만큼 돈다.

			if (k44_str.substring(k44_i, k44_i + 1).getBytes().length == 2) {//한글자씩 떼어내는데, 만약 바이트 길이가 2가 된다면,(한글)
				k44_bitCount += 1; //카운트에 1을 더 더하여준다.
			}

			k44_i++;
		}

		return k44_bitCount; //마지막으로 다 더해진 변수 카운트값 출력.
	}
}
