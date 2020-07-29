package �����1��������Ʈ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CUSTOMER_DAO {
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ��ü���ð�������
	public ArrayList<CUSTOMER_VO> selectAll() {
		ArrayList<CUSTOMER_VO> CUSTOMER = new ArrayList<CUSTOMER_VO>();

		getConn();
		try {
			String sql = "select * from CUSTOMER";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String ID = rs.getString(1);
				String PW = rs.getString(2);
				String �ּ� = rs.getString(3);
				String �̸� = rs.getString(4);
				String ����ó = rs.getString(5);
				String ������� = rs.getString(6);
				String �̸��� = rs.getString(7);
				CUSTOMER.add(new CUSTOMER_VO(ID, PW, �ּ�, �̸�, ����ó, �������, �̸���));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return CUSTOMER;
	}
}
