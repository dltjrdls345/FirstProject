package fegopa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class 부스_DAO {
	
	// insertBooth : 주최측에서 할당할 부스 등록
	// selectBoothCon 부스 id에 해당하는 부스 상태 조회 
	//deleteBooth 등록된 부스 삭제
	//updateBooth 등록된 부스 수정 
	//부스상태(대기,승인)변경 : updateBoothWait, updateBoothCommit
	// selectAllBooth() : 등록된 모든 부스 조회(일반회원이 볼수있게)
	//selectMyBooth() 로그인 중인 주최회원이 등록한 부스 열람
	

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
	public int insertBooth(부스VO vo) {
		
		int cnt=0;
		try {
			getConn();
			
			String sql = "insert into booth values(EX_SEQ.NEXTVAL2,?,?,?,?,?,?)";
			
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, vo.get부스종류());
			pst.setInt(2, vo.get대여료());
			pst.setString(3, vo.get대여시작기간());
			pst.setString(4, vo.get대여종료기간());
			pst.setString(5, vo.get부스크기());
			pst.setString(6, vo.get부스상태());
			pst.setString(7, vo.get축제ID());
			
			
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
}	
	//deleteBooth 등록된 부스 삭제
	public int deleteBooth(String 부스id) { 

		int cnt = 0;
		try {
			getConn();

			String sql = "DELETE FROM BOOTH where 부스id = ?";

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
	//updateBooth 등록된 부스 수정 
	public int updateBooth(부스VO vo) {

	int cnt = 0;
	try {
		getConn();
		
		String sql = "UPDATE BOOTH SET 부스id=?,부스종류=?,대여료=?,대여시작기간=?,대여종료기간=?,부스크기=?,부스상태=? where 축제ID = ? and 부스ID = ? ";

		pst = conn.prepareStatement(sql);

		pst.setString(1, vo.get부스ID());
		pst.setString(2, vo.get부스종류());
		pst.setInt(3, vo.get대여료());
		pst.setString(4, vo.get대여시작기간());
		pst.setString(5, vo.get대여종료기간());
		pst.setString(6, vo.get부스크기());
		pst.setString(7, vo.get부스상태());
		

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}

	//등록된부스조회
	
	//1. selectAllBooth 일반회원이 특정 축제에 해당하는 부스를 조회
	public ArrayList<부스VO> selectAllBooth(String 축제id){
		ArrayList<부스VO> BOOTH = new ArrayList<부스VO>();
		
		try {
			getConn();
			
			String sql = "SELECT * FROM BOOTH where 축제id = ?";
			
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
	
	//2. selectMyBooth() 로그인 중인 주최회원이 등록한 부스 열람
	public ArrayList<부스VO> selectMyBooth(){
		ArrayList<부스VO> BOOTH = new ArrayList<부스VO>();
		String 주최id = 주최dao.selectID();
		try {
			getConn();
			
			String sql = "SELECT * FROM BOOTH where 축제id = (select id from festival where 주최id = ?) ";
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
	
	//selectBoothCon 부스 id에 해당하는 부스 상태 조회 
	public String selectBoothCon(String 부스id) {
		String condition = null;
		try {
			getConn();
			String sql = "select 부스상태 from booth where 부스id = ?";

			pst = conn.prepareStatement(sql);
			pst.setString(1, 부스id);
			rs = pst.executeQuery();
			if (rs.next()) {
				condition = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return condition;
	}
	
	//부스상태(대기,승인)변경
	public int updateBoothCommit(부스VO vo) {
		
		int cnt = 0;
		try {
			getConn();

			String sql = "UPDATE BOOTH SET 부스상태= '승인' where 부스id =?)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.get부스ID());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}		
		return cnt;
	}
	public int updateBoothWait(부스VO vo) {
		
		int cnt = 0;
		try {
			getConn();

			String sql = "UPDATE BOOTH SET 부스상태= '대기' where 부스id =?)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.get부스ID());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}		
		return cnt;
	}
	
}
