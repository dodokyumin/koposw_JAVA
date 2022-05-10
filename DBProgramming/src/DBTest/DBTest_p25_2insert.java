package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p25_2insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()을 통해 드라이버를 로드한다.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		//드라이버 매니저의 getConnection 메소드로 인자(mysql경로,id,pwd)를 보내어 DB에 연결한다.
		//연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
		
		Statement stmt = conn.createStatement();
		//conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
		
		int i = 1; //1000명까지 출력을 카운트해 줄 변수 i 설정.
		while(i <= 1000) { //반복 횟수 총 1000번
			
			String QueryTxt; //쿼리 명령문을 담아줄 String 변수 설정
			
			QueryTxt = String.format("insert into thousandReport ("
					+ "studentid, name, kor, eng, mat)"
					+ "values ("
					+ "%s, '홍길%s', RAND()*101, RAND()*101, RAND()*101);",
					//mysql의 RAND()메소드 사용을 위해 직접 입력해 보내주었다.
					200000+i, i
					);
			//쿼리 실행문을 String.format에 담아 String변수에 저장한다.
			
			stmt.execute(QueryTxt);
			//쿼리 실행문을 담은 string을 stmt의 실행메소드 execute에 담아 mysql명령을 실행한다.
			
			i++;
			//반복문이 끝날 수 있도록 변수 i의 값 증가하게 설정.
		}
		
		stmt.close();//열었던 stmt을 닫아주어 메모리 확보.
		conn.close();//열었던 conn을 닫아주어 메모리 확보.
	}

}
