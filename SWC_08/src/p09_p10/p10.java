package p09_p10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class p10 {

	public static void main(String[] args) throws IOException {
		String k44_startTime = null; //종료시점에 프린트할 시작시간과 종료시간 변수 설정.
		String k44_endTime = null;
		Date k44_date = new Date();
		// 포맷변경 ( 년월일 시분초)
		SimpleDateFormat k44_sdformat = new SimpleDateFormat("HH시 mm분 ss초"); 
		//  Java 시간 더하기
		Calendar k44_cal = Calendar.getInstance();
		k44_cal.setTime(k44_date);
		//시작시간 출력
		k44_startTime = k44_sdformat.format(k44_cal.getTime());  
		System.out.println("시작 시간 : " + k44_startTime); 
		
		//프로그램 시작시간 카운트
		long k44_start = System.currentTimeMillis();
		int k44_rCnt = 0; //BufferedReader로 파일을 읽을 때마다 카운트를++ 하고, ++한 카운트를 저장할 변수를 생성한다.
		int k44_wCnt = 0; //BufferedWriter로 파일을 쓸 때마다 카운트를++ 하고, ++한 카운트를 저장할 변수를 생성한다.
		
		File k44_f = new File("C:\\Users\\501-01\\Desktop\\day_data\\THTSKS010H00.dat");	//File 클래스의 인스턴스 f를 만들어 .dat파일을 불러온다.
		BufferedReader k44_br = new BufferedReader(new FileReader(k44_f));	//인스턴스 f파일을 읽는 buffer인스턴스 br을 생성했다.
		File k44_f1 = new File("C:\\Users\\501-01\\Desktop\\day_data\\StockDailyPrice.csv");	//File 클래스의 인스턴스 f를 만들어 .dat파일을 불러온다.
		BufferedWriter k44_bw1 = new BufferedWriter(new FileWriter(k44_f1));	//인스턴스 f파일을 읽는 buffer인스턴스 br을 생성했다.
		
		String k44_readtxt;	//데이터를 읽어올때 해당 데이터 스트링을 담아줄 변수 설정
		
		int k44_cnt= 0; int k44_wcnt = 0;	//읽기 카운트와 쓰기 카운트를 담아줄 int형 변수 설정
		
		
		while((k44_readtxt=k44_br.readLine())!=null) {
			k44_rCnt ++;
			StringBuffer k44_s = new StringBuffer(); //StringBuffer 클래스의 인스턴스 s를 만든다.
			String[] k44_field = k44_readtxt.split("%_%"); //첫번째 항목 즉 리스트의 값을 정제하여 필드 배열에 저장하기.
			
			if(k44_field.length > 2&&k44_field[2].replace("^", "").trim().substring(0, 1).equals("A")) {//항목 갯수가 2개가 넘으면서 동시에 해당 리스트를 정제한 값이 해당 문자열과 같을 때
				k44_wCnt ++;
				k44_s.append(k44_field[0].replace("^", "").trim()); //첫번째 칸에 0번 항목을 저장
				for (int j=0; j<k44_field.length; j++) {
					k44_s.append("."+k44_field[j].replace("^", "").trim());
				}//쓸 스트링버퍼에 정제된 데이터를 append해주면서 설정
				
				k44_bw1.write(k44_s.toString()); //버퍼스트링을 스트링으로 변환해 파일에 쓰기
				k44_bw1.newLine(); //줄바꿈
				k44_wcnt++;
			}
			k44_cnt++;
		}
		
		k44_br.close();//버퍼 리딩 끄기
		k44_bw1.close();//버퍼 라이팅 끄기
		
		long k44_end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		int k44_takeSec = (int) (( k44_end - k44_start )/1000.0);	//끝나는시점 -시작시점 = 총 걸린시간
		k44_cal.add(Calendar.SECOND, k44_takeSec); //총 걸린 시간만큼 변수에 저장
		k44_endTime = k44_sdformat.format(k44_cal.getTime());	//프로그램이 끝나는 시점 시간을 가져옴
		System.out.println( "완료 시간 : " + k44_endTime);
		System.out.println( "걸린 시간 : " + ( k44_end - k44_start )/1000 +"초"); //밀리초를 초 단위로 바꿔줌
		System.out.println("읽은 갯수 : " + k44_rCnt);
		System.out.println("기록 갯수 : " + k44_wCnt);
		
		
	}

}
