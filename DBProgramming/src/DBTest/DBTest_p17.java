package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p17 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//����� ������ excuteQuery
		//����� ������ Query
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44","root","koposw44");
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("show databases;");
		
		while (rset.next()) {
			System.out.println("�� : " + rset.getString(1));
		}
		rset.close();
		stmt.close();
		conn.close();
		
	}

}
