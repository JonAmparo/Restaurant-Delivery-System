package model_draft;

import java.util.ArrayList;


/*
 * DAO = Data Access Object
 * 
 * DAO is an abbreviation for Data Access Object, 
 * so it should encapsulate the logic for retrieving, 
 * saving and updating data in your data storage 
 * (a database, a file-system, whatever).
*/
public class UserDAO {

	// BASIC CRUD (only need the create for login!)
	public void createNewUser(UserBean user) {
		//int id = DTO.getInstance().getUserList().size();
		//user.setId(id + "");
		DTO.getInstance().getUserList().add(user);
		
	}
	
	
	// used to retrieve all the user information within the list
	public ArrayList<UserBean> getAllUsers() {
		return DTO.getInstance().getUserList();
	}
	
	//used to retrieve only one user info from the list (id dependent)
	public UserBean getSingleUser(int id) {
		return DTO.getInstance().getUserList().get(id);
	}

	/*public static ArrayList<UserBean> getAllUsers() {
		return DTO.getInstance().getUserList();
	}*/
	
	//this method is not required!
		/*public void editUser(UserBean user, int id) {
			DTO.getInstance().getUserList().set(id, user);
		}*/
		
		//this method is not required!
		/*public void deleteUser(int id) {
			DTO.getInstance().getUserList().remove(id);
		}*/
	
/*	public static void main(String[] args) {
		UserBean n = new UserBean("Ryan", "22", "manager");
		
		DTO.getInstance().getUserList().add(n);
		System.out.println(DTO.getInstance().getUserList().toString());
	}*/
		
}