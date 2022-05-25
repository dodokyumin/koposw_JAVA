package DBTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
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
		System.out.println("시작 시간       : " + k44_startTime); 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()을 통해 드라이버를 로드한다.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33063/koposw44?useSSL=false", "root", "koposw44");
		//드라이버 매니저의 getConnection 메소드로 인자(mysql경로,id,pwd)를 보내어 DB에 연결한다.
		//연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
		
		String QueryText=String.format("insert into wifi(num,addr,lat,lng)"+//10
				"values(?,?,?,?,?)");
		
		PreparedStatement pstmt = conn.prepareStatement(QueryText); 
		//conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
		
		File f = new File("C:\\Users\\501-01\\Desktop\\와이파이.csv");
		//해당 경로의 파일을 파일형 변수 f에 담아 구조화 시킨다.
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		//FileReader로 파일f를 가져오고 버퍼를 이용해서 파일을 읽는 BufferedReader의 인스턴스 br에 담아 구조화시킨다.
		
		String readtxt;
		//텍스트를 읽어 담아둘 String변수 설정.
		
		if((readtxt = br.readLine()) == null) {
		//만약 버퍼리더로 읽어온 라인을 저장한 readtxt가 null, 즉 값이 없다면,
			System.out.println("빈 파일입니다.");
		//빈 파일 이라는 안내문 출력
			return;
		}
		
		String[] field_name = readtxt.split(",");
		
		int LineCnt = 0;
		
		conn.setAutoCommit(false);
		
		long startTime = System.currentTimeMillis();
		
		double lat = 37.3860521;//자신의 위도 값
		double lng = 127.1214038;//자신의 경도 값
		int cnt = 1;
		while((readtxt = br.readLine()) != null) { 
		//만약 버퍼리더로 읽어온 라인을 저장한 readtxt가 null이 아니라면, 즉 값이 있다면,
			String[] field = readtxt.split(",");
			//탭으로 분류한 txt파일이니 읽어온 라인을 탭 기준으로 나누어 배열에 저장한다.
			
			pstmt.setLong(1,cnt);
			pstmt.setString(2,field[9]);
			pstmt.setString(3,field[12]);
			pstmt.setString(4,field[13]);
			double latitude = Double.parseDouble(field[12]);
			double longitude = Double.parseDouble(field[13]);
			pstmt.setLong(5, 
					(int)(Math.sqrt( Math.pow( latitude-lat,2) + Math.pow(longitude-lng,2) )));
			
			
			
			pstmt.addBatch();
			
			pstmt.clearParameters();
			
			LineCnt++;
			
			try {
				if(LineCnt%100 == 0) {
					pstmt.executeBatch();
					conn.commit();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			cnt++;
		}
		
		conn.commit();
		
		conn.setAutoCommit(true);
		
		long endTime = System.currentTimeMillis();
		
		System.out.printf("Insert End\n");
		
		k44_endTime = k44_sdformat.format(k44_cal.getTime());	//프로그램이 끝나는 시점 시간을 가져옴
		System.out.println( "완료 시간       : " + k44_endTime);
		
		System.out.printf("토탈 라인 카운트  : %d\n", LineCnt);
		
		System.out.printf("걸린 시간         : %dms\n", endTime - startTime);
		
		br.close();//열었던 br을 닫아주어 메모리 확보.
		pstmt.close();//열었던 stmt을 닫아주어 메모리 확보.
		conn.close();//열었던 conn을 닫아주어 메모리 확보.
	}

}
