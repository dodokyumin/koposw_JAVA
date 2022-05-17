package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_p27set {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName()을 통해 드라이버를 로드한다.
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33062/koposw44", "root", "koposw44");
		//드라이버 매니저의 getConnection 메소드로 인자(mysql경로,id,pwd)를 보내어 DB에 연결한다.																										  
		//연결 완료한 설정을 인스턴스 conn에 담아 구조화 한다.
		
		Statement stmt = conn.createStatement();
		//conn의 createStatement 메소드를 Query 작업을 실행하기 위한 Statement형 인스턴스에 담아 정적인 쿼리를 처리할 수 있게 한다.
		
		stmt.execute("create table stockdailyprice("+		//freewifi로 테이블 생성
				"stnd_iscd varchar(50), "+      //0 NOT_NULL 표준 종목코드
				"bsop_date int , "+      //1 NOT_NULL 주식 영업 일자
				"shrn_iscd varchar(50) , "+      //2 NOT_NULL 유가증권 단축 종목코드
				"stck_prpr int , "+      //3 주식 종가
				"stck_oprc int , "+      //4 주식 시가
				"stck_hgpr int , "+      //5 주식 최고가
				"stck_lwpr int , "+      //6 주식 최저가
				"prdy_vrss_sign varchar(50) , "+      // 7 전일 대비 부호
				"prdy_vrss int , "+      // 8 전일 대비
				"prdy_ctrt float , "+      // 9 전일 대비율
				"prdy_vol long , "+      //10 전일 거래량
				"acml_vol long , "+      //11 누적 거래량
				"acml_tr_pbmn long , "+      //12 누적 거래 대금
				"askp1 int , "+      //13 매도호가1
				"bidp1 int , "+      //14 매수호가1
				"total_askp_rsqn long , "+      //15 총 매도호가 잔량
				"total_bidp_rsqn long , "+      //16 총 매수호가 잔량
				"seln_cntg_smtn long , "+      //17 매도 체결 합계
				"shnu_cntg_smtn long , "+      //18 매수 체결 합계
				"seln_tr_pbmn long , "+      //19 매도 거래 대금(누적)
				"shnu_tr_pbmn long , "+      //20 매수 거래 대금(누적)
				"seln_cntg_csnu int , "+      //21 매도 체결 건수
				"shnu_cntg_csnu int , "+      //22 매수 체결 건수
				"w52_hgpr int , "+      //23 52주일 최고가
				"w52_lwpr int , "+      //24 52주일 최저가
				"w52_hgpr_date int , "+      //25 52주일 최고가 일자
				"w52_lwpr_date int , "+      //26 52주일 최저가 일자
				"ovtm_untp_bsop_hour int , "+      //27 시간외 단일가 최종 시간
				"ovtm_untp_prpr int , "+      //28 시간외 단일가 현재가
				"ovtm_untp_prdy_vrss int , "+      //29 시간외 단일가 전일 대비
				"ovtm_untp_prdy_vrss_sign varchar(50) , "+      //30 시간외 단일가 전일 대비 부호
				"ovtm_untp_askp1 int , "+      //31 시간외 단일가 매도호가1
				"ovtm_untp_bidp1 int , "+      //32 시간외 단일가 매수호가1
				"ovtm_untp_vol long , "+      //33 시간외 단일가 거래량
				"ovtm_untp_tr_pbmn long , "+      //34 시간외 단일가 거래 대금
				"ovtm_untp_oprc int , "+      //35 시간외 단일가 시가
				"ovtm_untp_hgpr  int      , "+      //36 시간외 단일가 최고가 
				"ovtm_untp_lwpr int , "+      //37 시간외 단일가 최저가
				"mkob_otcp_vol long , "+      //38 장개시전 시간외종가 거래량
				"mkob_otcp_tr_pbmn long , "+      //39 장개시전 시간외종가 거래 대금
				"mkfa_otcp_vol long , "+      //40 장종료후 시간외종가 거래량
				"mkfa_otcp_tr_pbmn long , "+      //41 장종료후 시간외종가 거래 대금
				"mrkt_div_cls_code varchar(50) , "+      //42 시장 분류 구분 코드
				"pstc_dvdn_amt long , "+      //43 주당 배당 금액
				"lstn_stcn long , "+      //44 상장 주수
				"stck_sdpr int , "+      //45 주식 기준가
				"stck_fcam float , "+      //46 주식 액면가
				"wghn_avrg_stck_prc double , "+      //47 가중 평균 주식 가격
				"issu_limt_rate float , "+      //48 종목 한도 비율
				"frgn_limt_qty long , "+      //49 외국인 한도 수량
				"oder_able_qty long , "+      //50 주문 가능 수량
				"frgn_limt_exhs_cls_code varchar(50) , "+      //51 외국인 한도 소진 구분 코드
				"frgn_hldn_qty long , "+      //52 외국인 보유 수량
				"frgn_hldn_rate float , "+      //53 외국인 보유 비율
				"hts_frgn_ehrt float , "+      //54 HTS 외국인 소진율
				"itmt_last_nav float , "+      //55 장중 최종 NAV
				"prdy_last_nav float , "+      //56 전일 최종 NAV
				"trc_errt float , "+      //57 추적 오차율
				"dprt float , "+      //58 괴리율
				"ssts_cntg_qty long , "+      // 59 공매도차입증권매도체결수량
				"ssts_tr_pbmn long , "+      //60 공매도차입증권매도거래대금
				"frgn_ntby_qty long , "+      //61 외국인 순매수
				"flng_cls_code varchar(50) , "+      //62 락구분 코드
				"prtt_rate float , "+      //63 분할 비율
				"acml_prtt_rate float , "+      //64 누적 분할 비율
				"stdv float , "+      //65 전체융자잔고비율
				"beta_cfcn float , "+      //66 베타 계수(90일)
				"crlt_cfcn float , "+      //67 DEL 상관 계수
				"bull_beta float , "+      //68 DEL 강세 계수
				"bear_beta float , "+      //69 DEL 약세 계수
				"bull_dvtn  float , "+      //70*  DEL 강세 편차
				"bear_dvtn  float , "+      //71*  DEL 약세 편차
				"bull_crlt  float , "+      //72*  DEL 강세 상관계수
				"bear_crlt  float , "+      //73*  DEL 약세 상관계수
				"stck_mxpr  int , "+      //74 *  주식 상한가
				"stck_llam  int , "+      //75 *  주식 하한가
				"icic_cls_code varchar(50) , "+      //76 *  증자 구분 코드
				"itmt_vol  long , "+      //77 *  장중 거래량
				"itmt_tr_pbmn  long , "+      //78 *  장중 거래대금
				"fcam_mod_cls_code varchar(50) , "+      //79 액면가 변경 구분 코드
				"revl_issu_reas_code varchar(50)     , "+      //80 재평가 종목 사유 코드
				"orgn_ntby_qty long , "+      //81 기관계 순매수
				"adj_prpr int , "+      //82 수정주가 (교보:fnguide때문에 추가)
				"fn_oprc int , "+      //83 주식 시가
				"fn_hgpr int , "+      //84 주식 최고가
				"fn_lwpr int , "+      //85 주식 최저가
				"fn_prpr int , "+      //86 주식 종가
				"fn_acml_vol long , "+      //87 누적 거래량
				"fn_acml_tr_pbmn long , "+      //88 누적 거래 대금
				"fn_prtt_rate float , "+      //89 분할 비율
				"fn_flng_cls_code varchar(50) , "+      //90 락구분 코드
				"buyin_nor_prpr int , "+      //91 Buy-in 일반 체결가
				"buyin_nor_prdy_vrss int , "+      //92 Buy-in 일반 종가 대비
				"buyin_nor_vol long , "+      //93 Buy-in 일반 체결량
				"buyin_nor_tr_pbmn long , "+      //94 Buy-in 일반 체결 대금
				"buyin_tod_prpr int , "+      //95 Buy-in 당일 체결가
				"buyin_tod_prdy_vrss int , "+      //96 Buy-in 당일 종가 대비
				"buyin_tod_vol long , "+      //97 Buy-in 당일 체결량
				"buyin_tod_tr_pbmn long,  "+      //98 Buy-in 당일 체결 대금
				"CONSTRAINT stock_pk PRIMARY KEY(bsop_date, shrn_iscd))"
				//쿼리 실행문을 담은 string을 stmt의 실행메소드 execute에 담아 mysql명령을 실행한다.
				//이때 일자, 단축코드 복합은 중복값이 없는 primary key로 설정하였다.
				);
		
		stmt.close(); //열었던 stmt을 닫아주어 메모리 확보.
		conn.close(); //열었던 conn을 닫아주어 메모리 확보.
	}

}
