package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p25_2print {

   public static void main(String[] args) throws ClassNotFoundException, SQLException {
      Class.forName("com.mysql.cj.jdbc.Driver");
      //Class.forName()�� ���� ����̹��� �ε��Ѵ�.
      
      Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
      //����̹� �Ŵ����� getConnection �޼ҵ�� ����(mysql���,id,pwd)�� ������ DB�� �����Ѵ�.
      //���� �Ϸ��� ������ �ν��Ͻ� conn�� ��� ����ȭ �Ѵ�.
      
      Statement stmt = conn.createStatement();
      //conn�� createStatement �޼ҵ带 Query �۾��� �����ϱ� ���� Statement�� �ν��Ͻ��� ��� ������ ������ ó���� �� �ְ� �Ѵ�.
      
      String QueryTxt; //���� ��ɹ��� ����� String ���� ����
      
		for (int i = 0; i < 1000; i = i + 30) { // �ݺ����� ���� i�� ���� ���� 30������ �־� 30�� ����ϵ��� �Ѵ�.
			QueryTxt = String.format(" select *, kor+eng+mat, (kor+eng+mat)/3 from thousandReport limit %d, 30;", i);
			// ���� ���๮�� String.format�� ��� String������ �����Ѵ�. �� ������ ���հ�, ��հ��� �ش� ���̺� ��������, ����Ʈ��
			// ������ �־� �������� �ٸ��� �����Ѵ�.

			ResultSet rset = stmt.executeQuery(QueryTxt);
			// ������� ������ �� �ִ� ResultSet�� rset�ν��Ͻ��� ���� ���๮�� ���� stmt�� �����Ѵ�.
			System.out.println("============================================="); //���м� ���
			System.out.printf("%4s%6s%3s%4s%4s%4s%6s\n", "�й�", "�̸�", "����", "����", "����", "�հ�", "���");// ��� ���� �ȳ�

			while (rset.next()) {
			//���� ���۸����� �о�� ������ ������ readtxt�� null�� �ƴ϶��, �� ���� �ִٸ�,
				System.out.printf("%d%6s%5d%6d%6d%6d  %6.2f \n", rset.getInt(1), rset.getString(2), rset.getInt(3),
						rset.getInt(4), rset.getInt(5), rset.getInt(6), rset.getDouble(7));
				//rset�� getString�޼ҵ带 ���� �������, �� row���� ������� ���� �����͸� ���˿� �°� ����Ѵ�.
			}
			System.out.println("============================================="); //���м� ���
			System.out.println("�� ������ ��");//���м� ���
			
			QueryTxt = String.format("select sum(kor), sum(eng), sum(mat), sum(kor+eng+mat), sum((kor+eng+mat)/3), "
					//���� ��ɹ��� String.format�� ��� ������ �����Ѵ�. mysql���� ���̴� �հ� �޼ҵ�sum()�� sql���� ����ϱ� ���� ������ string�ڷ����̴�.
					+ "avg(kor), avg(eng), avg(mat), avg(kor+eng+mat), avg((kor+eng+mat)/3) from (select kor,eng,mat from thousandReport limit %d,30)as var;",
					i);
					//mysql���� ���̴� ��հ� �޼ҵ� avg()�� sql���� ����ϱ� ���� ������ string�ڷ����̴�. �̶� sql����Ʈ ����� ��� row���� �κ�������(i��° ���� 30��)
			//select�Ͽ� ��ƿ� �� �ְ� ���־���. �̶� from������ ������ ���̺� ��Ī var�� �����Ͽ���. 

			ResultSet rset2 = stmt.executeQuery(QueryTxt);
			// ������� ������ �� �ִ� ResultSet�� rset2�� ������־� �ι�° ���鵵 ���� �̿��� �� �ֵ��� ����ȭ.
			
			while (rset2.next()) {
			//���� ���۸����� �о�� ������ ������ readtxt�� null�� �ƴ϶��, �� ���� �ִٸ�,
				System.out.printf("    %12d %6d %6d %6d  %6.2f \n", rset2.getInt(1), rset2.getInt(2), rset2.getInt(3), rset2.getInt(4), rset2.getDouble(5));
				//�ش� row�� ������ ���� ���˿� �°� getInt�� getDoule �޼ҵ带 �̿��� �־��־� ����Ѵ�.
				System.out.printf("    %12.2f %6.2f %6.2f %6.2f  %6.2f \n", rset2.getDouble(6), rset2.getDouble(7), rset2.getDouble(8), rset2.getDouble(9), rset2.getDouble(10));
			}
			System.out.println("��ü ���� ��"); // ���м� ���

			if (i == 990) {	//30�� ����� �� 33�� ��, 990����� ����ϸ� ���� 10���� ����ؾ� ������ i���� �ѹ� �� �� �� 1020�� ���� ���ԵǾ� ������ �߻��Ѵ�. 
				i = 970; //�׷��Ƿ� �ݺ� ���� i�� �ٽ� 970���� ����־� ������ ����� �ʰ� �Ѵ�. 
			}
			QueryTxt = String.format(" select sum(kor), sum(eng), sum(mat), sum(kor+eng+mat), sum((kor+eng+mat)/3), "
					+ "avg(kor), avg(eng), avg(mat), avg(kor+eng+mat), avg((kor+eng+mat)/3) from (select kor,eng,mat from thousandReport limit 0, %d)as var2;",
					(i + 30));
			//mysql���� ���̴� ��հ� �޼ҵ� avg()�� sql���� ����ϱ� ���� ������ string�ڷ����̴�. �̶� sql����Ʈ ����� ��� row���� �κ�������(i��° ���� 30��)
			//select�Ͽ� ��ƿ� �� �ְ� ���־���. �̶� from������ ������ ���̺� ��Ī var2�� �����Ͽ���. 

			ResultSet rset3 = stmt.executeQuery(QueryTxt);
			// ������� ������ �� �ִ� ResultSet�� rset2�� ������־� ����° ���鵵 ���� �̿��� �� �ֵ��� ����ȭ.
	
			while (rset3.next()) {
				//���� ���۸����� �о�� ������ ������ readtxt�� null�� �ƴ϶��, �� ���� �ִٸ�,
				System.out.printf("    %12d %6d %6d %6d  %4.2f \n", rset3.getInt(1), rset3.getInt(2), rset3.getInt(3),rset3.getInt(4), rset3.getDouble(5));
				//�ش� row�� ������ ���� ���˿� �°� getInt�� getDoule �޼ҵ带 �̿��� �־��־� ����Ѵ�.
				System.out.printf("    %12.2f %6.2f %6.2f %6.2f  %6.2f \n", rset3.getDouble(6), rset3.getDouble(7),rset3.getDouble(8), rset3.getDouble(9), rset3.getDouble(10));
			}
			rset.close(); //������ rset�� �ݾ��־� �޸� Ȯ��.
			rset2.close();//������ rset2�� �ݾ��־� �޸� Ȯ��.
			rset3.close();//������ rset3�� �ݾ��־� �޸� Ȯ��.
		}
		stmt.close(); //������ stmt�� �ݾ��־� �޸� Ȯ��.
		conn.close(); //������ conn�� �ݾ��־� �޸� Ȯ��.
	}
}