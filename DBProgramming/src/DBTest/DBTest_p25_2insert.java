package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p25_2insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()�� ���� ����̹��� �ε��Ѵ�.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		//����̹� �Ŵ����� getConnection �޼ҵ�� ����(mysql���,id,pwd)�� ������ DB�� �����Ѵ�.
		//���� �Ϸ��� ������ �ν��Ͻ� conn�� ��� ����ȭ �Ѵ�.
		
		Statement stmt = conn.createStatement();
		//conn�� createStatement �޼ҵ带 Query �۾��� �����ϱ� ���� Statement�� �ν��Ͻ��� ��� ������ ������ ó���� �� �ְ� �Ѵ�.
		
		int i = 1; //1000����� ����� ī��Ʈ�� �� ���� i ����.
		while(i <= 1000) { //�ݺ� Ƚ�� �� 1000��
			
			String QueryTxt; //���� ��ɹ��� ����� String ���� ����
			
			QueryTxt = String.format("insert into thousandReport ("
					+ "studentid, name, kor, eng, mat)"
					+ "values ("
					+ "%s, 'ȫ��%s', RAND()*101, RAND()*101, RAND()*101);",
					//mysql�� RAND()�޼ҵ� ����� ���� ���� �Է��� �����־���.
					200000+i, i
					);
			//���� ���๮�� String.format�� ��� String������ �����Ѵ�.
			
			stmt.execute(QueryTxt);
			//���� ���๮�� ���� string�� stmt�� ����޼ҵ� execute�� ��� mysql����� �����Ѵ�.
			
			i++;
			//�ݺ����� ���� �� �ֵ��� ���� i�� �� �����ϰ� ����.
		}
		
		stmt.close();//������ stmt�� �ݾ��־� �޸� Ȯ��.
		conn.close();//������ conn�� �ݾ��־� �޸� Ȯ��.
	}

}
