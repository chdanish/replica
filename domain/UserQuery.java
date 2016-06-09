package so.pickme.replica.domain;

import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class UserQuery {
	
	Long UserID;
	
	String FName;	

	String LName;

	String UName;
	
	String Email;

	Boolean Friendstatus;
	
	Boolean Friendreqstatus;

	/**
	 * @return the userID
	 */
	public Long getUserID() {
		return UserID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(Long userID) {
		UserID = userID;
	}

	/**
	 * @return the fName
	 */
	public String getFName() {
		return FName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setFName(String fName) {
		FName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getLName() {
		return LName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setLName(String lName) {
		LName = lName;
	}

	/**
	 * @return the uName
	 */
	public String getUName() {
		return UName;
	}

	/**
	 * @param uName the uName to set
	 */
	public void setUName(String uName) {
		UName = uName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return the friendstatus
	 */
	public Boolean getFriendstatus() {
		return Friendstatus;
	}

	/**
	 * @param friendstatus the friendstatus to set
	 */
	public void setFriendstatus(Boolean friendstatus) {
		Friendstatus = friendstatus;
	}

	/**
	 * @return the friendreqstatus
	 */
	public Boolean getFriendreqstatus() {
		return Friendreqstatus;
	}

	/**
	 * @param friendreqstatus the friendreqstatus to set
	 */
	public void setFriendreqstatus(Boolean friendreqstatus) {
		Friendreqstatus = friendreqstatus;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserQuery [UserID=" + UserID + ", FName=" + FName + ", LName="
				+ LName + ", UName=" + UName + ", Email=" + Email
				+ ", Friendstatus= " + Friendstatus + ", Friendreqstatus= "
				+ Friendreqstatus + "]";
	}
	
	
	
	
	

	

}
