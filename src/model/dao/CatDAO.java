package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.bean.Category;
import util.DBConnectionUtil;

public class CatDAO {
	private Connection conn;
	private	Statement st;
	private PreparedStatement pst;
	private	ResultSet rs;
	public Category getItem(int id) {
		Category item = null;
		String sql = "SELECT id_category,name FROM Categories WHERE id_category = ?";
		conn = DBConnectionUtil.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			pst. setInt(1, id);
			rs = pst.executeQuery();
			while(rs.next()) {
				String name = rs.getString("name");
				int idSubCat = rs.getInt("id_subCategory");
				item = new Category(id, name, idSubCat);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnectionUtil.closeConnection(rs, pst, conn);
		}

		return item;
	}
	
	
	
	
	

}
