package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p17 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//�ſ�ſ�ſ� �߿�!!!!! �ܳؼ�,������Ʈ��Ʈ,����Ʈ��

		//����� ������ excuteQuery
		//����� ������ Query
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()�� ���� ����̹��� �ε��Ѵ�.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44","root","koposw44"); 
		//����̹� �Ŵ����� getConnection �޼ҵ�� ����(mysql���(���� ����� ���� �ּ�),id(DB�����),pwd)�� ������ DB�� �����Ѵ�.																										  
		//���� �Ϸ��� ������ �ν��Ͻ� conn�� ��� ����ȭ �Ѵ�.
		
		Statement stmt = conn.createStatement(); 
		//conn�� createStatement �޼ҵ带 Query �۾��� �����ϱ� ���� Statement�� �ν��Ͻ��� ��� ������ ������ ó���� �� �ְ� �Ѵ�.
		
		ResultSet rset = stmt.executeQuery("show tables;"); 
		//������� ������ �� �ִ� ResultSet�� rset�ν��Ͻ��� ���� ���๮�� ���� stmt�� �����Ѵ�.
		
		while (rset.next()) { //���� row�� �о���µ� �̶� ���� row�� ������ false�� ��ȯ�Ѵ�.
			System.out.println("�� : " + rset.getString(1)); //�ش� row�� ������� ������ rset�� ù String�� ����Ѵ�. 
		}
		rset.close(); //������ rset�� �ݾ��־� �޸� Ȯ��.
		stmt.close(); //������ stmt�� �ݾ��־� �޸� Ȯ��.
		conn.close(); //������ conn�� �ݾ��־� �޸� Ȯ��.
		
	}

}
