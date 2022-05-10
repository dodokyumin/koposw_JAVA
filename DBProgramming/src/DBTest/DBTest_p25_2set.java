package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p25_2set {

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
		
		stmt.execute( "create table thousandReport("+
				"studentid int not null primary key,"+	//�й�
				"name varchar(20),"+					//�̸�
				"kor int,"+								//��������
				"eng int,"+								//��������
				"mat int);");							//��������
		//���� ���๮�� ���� string�� stmt�� ����޼ҵ� execute�� ��� mysql����� �����Ѵ�.
		//�̶� studentid�� �ߺ����� ���� primary key�� �����Ͽ���.
		
		stmt.close(); //������ stmt�� �ݾ��־� �޸� Ȯ��.
		conn.close(); //������ conn�� �ݾ��־� �޸� Ȯ��.
	}

}
