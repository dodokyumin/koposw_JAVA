package p11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class p11_3 {

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
		
		//프로그램 시작시간 카운트
		long k44_start = System.currentTimeMillis();
		
		int k44_rCnt = 0; //BufferedReader로 파일을 읽을 때마다 카운트를++ 하고, ++한 카운트를 저장할 변수를 생성한다.
		int k44_wCnt = 0; //BufferedWriter로 파일을 쓸 때마다 카운트를++ 하고, ++한 카운트를 저장할 변수를 생성한다.
		
		File k44_f = new File("C:\\Users\\501-01\\Desktop\\day_data\\THTSKS010H00.dat"); // File 클래스의 인스턴스 f를 만들어 .dat파일을 불러온다.
		BufferedReader k44_br = new BufferedReader(new FileReader(k44_f)); // 인스턴스 f파일을 읽는 buffer인스턴스 br을 생성했다.

		String k44_readtxt;	//읽어온 데이터를 저장할 문자열 변수 설정을 하였다.
		
		double  k44_k44_Min = 0, k44_Max = 0;	
		String k44_MinDay = "";
		String k44_MaxDay = "";
		while ((k44_readtxt = k44_br.readLine()) != null) {	//우선적으로 해당 파일의 다음 라인을 readtxt변수에다가 저장을 한다! 그리고 다음라인의 값이 null일 때까지 반복문을 돌린다는 뜻.
			k44_rCnt ++;	//한번 돌릴 때마다 카운트 1추가
			StringBuffer k44_s = new StringBuffer(); // StringBuffer 클래스의 인스턴스 s를 만든다.
			String[] k44_field = k44_readtxt.split("%_%");	//저장된 라인의 데이터(정제되지 않음) 사이사이의 %_%을 기준으로 나누어서 필드 배열에 저장
				
			if (k44_field.length > 1 && k44_field[2].replace("^", "").trim().equals("A005930")&& k44_field[1].replace("^", "").trim().contains("2015")) {	//항목 갯수가 2개가 넘으면서 동시에 해당 리스트를 정제한 값이 해당 문자열과 같을 때
				k44_wCnt ++; //쓰기 카운트 1추가
				

				k44_s.append(k44_field[3].replace("^", "").trim());
				int k44_stockClosingPrice = Integer.valueOf(k44_s.toString());
				
				k44_k44_Min = ( k44_k44_Min == 0)? k44_stockClosingPrice : k44_k44_Min;	//처음은 기준이 자기자신이 되므로, 무조건 true가 될 수밖에 없는 삼항연산자를 만들어 초기값을 1번째 필드값으로 설정.
				k44_Max = ( k44_k44_Min == 0)? k44_stockClosingPrice : k44_Max;
				
				if ( k44_k44_Min > k44_stockClosingPrice) {	//자기 기준 자기보다 작은 가격이 있으면 그때마다의 값을 저장해준다.
					k44_k44_Min = k44_stockClosingPrice;
					k44_MinDay = (k44_field[1].replace("^", "").trim()).toString();
				}
				
				if (k44_Max < k44_stockClosingPrice) {	//자기 기준 자기보다 큰 가격이 있으면 그때마다의 값을 저장해준다.
					k44_Max = k44_stockClosingPrice;
					k44_MaxDay = (k44_field[1].replace("^", "").trim()).toString();
				}
			}
		}
		k44_br.close();	//버퍼 리딩 끄기

		System.out.printf("2015년 종가 최대값 가격 : %,d 원\n" , (int)k44_Max);
		System.out.println("2015년 종가 최대값 날짜 : " + k44_MaxDay);
		System.out.printf("2015년 종가 최소값 가격 : %,d 원\n" , (int)k44_k44_Min);
		System.out.println("2015년 종가 최소값 날짜 : " + k44_MinDay);
		
		long k44_end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		int k44_takeSec = (int) (( k44_end - k44_start )/1000.0);	//끝나는시점 -시작시점 = 총 걸린시간
		k44_cal.add(Calendar.SECOND, k44_takeSec); //총 걸린 시간만큼 변수에 저장
		k44_endTime = k44_sdformat.format(k44_cal.getTime());	//프로그램이 끝나는 시점 시간을 가져옴
		
		System.out.println();
		System.out.println("시작 시간 : " + k44_startTime); 
		System.out.println( "완료 시간 : " + k44_endTime);
		System.out.println( "걸린 시간 : " + ( k44_end - k44_start )/1000 +"초"); //밀리초를 초 단위로 바꿔줌
		System.out.println("읽은 갯수 : " + k44_rCnt);
		System.out.println("기록 갯수 : " + k44_wCnt);
	}
}
