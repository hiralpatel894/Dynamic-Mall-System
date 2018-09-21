package VO;

import java.io.Serializable;

public class StateVO implements Serializable
{
  private int state_Id;
  private String state_Name;
  private String state_Des;
  private CountryVO countryVO;
  private CityVO cityVO;
public int getState_Id() {
	return state_Id;
}
public void setState_Id(int state_Id) {
	this.state_Id = state_Id;
}
public String getState_Name() {
	return state_Name;
}
public void setState_Name(String state_Name) {
	this.state_Name = state_Name;
}
public String getState_Des() {
	return state_Des;
}
public void setState_Des(String state_Des) {
	this.state_Des = state_Des;
}
public CountryVO getCountryVO() {
	return countryVO;
}
public void setCountryVO(CountryVO countryVO) {
	this.countryVO = countryVO;
}
public CityVO getCityVO() {
	return cityVO;
}
public void setCityVO(CityVO cityVO) {
	this.cityVO = cityVO;
}
  
  


}
