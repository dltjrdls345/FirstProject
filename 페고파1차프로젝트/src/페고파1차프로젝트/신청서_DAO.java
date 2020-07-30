package �����1��������Ʈ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ��û��_DAO {
	///.��û�� ���� ������Ʈ 0
	// ��û�� ����
	// ��û�� ����
	// ��û�� �ֱ� 0
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	private void getConnection() {
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
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int insert(String ��ûID, String �̸�, String ����ڹ�ȣ, String ����ó, String �ν�ID, String �ν��Ұ�, String ÷������) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "insert into apply values (?,?,?,?,?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, ��ûID);
			psmt.setString(2, �̸�);
			psmt.setString(3, ����ڹ�ȣ);
			psmt.setString(4, ����ó);
			psmt.setString(5, �ν�ID);
			psmt.setString(6, �ν��Ұ�);
			psmt.setString(7, ÷������);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	//��û�� ����
	public int delete(String ��ûid) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "DELETE FROM apply where ��ûid=?";

			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, ��ûid);
			
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	//��û�� ����
	public int update_cusTel(��û��_VO vo) {

		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET ����ڹ�ȣ=?,����ó=?,�ν�id=?,�ν��Ұ�=?,÷������=?,��û����=?where ��ûid=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.get����ڹ�ȣ());
			psmt.setString(2, vo.get����ó());
			psmt.setString(3, vo.get�ν�id());
			psmt.setString(4, vo.get�ν��Ұ�());
			psmt.setString(5, vo.get÷������());
			psmt.setString(6, vo.get��û����());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public ArrayList<��û��_VO> allSelect() {

		ArrayList<��û��_VO> list = new ArrayList<��û��_VO>();

		try {
			getConnection();
			
			String sql = "SELECT * FROM apply";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String app_id = rs.getString(1);
				String cus_id = rs.getString(2);
				String app_num = rs.getString(3);
				String cus_tel = rs.getString(4);
				String boo_id = rs.getString(5);
				String app_int = rs.getString(6);
				String fes_file = rs.getString(7);
				String ��û���� = rs.getString(8);
				String ȸ��id = rs.getString(9);

				list.add(new ��û��_VO(app_id, cus_id, app_num, cus_tel, boo_id, app_int, fes_file, ��û����, ȸ��id));
				
			}
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + "\t" + list.get(i).get��ûid() + "\t "+ list.get(i).get�̸�() + "\t" + list.get(i).get����ڹ�ȣ() + "\t" + list.get(i).get����ó() + "\t" + list.get(i).get�ν�id() + "\t" + list.get(i).get�ν��Ұ�() + "\t" + list.get(i).get÷������() +"\t" + list.get(i).get��û����() +"\t" + list.get(i).getȸ��id());
					}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}
	//�ν� ����(���,����)
	public int updateapplywait(��û��_VO vo) {
		
		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET ��û����= '���' where �ν�id =?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.get�ν�id());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;

	}
	public int updateapplycommit(��û��_VO vo) {
		
		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET ��û����= '����' where �ν�id =?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.get�ν�id());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;

	}
	public int updateapplyrefuse(��û��_VO vo) {
		
		int cnt = 0;
		try {
			getConnection();

			String sql = "UPDATE apply SET ��û����= '����' where �ν�id =?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.get�ν�id());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;

	}
	
	
	
	
	
	
	

}
