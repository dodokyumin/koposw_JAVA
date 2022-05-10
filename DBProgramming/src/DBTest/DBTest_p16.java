package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p16 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {     
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		Statement stmt = conn.createStatement(); 
		ResultSet rset = stmt.executeQuery("select * from examtable"); 
		
		while (rset.next()) { 
				//결과물 처리 
		
		} 
		rset.close(); 
		stmt.close(); 
		conn.close(); 

	}

}
