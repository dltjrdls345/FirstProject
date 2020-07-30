package 페고파1차프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class 신청서_DAO {
	///.신청서 상태 업데이트 0
	// 신청서 변경
	// 신청서 삭제
	// 신청서 넣기 0
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

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

	public int insert(String 신청ID, String 이름, String 사업자번호, String 연락처, String 부스ID, String 부스소개, String 첨부파일) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "insert into apply values (?,?,?,?,?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, 신청ID);
			psmt.setString(2, 이름);
			psmt.setString(3, 사업자번호);
			psmt.setString(4, 연락처);
			psmt.setString(5, 부스ID);
			psmt.setString(6, 부스소개);
			psmt.setString(7, 첨부파일);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	//신청서 삭제
	public int delete(String 신청id) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "DELETE FROM apply where 신청id=?";

			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, 신청id);
			
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	//신청서 수정
	public int update_cusTel(신청서_VO vo) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET 사업자번호=?,연락처=?,부스id=?,부스소개=?,첨부파일=?,신청상태=?where 신청id=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.get사업자번호());
			psmt.setString(2, vo.get연락처());
			psmt.setString(3, vo.get부스id());
			psmt.setString(4, vo.get부스소개());
			psmt.setString(5, vo.get첨부파일());
			psmt.setString(6, vo.get신청상태());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public ArrayList<신청서_VO> allSelect() {

		ArrayList<신청서_VO> list = new ArrayList<신청서_VO>();

		try {
			getConnection();
			
			String sql = "SELECT * FROM apply";
			psmt = conn.prepareStatement(sql);

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
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + "\t" + list.get(i).get신청id() + "\t "+ list.get(i).get이름() + "\t" + list.get(i).get사업자번호() + "\t" + list.get(i).get연락처() + "\t" + list.get(i).get부스id() + "\t" + list.get(i).get부스소개() + "\t" + list.get(i).get첨부파일() +"\t" + list.get(i).get신청상태() +"\t" + list.get(i).get회원id());
					}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}
	//부스 상태(대기,승인)
	public int updateapplywait(신청서_VO vo) {
		
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
	public int updateapplycommit(신청서_VO vo) {
		
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
	public int updateapplyrefuse(신청서_VO vo) {
		
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
