package VO;

public class CityVO {
	
	private int city_Id;
	private String city_Name;
	private String city_Des;
	
	private CountryVO countryVO;
	private StateVO stateVO;
	public int getCity_Id() {
		return city_Id;
	}
	public void setCity_Id(int city_Id) {
		this.city_Id = city_Id;
	}
	public String getCity_Name() {
		return city_Name;
	}
	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}
	public String getCity_Des() {
		return city_Des;
	}
	public void setCity_Des(String city_Des) {
		this.city_Des = city_Des;
	}
	public CountryVO getCountryVO() {
		return countryVO;
	}
	public void setCountryVO(CountryVO countryVO) {
		this.countryVO = countryVO;
	}
	public StateVO getStateVO() {
		return stateVO;
	}
	public void setStateVO(StateVO stateVO) {
		this.stateVO = stateVO;
	}
	
	
}
