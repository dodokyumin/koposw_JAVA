package p05;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class p5 {

	public static void main(String[] args) {

		try {	//try 구문을 돌려 아래 코드들을 실행하고, catch를 통해 해당 이벤트가 발생하면 catch코드를 실행한다.
			File k44_f = new File("C:\\Users\\501-01\\Desktop\\Mytest.txt");	//import한 File클래스에 인스턴스f를 만들어 해당 경로에 있는 txt파일을 불러온다.
			FileWriter k44_fw = new FileWriter(k44_f);	//import한 FileWriter클래스에 인스턴스 fw를 만들어 위에서 불러온 파일에 쓰기모드가 가능토록 만들어준다.

			k44_fw.write("안녕 파일\n");	//FileWriter클래스의 write메소드를 통해 괄호 안의 string을 불러온 fw에 입력한다.

			k44_fw.write("hello 헬로\n");	//FileWriter클래스의 write메소드를 통해 괄호 안의 string을 불러온 fw에 입력한다.

			k44_fw.close();	//FileWriter클래스의 close메소드를 통해 쓰기모드를 종료해준다.

			FileReader k44_fr = new FileReader(k44_f);	//import한 FileReader클래스에 인스턴스 fr를 만들어 위에서 불러온 파일에 읽기모드가 가능토록 만들어준다.

			int k44_n = -1;	
			char[] k44_ch;	

			while (true) {
				k44_ch = new char[100];	//캐릭터형 배열 변수 ch의 크기를 넉넉잡아 100으로 설정해주었다.
				k44_n = k44_fr.read(k44_ch);	//fr파일(txt)를 읽어오면서 배열ch에 저장을 하는데, 
				//read 메소드의 리턴타입은 int형 이므로 읽어온 캐릭터가 있으면 1, 없으면 -1을 반환한다.

				if (k44_n == -1)	//n의 값이 -1즉, null일 때 이 반복문을 종료한다.
					break;

				for (int k44_i = 0; k44_i < k44_n; k44_i++) {	
					System.out.printf("%c", k44_ch[k44_i]);	//배열에 저장한 캐릭터 하나하나씩 불러와 출력한다.

				}

				k44_fr.close();	//FileReader클래스의 close메소드를 통해 읽기모드를 종료해준다.

				System.out.printf("\n FILE READ END ");
			}
		} catch (Exception k44_e) {	//예외처리구문을 통해 Exception 즉, 모든 예외오류발생문을 변수e에 담고, 이 이벤트가 발생하면 e에 담긴 구문을
			System.out.printf("나 에러[%s]\n", k44_e);	//화면에 출력,printf 한다.
		}
	}
}
