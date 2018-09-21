package VO;

import java.io.Serializable;

public class PostingMappingVO implements Serializable
{

	private int ads_Id;
	private String ads_Name;
	private String path;
	private PostingVO postingVO;
	
	public int getAds_Id() {
		return ads_Id;
	}
	public void setAds_Id(int ads_Id) {
		this.ads_Id = ads_Id;
	}
	public String getAds_Name() {
		return ads_Name;
	}
	public void setAds_Name(String ads_Name) {
		this.ads_Name = ads_Name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public PostingVO getPostingVO() {
		return postingVO;
	}
	public void setPostingVO(PostingVO postingVO) {
		this.postingVO = postingVO;
	}
}
