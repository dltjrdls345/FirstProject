package �����1��������Ʈ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class �Ϲ�ȸ��_DAO {
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	�Ϲ�ȸ��_VO vo = null;

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
	//Database Access Object
	public int login(String id, String pw) {

		int cnt = 0;

		try {
			getConn();
			String sql = "select id from CUSTOMER where id =? and pw = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pw);
			rs = pst.executeQuery();
			String cus_id = null;
			if (rs.next()) {
				cus_id = rs.getString(1);
				
			}if(cus_id!=null) {
				cnt = 1;
			}else {
				cnt = 0;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// �Ϲ�ȸ��ȸ������
	public int insert(String iD, String pW, String �ּ�, String �̸�, String ����ó, String �������, String �̸���) {
		
		int cnt=0;
		try {
			getConn();
			
			String sql = "insert into HOST values(?,?,?,?,?,?,?)";
			
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, iD);
			pst.setString(2, pW);
			pst.setString(3, �ּ�);
			pst.setString(4, �̸�);
			pst.setString(5, ����ó);
			pst.setString(6, �������);
			pst.setString(7, �̸���);
			
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
}
	// ȸ��Ż��
	public int delete(String iD) { 

		int cnt = 0;
		try {
			getConn();

			String sql = "DELETE FROM CUSTOMER where id=? and pw=?";

			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.getID());
			pst.setString(2, vo.getPW());
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	//ȸ������
	
	public int update1(String pW) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE CUSTOMER SET pW=? where id=?";

		pst = conn.prepareStatement(sql);
		
		pst.setString(1, pW);
		pst.setString(2, vo.getID());
		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update2(String �ּ�) {
		
	
	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE CUSTOMER SET �ּ�=? where id = ?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, �ּ�);
		pst.setString(2, vo.getID());

		cnt = pst.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update3(String �̸�) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE CUSTOMER SET �̸�=? where id =?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, �̸�);
		pst.setString(2, vo.getID());

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update4(String ����ó) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE CUSTOMER SET ����ó=? where id =?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, ����ó);
		pst.setString(2, vo.getID());

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update5(String �������) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE CUSTOMER SET �������=? where id =?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, �������);
		pst.setString(2, vo.getID());

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}
	public int update6(String �̸���) {

	int cnt = 0;
	try {
		getConn();

		String sql = "UPDATE CUSTOMER SET �̸���=? where id =?";

		pst = conn.prepareStatement(sql);

		pst.setString(1, �̸���);
		pst.setString(2, vo.getID());

		cnt = pst.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close();
	}

	return cnt;
}	
	public ArrayList<�Ϲ�ȸ��_VO> login(){
		ArrayList<�Ϲ�ȸ��_VO> CUSTOMER = new ArrayList<�Ϲ�ȸ��_VO>();
		
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
