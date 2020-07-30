package �����1��������Ʈ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class �ν�_DAO {
	///festival, �������� �ø����վ��(�α���)
	// 1. �佺Ƽ���� �ش��ϴ� -- > �ν����
	// 2. �ν��� �����Ҳ� --�Ϸ�
	// 3. �ν��� ��ȸ(�ڱ� �ν���..�α���) 
	// 4. �ν� ���� --�Ϸ�(�����̰� �������°� �˾ƿ�����)
	//     
	// ����id���� ��ȸ :  where ����id = (select id from festival where ���� id = ?) 
	// 
	// update������
	// where �ν� id = ? �ΰ��� set�� 
	//"���" , "����"   
	//.
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	����ȸ��_DAO ����dao = new ����ȸ��_DAO();

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
	//�ν����
	public int insert(�ν�VO vo) {
		
		int cnt=0;
		try {
			getConn();
			
			String sql = "insert into booth values(?,?,?,?,?,?,?)";
			
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, vo.get�ν�ID());
			pst.setString(2, vo.get�ν�����());
			pst.setInt(3, vo.get�뿩��());
			pst.setString(4, vo.get�뿩���۱Ⱓ());
			pst.setString(5, vo.get�뿩����Ⱓ());
			pst.setString(6, vo.get�ν�ũ��());
			pst.setString(7, vo.get�ν�����());
			pst.setString(8, vo.get����ID());
			
			
			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
}	
	//��ϵ� �ν� ����
	public int deleteBooth(String �ν�id) { 

		int cnt = 0;
		try {
			getConn();

			String sql = "DELETE FROM BOOTH where �ν�id = ?";

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
	//��ϵ� �ν� ����
	public int update1(�ν�VO vo) {

	int cnt = 0;
	try {
		getConn();
		
		String sql = "UPDATE BOOTH SET �ν�id=?,�ν�����=?,�뿩��=?,�뿩���۱Ⱓ=?,�뿩����Ⱓ=?,�ν�ũ��=?,�ν�����=? where ����ID = ? and �ν�ID = ? ";

		pst = conn.prepareStatement(sql);

		pst.setString(1, vo.get�ν�ID());
		pst.setString(2, vo.get�ν�����());
		pst.setInt(3, vo.get�뿩��());
		pst.setString(4, vo.get�뿩���۱Ⱓ());
		pst.setString(5, vo.get�뿩����Ⱓ());
		pst.setString(6, vo.get�ν�ũ��());
		pst.setString(7, vo.get�ν�����());
		

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
	public ArrayList<�ν�VO> selectAllBooth(){
		ArrayList<�ν�VO> BOOTH = new ArrayList<�ν�VO>();
		
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
	public ArrayList<�ν�VO> selectMyBooth(String ����id){
		ArrayList<�ν�VO> BOOTH = new ArrayList<�ν�VO>();
		
		try {
			getConn();
			
			String sql = "SELECT * FROM BOOTH where ����id = (select id from festival where ���� id = ?) ";
			pst = conn.prepareStatement(sql);

//			pst.setString(1, ����id);
			
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
	//�ν�����(���,����)
	public int updateBoothcommit(�ν�VO vo) {
		
		int cnt = 0;
		try {
			getConn();

			String sql = "UPDATE BOOTH SET �ν�����= '����' where �ν�id =?)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.get�ν�ID());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}		
		return cnt;
	}
	public int updateboothwait(�ν�VO vo) {
		
		int cnt = 0;
		try {
			getConn();

			String sql = "UPDATE BOOTH SET �ν�����= '���' where �ν�id =?)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.get�ν�ID());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}		
		return cnt;
	}
	public int updateboothrefuse(�ν�VO vo) {
		
		int cnt = 0;
		try {
			getConn();

			String sql = "UPDATE BOOTH SET �ν�����= '����' where �ν�id =?)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, vo.get�ν�ID());

			cnt = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}		
		return cnt;
	}
	
}
