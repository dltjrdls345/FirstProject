package 페고파1차프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class 일반회원_DAO {
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

	// 일반회원회원가입
	public int insert(String iD, String pW, String 주소, String 이름, String 연락처, String 생년월일, String 이메일) {
		
		int cnt=0;
		try {
			getConn();
			
			String sql = "insert into HOST values(?,?,?,?,?,?,?)";
			
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, iD);
			pst.setString(2, pW);
			pst.setString(3, 주소);
			pst.setString(4, 이름);
			pst.setString(5, 연락처);
			pst.setString(6, 생년월일);
			pst.setString(7, 이메일);
			
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
}
	// 회원탈퇴
	public int delete(String iD) { 

		int cnt = 0;
		try {
			getConn();

			String sql = "DELETE FROM CUSTOMER";

			pst = conn.prepareStatement(sql);

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	//회원수정
	public int update1(String iD) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE CUSTOMER SET iD=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, iD);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}	
	public int update2(String pW) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE CUSTOMER SET pW=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, pW);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update3(String 주소) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE CUSTOMER SET 주소=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, 주소);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update4(String 이름) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE CUSTOMER SET 이름=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, 이름);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update5(String 연락처) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE CUSTOMER SET 연락처=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, 연락처);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update6(String 생년월일) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE CUSTOMER SET 생년월일=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, 생년월일);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update7(String 이메일) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE CUSTOMER SET 이메일=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, 이메일);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}	
	public ArrayList<일반회원_VO> login(){
		ArrayList<일반회원_VO> CUSTOMER = new ArrayList<일반회원_VO>();
		
		try {
			getConn();
			
			String sql = "SELECT iD, pW FROM CUSTOMER where iD=? and pW = ?";
			
			pst = conn.prepareStatement(sql);
			
			rs = pst.executeQuery();
			while (rs.next()) {
				String iD = rs.getString(1);
				String pW = rs.getString(2);
		} 
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return CUSTOMER;
		}
	
	
	
}
