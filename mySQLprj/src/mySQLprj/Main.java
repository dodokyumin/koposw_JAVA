package mySQLprj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class Main {

	public static void main(String[] args) {
		
		Statement statement = null;
		ResultSet resultSet = null;
		Connection connection = null;
		
		String id = "root";
		String password = "koposw00";
		String dbQuery = "show databases";
		String select = "use class";
		String select1 = "select * from student";
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?useUnicode=true&characterEncoding=utf8&serverTimeZone=Asia/Seoul&useSSL=false",id,password);
			statement = connection.createStatement();
			statement.execute(select);
			
			if(statement.execute(select1)) {
				resultSet = statement.getResultSet();
			}
			
			while (resultSet.next()) {
				String str = resultSet.getString(1);
				String str2 = resultSet.getString(2);
				System.out.printf("%s\t%s\n",str,str2);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
