package model;

import java.util.ArrayList;

public class OrderModel {

	private ClientDAO clientDAO;
	private DTO dto;
	//private RestaurantModel restaurantModel;
	private ClientBean client;
	private ArrayList<String> orderList;
	private ArrayList<String> managerRestaurantList;

	public OrderModel() {
		this.dto = DTO.getInstance();
		// restaurantModel = new RestaurantModel();
		orderList = new ArrayList<>();
		managerRestaurantList = new ArrayList<>();
	}

}
