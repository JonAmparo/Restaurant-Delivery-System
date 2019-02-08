package model_draft;

import java.io.Serializable;

public class UserBean{

	//add status (account on or off)
	private String userName;
	private String passWord;
	private String roleName;	
	private boolean status;
	private int id;	
	
	public UserBean(String userName, String passWord, String rollName) {
		this.userName = userName;
		this.passWord = passWord;
		this.roleName = rollName;		
		this.id = DTO.getInstance().getUserList().size();		
	}

	public String toString() {
		return "\nUsername: " + this.userName + "\nPassword: " + this.passWord + "\nRole: " + this.roleName + "\nID: " + this.id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**
	 * @return the rollName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param rollName the rollName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
		
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	

	
}
