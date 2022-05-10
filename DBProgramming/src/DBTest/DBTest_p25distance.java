package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p25distance {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()�� ���� ����̹��� �ε��Ѵ�.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		//����̹� �Ŵ����� getConnection �޼ҵ�� ����(mysql���,id,pwd)�� ������ DB�� �����Ѵ�.																										  
		//���� �Ϸ��� ������ �ν��Ͻ� conn�� ��� ����ȭ �Ѵ�.
		
		Statement stmt = conn.createStatement();
		//conn�� createStatement �޼ҵ带 Query �۾��� �����ϱ� ���� Statement�� �ν��Ͻ��� ��� ������ ������ ó���� �� �ְ� �Ѵ�.
		
		double lat = 37.3860521;//�ڽ��� ���� ��
		double lng = 127.1214038;//�ڽ��� �浵 ��
		
		String QueryTxt;
		QueryTxt = String.format("select * from holidayParkingLotList where " +
					"SQRT( POWER( latitude-%f,2) + POWER (longitude-%f,2) ) = " +
					"(select MIN( SQRT( POWER( latitude-%f,2) + POWER (longitude-%f,2 ) ) ) from holidayParkingLotList);",
					lat, lng, lat, lng);
		//(�������� ���� + �浵���� ����)�� ��Ʈó���Ͽ� ���� ���������� �Ÿ��� ����ϰ�. mysql�� MIN�޼ҵ带 �̿��Ͽ� �ּڰ��� ���.
		//���� ���๮�� String.format�� ��� String������ �����Ѵ�.
//		QueryTxt = "select * from holidayParkingLotList";
		
		ResultSet rset = stmt.executeQuery(QueryTxt);
		//������� ������ �� �ִ� ResultSet�� rset�ν��Ͻ��� ���� ���๮�� ���� stmt�� �����Ѵ�.
		
		int iCnt = 0;
		//��row���� ������ ī��Ʈ�ؼ� �Ű��� ���� ����
		
		while (rset.next()) {//���� row�� �о���µ� �̶� ���� row�� ������ false�� ��ȯ�Ѵ�.
			System.out.printf("*(%d)******************************************\n",iCnt++);
			System.out.printf("�ñ�����         : %s\n",rset.getString(1));
			System.out.printf("��               : %s\n",rset.getString(2));
			System.out.printf("�������         : %s\n",rset.getString(3));
			System.out.printf("�����           : %s\n",rset.getString(4));
			System.out.printf("����ڸ�         : %s\n",rset.getString(5));
			System.out.printf("����ڿ���ó     : %s\n",rset.getString(6));
			System.out.printf("�������ּ�       : %s\n",rset.getString(7));
			System.out.printf("���ּ�         : %s\n",rset.getString(8));
			System.out.printf("����������       : %s\n",rset.getString(9));
			System.out.printf("����             : %s\n",rset.getString(10));
			System.out.printf("�浵             : %s\n",rset.getString(11));
			System.out.printf("����ð� 9��18�� : %s\n",rset.getString(12));
			System.out.printf("����ð� 9��19�� : %s\n",rset.getString(13));
			System.out.printf("����ð� 9��20�� : %s\n",rset.getString(14));
			System.out.printf("����ð� 9��21�� : %s\n",rset.getString(15));
			System.out.printf("����ð� 9��22�� : %s\n",rset.getString(16));
			System.out.printf("�������         : %s\n",rset.getString(17));
			System.out.printf("************************************************\n");
			// rset�� getString�޼ҵ带 ���� �������, �� row���� ������� ���� �����͸� ���˿� �°� ����Ѵ�.
		}
		rset.close(); //������ rset�� �ݾ��־� �޸� Ȯ��.
		stmt.close(); //������ stmt�� �ݾ��־� �޸� Ȯ��.
		conn.close(); //������ conn�� �ݾ��־� �޸� Ȯ��.
	}

}
