package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p21 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// ����� ������ excuteQuery
		// ����� ������ Query

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()�� ���� ����̹��� �ε��Ѵ�.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		//����̹� �Ŵ����� getConnection �޼ҵ�� ����(mysql���,id,pwd)�� ������ DB�� �����Ѵ�.
		//���� �Ϸ��� ������ �ν��Ͻ� conn�� ��� ����ȭ �Ѵ�.
				
		Statement stmt = conn.createStatement();
		//conn�� createStatement �޼ҵ带 Query �۾��� �����ϱ� ���� Statement�� �ν��Ͻ��� ��� ������ ������ ó���� �� �ְ� �Ѵ�.
		
		ResultSet rset = stmt.executeQuery("select * from examtable");
		//������� ������ �� �ִ� ResultSet�� rset�ν��Ͻ��� ���� ���๮�� ���� stmt�� �����Ѵ�.
		
		System.out.println(" �̸�  �й�  ���� ���� ����\n");
		//����Ͽ� �� ���� ������ֱ�
		
		while (rset.next()) { //���� row�� �о���µ� �̶� ���� row�� ������ false�� ��ȯ�Ѵ�.
			//�ش� row�� ������� ������ rset�� ������ �����͵��� ������ ��� ���˿� �°� �����Ѵ�.
			System.out.printf("%4s  %6s  %3d  %3d  %3d \n",
			rset.getString(1),rset.getInt(2),rset.getInt(3),rset.getInt(4),rset.getInt(5));
		}
		
		rset.close(); //������ rset�� �ݾ��־� �޸� Ȯ��.
		stmt.close(); //������ stmt�� �ݾ��־� �޸� Ȯ��.
		conn.close(); //������ conn�� �ݾ��־� �޸� Ȯ��.
	}

}
