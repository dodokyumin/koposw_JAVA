package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p15 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44"); 
		Statement stmt = conn.createStatement();
		ResultSet rSet = stmt.executeQuery("select * from examtable where kor=100;"); 
		 
	     while (rSet.next()) { 
	         System.out.println("�̸� : "+ rSet.getString(1));
	         System.out.println("�й� : "+ rSet.getInt(2));
	         System.out.println("���� : "+ rSet.getInt(3));
	         System.out.println("���� : "+ rSet.getInt(4));
	         System.out.println("���� : "+ rSet.getInt(5));
	      } 
	}
}
