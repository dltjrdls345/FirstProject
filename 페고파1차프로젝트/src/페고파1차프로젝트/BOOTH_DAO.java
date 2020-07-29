package 페고파1차프로젝트;

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
		}public ArrayList<BOOTH_VO> selectAll(String 축제ID){
			ArrayList<BOOTH_VO> BOOTH = new ArrayList<BOOTH_VO>();
			getConn();
			String sql = "select * from BOOTH";
			try {
				pst=conn.prepareStatement(sql);
				rs = pst.executeQuery();
				while(rs.next()) {
					String 부스ID=rs.getString(1);
					String 부스종류=rs.getString(2);
					int 대여료=rs.getInt(3);
					String 대여시작기간=rs.getString(4);
					String 대여종료기간=rs.getString(5);
					String 부스크기=rs.getString(6);
					String 부스상태=rs.getString(7);
					BOOTH.add(new BOOTH_VO(부스ID, 부스종류, 대여료, 대여시작기간, 대여종료기간, 부스크기, 부스상태, 축제ID));
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
