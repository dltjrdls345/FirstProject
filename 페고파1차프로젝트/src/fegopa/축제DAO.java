package fegopa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class 축제DAO {
	
	//1. insertFestival : 축제등록기능
	//2. updateFestival : 축제정보 변경기능
	//3. deleteFestival : 축제 삭제기능
	//4. selectMyFestivalInfo : 선택한 축제 정보 조회기능
	//5. showFestivalList : 전체 축제 목록 조회기능
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	주최회원_DAO 주최dao = new 주최회원_DAO();
	주최회원_VO 주최vo = null;
	
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
	
	//축제 등록 
	public int insertFestival(축제VO vo) {
		
		String id = 주최dao.selectID();
		int cnt = 0;
		try {
			getConn();

			String sql = "insert into festival values(?,?,?,?,?,?,?,?,?)";

			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.get축제ID());
			pst.setString(2, vo.get축제명());
			pst.setString(3, vo.get시작기간());
			pst.setString(4, vo.get종료기간());
			pst.setString(5, vo.get주소());
			pst.setString(6, vo.get기관연락처());
			pst.setString(7, vo.get축제설명());
			pst.setString(8, vo.get첨부파일());
			pst.setString(9, id);

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	
	//축제정보 변경
	public int updateFestivalInfo(축제VO vo, String 축제id) {
		int cnt = 0;
		try {
			getConn();
			String sql = "update festival set 축제명 = ? , 시작기간 = ? , 종료기간 = ? , 주소 = ? , 기관연락처 = ?, 축제설명 = ?, 첨부파일 = ? where 축제id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.get축제명());
			pst.setString(2, vo.get시작기간());
			pst.setString(3, vo.get종료기간());
			pst.setString(4, vo.get주소());
			pst.setString(5, vo.get기관연락처());
			pst.setString(6, vo.get축제설명());
			pst.setString(7, vo.get첨부파일());
			pst.setString(8, 축제id);
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	//축제 정보 삭제
	public int deleteFestival(String 축제id) {
		int cnt = 0;
		try {
			getConn();

			String sql = "delete from festival where 축제id = ?";
			pst = conn.prepareStatement(sql);
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	//축제 리스트
	public ArrayList<축제VO> showFestivalList() {
		ArrayList<축제VO> list = new ArrayList<축제VO>();
		축제VO vo = null;
		try {
			getConn();

			String sql = "SELECT * FROM festival";

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String 축제id = rs.getString(1);
				String 축제명 = rs.getString(2);
				String 시작기간 = rs.getString(3);
				String 종료기간 = rs.getString(4);
				String 주소 = rs.getString(5);
				String 기관연락처 = rs.getString(6);
				String 축제설명 = rs.getString(7);
				String 첨부파일 = rs.getString(8);
				String 주최id = rs.getString(9);
				vo = new 축제VO(축제id, 축제명, 시작기간, 종료기간, 주소, 기관연락처, 축제설명, 첨부파일, 주최id);
				list.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	//축제 정보 조회
	public ArrayList<축제VO> showMyFestivalInfo(String 축제id) {
		ArrayList<축제VO> list = new ArrayList<축제VO>();
		축제VO vo = null;
		try {
			getConn();

			String sql = "SELECT * FROM festival where 축제id = ?";

			pst = conn.prepareStatement(sql);
			pst.setString(1, 축제id);
			rs = pst.executeQuery();
			while (rs.next()) {
				String 축제명 = rs.getString(1);
				String 시작기간 = rs.getString(2);
				String 종료기간 = rs.getString(3);
				String 주소 = rs.getString(4);
				String 기관연락처 = rs.getString(5);
				String 축제설명 = rs.getString(6);
				String 첨부파일 = rs.getString(7);
				String 주최id = rs.getString(8);
				vo = new 축제VO(축제id, 축제명, 시작기간, 종료기간, 주소, 기관연락처, 축제설명, 첨부파일, 주최id);
				list.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	}
	
	
	

