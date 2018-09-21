package VO;

import java.io.Serializable;

public class AuctionVO implements Serializable {
    													
	
	private CategoryVO categoryVO;
	private SubcategoryVO subcategoryVO;
	private int auction_Id;
	private String product_Name;
	private String product_Desc;
	private String product_Brand;
	private String arrival_time;
	private String departure_time;
	private int min_bid_amt;
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
	public int getAuction_Id() {
		return auction_Id;
	}
	public void setAuction_Id(int auction_Id) {
		this.auction_Id = auction_Id;
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
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public int getMin_bid_amt() {
		return min_bid_amt;
	}
	public void setMin_bid_amt(int min_bid_amt) {
		this.min_bid_amt = min_bid_amt;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	
	

}
