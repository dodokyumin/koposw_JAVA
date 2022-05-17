package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p26drop {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()을 통해 드라이버를 로드한다.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33062/koposw44", "root", "koposw44");
		//드라이버 매니저의 getConnection 메소드로 인자(mysql경로,id,pwd)를 보내어 DB에 연결한다.
		//연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
		
		Statement stmt = conn.createStatement();
		//conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
		
		stmt.execute("drop table stockdailyprice8");
		//쿼리 실행문을 담은 string을 stmt의 실행메소드 execute에 담아 mysql명령을 실행한다.
		//mysql의 테이블을 삭제하는 drop table명령을 보내 해당 테이블을 삭제한다.
		
		stmt.close();//열었던 stmt을 닫아주어 메모리 확보.
		conn.close();//열었던 conn을 닫아주어 메모리 확보.
		

	}

}
