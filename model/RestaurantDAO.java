package model_draft;

import java.util.ArrayList;
/*
 * DAO = Data Access Object
*/
public class RestaurantDAO {

	// Restaurants
	//public void createNewClient(RestaurantCreateBean client) {
		//int id = DTO.getInstance().getRestoList().size();
		//client.setId(id + "");
	//	DTO.getInstance().getRestoList().add(client);
	//}
	
	public void createNewRestaurant(RestaurantBean resto) {
		DTO.getInstance().getRestaurauntList().add(resto);
		
	}
	
	public void editRestaurant(RestaurantBean restoToChange, RestaurantBean newResto) {
				
		for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) { 
			if(DTO.getInstance().getRestaurauntList().get(i).getId() == restoToChange.getId()) {
				DTO.getInstance().getRestaurauntList().set(i,newResto);
			}
		}		
		
	}
	
	public void deleteRestaurant(int id) {
		DTO.getInstance().getRestaurauntList().remove(id);
	}
	
	public ArrayList<RestaurantBean> getAllRestaurants() {
		return DTO.getInstance().getRestaurauntList();
	}
	
	public RestaurantBean getSingleRestaurant(int id) {
		return DTO.getInstance().getRestaurauntList().get(id);
	}
	
	
}
