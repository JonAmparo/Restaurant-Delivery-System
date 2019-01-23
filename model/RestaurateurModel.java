package model;

import java.util.ArrayList;

public class RestaurateurModel {
	
	private RestaurateurDAO restaurateurDAO;
	
	public RestaurateurModel() {
		restaurateurDAO = new RestaurateurDAO();
		createNewRestaurateur(new RestaurateurBean("chef1", "Hells Kitchen"));
		this.createNewRestaurateur(new RestaurateurBean("chef2", "Buffalo Wild Wings"));
		this.createNewRestaurateur(new RestaurateurBean("chef3", "McDonalds"));
		
		//this.editRestaurateur(new RestaurateurBean("JonathanAmparoEDITED", "Dominoes"), 1);
	}

	public void createNewRestaurateur(RestaurateurBean restaurateur) {
		int id = restaurateurDAO.getAllRestaurateur().size();
		restaurateur.setId(id + "");
		restaurateurDAO.createNewRestaurateur(restaurateur);
	}

	public void editRestaurateur(RestaurateurBean newRestaurateur, int id) {
		RestaurateurBean oldRestaurateur = this.getSingleRestaurateur(id);
		oldRestaurateur.setUsername(newRestaurateur.getUsername());
		oldRestaurateur.setRestaurantName(newRestaurateur.getRestaurantName());
		
		restaurateurDAO.editRestaurateur(oldRestaurateur, id);
	}

	public void deleteRestaurateur(int id) {
		restaurateurDAO.deleteRestaurateur(id);
	}

	public ArrayList<RestaurateurBean> getAllRestaurateur() {
		return restaurateurDAO.getAllRestaurateur();
	}

	public RestaurateurBean getSingleRestaurateur(int id) {
		return restaurateurDAO.getSingleRestaurateur(id);
	}

}
