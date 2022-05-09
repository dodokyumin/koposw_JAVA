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
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from examtable");
		
		System.out.println(" 이름  학번  국어 영어 수학\n");
		
		while (rset.next()) {
			System.out.printf("%4s  %6s  %3d  %3d  %3d \n",
			rset.getString(1),rset.getInt(2),rset.getInt(3),rset.getInt(4),rset.getInt(5));
		}
		
		rset.close();
		stmt.close();
		conn.close();
	}

}
