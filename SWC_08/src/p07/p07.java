package p07;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;

import java.io.IOException;

public class p07 {

	public static void main(String[] args) throws IOException {//try catch문을 쓰지 않고 에러가 나도 throw할 수 있도록 설정

		File k44_f = new File("C:\\Users\\501-01\\Desktop\\성남시_무료와이파이정보.csv"); //File 클래스의 인스턴스 f를 만들어 .csv파일을 불러온다.
		BufferedReader k44_br = new BufferedReader(new FileReader(k44_f)); // import한 BufferedWriter클래스에 인스턴스 bw를 만들어 위에서 불러온 파일에 쓰기모드가 가능토록 만들어준다.

		String k44_readtxt;	//읽어올 데이터를 저장할 String 자료형의 readtxt 변수 설정

		if ((k44_readtxt = k44_br.readLine()) == null) {	//!!!!!이때 우선 readline메소드로 읽어온 한줄 데이터들을 변수 String에 저장하는게 1번! 그리고 나서 그 값이 null인지 조건검사하는게 2번!!!
			System.out.printf("빈 파일입니다.\n");	//만약 null이라면 빈 파일이라는 안내문을 출력한다.
			return;
		}

		String[] k44_field_name = k44_readtxt.split(",");	//첫째줄(왜냐하면 반복을 안함) = 항목 명을 저장한 String변수 readtxt를 ","로 나누어 field_name 배열에 저장한다.

		int k44_LineCnt = 0;	//몇번째 줄인지를 카운트할 변수 설정
		while ((k44_readtxt = k44_br.readLine()) != null) {	//while을 돌릴 때마다 br.readLine을 readtxt에 담는 코드를 먼저 실행하는 것이였다!!!그래서 다음줄 다음줄 진행할 수 있었따!!!
			
			String[] k44_field = k44_readtxt.split(",");	//데이터들(엘리멘트들)(왜냐? 위에서 readLine으로 한줄 읽어놧어서 이제 2번째 부터)을 저장한 String변수 readtxt를 ","로 나누어 field 배열에 저장한다.
			System.out.printf("**[%d번째 항목]*************\n", k44_LineCnt);
			for (int k44_j = 0; k44_j < k44_field_name.length; k44_j++) {	//항목의 (세로줄) 가짓수만큼 반복한다. while안에 있으므로 2중반복.
				System.out.printf(" %s : %s\n", k44_field_name[k44_j], k44_field[k44_j]);
			}
			System.out.printf("****************************\n");
			if (k44_LineCnt == 100)	//100번동안 while문이 돌았으면 빠져나오기.
				break;

			k44_LineCnt++; //무한루프 돌지 않도록 조건변수값에 1씩 더하기.

		}
		k44_br.close();//BufferedReader클래스의 close메소드를 통해 쓰기모드를 종료해준다.

	}

}
