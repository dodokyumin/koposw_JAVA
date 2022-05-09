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
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		
		Statement stmt = conn.createStatement();

		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('나연', 209901, 95, 100, 95);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('정연', 209902, 95, 95, 95);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('모모', 209903, 100, 100, 100);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('사나', 209904, 100, 95, 90);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('지효', 209905, 80, 100, 70);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('미나', 209906, 100, 100, 70);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('다현', 209907, 70, 70, 70);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('채영', 209908, 85, 95, 90);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('쯔위', 209909, 80, 100, 90);");
		
		stmt.close();
		conn.close();
	}
}
