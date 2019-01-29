package model;

public class RestaurateurBean {
	private String id; //id foreign key???
	private String username;
	private String restaurantName;
	//Status
	//Role

	public RestaurateurBean(String username, String restaurantName) {
		this.username = username;
		this.restaurantName = restaurantName;
	}
	
	public RestaurateurBean(String id, String username, String restaurantName) {
		this.id = id;
		this.username = username;
		this.restaurantName = restaurantName;
	}

	public String toString() {
		return this.id + " : " + this.username + " " + this.restaurantName;
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
	 * @return the restaurantName
	 */
	public String getRestaurantName() {
		return restaurantName;
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
	 * @param restaurantName the restaurantName to set
	 */
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

}
