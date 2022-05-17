package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p26set {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()�� ���� ����̹��� �ε��Ѵ�.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33062/koposw44", "root", "koposw44");
		//����̹� �Ŵ����� getConnection �޼ҵ�� ����(mysql���,id,pwd)�� ������ DB�� �����Ѵ�.																										  
		//���� �Ϸ��� ������ �ν��Ͻ� conn�� ��� ����ȭ �Ѵ�.
		
		Statement stmt = conn.createStatement();
		//conn�� createStatement �޼ҵ带 Query �۾��� �����ϱ� ���� Statement�� �ν��Ͻ��� ��� ������ ������ ó���� �� �ְ� �Ѵ�.
		
		stmt.execute("create table stockdailyprice8("+		//freewifi�� ���̺� ����
				"shrn_iscd varchar(50) , "+      //2 NOT_NULL �������� ���� �����ڵ�
				"bsop_date int , "+      //1 NOT_NULL �ֽ� ���� ����
				"stck_oprc int , "+      //4 �ֽ� �ð�
				"stck_hgpr int , "+      //5 �ֽ� �ְ�
				"stck_lwpr int , "+      //6 �ֽ� ������
				"stck_prpr int , "+      //3 �ֽ� ����
				"acml_vol long , "+      //11 ���� �ŷ���
				"acml_tr_pbmn long , "+      //12 ���� �ŷ� ���
				
				"CONSTRAINT stock_pk PRIMARY KEY(bsop_date, shrn_iscd))"
				//���� ���๮�� ���� string�� stmt�� ����޼ҵ� execute�� ��� mysql����� �����Ѵ�.
				//�̶� ����, �����ڵ� ������ �ߺ����� ���� primary key�� �����Ͽ���.
				);
	}
}
