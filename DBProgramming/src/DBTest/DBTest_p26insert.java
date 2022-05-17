package DBTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DBTest_p26insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		String k44_startTime = null; //��������� ����Ʈ�� ���۽ð��� ����ð� ���� ����.
		String k44_endTime = null;
		Date k44_date = new Date();
		// ���˺��� ( ����� �ú���)
		SimpleDateFormat k44_sdformat = new SimpleDateFormat("HH�� mm�� ss��"); 
		//  Java �ð� ���ϱ�
		Calendar k44_cal = Calendar.getInstance();
		k44_cal.setTime(k44_date);
		//���۽ð� ���
		k44_startTime = k44_sdformat.format(k44_cal.getTime());  
		System.out.println("���� �ð�       : " + k44_startTime); 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()�� ���� ����̹��� �ε��Ѵ�.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33062/koposw44?useSSL=false", "root", "koposw44");
		//����̹� �Ŵ����� getConnection �޼ҵ�� ����(mysql���,id,pwd)�� ������ DB�� �����Ѵ�.
		//���� �Ϸ��� ������ �ν��Ͻ� conn�� ��� ����ȭ �Ѵ�.
		
		String QueryText=String.format("insert into stockdailyprice8(shrn_iscd,bsop_date,stck_oprc,stck_hgpr,stck_lwpr,stck_prpr,acml_vol,acml_tr_pbmn)"+//10
				"values(?,?,?,?,?,?,?,?)");
		
		PreparedStatement pstmt = conn.prepareStatement(QueryText); 
		//conn�� createStatement �޼ҵ带 Query �۾��� �����ϱ� ���� Statement�� �ν��Ͻ��� ��� ������ ������ ó���� �� �ְ� �Ѵ�.
		
		File f = new File("C:\\Users\\501-01\\Desktop\\�ǽ�csv\\day_data\\StockDailyPrice.csv");
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
		
		String[] field_name = readtxt.split("\t");
		
		int LineCnt = 0;
		
		conn.setAutoCommit(false);
		
		long startTime = System.currentTimeMillis();
		
		while((readtxt = br.readLine()) != null) { 
		//���� ���۸����� �о�� ������ ������ readtxt�� null�� �ƴ϶��, �� ���� �ִٸ�,
			String[] field = readtxt.split(",");
			//������ �з��� txt�����̴� �о�� ������ �� �������� ������ �迭�� �����Ѵ�.
			
			pstmt.setString(1,field[2]);
			pstmt.setString(2,field[1]);
			pstmt.setString(3,field[4]);
			pstmt.setString(4,field[5]);
			pstmt.setString(5,field[6]);
			pstmt.setString(6,field[3]);
			pstmt.setString(7,field[11]);
			pstmt.setString(8,field[12]);
			
			pstmt.addBatch();
			
			pstmt.clearParameters();
			
			LineCnt++;
			
			try {
				if(LineCnt%10000 == 0) {
					pstmt.executeBatch();
					conn.commit();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		conn.commit();
		
		conn.setAutoCommit(true);
		
		long endTime = System.currentTimeMillis();
		
		System.out.printf("Insert End\n");
		
		k44_endTime = k44_sdformat.format(k44_cal.getTime());	//���α׷��� ������ ���� �ð��� ������
		System.out.println( "�Ϸ� �ð�       : " + k44_endTime);
		
		System.out.printf("��Ż ���� ī��Ʈ  : %d\n", LineCnt);
		
		System.out.printf("�ɸ� �ð�         : %dms\n", endTime - startTime);
		
		br.close();//������ br�� �ݾ��־� �޸� Ȯ��.
		pstmt.close();//������ stmt�� �ݾ��־� �޸� Ȯ��.
		conn.close();//������ conn�� �ݾ��־� �޸� Ȯ��.
	}

}
