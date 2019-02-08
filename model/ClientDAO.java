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
public class ClientDAO {

	// Clients
	public void createNewClient(ClientBean client) {
		int id = DTO.getInstance().getInstance().getClientList().size();
		client.setId(id + "");
		DTO.getInstance().getClientList().add(client);
	}
	
	public void editClient(ClientBean client, int id) {
		DTO.getInstance().getClientList().set(id, client);
	}
	
	public void deleteClient(int id) {
		DTO.getInstance().getClientList().remove(id);
	}
	
	public ArrayList<ClientBean> getAllClients() {
		return DTO.getInstance().getClientList();
	}
	
	public ClientBean getSingleClient(int id) {
		return DTO.getInstance().getClientList().get(id);
	}
	
	// Users
	
	// Restaurater
	
	// Manager
	
	// Menu
	
	// Restaurant
	
}
