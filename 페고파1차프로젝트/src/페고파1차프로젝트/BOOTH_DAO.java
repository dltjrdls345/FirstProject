package �����1��������Ʈ;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BOOTH_DAO {
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
				if(rs!=null) {
				rs.close();}
				if(pst!=null) {
					pst.close();
				}if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}public ArrayList<BOOTH_VO> selectAll(String ����ID){
			ArrayList<BOOTH_VO> BOOTH = new ArrayList<BOOTH_VO>();
			getConn();
			String sql = "select * from BOOTH";
			try {
				pst=conn.prepareStatement(sql);
				rs = pst.executeQuery();
				while(rs.next()) {
					String �ν�ID=rs.getString(1);
					String �ν�����=rs.getString(2);
					int �뿩��=rs.getInt(3);
					String �뿩���۱Ⱓ=rs.getString(4);
					String �뿩����Ⱓ=rs.getString(5);
					String �ν�ũ��=rs.getString(6);
					String �ν�����=rs.getString(7);
					BOOTH.add(new BOOTH_VO(�ν�ID, �ν�����, �뿩��, �뿩���۱Ⱓ, �뿩����Ⱓ, �ν�ũ��, �ν�����, ����ID));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				close();
			}
		return BOOTH;
			
		}

}
