package model_draft;

import java.util.ArrayList;

public class ClientBean {
	private String id;
	private String username;
	private String password;
	private String confirmPassword;
	private String lastName;
	private String firstName;
	private String address;
	private String email;
	private String phone;
	private ArrayList<HistoryBean> historyBean;

	public ClientBean(String username, String password, String confirmPassword, String lastName, String firstName,
			String address, String email, String phone) {
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	public ClientBean(String id, String username, String password, String confirmPassword, String lastName,
			String firstName, String address, String email, String phone) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	public String toString() {
		return this.id + " : " + this.lastName + " " + this.firstName + ", " + this.address + ", " + this.email + ", "
				+ this.phone;
	}
	
	

	/**
	 * @return the historyBean
	 */
	public ArrayList<HistoryBean> getHistoryBean() {
		return historyBean;
	}

	/**
	 * @param historyBean the historyBean to set
	 */
	public void setHistoryBean(ArrayList<HistoryBean> historyBean) {
		this.historyBean = historyBean;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
