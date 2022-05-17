package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p22 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()을 통해 드라이버를 로드한다.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33062/koposw44", "root", "koposw44");
		//드라이버 매니저의 getConnection 메소드로 인자(mysql경로,id,pwd)를 보내어 DB에 연결한다.
		//연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
				
		Statement stmt = conn.createStatement();
		//conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
		
		stmt.execute("create table freewifi("+		//freewifi로 테이블 생성
				"num int," +
				"inst_place varchar(50), "+         //설치장소명
				"inst_place_detail varchar(50), "+	//설치장소상세
				"inst_city varchar(50), "+			//설치시도명
				"inst_country varchar(50), "+		//설치시군구명
				"inst_place_flag varchar(50), "+	//설치시설구분
				"service_provider varchar(50), "+	//서비스제공사명
				"wifi_ssid varchar(200), "+			//와이파이SSID
				"inst_date varchar(50), "+			//설치년월 -> 정제할 것
				"place_addr_road varchar(200), "+	//소재지도로명주소
				"place_addr_land varchar(200), "+	//소재지지번주소
				"manage_office varchar(50), "+		//관리기관명
				"manage_office_phone varchar(50), "+//관리기관 전화번호
				"latitude double, "+				//위도
				"longitude double, "+				//경도
				"write_date date"+")");				//데이터 기준일자
		//		"CONSTRAINT place_pk PRIMARY KEY(inst_place, inst_place_detail, wifi_ssid, inst_date, latitude, longitude))");
		//쿼리 실행문을 담은 string을 stmt의 실행메소드 execute에 담아 mysql명령을 실행한다.
		//"CONSTRAINT pk이름 PRIMARY KEY()" 메소드를 사용하여 프라이머리 키를 여러 값들을 묶은 값으로 설정한다.
		
		stmt.close();//열었던 stmt을 닫아주어 메모리 확보.
		conn.close();//열었던 conn을 닫아주어 메모리 확보.
	}

}
