package DBTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p23 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()�� ���� ����̹��� �ε��Ѵ�.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		//����̹� �Ŵ����� getConnection �޼ҵ�� ����(mysql���,id,pwd)�� ������ DB�� �����Ѵ�.
		//���� �Ϸ��� ������ �ν��Ͻ� conn�� ��� ����ȭ �Ѵ�.
		
		Statement stmt = conn.createStatement(); 
		//conn�� createStatement �޼ҵ带 Query �۾��� �����ϱ� ���� Statement�� �ν��Ͻ��� ��� ������ ������ ó���� �� �ְ� �Ѵ�.
		
		File f = new File("C:\\Users\\501-01\\Documents\\���������������ǥ�ص�����.txt");
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
//		int LineCnt = 0;
	
		while ((readtxt = br.readLine()) != null) {
		//���� ���۸����� �о�� ������ ������ readtxt�� null�� �ƴ϶��, �� ���� �ִٸ�,
			String[] field = readtxt.split("\t");
			//������ �з��� txt�����̴� �о�� ������ �� �������� ������ �迭�� �����Ѵ�.
			String QueryTxt;
			//�������� ������ String�� ���� ���� ���� 
			
			//���⼭���� wifi ��ġ��¥�� date�������� �ϰ� �缳���ϴ� �ڵ�
			//�̶� ���� ���Ͽ� day���� �������� �ʾҴٸ� ������ 1~28���� �־��־���.
			int year = 0; //year�� ���� ����
			int month = 0; //month�� ���� ����
			int day = 0; //day�� ���� ����

			//wifi��ġ ��¥�� �ƿ� ��޵��� �ʾ��� ���.
			if (field[7].equals("")) {
				year = 2010 + (int) (Math.random() * 12);
				month = (int) (Math.random() * 12) + 1;

			//������ ��޵Ǿ��� ���. ex)2014
			} else if (field[7].length() == 4) {
				year = Integer.parseInt(field[7]);
				month = (int) (Math.random() * 12) + 1;
			}
			
			//������ �������� ��޵Ǿ��� ���. ex)2017-08
			else if (field[7].length() == 7) {
				year = Integer.parseInt(field[7].substring(0, 4));
				month = Integer.parseInt(field[7].substring(5, 7));
			}
			
			//���� ����� ǥ��ǰ� ������ ���ڸ����� ��޵Ǿ��� ���. ex)JAN-14
				//1��
			else if (field[7].contains("Jan")) {
				month = 1;
				try {
					year = 2000 + Integer.parseInt(field[7].substring(4, 6));
				} catch (Exception e) {
				}
				try {
					year = 2000 + Integer.parseInt(field[7].substring(0, 2));
				} catch (Exception e) {
				}
				//2��
			} else if (field[7].contains("Feb")) {
				month = 2;
				try {
					year = 2000 + Integer.parseInt(field[7].substring(4, 6));
				} catch (Exception e) {
				}
				try {
					year = 2000 + Integer.parseInt(field[7].substring(0, 2));
				} catch (Exception e) {
				}
				//3��
			} else if (field[7].contains("Mar")) {
				month = 3;
				try {
					year = 2000 + Integer.parseInt(field[7].substring(4, 6));
				} catch (Exception e) {
				}
				try {
					year = 2000 + Integer.parseInt(field[7].substring(0, 2));
				} catch (Exception e) {
				}
				//4��
			} else if (field[7].contains("Apr")) {
				month = 4;
				try {
					year = 2000 + Integer.parseInt(field[7].substring(4, 6));
				} catch (Exception e) {
				}
				try {
					year = 2000 + Integer.parseInt(field[7].substring(0, 2));
				} catch (Exception e) {
				}
				//5��
			} else if (field[7].contains("May")) {
				month = 5;
				try {
					year = 2000 + Integer.parseInt(field[7].substring(4, 6));
				} catch (Exception e) {
				}
				try {
					year = 2000 + Integer.parseInt(field[7].substring(0, 2));
				} catch (Exception e) {
				}
				//6��
			} else if (field[7].contains("Jun")) {
				month = 6;
				try {
					year = 2000 + Integer.parseInt(field[7].substring(4, 6));
				} catch (Exception e) {
				}
				try {
					year = 2000 + Integer.parseInt(field[7].substring(0, 2));
				} catch (Exception e) {
				}
				//7��
			} else if (field[7].contains("Jul")) {
				month = 7;
				try {
					year = 2000 + Integer.parseInt(field[7].substring(4, 6));
				} catch (Exception e) {
				}
				try {
					year = 2000 + Integer.parseInt(field[7].substring(0, 2));
				} catch (Exception e) {
				}
				//8��
			} else if (field[7].contains("Aug")) {
				month = 8;
				try {
					year = 2000 + Integer.parseInt(field[7].substring(4, 6));
				} catch (Exception e) {
				}
				try {
					year = 2000 + Integer.parseInt(field[7].substring(0, 2));
				} catch (Exception e) {
				}
				//9��
			} else if (field[7].contains("Sep")) {
				month = 9;
				try {
					year = 2000 + Integer.parseInt(field[7].substring(4, 6));
				} catch (Exception e) {
				}
				try {
					year = 2000 + Integer.parseInt(field[7].substring(0, 2));
				} catch (Exception e) {
				}
				//10��
			} else if (field[7].contains("Oct")) {
				month = 10;
				try {
					year = 2000 + Integer.parseInt(field[7].substring(4, 6));
				} catch (Exception e) {
				}
				try {
					year = 2000 + Integer.parseInt(field[7].substring(0, 2));
				} catch (Exception e) {
				}
				//11��
			} else if (field[7].contains("Nov")) {
				month = 11;
				try {
					year = 2000 + Integer.parseInt(field[7].substring(4, 6));
				} catch (Exception e) {
				}
				try {
					year = 2000 + Integer.parseInt(field[7].substring(0, 2));
				} catch (Exception e) {
				}
				//12��
			} else if (field[7].contains("Dec")) {
				month = 12;
				try {
					year = 2000 + Integer.parseInt(field[7].substring(4, 6));
				} catch (Exception e) {
				}
				try {
					year = 2000 + Integer.parseInt(field[7].substring(0, 2));
				} catch (Exception e) {
				}
			}
			//������ �������� �ѱ� �������� ��޵Ǿ��� ���. ex)2014�� 12��
			else if (field[7].contains("��")) {
				year = Integer.parseInt(field[7].substring(0, 4));
				month = Integer.parseInt(field[7].substring(6, 8));
			}
			
			//�� �ڵ���� day�� ����� �ȵ� ����. �׷��Ƿ� day���� ���Ƿ� �������ش�.
			day = (int) (Math.random() * 28) + 1;

			//���������� date������ ���. ex)2013-05-01
			if (field[7].length() == 10) {
				year = Integer.parseInt(field[7].substring(0, 4));
				month = Integer.parseInt(field[7].substring(5, 7));
				day = Integer.parseInt(field[7].substring(8, 10));
			}

			field[7] = String.format("%d-" + "%02d-" + "%02d", year, month, day);
			//date���Ŀ� �°� �������Ͽ��־���.
			
			QueryTxt = String.format("insert into freewifi ("
					+ "inst_place, inst_place_detail, inst_city, inst_country, inst_place_flag,"
					+ "service_provider, wifi_ssid, inst_date, place_addr_road, place_addr_land,"
					+ "manage_office, manage_office_phone, latitude, longitude, write_date)" + "values ("
					+ "'%s', '%s', '%s', '%s', '%s'," + "'%s', '%s', '%s', '%s', '%s'," + "'%s', '%s', %s, %s, '%s');",
					field[0], field[1], field[2], field[3], field[4], field[5], field[6], field[7], field[8], field[9],
					field[10], field[11], field[12], field[13], field[14]);
			//���� ���๮�� String.format�� ��� String������ �����Ѵ�.
			
			stmt.execute(QueryTxt);
			//���� ���๮�� ���� string�� stmt�� ����޼ҵ� execute�� ��� mysql����� �����Ѵ�.
//			LineCnt++;
		}

		br.close();//������ br�� �ݾ��־� �޸� Ȯ��.
		stmt.close();//������ stmt�� �ݾ��־� �޸� Ȯ��.
		conn.close();//������ conn�� �ݾ��־� �޸� Ȯ��.
	}

}
