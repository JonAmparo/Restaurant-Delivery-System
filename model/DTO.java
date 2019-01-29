package model;

import java.util.ArrayList;

/*
 * DTO = Data Transfer Object
 * 
 * DTO is an abbreviation for Data Transfer Object, 
 * so it is used to transfer the data between classes 
 * and modules of your application. DTO should only 
 * contain private fields for your data, getters, setters 
 * and constructors. It is not recommended to add business 
 * logic methods to such classes, but it is OK to add some util methods.
*/
public class DTO {
	private ArrayList<ClientBean> clientList = new ArrayList<>();
	private ArrayList<RestaurateurBean> restaurateurList = new ArrayList<>();
	private ArrayList<UserBean> userList = new ArrayList<>();
	//private ArrayList<orderBean> orderList = new ArrayList<>();
	

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
	public ArrayList<UserBean> getUserList() {
		return userList;
	}

	/**
	 * @return the restaurateurList
	 */
	public ArrayList<RestaurateurBean> getRestaurateurList() {
		return restaurateurList;
	}
	
	

}
