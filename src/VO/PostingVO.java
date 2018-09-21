package VO;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class PostingVO implements Serializable
{
	private int sell_Id;
	private int phone;
	private String ads_Desc;
	
	private CategoryVO categoryVO;
	private SubcategoryVO subcategoryVO;
	
	public int getSell_Id() {
		return sell_Id;
	}
	public void setSell_Id(int sell_Id) {
		this.sell_Id = sell_Id;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAds_Desc() {
		return ads_Desc;
	}
	public void setAds_Desc(String ads_Desc) {
		this.ads_Desc = ads_Desc;
	}
	public CategoryVO getCategoryVO() {
		return categoryVO;
	}
	public void setCategoryVO(CategoryVO categoryVO) {
		this.categoryVO = categoryVO;
	}
	public SubcategoryVO getSubcategoryVO() {
		return subcategoryVO;
	}
	public void setSubcategoryVO(SubcategoryVO subcategoryVO) {
		this.subcategoryVO = subcategoryVO;
	}
	

}
