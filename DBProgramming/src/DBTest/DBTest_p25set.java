package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p25set {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()�� ���� ����̹��� �ε��Ѵ�.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		//����̹� �Ŵ����� getConnection �޼ҵ�� ����(mysql���,id,pwd)�� ������ DB�� �����Ѵ�.																										  
		//���� �Ϸ��� ������ �ν��Ͻ� conn�� ��� ����ȭ �Ѵ�.
		
		Statement stmt = conn.createStatement();
		//conn�� createStatement �޼ҵ带 Query �۾��� �����ϱ� ���� Statement�� �ν��Ͻ��� ��� ������ ������ ó���� �� �ְ� �Ѵ�.
		
		stmt.execute("create table holidayParkingLotList("+		//freewifi�� ���̺� ����
				"place_si varchar(50), "+         //�ñ�����
				"place_gu varchar(50), "+         //��
				"parking_name varchar(50), "+	//�������
				"institution_name varchar(50), "+			//�����
				"manager_name varchar(50), "+		//����ڸ�
				"manager_phone varchar(50), "+	//����ڿ���ó
				"parking_address varchar(50) primary key, "+	//�������ּ�
				"parking_address_detail varchar(200), "+			//���ּ�
				"parking_type varchar(50), "+			//����������
				"latitude double, "+				//����
				"longitude double, "+				//�浵
				"opentime_0918 varchar(200), "+	//����ð� 9��18��
				"opentime_0919 varchar(200), "+	//����ð� 9��19��
				"opentime_0920 varchar(200), "+	//����ð� 9��20��
				"opentime_0921 varchar(200), "+	//����ð� 9��21��
				"opentime_0922 varchar(200), "+	//����ð� 9��22��
				"notice varchar(200)"+	//�������
				");"
				//���� ���๮�� ���� string�� stmt�� ����޼ҵ� execute�� ��� mysql����� �����Ѵ�.
				//�̶� parking_address�� �ߺ����� ���� primary key�� �����Ͽ���.
				);
		
		stmt.close(); //������ stmt�� �ݾ��־� �޸� Ȯ��.
		conn.close(); //������ conn�� �ݾ��־� �޸� Ȯ��.
	}

}
