package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBConnectionUtil;

public class NewsDAO {
	private Connection conn;
	private Statement st;
	private ResultSet rs;

	public int numberOfItems() {
		String sql = "SELECT COUNT(*) AS count FROM songs ";
		
		try {
			conn = DBConnectionUtil.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			if (rs.next()) {
				int count = rs.getInt("count");
				return count;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionUtil.closeConnection(rs, st, conn);
		}
		
		return 0;
	}
	
	

}
