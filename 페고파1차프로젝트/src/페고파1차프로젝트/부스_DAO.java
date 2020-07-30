package 페고파1차프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class 부스_DAO {
	///festival, 주최측만 올릴수잇어요(로그인)
	// 1. 페스티벌에 해당하는 -- > 부스등록
	// 2. 부스를 삭제할꺼 --완료
	// 3. 부스를 조회(자기 부스만..로그인) 
	// 4. 부스 수정 --완료(예슬이가 가져오는거 알아오는중)
	//     
	// 축제id별로 조회 :  where 축제id = (select id from festival where 축제 id = ?) 
	// 
	// update문으로
	// where 부스 id = ? 인곳에 set을 
	//"대기" , "승인"   
	//.
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
	public int insert(부스VO vo) {
		
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
	//등록된 부스 수정
	public int update1(부스VO vo) {

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
	
	//1. 일반회원
	public ArrayList<부스VO> selectAllBooth(){
		ArrayList<부스VO> BOOTH = new ArrayList<부스VO>();
		
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
	public ArrayList<부스VO> selectMyBooth(String 주최id){
		ArrayList<부스VO> BOOTH = new ArrayList<부스VO>();
		
		try {
			getConn();
			
			String sql = "SELECT * FROM BOOTH where 축제id = (select id from festival where 축제 id = ?) ";
			pst = conn.prepareStatement(sql);

//			pst.setString(1, 주최id);
			
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
	//부스상태(대기,승인)
	public int updateBoothcommit(부스VO vo) {
		
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
	public int updateboothwait(부스VO vo) {
		
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
	public int updateboothrefuse(부스VO vo) {
		
		int cnt = 0;
		try {
			getConn();

			String sql = "UPDATE BOOTH SET 부스상태= '거절' where 부스id =?)";

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
