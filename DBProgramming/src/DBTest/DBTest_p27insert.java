package DBTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DBTest_p27insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		String k44_startTime = null; //종료시점에 프린트할 시작시간과 종료시간 변수 설정.
		String k44_endTime = null;
		Date k44_date = new Date();
		// 포맷변경 ( 년월일 시분초)
		SimpleDateFormat k44_sdformat = new SimpleDateFormat("HH시 mm분 ss초"); 
		//  Java 시간 더하기
		Calendar k44_cal = Calendar.getInstance();
		k44_cal.setTime(k44_date);
		//시작시간 출력
		k44_startTime = k44_sdformat.format(k44_cal.getTime());  
		System.out.println("시작 시간       : " + k44_startTime); 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()을 통해 드라이버를 로드한다.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33062/koposw44", "root", "koposw44");
		//드라이버 매니저의 getConnection 메소드로 인자(mysql경로,id,pwd)를 보내어 DB에 연결한다.
		//연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
		
		String QueryText="insert ignore into stockdailyprice(stnd_iscd,bsop_date,shrn_iscd,stck_prpr,stck_oprc,stck_hgpr,stck_lwpr,prdy_vrss_sign,prdy_vrss,prdy_ctrt,"+//10
				"prdy_vol,acml_vol,acml_tr_pbmn,askp1,bidp1,total_askp_rsqn,total_bidp_rsqn,seln_cntg_smtn,shnu_cntg_smtn,seln_tr_pbmn,shnu_tr_pbmn,seln_cntg_csnu,"+//12
				"shnu_cntg_csnu,w52_hgpr,w52_lwpr,w52_hgpr_date,w52_lwpr_date,ovtm_untp_bsop_hour,ovtm_untp_prpr,ovtm_untp_prdy_vrss,ovtm_untp_prdy_vrss_sign,"+//9
				"ovtm_untp_askp1,ovtm_untp_bidp1,ovtm_untp_vol,ovtm_untp_tr_pbmn,ovtm_untp_oprc,ovtm_untp_hgpr,ovtm_untp_lwpr,mkob_otcp_vol,mkob_otcp_tr_pbmn,mkfa_otcp_vol,"+//10
				"mkfa_otcp_tr_pbmn,mrkt_div_cls_code,pstc_dvdn_amt,lstn_stcn,stck_sdpr,stck_fcam,wghn_avrg_stck_prc,issu_limt_rate,frgn_limt_qty,oder_able_qty,"+//10
				"frgn_limt_exhs_cls_code,frgn_hldn_qty,frgn_hldn_rate,hts_frgn_ehrt,itmt_last_nav,prdy_last_nav,trc_errt,dprt,ssts_cntg_qty,ssts_tr_pbmn,frgn_ntby_qty,"+//11
				"flng_cls_code,prtt_rate,acml_prtt_rate,stdv,beta_cfcn,crlt_cfcn,bull_beta,bear_beta,bull_dvtn,bear_dvtn,bull_crlt,bear_crlt,stck_mxpr,stck_llam,"+//14
				"icic_cls_code,itmt_vol,itmt_tr_pbmn,fcam_mod_cls_code,revl_issu_reas_code,orgn_ntby_qty,adj_prpr,fn_oprc,fn_hgpr,fn_lwpr,fn_prpr,fn_acml_vol,fn_acml_tr_pbmn,"+//13
				"fn_prtt_rate,fn_flng_cls_code,buyin_nor_prpr,buyin_nor_prdy_vrss,buyin_nor_vol,buyin_nor_tr_pbmn,buyin_tod_prpr,buyin_tod_prdy_vrss,buyin_tod_vol,buyin_tod_tr_pbmn)"+//10
				"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(QueryText); 
		//conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
		
		File f = new File("C:\\Users\\501-01\\Desktop\\StockDailyPrice.csv");
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
		

		
		int LineCnt = 0; //라인을 카운트해줄 변수 설정
		
		conn.setAutoCommit(false); //오토커밋을 하지말고, 수만건을 메모리와 같은 버퍼에서 처리한후 ,
		//수만건 되었을때만 디스크에서 쓰게 한다면 처리속도를 획기적으로 줄일수 있다.
		
		long startTime = System.currentTimeMillis(); //시작 시간 출력


		 while ((readtxt = br.readLine()) != null) { //읽어들인 readline이 null이 아니면 계속 반복문을 수행한다. 
             String[] field = readtxt.split(","); // readtext를 가져와 문자열 배열 field에 순서대로 부여한다.
             try {
                for (int i = 0; i <99; i++) {    //i가 필드의 갯수만큼 돌면서 해당 ? 순번에 맞게 배열에 담은 파라미터를 보내준다.
                   pstmt.setString(i+1, field[i]); //그리고 setString으로 담는다.
                }      
			} catch (Exception e) {

			}
			try {
				pstmt.addBatch(); // 모아둔 쿼리를 한번에 DB쪽으로 날린다.
			} catch (Exception e) {

			}
			System.out.printf("%d번 row까지 batch 완료!!!!굳!!\n", LineCnt);
			pstmt.clearParameters();

			LineCnt++;// 변수에 1을 더해준다.
		
			
			if (LineCnt % 10000 == 0) {// 10000으로 나누어 떨어지면
				pstmt.executeBatch();// 모아둔 쿼리를 한번에 DB쪽으로 날린다.
				conn.commit();// 자동커밋을 비활성화하였기때문에 무조건 commit을 해줘야한다.
			} // 조건문 닫는다.

		}

		try {
			pstmt.executeBatch(); //10000단위로 뱃치하고 남은 값들을 다시 뱃치하기 위해 
		} catch (Exception e) {
			e.printStackTrace();
		}

		conn.commit(); //캐시 데이터들을 커밋한다,

		conn.setAutoCommit(true); //셋 오토 커밋을 다시 켜줌

		long endTime = System.currentTimeMillis();

		System.out.printf("Insert End\n");
		
		k44_endTime = k44_sdformat.format(k44_cal.getTime());	//프로그램이 끝나는 시점 시간을 가져옴
		System.out.println( "완료 시간       : " + k44_endTime);
		
		System.out.printf("토탈 라인 카운트  : %d\n", LineCnt);
		
		System.out.printf("걸린 시간         : %dms\n", endTime - startTime);
		
		br.close();//열었던 br을 닫아주어 메모리 확보.
		pstmt.close();//열었던 stmt을 닫아주어 메모리 확보.
		conn.close();//열었던 conn을 닫아주어 메모리 확보.
	}

}
