package p06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p06 {

	public static void k44_FileWrite() throws IOException { //파일 쓰기를 해줄 함수 구현하기.
		
		File k44_f = new File("C:\\Users\\501-01\\Desktop\\Mytest1.txt");	//File 클래스의 인스턴스 f를 만들어 .txt파일을 불러온다.
		BufferedWriter k44_bw = new BufferedWriter(new FileWriter(k44_f));	//import한 BufferedWriter클래스에 인스턴스 bw를 만들어 위에서 불러온 파일에 쓰기모드가 가능토록 만들어준다.

		k44_bw.write("안녕 파일!");	//BufferedWriter클래스의 write메소드를 통해 괄호 안의 string을 불러온 bw에 입력한다.
		k44_bw.newLine();
		k44_bw.write("hello 헬로!");	
		k44_bw.newLine();

		k44_bw.close();	//BufferedWriter클래스의 close메소드를 통해 쓰기모드를 종료해준다.

	}

	public static void k44_FileRead() throws IOException {	 //파일 읽기를 해줄 함수 구현하기.

		File f = new File("C:\\Users\\501-01\\Desktop\\Mytest1.txt");	//File 클래스의 인스턴스 f를 만들어 .txt파일을 불러온다.
		BufferedReader k44_br = new BufferedReader(new FileReader(f));	//import한 BufferedReader클래스에 인스턴스 br를 만들어 위에서 불러온 파일에 읽기모드가 가능토록 만들어준다.

		String k44_readtxt;	//읽어올 데이터를 저장할 String 자료형의 readtxt 변수 설정

		while ((k44_readtxt = k44_br.readLine()) != null) {	//!!!!!이때 우선 readline메소드로 읽어온 한줄 데이터들을 변수 String에 저장하는게 1번! 그리고 나서 그 값이 null인지 조건검사하는게 2번!!!
			System.out.printf("%s\n", k44_readtxt);	//저장된 readtxt String이 반복문을 통해 반복 출력된다.
		}

		k44_br.close();	//BufferedReader클래스의 close메소드를 통해 쓰기모드를 종료해준다.
	}

	public static void main(String[] args) throws IOException {	//메인메소드

		k44_FileWrite();	//파일쓰기를 하는 함수를 호출
		k44_FileRead();		//파일 읽기를 하는 함수를 호출
	}
}
