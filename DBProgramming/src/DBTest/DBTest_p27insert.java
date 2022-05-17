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
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.89:33062/koposw44", "root", "koposw44");
		//����̹� �Ŵ����� getConnection �޼ҵ�� ����(mysql���,id,pwd)�� ������ DB�� �����Ѵ�.
		//���� �Ϸ��� ������ �ν��Ͻ� conn�� ��� ����ȭ �Ѵ�.
		
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
		//conn�� createStatement �޼ҵ带 Query �۾��� �����ϱ� ���� Statement�� �ν��Ͻ��� ��� ������ ������ ó���� �� �ְ� �Ѵ�.
		
		File f = new File("C:\\Users\\501-01\\Desktop\\StockDailyPrice.csv");
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
		

		
		int LineCnt = 0; //������ ī��Ʈ���� ���� ����
		
		conn.setAutoCommit(false); //����Ŀ���� ��������, �������� �޸𸮿� ���� ���ۿ��� ó������ ,
		//������ �Ǿ������� ��ũ���� ���� �Ѵٸ� ó���ӵ��� ȹ�������� ���ϼ� �ִ�.
		
		long startTime = System.currentTimeMillis(); //���� �ð� ���


		 while ((readtxt = br.readLine()) != null) { //�о���� readline�� null�� �ƴϸ� ��� �ݺ����� �����Ѵ�. 
             String[] field = readtxt.split(","); // readtext�� ������ ���ڿ� �迭 field�� ������� �ο��Ѵ�.
             try {
                for (int i = 0; i <99; i++) {    //i�� �ʵ��� ������ŭ ���鼭 �ش� ? ������ �°� �迭�� ���� �Ķ���͸� �����ش�.
                   pstmt.setString(i+1, field[i]); //�׸��� setString���� ��´�.
                }      
			} catch (Exception e) {

			}
			try {
				pstmt.addBatch(); // ��Ƶ� ������ �ѹ��� DB������ ������.
			} catch (Exception e) {

			}
			System.out.printf("%d�� row���� batch �Ϸ�!!!!��!!\n", LineCnt);
			pstmt.clearParameters();

			LineCnt++;// ������ 1�� �����ش�.
		
			
			if (LineCnt % 10000 == 0) {// 10000���� ������ ��������
				pstmt.executeBatch();// ��Ƶ� ������ �ѹ��� DB������ ������.
				conn.commit();// �ڵ�Ŀ���� ��Ȱ��ȭ�Ͽ��⶧���� ������ commit�� ������Ѵ�.
			} // ���ǹ� �ݴ´�.

		}

		try {
			pstmt.executeBatch(); //10000������ ��ġ�ϰ� ���� ������ �ٽ� ��ġ�ϱ� ���� 
		} catch (Exception e) {
			e.printStackTrace();
		}

		conn.commit(); //ĳ�� �����͵��� Ŀ���Ѵ�,

		conn.setAutoCommit(true); //�� ���� Ŀ���� �ٽ� ����

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
