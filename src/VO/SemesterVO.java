package VO;

import java.io.Serializable;

public class SemesterVO implements Serializable {

	   private int semId;
	      private String semName;
	      private String semDescription;
	   private BranchVO branch;
	public int getSemId() {
		return semId;
	}
	public void setSemId(int semId) {
		this.semId = semId;
	}
	public String getSemName() {
		return semName;
	}
	public void setSemName(String semName) {
		this.semName = semName;
	}
	public String getSemDescription() {
		return semDescription;
	}
	public void setSemDescription(String semDescription) {
		this.semDescription = semDescription;
	}
	public BranchVO getBranch() {
		return branch;
	}
	public void setBranch(BranchVO branch) {
		this.branch = branch;
	}
	   
	   
}
