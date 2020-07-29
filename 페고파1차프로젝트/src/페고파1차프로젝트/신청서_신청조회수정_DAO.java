package �����1��������Ʈ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ��û��_��û��ȸ����_DAO {

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

	public int insert(String ��ûID, String �̸�, String ����ڹ�ȣ, String ����ó, String �ν�ID, String �ν��Ұ�, String ÷������) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "insert into apply values (?,?,?,?,?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setNString(1, ��ûID);
			psmt.setNString(2, �̸�);
			psmt.setNString(3, ����ڹ�ȣ);
			psmt.setNString(4, ����ó);
			psmt.setNString(5, �ν�ID);
			psmt.setNString(6, �ν��Ұ�);
			psmt.setNString(7, ÷������);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public int delete(String ��ûID) {

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

	public int update_cusTel(String ����ó) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET ����ó = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, ����ó);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public int update_booId(String �ν�ID) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET �ν�ID = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, �ν�ID);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public int update_appInt(String �ν��Ұ�) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET �ν��Ұ� = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, �ν��Ұ�);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public int update_fesFile(String ÷������) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET ÷������ = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, ÷������);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public ArrayList<��û��_��û��ȸ����_VO> allSelect() {

		ArrayList<��û��_��û��ȸ����_VO> list = new ArrayList<��û��_��û��ȸ����_VO>();

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

				list.add(new ��û��_��û��ȸ����_VO(app_id, cus_id, app_num, cus_tel, boo_id, app_int, fes_file));
				
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
