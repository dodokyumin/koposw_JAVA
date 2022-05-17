package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p25_2print {

   public static void main(String[] args) throws ClassNotFoundException, SQLException {
      Class.forName("com.mysql.cj.jdbc.Driver");
      //Class.forName()을 통해 드라이버를 로드한다.
      
      Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33060/koposw44", "root", "koposw44");
      //드라이버 매니저의 getConnection 메소드로 인자(mysql경로,id,pwd)를 보내어 DB에 연결한다.
      //연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
      
      Statement stmt = conn.createStatement();
      //conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
      
      String QueryTxt; //쿼리 명령문을 담아줄 String 변수 설정
      
		for (int i = 0; i < 1000; i = i + 30) { // 반복문을 도는 i의 증가 값을 30단위로 주어 30명씩 출력하도록 한다.
			QueryTxt = String.format(" select *, kor+eng+mat, (kor+eng+mat)/3 from thousandReport limit %d, 30;", i);
			// 쿼리 실행문을 String.format에 담아 String변수에 저장한다. 각 점수의 총합과, 평균값을 해당 테이블에 가져오고, 리미트에
			// 변수를 주어 시작점을 다르게 세팅한다.

			ResultSet rset = stmt.executeQuery(QueryTxt);
			// 결과값을 저장할 수 있는 ResultSet형 rset인스턴스에 쿼리 실행문을 담은 stmt를 저장한다.
			System.out.println("============================================="); //구분선 출력
			System.out.printf("%4s%6s%3s%4s%4s%4s%6s\n", "학번", "이름", "국어", "영어", "수학", "합계", "평균");// 출력 포맷 안내

			while (rset.next()) {
			//만약 버퍼리더로 읽어온 라인을 저장한 readtxt가 null이 아니라면, 즉 값이 있다면,
				System.out.printf("%d%6s%5d%6d%6d%6d  %6.2f \n", rset.getInt(1), rset.getString(2), rset.getInt(3),
						rset.getInt(4), rset.getInt(5), rset.getInt(6), rset.getDouble(7));
				//rset의 getString메소드를 통해 순서대로, 각 row들의 결과값을 담은 데이터를 포맷에 맞게 출력한다.
			}
			System.out.println("============================================="); //구분선 출력
			System.out.println("현 페이지 값");//구분선 출력
			
			QueryTxt = String.format("select sum(kor), sum(eng), sum(mat), sum(kor+eng+mat), sum((kor+eng+mat)/3), "
					//쿼리 명령문을 String.format에 담아 변수에 저장한다. mysql에서 쓰이는 합계 메소드sum()은 sql에서 사용하기 위해 지금은 string자료형이다.
					+ "avg(kor), avg(eng), avg(mat), avg(kor+eng+mat), avg((kor+eng+mat)/3) from (select kor,eng,mat from thousandReport limit %d,30)as var;",
					i);
					//mysql에서 쓰이는 평균값 메소드 avg()은 sql에서 사용하기 위해 지금은 string자료형이다. 이때 sql리미트 명령을 담아 row들을 부분적으로(i번째 부터 30개)
			//select하여 담아올 수 있게 해주었다. 이때 from다음의 범위를 테이블 별칭 var로 저장하였다. 

			ResultSet rset2 = stmt.executeQuery(QueryTxt);
			// 결과값을 저장할 수 있는 ResultSet형 rset2를 만들어주어 두번째 값들도 쉽게 이용할 수 있도록 구조화.
			
			while (rset2.next()) {
			//만약 버퍼리더로 읽어온 라인을 저장한 readtxt가 null이 아니라면, 즉 값이 있다면,
				System.out.printf("    %12d %6d %6d %6d  %6.2f \n", rset2.getInt(1), rset2.getInt(2), rset2.getInt(3), rset2.getInt(4), rset2.getDouble(5));
				//해당 row의 값들을 현재 포맷에 맞게 getInt와 getDoule 메소드를 이용해 넣어주어 출력한다.
				System.out.printf("    %12.2f %6.2f %6.2f %6.2f  %6.2f \n", rset2.getDouble(6), rset2.getDouble(7), rset2.getDouble(8), rset2.getDouble(9), rset2.getDouble(10));
			}
			System.out.println("전체 누적 값"); // 구분선 출력

			if (i == 990) {	//30명씩 출력할 때 33번 즉, 990명까지 출력하면 남은 10명을 출력해야 하지만 i값이 한번 더 돌 때 1020번 까지 돌게되어 에러가 발생한다. 
				i = 970; //그러므로 반복 변수 i를 다시 970으로 잡아주어 범위를 벗어나지 않게 한다. 
			}
			QueryTxt = String.format(" select sum(kor), sum(eng), sum(mat), sum(kor+eng+mat), sum((kor+eng+mat)/3), "
					+ "avg(kor), avg(eng), avg(mat), avg(kor+eng+mat), avg((kor+eng+mat)/3) from (select kor,eng,mat from thousandReport limit 0, %d)as var2;",
					(i + 30));
			//mysql에서 쓰이는 평균값 메소드 avg()은 sql에서 사용하기 위해 지금은 string자료형이다. 이때 sql리미트 명령을 담아 row들을 부분적으로(i번째 부터 30개)
			//select하여 담아올 수 있게 해주었다. 이때 from다음의 범위를 테이블 별칭 var2로 저장하였다. 

			ResultSet rset3 = stmt.executeQuery(QueryTxt);
			// 결과값을 저장할 수 있는 ResultSet형 rset2를 만들어주어 세번째 값들도 쉽게 이용할 수 있도록 구조화.
	
			while (rset3.next()) {
				//만약 버퍼리더로 읽어온 라인을 저장한 readtxt가 null이 아니라면, 즉 값이 있다면,
				System.out.printf("    %12d %6d %6d %6d  %4.2f \n", rset3.getInt(1), rset3.getInt(2), rset3.getInt(3),rset3.getInt(4), rset3.getDouble(5));
				//해당 row의 값들을 현재 포맷에 맞게 getInt와 getDoule 메소드를 이용해 넣어주어 출력한다.
				System.out.printf("    %12.2f %6.2f %6.2f %6.2f  %6.2f \n", rset3.getDouble(6), rset3.getDouble(7),rset3.getDouble(8), rset3.getDouble(9), rset3.getDouble(10));
			}
			rset.close(); //열었던 rset을 닫아주어 메모리 확보.
			rset2.close();//열었던 rset2을 닫아주어 메모리 확보.
			rset3.close();//열었던 rset3을 닫아주어 메모리 확보.
		}
		stmt.close(); //열었던 stmt을 닫아주어 메모리 확보.
		conn.close(); //열었던 conn을 닫아주어 메모리 확보.
	}
}