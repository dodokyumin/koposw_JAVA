package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p25set {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()을 통해 드라이버를 로드한다.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		//드라이버 매니저의 getConnection 메소드로 인자(mysql경로,id,pwd)를 보내어 DB에 연결한다.																										  
		//연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
		
		Statement stmt = conn.createStatement();
		//conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
		
		stmt.execute("create table holidayParkingLotList("+		//freewifi로 테이블 생성
				"place_si varchar(50), "+         //시군구명
				"place_gu varchar(50), "+         //구
				"parking_name varchar(50), "+	//주차장명
				"institution_name varchar(50), "+			//기관명
				"manager_name varchar(50), "+		//담당자명
				"manager_phone varchar(50), "+	//담당자연락처
				"parking_address varchar(50) primary key, "+	//주차장주소
				"parking_address_detail varchar(200), "+			//상세주소
				"parking_type varchar(50), "+			//주차장유형
				"latitude double, "+				//위도
				"longitude double, "+				//경도
				"opentime_0918 varchar(200), "+	//개방시간 9월18일
				"opentime_0919 varchar(200), "+	//개방시간 9월19일
				"opentime_0920 varchar(200), "+	//개방시간 9월20일
				"opentime_0921 varchar(200), "+	//개방시간 9월21일
				"opentime_0922 varchar(200), "+	//개방시간 9월22일
				"notice varchar(200)"+	//참고사항
				");"
				//쿼리 실행문을 담은 string을 stmt의 실행메소드 execute에 담아 mysql명령을 실행한다.
				//이때 parking_address는 중복값이 없는 primary key로 설정하였다.
				);
		
		stmt.close(); //열었던 stmt을 닫아주어 메모리 확보.
		conn.close(); //열었던 conn을 닫아주어 메모리 확보.
	}

}
