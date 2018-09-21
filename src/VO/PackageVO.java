package VO;

import java.io.Serializable;
import java.sql.Date;



public class PackageVO implements Serializable{

	private int package_Id;
	private String package_Name; 
	private String package_Des;
	private String package_Duration;
	private Double package_Price;
	public int getPackage_Id() {
		return package_Id;
	}
	public void setPackage_Id(int package_Id) {
		this.package_Id = package_Id;
	}
	public String getPackage_Name() {
		return package_Name;
	}
	public void setPackage_Name(String package_Name) {
		this.package_Name = package_Name;
	}
	public String getPackage_Des() {
		return package_Des;
	}
	public void setPackage_Des(String package_Des) {
		this.package_Des = package_Des;
	}
	public String getPackage_Duration() {
		return package_Duration;
	}
	public void setPackage_Duration(String package_Duration) {
		this.package_Duration = package_Duration;
	}
	public Double getPackage_Price() {
		return package_Price;
	}
	public void setPackage_Price(Double package_Price) {
		this.package_Price = package_Price;
	}
	
	
}
