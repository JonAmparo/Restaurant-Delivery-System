package model_draft;

import java.io.ObjectInputStream.GetField;

public class UserModel {

	private UserDAO userDao = new UserDAO(); // declare the UserDAO object

	public UserModel(String userName, String passWord, String rollName) {

		this.createNewUser(new UserBean(userName, passWord, rollName));

	}

	public UserModel() {

		// instantiate UserDAO object

		// Using the function below to create a new User with the UserBean template
		this.createNewUser(new UserBean("Bill", "111", "Admin"));
		this.createNewUser(new UserBean("Bob", "222", "Manager"));
		this.createNewUser(new UserBean("Amanda", "333", "Chef"));
		this.createNewUser(new UserBean("Jeffrey", "444", "Delivery Driver"));
		this.createNewUser(new UserBean("Madonna", "555", "Client"));

		// Johns quick-users
		this.createNewUser(new UserBean("admin", "", "Admin"));
		this.createNewUser(new UserBean("manager", "222", "Manager"));
		this.createNewUser(new UserBean("client", "", "Client"));
		this.createNewUser(new UserBean("delivery", "444", "Delivery Driver"));
		this.createNewUser(new UserBean("chef", "123", "Chef"));
		
		this.createNewUser(new UserBean("admin", "admin", "Admin"));	
		this.createNewUser(new UserBean("client", "123", "Client"));
	}

	// user create function
	public void createNewUser(UserBean user) {
		userDao.createNewUser(user);

	}

	public boolean checkUserName(String userName) {
		for (UserBean user : userDao.getAllUsers()) {
			if (userName.equals(user.getUserName())) {
				System.out.println("true");
				return true;
			}
		}
		System.out.println("false");
		return false;
	}

	// main to test out
	public static void main(String[] args) {

		UserModel m = new UserModel();
		System.out.println(m.userDao.getAllUsers()); // print out all users(info)

		// check the DTO contents
		DTO st = DTO.getInstance();
		System.out.println(st.getInstance().getUserList());

		// check if name matches
		m.checkUserName("Bill");

	}
}