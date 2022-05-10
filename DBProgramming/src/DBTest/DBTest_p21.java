package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p21 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 결과가 없으면 excuteQuery
		// 결과가 있으면 Query

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()을 통해 드라이버를 로드한다.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		//드라이버 매니저의 getConnection 메소드로 인자(mysql경로,id,pwd)를 보내어 DB에 연결한다.
		//연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
				
		Statement stmt = conn.createStatement();
		//conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
		
		ResultSet rset = stmt.executeQuery("select * from examtable");
		//결과값을 저장할 수 있는 ResultSet형 rset인스턴스에 쿼리 실행문을 담은 stmt를 저장한다.
		
		System.out.println(" 이름  학번  국어 영어 수학\n");
		//출력하여 볼 포맷 만들어주기
		
		while (rset.next()) { //다음 row를 읽어오는데 이때 다음 row가 없으면 false를 반환한다.
			//해당 row의 결과값을 저장한 rset의 순서별 데이터들을 가져와 출력 포맷에 맞게 저장한다.
			System.out.printf("%4s  %6s  %3d  %3d  %3d \n",
			rset.getString(1),rset.getInt(2),rset.getInt(3),rset.getInt(4),rset.getInt(5));
		}
		
		rset.close(); //열었던 rset을 닫아주어 메모리 확보.
		stmt.close(); //열었던 stmt을 닫아주어 메모리 확보.
		conn.close(); //열었던 conn을 닫아주어 메모리 확보.
	}

}
