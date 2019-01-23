package model;

import java.util.ArrayList;

public class RestaurateurDAO {
	
	public void createNewRestaurateur(RestaurateurBean restaurateur) {
		int id = DTO.getInstance().getRestaurateurList().size();
		restaurateur.setId(id + "");
		DTO.getInstance().getRestaurateurList().add(restaurateur);
	}
	
	public void editRestaurateur(RestaurateurBean restaurateur, int id) {
		DTO.getInstance().getRestaurateurList().set(id, restaurateur);
	}
	
	public void deleteRestaurateur(int id) {
		DTO.getInstance().getRestaurateurList().remove(id);
	}
	
	public ArrayList<RestaurateurBean> getAllRestaurateur() {
		return DTO.getInstance().getRestaurateurList();
	}
	
	public RestaurateurBean getSingleRestaurateur(int id) {
		return DTO.getInstance().getRestaurateurList().get(id);
	}

}
