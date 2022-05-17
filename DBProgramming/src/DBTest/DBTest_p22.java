package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p22 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()�� ���� ����̹��� �ε��Ѵ�.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33062/koposw44", "root", "koposw44");
		//����̹� �Ŵ����� getConnection �޼ҵ�� ����(mysql���,id,pwd)�� ������ DB�� �����Ѵ�.
		//���� �Ϸ��� ������ �ν��Ͻ� conn�� ��� ����ȭ �Ѵ�.
				
		Statement stmt = conn.createStatement();
		//conn�� createStatement �޼ҵ带 Query �۾��� �����ϱ� ���� Statement�� �ν��Ͻ��� ��� ������ ������ ó���� �� �ְ� �Ѵ�.
		
		stmt.execute("create table freewifi("+		//freewifi�� ���̺� ����
				"num int," +
				"inst_place varchar(50), "+         //��ġ��Ҹ�
				"inst_place_detail varchar(50), "+	//��ġ��һ�
				"inst_city varchar(50), "+			//��ġ�õ���
				"inst_country varchar(50), "+		//��ġ�ñ�����
				"inst_place_flag varchar(50), "+	//��ġ�ü�����
				"service_provider varchar(50), "+	//�����������
				"wifi_ssid varchar(200), "+			//��������SSID
				"inst_date varchar(50), "+			//��ġ��� -> ������ ��
				"place_addr_road varchar(200), "+	//���������θ��ּ�
				"place_addr_land varchar(200), "+	//�����������ּ�
				"manage_office varchar(50), "+		//���������
				"manage_office_phone varchar(50), "+//������� ��ȭ��ȣ
				"latitude double, "+				//����
				"longitude double, "+				//�浵
				"write_date date"+")");				//������ ��������
		//		"CONSTRAINT place_pk PRIMARY KEY(inst_place, inst_place_detail, wifi_ssid, inst_date, latitude, longitude))");
		//���� ���๮�� ���� string�� stmt�� ����޼ҵ� execute�� ��� mysql����� �����Ѵ�.
		//"CONSTRAINT pk�̸� PRIMARY KEY()" �޼ҵ带 ����Ͽ� �����̸Ӹ� Ű�� ���� ������ ���� ������ �����Ѵ�.
		
		stmt.close();//������ stmt�� �ݾ��־� �޸� Ȯ��.
		conn.close();//������ conn�� �ݾ��־� �޸� Ȯ��.
	}

}
