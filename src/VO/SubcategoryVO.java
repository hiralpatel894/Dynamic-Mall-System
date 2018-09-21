package VO;

import java.io.Serializable;

import VO.CategoryVO;

public class SubcategoryVO implements Serializable {
	private int subcat_Id;
	private String subcat_Name; 
	private String subcat_Des;
	private CategoryVO categoryVO;
	public int getSubcat_Id() {
		return subcat_Id;
	}
	public void setSubcat_Id(int subcat_Id) {
		this.subcat_Id = subcat_Id;
	}
	public String getSubcat_Name() {
		return subcat_Name;
	}
	public void setSubcat_Name(String subcat_Name) {
		this.subcat_Name = subcat_Name;
	}
	public String getSubcat_Des() {
		return subcat_Des;
	}
	public void setSubcat_Des(String subcat_Des) {
		this.subcat_Des = subcat_Des;
	}
	public CategoryVO getCategoryVO() {
		return categoryVO;
	}
	public void setCategoryVO(CategoryVO categoryVO) {
		this.categoryVO = categoryVO;
	}
	
	
}
