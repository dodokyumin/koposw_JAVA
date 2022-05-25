package DBTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p25insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()�� ���� ����̹��� �ε��Ѵ�.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33063/koposw44", "root", "koposw44");
		//����̹� �Ŵ����� getConnection �޼ҵ�� ����(mysql���,id,pwd)�� ������ DB�� �����Ѵ�.
		//���� �Ϸ��� ������ �ν��Ͻ� conn�� ��� ����ȭ �Ѵ�.
				
		Statement stmt = conn.createStatement(); 
		//conn�� createStatement �޼ҵ带 Query �۾��� �����ϱ� ���� Statement�� �ν��Ͻ��� ��� ������ ������ ó���� �� �ְ� �Ѵ�.
		
		File f = new File("C:\\Users\\501-01\\Desktop\\��������.txt");
		//�ش� ����� ������ ������ ���� f�� ��� ����ȭ ��Ų��.
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		//FileReader�� ����f�� �������� ���۸� �̿��ؼ� ������ �д� BufferedReader�� �ν��Ͻ� br�� ��� ����ȭ��Ų��.
		
		String readtxt;
		//�ؽ�Ʈ�� �о� ��Ƶ� String���� ����.
		
		if((readtxt = br.readLine()) == null) {
		//���� ���۸����� �о�� ������ ������ readtxt�� null, �� ���� ���ٸ�,
			System.out.println("�� �����Դϴ�.");
		//�� ���� �̶�� �ȳ��� ���
			return;
		}
		
//		String[] field_name = readtxt.split("\t");
//		
		int LineCnt = 1;

		double lat = 37.3860521;//�ڽ��� ���� ��
		double lng = 127.1214038;//�ڽ��� �浵 ��
		
		while((readtxt = br.readLine()) != null) { 
		//���� ���۸����� �о�� ������ ������ readtxt�� null�� �ƴ϶��, �� ���� �ִٸ�,
			String[] field = readtxt.split("\t");
			//������ �з��� txt�����̴� �о�� ������ �� �������� ������ �迭�� �����Ѵ�.
			String QueryTxt;
			//�������� ������ String�� ���� ���� ���� 
			double latitude = Double.parseDouble(field[12]);
			double longitude = Double.parseDouble(field[13]);
			int dist = (int) (Math.sqrt( Math.pow( latitude-lat,2) + Math.pow(longitude-lng,2) )*100);
			QueryTxt = String.format("insert into wifi(num,addr,lat,lng,dist)"
					+ "values ("
					+ "'%s', '%s', '%s', '%s', '%s');",
					LineCnt, field[9], field[12], field[13]
					,dist
					);
			stmt.execute(QueryTxt);
			//���� ���๮�� ���� string�� stmt�� ����޼ҵ� execute�� ��� mysql����� �����Ѵ�.
			LineCnt++;

		}
		br.close();//������ br�� �ݾ��־� �޸� Ȯ��.
		stmt.close();//������ stmt�� �ݾ��־� �޸� Ȯ��.
		conn.close();//������ conn�� �ݾ��־� �޸� Ȯ��.
	}

}
