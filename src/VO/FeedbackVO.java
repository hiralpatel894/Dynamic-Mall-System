package VO;

public class FeedbackVO {
	
	
	private int Id;
	private String email; 
	private String feedback_Message;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback_Message() {
		return feedback_Message;
	}
	public void setFeedback_Message(String feedback_Message) {
		this.feedback_Message = feedback_Message;
	}
	


}
