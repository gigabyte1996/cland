package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import model.bean.Category;
import model.bean.News;
import util.DBConnectionUtil;
import util.DefineUtil;

public class NewsDAO {
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement pst;

	public int numberOfItems() {
		String sql = "SELECT COUNT(*) AS count FROM News ";
		
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

	public ArrayList<News> getItemsPagination(int offset) {
		ArrayList<News> items = new ArrayList<>();
		String sql = "SELECT * FROM News AS n " 
				+ "INNER JOIN Categories AS c ON n.id_cat = c.id_category ORDER BY n.id_news DESC LIMIT ?, ?";
	 try {
			conn = DBConnectionUtil.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, offset);
			pst.setInt(2, DefineUtil.NUMBER_PER_PAGE);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				int idNews = rs.getInt("n.id_news");
				String title = rs.getString("n.title");
				String contain = rs.getString("contain");
				Timestamp dateCreate = rs.getTimestamp("date_create");				
				String images = rs.getString("images");

	
				int idCat = rs.getInt("id_category");
				String name = rs.getString("name");
				int idSubCat = rs.getInt("id_subCategory");
				
				Category categories = new Category(idCat, name, idSubCat);
				News item = new News(idNews, title, contain, dateCreate, images, idSubCat);			
				items.add(item);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionUtil.closeConnection(rs, pst, conn);
		}
		return items;
	}

	public ArrayList<News> getItemsbyCategoryIdPagination(int offset, int idCat1) {
		ArrayList<News> items = new ArrayList<>();
		String sql = "SELECT * FROM News AS n " 
				+ "INNER JOIN Categories AS c ON n.id_cat = c.id_category WHERE c.id_category = ? ORDER BY n.id_news DESC LIMIT ?, ?";
	 try {
			conn = DBConnectionUtil.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, idCat1);
			pst.setInt(2, offset);
			pst.setInt(3, DefineUtil.NUMBER_PER_PAGE);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				int idNews = rs.getInt("n.id_news");
				String title = rs.getString("n.title");
				String contain = rs.getString("contain");
				Timestamp dateCreate = rs.getTimestamp("date_create");				
				String images = rs.getString("images");

	
				int idCat = rs.getInt("id_category");
				String name = rs.getString("name");
				int idSubCat = rs.getInt("id_subCategory");
				
				Category category = new Category(idCat, name, idSubCat);
				News item = new News(idNews, title, contain, dateCreate, images, idSubCat);			
				items.add(item);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionUtil.closeConnection(rs, pst, conn);
		}
		return items;
	}

	public ArrayList<News> getItems() {
		ArrayList<News> items = new ArrayList<>();
		String sql = "SELECT * FROM News AS n INNER JOIN Categories AS c ON n.id_cat = c.id_category ORDER BY n.date_create DESC";
		conn = DBConnectionUtil.getConnection();

		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int idNews = rs.getInt("n.id_news");
				String title = rs.getString("n.title");
				String contain = rs.getString("contain");
				Timestamp dateCreate = rs.getTimestamp("date_create");				
				String images = rs.getString("images");


				int idCat = rs.getInt("id_category");
				String name = rs.getString("name");
				int idSubCat = rs.getInt("id_subCategory");
				
				Category categories = new Category(idCat, name, idSubCat);
				News item = new News(idNews, title, contain, dateCreate, images, idSubCat);			
				items.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnectionUtil.closeConnection(rs, pst, conn);
		}
		
		
		return items;
	}
	
	

}
