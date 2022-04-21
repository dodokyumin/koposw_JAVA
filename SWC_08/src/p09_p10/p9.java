package p09_p10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class p9 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\501-01\\Desktop\\day_data\\THTSKS010H00.dat");	//File 클래스의 인스턴스 f를 만들어 .dat파일을 불러온다.
		BufferedReader br = new BufferedReader(new FileReader(f));	//인스턴스 f파일을 읽는 buffer인스턴스 br을 생성했다.
		
		String readtxt;
		int LineCnt = 0;	//라인 카운트를 담아줄 변수 LineCnt를 설정한다.
		int n = -1;
		StringBuffer s = new StringBuffer(); //StringBuffer 클래스의 인스턴스 s를 만든다.
		
		while(true) {
			
			char[] ch = new char[1000];	//캐릭터형 배열 변수 ch의 크기를 넉넉잡아 1000으로 설정해주었다.
			
			n = br.read(ch);	//br 파일(dat)를 읽어오면서 배열ch에 저장을 하는데, 
			
			if (n == -1) break;	//n의 값이 -1즉, null일 때 이 반복문을 종료한다.
			
			for(char c : ch) {	//ch에서 차례대로 객체를 꺼내서 c에다가 넣겠다는 의미!!!
				if(c =='\n') {	//만약 꺼낸 데이터 c가 줄바꿈이면
					System.out.printf("[%s]***\n",s.toString());	//스트링버퍼의 메소드 toString하여 출력
					s.delete(0, s.length());	//그리고 해당 s의 0번쨰 문자부터 끝까지(s.length)를 삭제
				}else {
					s.append(c);	//아니라면 s에 c붙이기
				}
			}
			LineCnt++;	//라인카운트++ 해주어 while문이 끝날 수 있게.
		}
		
		System.out.printf("[%s]***\n",s.toString());
		br.close();
		
	}

}
