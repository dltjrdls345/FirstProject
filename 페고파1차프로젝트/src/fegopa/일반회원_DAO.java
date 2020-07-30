package fegopa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class 일반회원_DAO {
		// -- 구현된 기능 정리 --
		// insert() : vo 받아서 회원가입
		// logIN() : 아이디, 비밀번호 받아 일치하는지 확인하고, 일치하면 id 리턴
		// updateLogtime() : 로그인 성공 시 해당 id의 systime 갱신하여 로그인 상태 구별
		// selectID() : 현재 로그인 되어있는 id 정보 가져옴
		// deleteCustomer() : 현재 로그인된 회원 탈퇴
		// showCustomerInfo() : 현재 로그인된 회원 정보열람
		// updateCustomerInfo() : 현재 로그인된 회원 정보수정
	///
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	private void getConn() {
		String url = "jdbc:oracle:thin:@210.105.224.158:1521:xe";
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

	// 일반회원회원가입
	public int insert(일반회원_VO vo) {

		int cnt = 0;
		try {
			getConn();

			String sql = "insert into customer values(?,?,?,?,?,?,?,null)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.getID());
			pst.setString(2, vo.getPW());
			pst.setString(3, vo.get주소());
			pst.setString(4, vo.get이름());
			pst.setString(5, vo.get연락처());
			pst.setString(6, vo.get생년월일());
			pst.setString(7, vo.get이메일());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// 로그인기능

	public String logIN(일반회원_VO vo) {
		String result=null;
		try {
			getConn();
			String sql = "select id from customer where id = ? and pw = ?";

			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.getID());
			pst.setString(2, vo.getPW());
			rs = pst.executeQuery();
			if (rs.next()) {
				result = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	// systimestamp update 기능(로그인시 갱신)
	public int updateLogtime(String id) {
		int cnt = 0;
		try {
			getConn();
			String sql = "update customer set logtime = systimestamp where id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// 현재 로그인한 아이디 가져오기
	public String selectID() {
		String id = null;
		try {
			getConn();
			String sql = "select id from customer where logtime = (select max(logtime) from customer)";

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			if (rs.next()) {
				id = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return id;
	}

	// 회원 정보조회(본인꺼)
	public 일반회원_VO showCustomerInfo() {
		일반회원_VO vo = null;
		try {
			getConn();

			String sql = "SELECT * FROM CUSTOMER where logtime = (select max(logtime) from customer)";

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			if (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String 주소 = rs.getString(3);
				String 이름 = rs.getString(4);
				String 연락처 = rs.getString(5);
				String 생년월일 = rs.getString(6);
				String 이메일 = rs.getString(7);
				String logtime = rs.getString(8);
				vo = new 일반회원_VO(id, pw, 주소, 이름, 연락처, 생년월일, 이메일, logtime);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}

	// 회원탈퇴 -- 현재 로그인한 회원의 탈퇴
	public int deleteCustomer() {

		int cnt = 0;
		try {
			getConn();

			String sql = "delete from customer where logtime = (select max(logtime) from customer)";

			pst = conn.prepareStatement(sql);
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	
//	 회원 수정 - - -> 현재 로그인한 회원의 정보를 수정
	public int updateCustomerInfo(일반회원_VO vo) {

		int cnt = 0;
		try {
			getConn();

			String sql = "UPDATE CUSTOMER SET pw = ?, 주소 = ?, 이름 = ?, 연락처 = ?, 생년월일 = ? , 이메일 = ? where logtime = (select max(logtime) from customer)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.getPW());
			pst.setString(2, vo.get주소());
			pst.setString(3, vo.get이름());
			pst.setString(4, vo.get연락처());
			pst.setString(5, vo.get생년월일());
			pst.setString(6, vo.get이메일());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}
	
}
