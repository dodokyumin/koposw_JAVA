package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p26set {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()을 통해 드라이버를 로드한다.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33062/koposw44", "root", "koposw44");
		//드라이버 매니저의 getConnection 메소드로 인자(mysql경로,id,pwd)를 보내어 DB에 연결한다.																										  
		//연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
		
		Statement stmt = conn.createStatement();
		//conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
		
		stmt.execute("create table stockdailyprice8("+		//freewifi로 테이블 생성
				"shrn_iscd varchar(50) , "+      //2 NOT_NULL 유가증권 단축 종목코드
				"bsop_date int , "+      //1 NOT_NULL 주식 영업 일자
				"stck_oprc int , "+      //4 주식 시가
				"stck_hgpr int , "+      //5 주식 최고가
				"stck_lwpr int , "+      //6 주식 최저가
				"stck_prpr int , "+      //3 주식 종가
				"acml_vol long , "+      //11 누적 거래량
				"acml_tr_pbmn long , "+      //12 누적 거래 대금
				
				"CONSTRAINT stock_pk PRIMARY KEY(bsop_date, shrn_iscd))"
				//쿼리 실행문을 담은 string을 stmt의 실행메소드 execute에 담아 mysql명령을 실행한다.
				//이때 일자, 단축코드 복합은 중복값이 없는 primary key로 설정하였다.
				);
	}
}
