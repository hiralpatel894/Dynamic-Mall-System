package VO;

public class ComplaintVO {

	
	
	private int complaint_Id;
	private String email; 
	private String complaint_Subject;
	private String complaint_Message;
	public int getComplaint_Id() {
		return complaint_Id;
	}
	public void setComplaint_Id(int complaint_Id) {
		this.complaint_Id = complaint_Id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComplaint_Subject() {
		return complaint_Subject;
	}
	public void setComplaint_Subject(String complaint_Subject) {
		this.complaint_Subject = complaint_Subject;
	}
	public String getComplaint_Message() {
		return complaint_Message;
	}
	public void setComplaint_Message(String complaint_Message) {
		this.complaint_Message = complaint_Message;
	}
	
}
