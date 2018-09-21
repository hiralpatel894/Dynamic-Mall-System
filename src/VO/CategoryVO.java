package VO;

import java.io.Serializable;

public class CategoryVO implements Serializable {

	private int cat_Id;
	private String cat_Name; 
	private String cat_Des;
	public int getCat_Id() {
		return cat_Id;
	}
	public void setCat_Id(int cat_Id) {
		this.cat_Id = cat_Id;
	}
	public String getCat_Name() {
		return cat_Name;
	}
	public void setCat_Name(String cat_Name) {
		this.cat_Name = cat_Name;
	}
	public String getCat_Des() {
		return cat_Des;
	}
	public void setCat_Des(String cat_Des) {
		this.cat_Des = cat_Des;
	}
	
	
	
}
