package 페고파1차프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class 공고_DAO {
	//
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	주최회원_DAO 주최dao = new 주최회원_DAO();

	private void getConn() {
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
	//부스등록
	public int insert(공고_VO vo) {
		
		int cnt=0;
		try {
			getConn();
			
			String sql = "insert into booth values(?,?,?,?,?,?,?)";
			
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, vo.get부스ID());
			pst.setString(2, vo.get부스종류());
			pst.setInt(3, vo.get대여료());
			pst.setString(4, vo.get대여시작기간());
			pst.setString(5, vo.get대여종료기간());
			pst.setString(6, vo.get부스크기());
			pst.setString(7, vo.get부스상태());
			pst.setString(8, vo.get축제ID());
			
			
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
}	
	//등록된 부스 삭제
	public int delete(String 부스id) { 

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
	//부스 수정(1번부터7번까지)
	public int update1(String 부스id) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET 부스id=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, 부스id);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update2(String 부스종류) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET 부스종류=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, 부스종류);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update3(int 대여료) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET 대여료=?";

		pst = conn.prepareStatement(sql);

		pst.setInt(1, 대여료);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update4(String 대여시작기간) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET 대여시작기간=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, 대여시작기간);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update5(String 대여종료기간) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET 대여종료기간=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, 대여종료기간);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update6(String 부스크기) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET 부스크기=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, 부스크기);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update7(String 부스상태) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE HOST SET 부스상태=?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, 부스상태);

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	//등록된부스조회
	
	//1. 일반회원
	public ArrayList<공고_VO> selectAllBooth(){
		ArrayList<공고_VO> BOOTH = new ArrayList<공고_VO>();
		
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
	
	//2. 주최회원
	public ArrayList<공고_VO> selectMyBooth(String 주최id){
		ArrayList<공고_VO> BOOTH = new ArrayList<공고_VO>();
		
		try {
			getConn();
			
			String sql = "SELECT * FROM BOOTH where ID = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, 주최id);
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
