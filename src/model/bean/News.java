package model.bean;

import java.sql.Date;

public class News {
	private int id;
	private String title;
	private String contain;
	private Date date_create;
	private String image;
	private int idCat;
	public News(int id, String title, String contain, Date date_create, String image, int idCat) {
		super();
		this.id = id;
		this.title = title;
		this.contain = contain;
		this.date_create = date_create;
		this.image = image;
		this.idCat = idCat;
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContain() {
		return contain;
	}
	public void setContain(String contain) {
		this.contain = contain;
	}
	public Date getDate_create() {
		return date_create;
	}
	public void setDate_create(Date date_create) {
		this.date_create = date_create;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getIdCat() {
		return idCat;
	}
	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}
	
	

}
