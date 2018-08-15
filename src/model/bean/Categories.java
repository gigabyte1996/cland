package model.bean;

public class Categories {
	private int idCat;
	private String name;
	private int idSudcat;
	public int getIdCat() {
		return idCat;
	}
	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdSudcat() {
		return idSudcat;
	}
	public void setIdSudcat(int idSudcat) {
		this.idSudcat = idSudcat;
	}
	public Categories(int idCat, String name, int idSudcat) {
		super();
		this.idCat = idCat;
		this.name = name;
		this.idSudcat = idSudcat;
	}
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
