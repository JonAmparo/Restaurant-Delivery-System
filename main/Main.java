package main;

import model.ClientBean;
import model.ClientModel;
import model.ClientDAO;
import model.DTO;
import model.RestaurateurModel;
import view.Client;

public class Main {

	public static void main(String[] args) {
		ClientModel clientModel = new ClientModel();
		RestaurateurModel restaurateurModel = new RestaurateurModel();

//		System.out.println("Create New Clients - " + model.createNewClient());
//		ClientModel.createNewClient(clientBean);
//		System.out.println(model.toString());

		/*
		 * for (ClientBean client : model.getAllClients()) {
		 * System.out.println(client.getFirstName()); }
		 */
		System.out.println("Get All Clients: " + clientModel.getAllClients());
		System.out.println("Get Single Client: " + clientModel.getSingleClient(0));
		System.out.println("Get Single Client: " + clientModel.getSingleClient(2));
		System.out.println("Get Single Client: " + clientModel.getSingleClient(1) + "\n");
		
		
		System.out.println("Get All Restaurateurs: " + restaurateurModel.getAllRestaurateur());
		System.out.println("Get Single Restaurateur: " + restaurateurModel.getSingleRestaurateur(0));
		System.out.println("Get Single Restaurateur: " + restaurateurModel.getSingleRestaurateur(2));
		

	}

}
