package fegopa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class 신청서_DAO {
	///updateApply : 신청서 작성내역 변경(일반회원이 자기가 작성한 신청서 수정)
	// 신청서 상태 변경(주최자가 변경가능 : 승인  updateApplyCommit, 대기 updateApplyWait, 거절 updateApplyRefuse)
	// deleteApply 신청서 삭제(일반회원이 자기가 작성한 신청서 삭제)
	// insertApply : 신청서 넣기 (일반회원이 자기가 대여하려는 부스 신청서 작성)
	// selectMyApply() : 본인이 작성한 신청서 목록 전체보기
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	주최회원_DAO 주최dao = new 주최회원_DAO();
	일반회원_DAO 일반dao = new 일반회원_DAO();
	축제DAO 축제dao = new 축제DAO();
	

	private void getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//신청서 작성(일반회원)

	public int insertApply(신청서_VO vo) {
		String id = 일반dao.selectID();
		int cnt = 0;
		int num = 0;
		try {
			getConnection();

			String sql = "insert into apply(신청id,이름,사업자번호,연락처,부스id,부스소개 ,첨부파일,회원id,축제id) values(EX_SEQ.NEXTVAL,?,?,?,?,?,?,?,?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.get이름());
			psmt.setString(2, vo.get사업자번호());
			psmt.setString(3, vo.get연락처());
			psmt.setString(4, vo.get부스id());
			psmt.setString(5, vo.get부스소개());
			psmt.setString(6, vo.get첨부파일());
			psmt.setString(7, id);
			psmt.setString(8, vo.get축제id());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	//신청서 삭제(일반회원)
	public int deleteApply(String 신청id) {
		String id = 일반dao.selectID();
		int cnt = 0;
		try {
			getConnection();

			String sql = "DELETE FROM apply where 신청id=? and 회원id = ?";

			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, 신청id);
			psmt.setString(2, id);
			
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	//신청서 수정(일반회원)
	public int updateApply(신청서_VO vo) {
		String id = 일반dao.selectID();
		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET 사업자번호=?,연락처=?,부스id=?,부스소개=?,첨부파일=?,신청상태=? where 신청id=? and 회원id = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.get사업자번호());
			psmt.setString(2, vo.get연락처());
			psmt.setString(3, vo.get부스id());
			psmt.setString(4, vo.get부스소개());
			psmt.setString(5, vo.get첨부파일());
			psmt.setString(6, vo.get신청상태());
			psmt.setNString(7, vo.get신청id());
			psmt.setString(8, id);
			

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	//본인이 작성한 신청서 모두 보기
	public ArrayList<신청서_VO> selectMyApply() {

		ArrayList<신청서_VO> list = new ArrayList<신청서_VO>();
		String id = 일반dao.selectID();
		
		try {
			getConnection();
			
			String sql = "SELECT * FROM apply where 회원id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String app_id = rs.getString(1);
				String cus_id = rs.getString(2);
				String app_num = rs.getString(3);
				String cus_tel = rs.getString(4);
				String boo_id = rs.getString(5);
				String app_int = rs.getString(6);
				String fes_file = rs.getString(7);
				String 신청상태 = rs.getString(8);
				String 회원id = rs.getString(9);

				list.add(new 신청서_VO(app_id, cus_id, app_num, cus_tel, boo_id, app_int, fes_file, 신청상태, 회원id));
				
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}
	//신청서 상태 변경(승인.거절.대기)
	// --> 상태 '대기'로 변환
	public int updateApplyWait(신청서_VO vo) {
		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET 신청상태= '대기' where 부스id =?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.get부스id());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;

	}
	// --> 상태 '승낙'로 변환
	public int updateAppltCommit(신청서_VO vo) {
		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET 신청상태= '승인' where 부스id =?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.get부스id());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;

	}
	// --> 상태 '거절'로 변환
	public int updateApplyRefuse(신청서_VO vo) {
		
		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET 신청상태= '거절' where 부스id =?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.get부스id());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;

	}
	
	
	
	
	
	
	

}
