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
		//Class.forName()을 통해 드라이버를 로드한다.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
		//드라이버 매니저의 getConnection 메소드로 인자(mysql경로,id,pwd)를 보내어 DB에 연결한다.
		//연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
		
		Statement stmt = conn.createStatement(); 
		//conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
		
		File f = new File("C:\\Users\\501-01\\Documents\\전국무료와이파이표준데이터.txt");
		//해당 경로의 파일을 파일형 변수 f에 담아 구조화 시킨다.
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		//FileReader로 파일f를 가져오고 버퍼를 이용해서 파일을 읽는 BufferedReader의 인스턴스 br에 담아 구조화시킨다.
		
		String readtxt;
		//텍스트를 읽어 담아둘 String변수 설정.
		
		if((readtxt = br.readLine()) == null) {
		//만약 버퍼리더로 읽어온 라인을 저장한 readtxt가 null, 즉 값이 없다면,
			System.out.println("빈 파일입니다.");
		//빈 파일 이라는 안내문 출력
			return;
		}
		
		
//		String[] field_name = readtxt.split("\t");
//		int LineCnt = 0;
	
		while ((readtxt = br.readLine()) != null) {
		//만약 버퍼리더로 읽어온 라인을 저장한 readtxt가 null이 아니라면, 즉 값이 있다면,
			String[] field = readtxt.split("\t");
			//탭으로 분류한 txt파일이니 읽어온 라인을 탭 기준으로 나누어 배열에 저장한다.
			String QueryTxt;
			//쿼리문을 실행할 String을 담을 변수 세팅 
			
			//여기서부터 wifi 설치날짜를 date형식으로 일괄 재설정하는 코드
			//이때 만약 파일에 day값이 지정되지 않았다면 임의의 1~28값을 넣어주었다.
			int year = 0; //year을 담을 변수
			int month = 0; //month를 담을 변수
			int day = 0; //day를 담을 변수

			//wifi설치 날짜가 아예 언급되지 않았을 경우.
			if (field[7].equals("")) {
				year = 2010 + (int) (Math.random() * 12);
				month = (int) (Math.random() * 12) + 1;

			//연도만 언급되었을 경우. ex)2014
			} else if (field[7].length() == 4) {
				year = Integer.parseInt(field[7]);
				month = (int) (Math.random() * 12) + 1;
			}
			
			//연도와 월까지만 언급되었을 경우. ex)2017-08
			else if (field[7].length() == 7) {
				year = Integer.parseInt(field[7].substring(0, 4));
				month = Integer.parseInt(field[7].substring(5, 7));
			}
			
			//월이 영어로 표기되고 연도가 두자리수로 언급되었을 경우. ex)JAN-14
				//1월
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
				//2월
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
				//3월
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
				//4월
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
				//5월
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
				//6월
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
				//7월
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
				//8월
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
				//9월
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
				//10월
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
				//11월
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
				//12월
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
			//연도와 월까지만 한글 형식으로 언급되었을 경우. ex)2014년 12월
			else if (field[7].contains("년")) {
				year = Integer.parseInt(field[7].substring(0, 4));
				month = Integer.parseInt(field[7].substring(6, 8));
			}
			
			//윗 코드들은 day가 언급이 안된 경우들. 그러므로 day값을 임의로 설정해준다.
			day = (int) (Math.random() * 28) + 1;

			//정상적으로 date형식일 경우. ex)2013-05-01
			if (field[7].length() == 10) {
				year = Integer.parseInt(field[7].substring(0, 4));
				month = Integer.parseInt(field[7].substring(5, 7));
				day = Integer.parseInt(field[7].substring(8, 10));
			}

			field[7] = String.format("%d-" + "%02d-" + "%02d", year, month, day);
			//date형식에 맞게 포맷팅하여주었다.
			
			QueryTxt = String.format("insert into freewifi ("
					+ "inst_place, inst_place_detail, inst_city, inst_country, inst_place_flag,"
					+ "service_provider, wifi_ssid, inst_date, place_addr_road, place_addr_land,"
					+ "manage_office, manage_office_phone, latitude, longitude, write_date)" + "values ("
					+ "'%s', '%s', '%s', '%s', '%s'," + "'%s', '%s', '%s', '%s', '%s'," + "'%s', '%s', %s, %s, '%s');",
					field[0], field[1], field[2], field[3], field[4], field[5], field[6], field[7], field[8], field[9],
					field[10], field[11], field[12], field[13], field[14]);
			//쿼리 실행문을 String.format에 담아 String변수에 저장한다.
			
			stmt.execute(QueryTxt);
			//쿼리 실행문을 담은 string을 stmt의 실행메소드 execute에 담아 mysql명령을 실행한다.
//			LineCnt++;
		}

		br.close();//열었던 br을 닫아주어 메모리 확보.
		stmt.close();//열었던 stmt을 닫아주어 메모리 확보.
		conn.close();//열었던 conn을 닫아주어 메모리 확보.
	}

}
