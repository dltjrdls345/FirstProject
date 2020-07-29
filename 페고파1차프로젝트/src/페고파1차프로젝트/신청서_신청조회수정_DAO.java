package 페고파1차프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class 신청서_신청조회수정_DAO {

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

			psmt.setNString(1, 신청ID);
			psmt.setNString(2, 이름);
			psmt.setNString(3, 사업자번호);
			psmt.setNString(4, 연락처);
			psmt.setNString(5, 부스ID);
			psmt.setNString(6, 부스소개);
			psmt.setNString(7, 첨부파일);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public int delete(String 신청ID) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "DELETE FROM apply";

			psmt = conn.prepareStatement(sql);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public int update_cusTel(String 연락처) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET 연락처 = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, 연락처);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public int update_booId(String 부스ID) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET 부스ID = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, 부스ID);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public int update_appInt(String 부스소개) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET 부스소개 = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, 부스소개);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public int update_fesFile(String 첨부파일) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET 첨부파일 = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, 첨부파일);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public ArrayList<신청서_신청조회수정_VO> allSelect() {

		ArrayList<신청서_신청조회수정_VO> list = new ArrayList<신청서_신청조회수정_VO>();

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

				list.add(new 신청서_신청조회수정_VO(app_id, cus_id, app_num, cus_tel, boo_id, app_int, fes_file));
				
			}
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + "\t" + list.get(i).getApp_id() + "\t "+ list.get(i).getCus_id() + "\t" + list.get(i).getApp_num() + "\t" + list.get(i).getCus_tel() + "\t" + list.get(i).getBoo_id() + "\t" + list.get(i).getApp_int() + "\t" + list.get(i).getFes_file());
					}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}

}
