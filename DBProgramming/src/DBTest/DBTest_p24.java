package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p24 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()�� ���� ����̹��� �ε��Ѵ�.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		//����̹� �Ŵ����� getConnection �޼ҵ�� ����(mysql���,id,pwd)�� ������ DB�� �����Ѵ�.																										  
		//���� �Ϸ��� ������ �ν��Ͻ� conn�� ��� ����ȭ �Ѵ�.
		
		Statement stmt = conn.createStatement();
		//conn�� createStatement �޼ҵ带 Query �۾��� �����ϱ� ���� Statement�� �ν��Ͻ��� ��� ������ ������ ó���� �� �ְ� �Ѵ�.
		
		double lat = 37.3860521; //�ڽ��� ���� ��
		double lng = 127.1214038;//�ڽ��� �浵 ��
		
		String QueryTxt;  //�������� �о� ��Ƶ� String���� ����.
//		QueryTxt = String.format("select * from freewifi where " +
//					"SQRT( POWER( latitude-%f,2) + POWER (longitude-%f,2) ) = " +
//					"(select MIN( SQRT( POWER( latitude-%f,2) + POWER (longitude-%f,2 ) ) ) from freewifi);",
//					lat, lng, lat, lng);
		//(�������� ���� + �浵���� ����)�� ��Ʈó���Ͽ� ���� ���������� �Ÿ��� ����ϰ�. mysql�� MIN�޼ҵ带 �̿��Ͽ� �ּڰ��� ���.
		//���� ���๮�� String.format�� ��� String������ �����Ѵ�.
		
//		QueryTxt = "select * from freewifi where service_provider = 'SKT'";
		QueryTxt = "select * from freewifi where inst_country = '������'";
//		QueryTxt = "select * from freewifi";
		
		ResultSet rset = stmt.executeQuery(QueryTxt);
		//������� ������ �� �ִ� ResultSet�� rset�ν��Ͻ��� ���� ���๮�� ���� stmt�� �����Ѵ�.
		
		int iCnt = 0;
		//��row���� ������ ī��Ʈ�ؼ� �Ű��� ���� ����
		
		while (rset.next()) { //���� row�� �о���µ� �̶� ���� row�� ������ false�� ��ȯ�Ѵ�.
			System.out.printf("*(%d)******************************************\n",iCnt++);
			System.out.printf("��ġ��Ҹ�        : %s\n",rset.getString(1));
			System.out.printf("��ġ��һ�      : %s\n",rset.getString(2));
			System.out.printf("��ġ�õ���        : %s\n",rset.getString(3));
			System.out.printf("��ġ�ñ�����      : %s\n",rset.getString(4));
			System.out.printf("��ġ�ü�����      : %s\n",rset.getString(5));
			System.out.printf("�����������    : %s\n",rset.getString(6));
			System.out.printf("��������SSID      : %s\n",rset.getString(7));
			System.out.printf("��ġ���          : %s\n",rset.getString(8));
			System.out.printf("���������θ��ּ�  : %s\n",rset.getString(9));
			System.out.printf("�����������ּ�    : %s\n",rset.getString(10));
			System.out.printf("���������        : %s\n",rset.getString(11));
			System.out.printf("���������ȭ��ȣ  : %s\n",rset.getString(12));
			System.out.printf("����              : %s\n",rset.getString(13));
			System.out.printf("�浵              : %s\n",rset.getString(14));
			System.out.printf("�����ͱ�������    : %s\n",rset.getString(15));
			System.out.printf("************************************************\n");
		// rset�� getString�޼ҵ带 ���� �������, �� row���� ������� ���� �����͸� ���˿� �°� ����Ѵ�.
		}
		rset.close(); //������ rset�� �ݾ��־� �޸� Ȯ��.
		stmt.close(); //������ stmt�� �ݾ��־� �޸� Ȯ��.
		conn.close(); //������ conn�� �ݾ��־� �޸� Ȯ��.
	}
}
