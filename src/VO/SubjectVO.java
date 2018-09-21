package VO;

import java.io.Serializable;

public class SubjectVO implements Serializable
{
     private int subjectId;
     private String subjectName;
     private String subjectDescription;
     
     private BranchVO branch;
     private SemesterVO sem;
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectDescription() {
		return subjectDescription;
	}
	public void setSubjectDescription(String subjectDescription) {
		this.subjectDescription = subjectDescription;
	}
	public BranchVO getBranch() {
		return branch;
	}
	public void setBranch(BranchVO branch) {
		this.branch = branch;
	}
	public SemesterVO getSem() {
		return sem;
	}
	public void setSem(SemesterVO sem) {
		this.sem = sem;
	}
     
	     
}
