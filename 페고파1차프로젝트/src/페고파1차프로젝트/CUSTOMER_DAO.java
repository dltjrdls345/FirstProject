package 페고파1차프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CUSTOMER_DAO {
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
	try {
		if(rs != null) {
		rs.close();
		}if(pst != null) {
			pst.close();
		}if(conn!=null) {
			conn.close();
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//public
	
	
	
	
	
	
	
}
}
