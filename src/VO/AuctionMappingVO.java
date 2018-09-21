package VO;

import java.io.Serializable;

public class AuctionMappingVO implements Serializable{
	
	
	private int auction_Id;
	private String auction_Name;
	private String path;
	private AuctionVO auctionVO;
	public int getAuction_Id() {
		return auction_Id;
	}
	public void setAuction_Id(int auction_Id) {
		this.auction_Id = auction_Id;
	}
	
	public String getAuction_Name() {
		return auction_Name;
	}
	public void setAuction_Name(String auction_Name) {
		this.auction_Name = auction_Name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public AuctionVO getAuctionVO() {
		return auctionVO;
	}
	public void setAuctionVO(AuctionVO auctionVO) {
		this.auctionVO = auctionVO;
	}
	
}
