package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p20 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// ����� ������ excuteQuery
		// ����� ������ Query

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		
		Statement stmt = conn.createStatement();

		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('����', 209901, 95, 100, 95);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('����', 209902, 95, 95, 95);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('���', 209903, 100, 100, 100);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('�糪', 209904, 100, 95, 90);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('��ȿ', 209905, 80, 100, 70);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('�̳�', 209906, 100, 100, 70);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('����', 209907, 70, 70, 70);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('ä��', 209908, 85, 95, 90);");
		stmt.execute("insert into examtable01 (name, studentid, kor, eng, mat) values ('����', 209909, 80, 100, 90);");
		
		stmt.close();
		conn.close();
	}
}
