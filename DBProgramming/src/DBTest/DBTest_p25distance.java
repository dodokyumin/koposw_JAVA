package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p25distance {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()을 통해 드라이버를 로드한다.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		//드라이버 매니저의 getConnection 메소드로 인자(mysql경로,id,pwd)를 보내어 DB에 연결한다.																										  
		//연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
		
		Statement stmt = conn.createStatement();
		//conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
		
		double lat = 37.3860521;//자신의 위도 값
		double lng = 127.1214038;//자신의 경도 값
		
		String QueryTxt;
		QueryTxt = String.format("select * from holidayParkingLotList where " +
					"SQRT( POWER( latitude-%f,2) + POWER (longitude-%f,2) ) = " +
					"(select MIN( SQRT( POWER( latitude-%f,2) + POWER (longitude-%f,2 ) ) ) from holidayParkingLotList);",
					lat, lng, lat, lng);
		//(위도차의 제곱 + 경도차의 제곱)을 루트처리하여 현재 지점까지의 거리를 계산하고. mysql의 MIN메소드를 이용하여 최솟값을 출력.
		//쿼리 실행문을 String.format에 담아 String변수에 저장한다.
//		QueryTxt = "select * from holidayParkingLotList";
		
		ResultSet rset = stmt.executeQuery(QueryTxt);
		//결과값을 저장할 수 있는 ResultSet형 rset인스턴스에 쿼리 실행문을 담은 stmt를 저장한다.
		
		int iCnt = 0;
		//각row들의 순서를 카운트해서 매겨줄 변수 설정
		
		while (rset.next()) {//다음 row를 읽어오는데 이때 다음 row가 없으면 false를 반환한다.
			System.out.printf("*(%d)******************************************\n",iCnt++);
			System.out.printf("시군구명         : %s\n",rset.getString(1));
			System.out.printf("구               : %s\n",rset.getString(2));
			System.out.printf("주차장명         : %s\n",rset.getString(3));
			System.out.printf("기관명           : %s\n",rset.getString(4));
			System.out.printf("담당자명         : %s\n",rset.getString(5));
			System.out.printf("담당자연락처     : %s\n",rset.getString(6));
			System.out.printf("주차장주소       : %s\n",rset.getString(7));
			System.out.printf("상세주소         : %s\n",rset.getString(8));
			System.out.printf("주차장유형       : %s\n",rset.getString(9));
			System.out.printf("위도             : %s\n",rset.getString(10));
			System.out.printf("경도             : %s\n",rset.getString(11));
			System.out.printf("개방시간 9월18일 : %s\n",rset.getString(12));
			System.out.printf("개방시간 9월19일 : %s\n",rset.getString(13));
			System.out.printf("개방시간 9월20일 : %s\n",rset.getString(14));
			System.out.printf("개방시간 9월21일 : %s\n",rset.getString(15));
			System.out.printf("개방시간 9월22일 : %s\n",rset.getString(16));
			System.out.printf("참고사항         : %s\n",rset.getString(17));
			System.out.printf("************************************************\n");
			// rset의 getString메소드를 통해 순서대로, 각 row들의 결과값을 담은 데이터를 포맷에 맞게 출력한다.
		}
		rset.close(); //열었던 rset을 닫아주어 메모리 확보.
		stmt.close(); //열었던 stmt을 닫아주어 메모리 확보.
		conn.close(); //열었던 conn을 닫아주어 메모리 확보.
	}

}
