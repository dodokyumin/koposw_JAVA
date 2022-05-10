package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p20 {

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
		
		//쿼리 실행문을 담은 string을 stmt의 실행메소드 execute에 담아 mysql명령을 실행한다.
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('나연', 209901, 95, 100, 95);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('정연', 209902, 95, 95, 95);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('모모', 209903, 100, 100, 100);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('사나', 209904, 100, 95, 90);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('지효', 209905, 80, 100, 70);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('미나', 209906, 100, 100, 70);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('다현', 209907, 70, 70, 70);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('채영', 209908, 85, 95, 90);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('쯔위', 209909, 80, 100, 90);");
		//테이블에 각 values들을 저장할 수 있는 mysql의 insert into 명령을 사용하여 각 데이터들을 분류하여 저장하였다.
		
		stmt.close();//열었던 stmt을 닫아주어 메모리 확보.
		conn.close();//열었던 conn을 닫아주어 메모리 확보.
	}
}
