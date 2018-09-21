package VO;

import java.io.Serializable;

public class ProductVO implements Serializable {
	
	
	private CategoryVO categoryVO;
	private SubcategoryVO subcategoryVO;
	private int product_Id;
	private String product_Name;
	private String product_Desc;
	private String product_Brand;
	
	private String logo;

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

	public int getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public String getProduct_Desc() {
		return product_Desc;
	}

	public void setProduct_Desc(String product_Desc) {
		this.product_Desc = product_Desc;
	}

	public String getProduct_Brand() {
		return product_Brand;
	}

	public void setProduct_Brand(String product_Brand) {
		this.product_Brand = product_Brand;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}
