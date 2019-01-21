package model;

import java.util.ArrayList;

/*
 * DTO = Data Transfer Object
*/
public class DTO {
	private ArrayList<ClientBean> clientList = new ArrayList<>();
	private ArrayList<RestaurateurBean> restaurateurList = new ArrayList<>();
	private ArrayList<LoginBean> userList = new ArrayList<>();

	// create a variable to get the instance of this class
	private static DTO current_instance = null;

	// make the constructor private to prevent the instantiation of this class
	private DTO() {
	}

	// create a function to get the instance of the class (getter)
	public static DTO getInstance() {
		if (current_instance == null)
			current_instance = new DTO();
		return current_instance;
	}

	/**
	 * @return the clientList
	 */
	public ArrayList<ClientBean> getClientList() {
		return clientList;
	}

	/**
	 * @return the userList
	 */
	public ArrayList<LoginBean> getUserList() {
		return userList;
	}

	/**
	 * @return the restaurateurList
	 */
	public ArrayList<RestaurateurBean> getRestaurateurList() {
		return restaurateurList;
	}
	
	

}
