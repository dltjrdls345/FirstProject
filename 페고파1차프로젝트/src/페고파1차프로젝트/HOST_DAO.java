package �����1��������Ʈ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HOST_DAO {
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	private void getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ��ü ��������
	public ArrayList<HOST_VO> selectAll() {
		ArrayList<HOST_VO> HOST = new ArrayList<HOST_VO>();

		getConn();

		try {
			String sql = "select * from HOST";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String ID = rs.getString(1);
				String PW = rs.getString(2);
				String �ּ� = rs.getString(3);
				String ����� = rs.getString(4);
				String ����ó = rs.getString(5);
				HOST.add(new HOST_VO(ID, PW, �ּ�, �����, ����ó));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return HOST;

	}
}
