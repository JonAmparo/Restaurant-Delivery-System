package model;

import java.util.ArrayList;

import view.ClientOrderFood;

public class ClientModel {

	private ClientDAO clientDAO;

	public ClientModel() {
		clientDAO = new ClientDAO();
		this.createNewClient(new ClientBean("client1", "123", "123", "Amparo", "Jonathan1", "3600 Avenue Du Parc",
				"JonathanAmparo2@live.com", "301-999-6666"));
		this.createNewClient(new ClientBean("client2", "123", "123", "Dope", "Sarah", "1600 Hope Ville",
				"Sarah@live.com", "514-858-4651"));
		this.createNewClient(new ClientBean("client3", "123", "123", "lovely", "Brooke", "785 Rue Saint",
				"BrookeV@live.com", "222-222-2222"));
		this.createNewClient(new ClientBean("client4", "123", "123", "Ann", "Carol", "123 Sunshine Road",
				"AnnSam@live.com", "123-456-7894"));

//		this.editClient(new ClientBean("client2", "123", "123", "Amparo", "JonathanEdited", "3600 Avenue Du Parc",
//				"JonathanAmparo2@live.com", "301-999-6666"), 2);
	}

	// Clients
	public void createNewClient(ClientBean client) {
		int id = clientDAO.getAllClients().size();
		client.setId(id + "");
		clientDAO.createNewClient(client);
	}

	public void editClient(ClientBean newClient, int id) {
		ClientBean oldClient = this.getSingleClient(id);
		oldClient.setUsername(newClient.getUsername());
		oldClient.setPassword(newClient.getPassword());
		oldClient.setConfirmPassword(newClient.getConfirmPassword());
		oldClient.setLastName(newClient.getLastName());
		oldClient.setFirstName(newClient.getFirstName());
		oldClient.setAddress(newClient.getAddress());
		oldClient.setEmail(newClient.getEmail());
		oldClient.setPhone(newClient.getPhone());

		clientDAO.editClient(oldClient, id);
	}

	public void deleteClient(int id) {
		clientDAO.deleteClient(id);
	}

	public ArrayList<ClientBean> getAllClients() {
		return clientDAO.getAllClients();

	}

	public ClientBean getSingleClient(int id) {
		return clientDAO.getSingleClient(id);
	}


}
