package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionUtil {
	
	private static String url = "jdbc:mysql://localhost:3309/my_project?useUnicode=true&characterEncoding=UTF-8";
	private static String user = "root";
	private static String password ="";
	
	public static Connection getConnection() {
		try {
		Connection conn;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("success");
		return conn;
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;	
	}
	public static void closeConnection(ResultSet rs, Statement st, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (conn != null) {
				conn.close();
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
