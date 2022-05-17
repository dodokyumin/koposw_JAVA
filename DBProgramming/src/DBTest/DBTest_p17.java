package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p17 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//매우매우매우 중요!!!!! 콘넥션,스테이트먼트,리절트셋

		//결과가 없으면 excuteQuery
		//결과가 있으면 Query
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()을 통해 드라이버를 로드한다.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44","root","koposw44"); 
		//드라이버 매니저의 getConnection 메소드로 인자(mysql경로(나의 우분투 접속 주소),id(DB사용자),pwd)를 보내어 DB에 연결한다.																										  
		//연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
		
		Statement stmt = conn.createStatement(); 
		//conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
		
		ResultSet rset = stmt.executeQuery("show tables;"); 
		//결과값을 저장할 수 있는 ResultSet형 rset인스턴스에 쿼리 실행문을 담은 stmt를 저장한다.
		
		while (rset.next()) { //다음 row를 읽어오는데 이때 다음 row가 없으면 false를 반환한다.
			System.out.println("값 : " + rset.getString(1)); //해당 row의 결과값을 저장한 rset의 첫 String을 출력한다. 
		}
		rset.close(); //열었던 rset을 닫아주어 메모리 확보.
		stmt.close(); //열었던 stmt을 닫아주어 메모리 확보.
		conn.close(); //열었던 conn을 닫아주어 메모리 확보.
		
	}

}
