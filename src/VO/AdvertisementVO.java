package VO;

import java.io.Serializable;

public class AdvertisementVO implements Serializable {

	private int advertisement_Id;
	private String advertisement_Name; 
	private String advertisement_Des; 
	private CategoryVO categoryVO;
	private SubcategoryVO subcategoryVO;
	public int getAdvertisement_Id() {
		return advertisement_Id;
	}
	public void setAdvertisement_Id(int advertisement_Id) {
		this.advertisement_Id = advertisement_Id;
	}
	
	public String getAdvertisement_Des() {
		return advertisement_Des;
	}
	public void setAdvertisement_Des(String advertisement_Des) {
		this.advertisement_Des = advertisement_Des;
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
	public String getAdvertisement_Name() {
		return advertisement_Name;
	}
	public void setAdvertisement_Name(String advertisement_Name) {
		this.advertisement_Name = advertisement_Name;
	}
	
	
	
}
