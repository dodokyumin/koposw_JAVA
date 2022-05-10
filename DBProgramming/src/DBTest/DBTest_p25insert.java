package DBTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p25insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()을 통해 드라이버를 로드한다.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		//드라이버 매니저의 getConnection 메소드로 인자(mysql경로,id,pwd)를 보내어 DB에 연결한다.
		//연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
				
		Statement stmt = conn.createStatement(); 
		//conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
		
		File f = new File("C:\\Users\\501-01\\Documents\\성남시명절공공주차장.txt");
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
		
//		String[] field_name = readtxt.split("\t");
//		
//		int LineCnt = 0;

		while((readtxt = br.readLine()) != null) { 
		//만약 버퍼리더로 읽어온 라인을 저장한 readtxt가 null이 아니라면, 즉 값이 있다면,
			String[] field = readtxt.split("\t");
			//탭으로 분류한 txt파일이니 읽어온 라인을 탭 기준으로 나누어 배열에 저장한다.
			String QueryTxt;
			//쿼리문을 실행할 String을 담을 변수 세팅 
			
			QueryTxt = String.format("insert into holidayParkingLotList ("
					+ "place_si, place_gu, parking_name, institution_name, manager_name, manager_phone,"
					+ "parking_address, parking_address_detail, parking_type, latitude, longitude,"	
					+ "opentime_0918, opentime_0919, opentime_0920, opentime_0921, opentime_0922, notice)"
					+ "values ("
					+ "'%s', '%s', '%s', '%s', '%s', '%s',"
					+ "'%s', '%s', '%s', %s, %s,"
					+ "'%s', '%s', '%s', '%s', '%s', '%s');",
					field[0], field[1], field[2], field[3], field[4], field[5], 
					field[6], field[7], field[8], field[9], field[10], 
					field[11], field[12], field[13], field[14], field[15], field[16]
					//쿼리 실행문을 String.format에 담아 String변수에 저장한다.
					);
			stmt.execute(QueryTxt);
			//쿼리 실행문을 담은 string을 stmt의 실행메소드 execute에 담아 mysql명령을 실행한다.
//			LineCnt++;

		}
		br.close();//열었던 br을 닫아주어 메모리 확보.
		stmt.close();//열었던 stmt을 닫아주어 메모리 확보.
		conn.close();//열었던 conn을 닫아주어 메모리 확보.
	}

}
