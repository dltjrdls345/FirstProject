package �����1��������Ʈ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ����_DAO {
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
	//�ν����
	public int insert(String �ν�id, String �ν�����, int �뿩��, String �뿩���۱Ⱓ, String �뿩����Ⱓ, String �ν�ũ��, String �ν�����,
			String ����id) {
		
		int cnt=0;
		try {
			getConn();
			
			String sql = "insert into HOST values(?,?,?,?,?,?,?)";
			
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, �ν�id);
			pst.setString(2, �ν�����);
			pst.setInt(3, �뿩��);
			pst.setString(4, �뿩���۱Ⱓ);
			pst.setString(5, �뿩����Ⱓ);
			pst.setString(6, �ν�ũ��);
			pst.setString(7, �ν�����);
			pst.setString(8, ����id);
			
			
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
}	
	//��ϵ� �ν� ����
	public int delete(String �ν�id) { 

		int cnt = 0;
		try {
			getConn();

			String sql = "DELETE FROM BOOTH";

			pst = conn.prepareStatement(sql);

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}	
	//�ν� ����(1������7������)
	public int update1(String �ν�id) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET �ν�id=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, �ν�id);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update2(String �ν�����) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET �ν�����=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, �ν�����);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update3(int �뿩��) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET �뿩��=?";

		pst = conn.prepareStatement(sql);

		pst.setInt(1, �뿩��);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update4(String �뿩���۱Ⱓ) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET �뿩���۱Ⱓ=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, �뿩���۱Ⱓ);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update5(String �뿩����Ⱓ) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET �뿩����Ⱓ=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, �뿩����Ⱓ);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update6(String �ν�ũ��) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET �ν�ũ��=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, �ν�ũ��);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update7(String �ν�����) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET �ν�����=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, �ν�����);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	//��ϵȺν���ȸ
	
	//1. �Ϲ�ȸ��
	public ArrayList<����_VO> selectAllBooth(){
		ArrayList<����_VO> BOOTH = new ArrayList<����_VO>();
		
		try {
			getConn();
			
			String sql = "SELECT * FROM BOOTH";
			
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();
			while (rs.next()) {
				String iD = rs.getString(1);
		} 
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return BOOTH;
		}
	
	//2. ����ȸ��
	public ArrayList<����_VO> selectMyBooth(String ����id){
		ArrayList<����_VO> BOOTH = new ArrayList<����_VO>();
		
		try {
			getConn();
			
			String sql = "SELECT * FROM BOOTH where ID = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, ����id);
			rs = pst.executeQuery();
			while (rs.next()) {
				String iD = rs.getString(1);
		} 
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return BOOTH;
		}
	
}
