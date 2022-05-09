package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p18 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 결과가 없으면 excuteQuery
		// 결과가 있으면 Query

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		Statement stmt = conn.createStatement();

		stmt.execute( "create table examtable01(name varchar(20),"+"studentid int not null primary key,"+"kor int,"+"eng int,"+"mat int);");
		
		stmt.close();
		conn.close();
	}
}
