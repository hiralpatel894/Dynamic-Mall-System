package VO;

public class ProfileVO {
	
	private int profile_Id;
	private CountryVO countryVO;
	private StateVO stateVO;
	private CityVO cityVO;

	private int pin_Code;
	private long mobile;
	private long phone_Number;
	private String temp_Addr;
	private String perm_Addr;
	private String shop_Name;
	private String shop_Desc;
	public int getProfile_Id() {
		return profile_Id;
	}
	public void setProfile_Id(int profile_Id) {
		this.profile_Id = profile_Id;
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
	public CityVO getCityVO() {
		return cityVO;
	}
	public void setCityVO(CityVO cityVO) {
		this.cityVO = cityVO;
	}
	public int getPin_Code() {
		return pin_Code;
	}
	public void setPin_Code(int pin_Code) {
		this.pin_Code = pin_Code;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public long getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(long phone_Number) {
		this.phone_Number = phone_Number;
	}
	public String getTemp_Addr() {
		return temp_Addr;
	}
	public void setTemp_Addr(String temp_Addr) {
		this.temp_Addr = temp_Addr;
	}
	public String getPerm_Addr() {
		return perm_Addr;
	}
	public void setPerm_Addr(String perm_Addr) {
		this.perm_Addr = perm_Addr;
	}
	public String getShop_Name() {
		return shop_Name;
	}
	public void setShop_Name(String shop_Name) {
		this.shop_Name = shop_Name;
	}
	public String getShop_Desc() {
		return shop_Desc;
	}
	public void setShop_Desc(String shop_Desc) {
		this.shop_Desc = shop_Desc;
	}
}
